package fabrica.abstrata;

import fabrica.abstrata.modelo.Cobranca;
import fabrica.abstrata.modelo.CobrancaClaro;
import fabrica.abstrata.modelo.EnvioSMS;
import fabrica.abstrata.modelo.EnvioSMSClaro;

/**
 *
 * @author Camila Volponi
 */
public class FabricaClaro extends FabricaAbstrataEnvios{
    
    @Override
    public EnvioSMS criaEnvioSMS () {
        return new EnvioSMSClaro("Assincrono");
    }
    @Override
    public Cobranca criaCobranca() {
        return new CobrancaClaro();
    }
}
