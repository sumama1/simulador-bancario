/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorbancario.pkg1;

import java.util.Scanner;

/**
 *
 * @author sg701-02
 */
public class cdt {
    
    private int meses;
    private double saldototal;
    private int valordeapertura;
    private int liquidacion;

    public cdt(int valordeapertura, int liquidacion) {
        this.valordeapertura = valordeapertura;
        this.liquidacion = liquidacion;
    }

    public int getValordeapertura() {
        return valordeapertura;
    }

    public void setValordeapertura(int valordeapertura) {
        this.valordeapertura = valordeapertura;
    }

    public int getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(int liquidacion) {
        this.liquidacion = liquidacion;
    }

   

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getSaldototal() {
        return saldototal;
    }

    public void setSaldototal(double saldototal) {
        this.saldototal = saldototal;
    }

    public cdt() {
    }

    public cdt(int meses, double saldototal) {
        
        this.meses = meses;
        this.saldototal = saldototal;
    }
    
    
    public void liquidacioncdt() {
        
        
    Scanner sc=new Scanner(System.in);
    this.valordeapertura = 1000000;
    System.out.println("su valor de apertuda de cdt es 1000000");
        System.out.println("Escriba el numero de meses a simular");
        this.meses =sc.nextInt();
    this.saldototal=this.valordeapertura +( this.valordeapertura *0.06 * this.meses);
    System.out.println("su saldo de la cuenta de cdt es;"+saldototal);
    }
    
    
    
}
