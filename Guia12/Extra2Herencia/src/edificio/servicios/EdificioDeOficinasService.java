/*
Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edi1ficio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edi1ficio.
 */
package edificio.servicios;


import edificio.entidades.Edificio;
import edificio.entidades.EdificioDeOficinas;
import edificio.servicios.EdificioService;

public class EdificioDeOficinasService extends EdificioService {



    @Override
    public Double calcularSuperficie(Edificio edi) {
        EdificioDeOficinas edi1 = (EdificioDeOficinas) edi;
        return (2 * (edi1.getAncho() * edi1.getLargo() + edi1.getAncho() * edi1.getAlto() + edi1.getAlto() * edi1.getLargo()))*edi1.getNumPisos();
    }

    @Override
    public Double calcularVolumen(Edificio edi) {
        EdificioDeOficinas edi1 = (EdificioDeOficinas) edi;
        return ((edi1.getAncho() * edi1.getLargo()) * edi1.getAlto())*edi1.getNumPisos();
    }
    public void cantPersonas(EdificioDeOficinas edi){
        System.out.println("La cantidad de personas que entran en un piso es: "+edi.getCantPerOfic());
        System.out.println("La cantidad de personas que entran en todo el edi1ficio es: "+edi.getCantPerOfic()*edi.getNumPisos());
    }
}
