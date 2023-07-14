/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Sala {
   Asiento[][] butaca = new Asiento[8][6];

    public Sala() {
    }

    public Asiento[][] getButaca() {
        return butaca;
    }

    public void setButaca(Asiento[][] butaca) {
        this.butaca = butaca;
    }
   
}
