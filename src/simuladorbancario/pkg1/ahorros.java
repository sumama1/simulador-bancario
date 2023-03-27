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
public class ahorros {
    private int ConsignaciondeAhorros;
    private double retirodesaldo;
    private int Meses;
    private double SaldoTotal;

    public ahorros() {
    }

    public double getRetirodesaldo() {
        return retirodesaldo;
    }

    public void setRetirodesaldo(int retirodesaldo) {
        this.retirodesaldo = retirodesaldo;
    }

    public ahorros(double retirodesaldo) {
        this.retirodesaldo = retirodesaldo;
    }

    public ahorros(int ConsignaciondeAhorros, int ConsignaciondeCorriente, int Meses, double SaldoTotal) {
        this.ConsignaciondeAhorros = ConsignaciondeAhorros;
       
        this.Meses = Meses;
        this.SaldoTotal = SaldoTotal;
    }

    public int getConsignaciondeAhorros() {
        return ConsignaciondeAhorros;
    }

    public void setConsignaciondeAhorros(int ConsignaciondeAhorros) {
        this.ConsignaciondeAhorros = ConsignaciondeAhorros;
    }

    
    

    
    

    public int getMeses() {
        return Meses;
    }

    public void setMeses(int Meses) {
        this.Meses = Meses;
    }

    public double getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(double SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }
    public void calcularIntereses(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el numero de meses a simular");
        this.Meses =sc.nextInt();
    this.SaldoTotal=this.ConsignaciondeAhorros +( this.ConsignaciondeAhorros *0.06 * this.Meses);
    System.out.println("su saldo de la cuenta de ahorros es;"+SaldoTotal);
    }
   public void Consignacion() {
   Scanner sc=new Scanner(System.in);
   System.out.println("escriba el valor a Consignar en ahorros");
   this.ConsignaciondeAhorros= sc.nextInt();
   System.out.println("el saldo de la cuenta de ahorros es"+ConsignaciondeAhorros);
   
 
  }
   public void  Retiro(){
       
       Scanner sc=new Scanner(System.in);
       System.out.println("escriba el valor a retirar en la cuenta de ahorros");
       this.retirodesaldo = sc.nextInt();
       this.SaldoTotal= this.SaldoTotal - this.retirodesaldo;
       System.out.println("su saldo total de la cuenta de ahorros es:"+SaldoTotal);
       
   }
   
   
}
