package br.com.emmanuelneri.blog;

import com.sun.istack.internal.NotNull;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Entity
@NamedQueries({
    @NamedQuery(name = "Produto.findByCodigo",
        query = "from Produto p where :codigo in elements(p.codigos)")
})
public class Produto {

    @Id
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro = LocalDate.now();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="produto_codigo", joinColumns = @JoinColumn(name = "id"))
    @Column(name="codigo_produto")
    private List<String> codigos;

    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyColumn(name = "locale")
    @Column(name = "descricao")
    @CollectionTable(name = "produto_descricao", joinColumns = @JoinColumn(name = "id"))
    private Map<Locale, String> descricoes;

    @ManyToMany(cascade = CascadeType.ALL)
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "estado")
    @JoinTable(name = "produto_fornecedor", joinColumns = @JoinColumn(name = "id_produto"), inverseJoinColumns = @JoinColumn(name = "id_fornecedor"))
    private Map<Estado, Fornecedor> fornecedores = new HashMap<Estado, Fornecedor>();

    public Long getId() {
        return id;
    }

    public List<String> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<String> codigos) {
        this.codigos = codigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
