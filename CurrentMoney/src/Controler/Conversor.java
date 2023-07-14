/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Money;

/**
 *
 * @author yatac
 */
public class Conversor {

    private Money money = new Money("S/.", "Peru");

    public void convertirMonedas(String opcion, double cantidad) {
        switch (opcion) {
            case "dolar":
                money.conversor(cantidad, new Money("$", "EEUU."), 3.57);
                break;
            case "euro":
                money.conversor(cantidad, new Money("e", "España"), 4.02);
                break;
            case "pesosmx":
                money.conversor(cantidad, new Money("mx", "Mexico"), 0.21 );
                break;
            case "pesoschl":
                money.conversor(cantidad, new Money("$", "Chile"), 0.0044);
                break;
            default:
                throw new AssertionError();
        }
    }

}
