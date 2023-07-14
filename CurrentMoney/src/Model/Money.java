/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class Money {
 
    private String symbol;
    private String nacionality;

    public Money(String symbol, String nacionality) {
        this.symbol = symbol;
        this.nacionality = nacionality;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    
    public void conversor(double cantidad, Money money, double conversor){
       double result = cantidad * conversor;
       JOptionPane.showMessageDialog(null,this.symbol + cantidad + " de " + this.nacionality + " equivalen a : " + money.getSymbol() + result+" de "+ money.getNacionality() ,"",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
