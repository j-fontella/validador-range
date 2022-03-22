import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Db {

    public static void main(String[] args) {
        Faixa faixa1 = new Faixa();
        faixa1.setValorCprInicio(BigDecimal.valueOf(3000.0));
        faixa1.setValorCprFim(BigDecimal.valueOf(5000));
        faixa1.setTipoCobranca(TipoCobranca.VALOR);
        faixa1.setValorCobranca(BigDecimal.valueOf(500));

        Faixa faixa2 = new Faixa();
        faixa2.setValorCprInicio(BigDecimal.valueOf(5001));
        faixa2.setValorCprFim(BigDecimal.valueOf(6000));
        faixa2.setTipoCobranca(TipoCobranca.PERCENTUAL);
        faixa2.setValorCobranca(BigDecimal.valueOf(10));

        Faixa faixa3 = new Faixa();
        faixa3.setValorCprInicio(BigDecimal.valueOf(6001));
        faixa3.setValorCprFim(BigDecimal.valueOf(6002));
        faixa3.setTipoCobranca(TipoCobranca.PERCENTUAL);
        faixa3.setValorCobranca(BigDecimal.valueOf(10));

        Faixa faixa4 = new Faixa();
        faixa4.setValorCprInicio(BigDecimal.valueOf(6002.2));
        faixa4.setValorCprFim(BigDecimal.valueOf(6003));
        faixa4.setTipoCobranca(TipoCobranca.PERCENTUAL);
        faixa4.setValorCobranca(BigDecimal.valueOf(10));

        List<Faixa> faixas = Arrays.asList(faixa1, faixa2, faixa3, faixa4);
        ValidadorFaixa.validaFaixas(faixas);

    }
}
