
import java.math.BigDecimal;

public class Faixa {
    private BigDecimal valorCprInicio;
    private BigDecimal valorCprFim;
    private BigDecimal valorCobranca;
    private TipoCobranca tipoCobranca;

    public BigDecimal getValorCprInicio() {
        return valorCprInicio;
    }

    public void setValorCprInicio(BigDecimal valorCprInicio) {
        this.valorCprInicio = valorCprInicio;
    }

    public BigDecimal getValorCprFim() {
        return valorCprFim;
    }

    public void setValorCprFim(BigDecimal valorCprFim) {
        this.valorCprFim = valorCprFim;
    }

    public BigDecimal getValorCobranca() {
        return valorCobranca;
    }

    public void setValorCobranca(BigDecimal valorCobranca) {
        this.valorCobranca = valorCobranca;
    }

    public TipoCobranca getTipoCobranca() {
        return tipoCobranca;
    }

    public void setTipoCobranca(TipoCobranca tipoCobranca) {
        this.tipoCobranca = tipoCobranca;
    }
}
