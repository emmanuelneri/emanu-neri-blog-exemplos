import java.time.LocalDate;

public final class DataUtil {

    private DataUtil() {}

    public static LocalDate getMesAnterior(LocalDate data) {
        return data.minusMonths(1);
    }

}
