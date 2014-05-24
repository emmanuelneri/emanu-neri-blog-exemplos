package br.com.emmanuelneri.blog;

import com.sun.istack.internal.NotNull;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import java.util.List;

@Entity
@NamedQueries({
    @NamedQuery(name = "Produto.findByCodigo",
        query = "from Produto p,  "
                + "where :codigo in elements(p.codigos)")
})
public class Produto {

    @Id
    private Long id;

    @NotNull
    private String nome;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="produto_codigo", joinColumns = @JoinColumn(name = "id"))
    @Column(name="codigo_produto")
    private List<String> codigos;

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
