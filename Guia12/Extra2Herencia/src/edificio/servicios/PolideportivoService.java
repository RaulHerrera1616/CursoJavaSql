/*
esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package edificio.servicios;

import edificio.entidades.Edificio;
import edificio.entidades.Polideportivo;



public class PolideportivoService extends EdificioService {

    @Override
    public Double calcularSuperficie(Edificio edi) {
        Polideportivo poli1 = (Polideportivo )edi;
        if (poli1.getTipoInstalacion().equalsIgnoreCase("Techado")) {
            return 2 * (poli1.getAncho() * poli1.getLargo() + poli1.getAncho() * poli1.getAlto() + poli1.getAlto() * poli1.getLargo());
        }else{
            return poli1.getAncho() * poli1.getLargo() + (2 * (poli1.getAncho() * poli1.getAlto() + poli1.getAlto() * poli1.getLargo()));
        }
        
    }

    @Override
    public Double calcularVolumen(Edificio edi) {
        Polideportivo poli1 = (Polideportivo )edi;
        return (poli1.getAncho() * poli1.getLargo()) * poli1.getAlto();
    }

}
