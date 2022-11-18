/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlab10lib;
import Libreria.Calculadora;
import java.util.Scanner;
/**
 *
 * @author Juan Carlos
 */
public class RunLab10Lib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora casio = new Calculadora();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresar numeros para realizar la suma:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        
        System.out.println("Ingresar numeros para realizar la resta:");
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        
        System.out.println("Ingresar numeros para realizar la multiplicacion:");
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        
        System.out.println("Ingresar numeros para realizar la division:");
        double g = scan.nextDouble();
        double h = scan.nextDouble();
        
        System.out.println("----------------------------------------------");
        
        System.out.println(casio.suma(a, b));
        System.out.println(casio.resta(c, d));
        System.out.println(casio.multi(e, f));
        System.out.println(casio.divis(g, h));
    }
    
}
