package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.model.Marca;
import br.com.emmanuelneri.blog.vo.CarroVO;
import br.com.emmanuelneri.blog.vo.ModeloVO;
import com.google.common.collect.Lists;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CarroController {

    private List<CarroVO> carros;

    @PostConstruct
    public void init() {
        this.carros = new ArrayList<>();

        final ModeloVO modeloLT = new ModeloVO("LT");
        final ModeloVO modeloLTZ = new ModeloVO("LTZ");

        this.carros.add(new CarroVO("Cruze", Marca.CHEVROLET, Lists.newArrayList(modeloLT, modeloLTZ)));

        final ModeloVO modeloSE = new ModeloVO("SE");
        final ModeloVO modeloTitanium = new ModeloVO("Titanium");

        this.carros.add(new CarroVO("Focus", Marca.FORD, Lists.newArrayList(modeloSE, modeloTitanium)));
    }

    public List<CarroVO> getCarros() {
        return carros;
    }
}
