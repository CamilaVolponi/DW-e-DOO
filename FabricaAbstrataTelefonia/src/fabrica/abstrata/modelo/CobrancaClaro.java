package fabrica.abstrata.modelo;

import fabrica.abstrata.modelo.Cobranca;

/**
 *
 * @author Camila Volponi
 */
public class CobrancaClaro implements Cobranca {

    @Override
    public void cobrar(int telefone) {
        System.out.println("Cobrar via claro");
    }
    
}
