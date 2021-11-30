
package ClaseYObjetos;

import java.util.Scanner;
public class PracticaSemana12 {
        
        public static void main (String [] dada){
            marcadores Marcadores = new marcadores();
            Scanner entrada= new Scanner(System.in);
            
            System.out.println("Cual seria la punta:");
         Marcadores.punta=entrada.next();
            
            System.out.println(" Cual seria la marca:");
             Marcadores.Marca=entrada.next();
             System.out.println("Cual seria el color:");
             Marcadores.color=entrada.next();
             System.out.println("Cual seria la forma:");
             Marcadores.forma=entrada.next();
             System.out.println("Cual seria el material:");
             Marcadores.material =entrada.next();
             System.out.println("Cual seria el tamaño:");
             Marcadores.tamaño=entrada.next();
             System.out.println("Cual seria el precio:");
             Marcadores.precio =entrada.nextInt();
             
             Marcadores. Impresion(); 
        }
                
}

