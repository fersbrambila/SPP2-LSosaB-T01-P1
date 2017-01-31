//Luisa Fernanda Sosa Brambila
// A01411485
// IIS
package spp2.lsosab.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBT01P1 {

    
    public static void main(String[] args) {
        System.out.println("Calculadora de promedio");
        Scanner teclado= new Scanner (System.in);
        
        double cal1, cal2, cal3, cal4, cal5, prom;
        int mat;
        String res;
        
        System.out.println("Ingresa tu matríacula sin A0");
        mat= teclado.nextInt();
        System.out.println("Escribe la calificación 1: ");
        cal1= teclado.nextDouble();
        System.out.println("Escribe la calificación 2: ");
        cal2= teclado.nextDouble();
        System.out.println("Escribe la calificación 3: ");
        cal3= teclado.nextDouble();
        System.out.println("Escribe la calificación 4: ");
        cal4= teclado.nextDouble();
        System.out.println("Escribe la calificación 5: ");
        cal5 =teclado.nextDouble();
        
        prom= (cal1 + cal2 + cal3 + cal4 + cal5)/5;
        if (prom<7.0){res= "REPROBADO" ;}  
        else {res= "APROBADO";}
        
        System.out.println("Tu promedio es :" + prom);
        System.out.println("Tu estatus actual es: " + res);
     
        
        
    }
    
}
