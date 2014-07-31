import junit.framework.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class DataProviderTest {

    @DataProvider(name = "datas", parallel = true)
    public Object[][] datas() {
        return new Object[][] {
                { LocalDate.of(2014, 1, 1), LocalDate.of(2013, 12, 1)},
                { LocalDate.of(2014, 2, 1), LocalDate.of(2014, 1, 1)},
                { LocalDate.of(2014, 3, 1), LocalDate.of(2014, 2, 1)},
                { LocalDate.of(2014, 4, 1), LocalDate.of(2014, 3, 1)},
                { LocalDate.of(2014, 5, 1), LocalDate.of(2014, 4, 1)},
                { LocalDate.of(2014, 6, 1), LocalDate.of(2014, 5, 1)}};
    }

    @Test(dataProvider = "datas")
    public void getMesAnteriorTest(LocalDate dataInicial, LocalDate dataResultado) {
        Assert.assertEquals(dataResultado, DataUtil.getMesAnterior(dataInicial));
    }

}
