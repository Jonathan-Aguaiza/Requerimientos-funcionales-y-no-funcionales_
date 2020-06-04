/*
Implementar un algoritmo que me permita ingresar por teclado, los requerimientos
funcionales y los requerimientos no funcionales y que al final me muestre en
en pantalla.
 */
package requerimientosfuncionalesynofuncionales;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class RequerimientosFuncionalesyNoFuncionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese primer requerimiento funcional:");
        String r1=objeto.nextLine();
        /*
        motor de combustion interna
        */
        System.out.println("Ingrese segundo requerimiento  funcional:");
        String r2=objeto.nextLine();
        /*
        combustible
        */
        System.out.println("Ingrese un tercer requerimiento funcional");
        String r3=objeto.nextLine();
        /*
        bateria
        */
        System.out.println("Ingrese primer requerimiento no funcional:");
        String rn1=objeto.nextLine();
        /*
        control HEV
        */
        System.out.println("Ingrese segundo requerimiento no funcional:");
        String rn2=objeto.nextLine();
        /*
        algoritmo de entrenamiento MLP
        */
        System.out.println("Ingrese un tercer requerimiento no funcional:");
        String rn3=objeto.nextLine();
        /*
        conduccion de datos
        */
        
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        
        System.out.println("Requerimientos funcionales:");
        System.out.println("1.-"+r1);
        System.out.println("2.-"+r2);
        System.out.println("3.-"+r3);
        System.out.println("");
        System.out.println("Requerimientos no funcionales:");
        System.out.println("1.-"+rn1);
        System.out.println("2.-"+rn2);
        System.out.println("3.-"+rn3);
    }
    
}
