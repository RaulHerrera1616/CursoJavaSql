/*
tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
 */
package edificio.servicios;

import edificio.entidades.Edificio;


public abstract class EdificioService {
    
    public abstract Double calcularSuperficie(Edificio edi);
    public abstract Double calcularVolumen(Edificio edi);
}
