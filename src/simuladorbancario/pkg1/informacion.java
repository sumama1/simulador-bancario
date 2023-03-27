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
public class informacion {
    private String Nombre;
    private String Identificacion;
    
    private int Corriente;
    
    private double SaldoTotal;
    
    

  
    

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

   

    public int getCorriente() {
        return Corriente;
    }

    public void setCorriente(int Corriente) {
        this.Corriente = Corriente;
    }

   

    public double getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(double SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    public informacion() {
    }

    public informacion(String Nombre, String Identificacion, int Corriente, int cdt, int SaldoTotal) {
        this.Nombre = Nombre;
        this.Identificacion = Identificacion;
        
        this.Corriente = Corriente;
       
        this.SaldoTotal = SaldoTotal;
        
    }
   public void informacion() {
       Scanner sc= new Scanner(System.in);
       System.out.println("escriba su nombre: ");
       this.Nombre= sc.next();
       System.out.println("escrba su id");
       this.Identificacion = sc.next();
      
       System.out.println("escriba el valor a consingar en la cuenta corriente");
       this.Corriente = sc.nextInt();
      
      
       
     
       
       
       
       
   }
    
}
    

