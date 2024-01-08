package dia3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Dia3Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

        char[][] sillas = new char[5][5];
        boolean bandera = false;
        int fila = 0;
        int col = 0;
        int silla;
        String texto;
        boolean estaOk = false;

        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                sillas[f][c] = 'O';

            }
        }

        System.out.println("Bienvenidos al sistema de reservas del Teatro Hack a Boss");
        while (bandera != true) {
            System.out.print("Ingrese fila y asiento a reservar\n");

            for (int f = 0; f < 5; f++) {
                for (int c = 0; c < 5; c++) {

                    //System.out.print("[" + sillas[f][c] + "]");
                }
                System.out.println("");

            }

            while (bandera != true) {

//                if (fila <=9 && fila>=0 ) {
//                    if (col <=9 && col>=0) {
//                        estaOk=true;
//                        
//                    }else{
//                        System.out.println("Asiento fila ocupado");
//                    }
           
//                }else{
//                
//                        System.out.println("Asiento columna ocupado");
//                }
                for (int f = 0; f < 5; f++) {
                    for (int c = 0; c < 5; c++) {

                       System.out.print("[" + sillas[f][c] + "]");
                    }
                    System.out.println("");

                }

                System.out.print("\nLa filas debe ser entre (0-4 ):");
                fila = scn.nextInt();
                System.out.println("\nEl asiento debe ser entre (0-4):");
                silla = scn.nextInt();

                if (sillas[fila][silla] == 'O') {
                    sillas[fila][silla] = 'X';
                    System.out.println("El asiento no esta disponible. Pruebe a reservar otro asiento");

                } else {

                    System.out.println("El asiento fue reservado con exito.Disfrute de la obra !!!");
                }

                System.out.println("Deseas seguir realizando alguna compra más: ¿ S/N ?");
                texto = scn.next();

                if (texto.equalsIgnoreCase("N")) {
                    bandera = true;

                }

            }

        }
    }
}

//////////////////////////solución//////////////////////
//
//package sistemateatro;
//
//import java.util.Scanner;
//
///**
// *
// * @author Luisina
// */
//public class SistemaTeatro {
//
//    public static void main(String[] args) {
//        
//        String asientos [][] = new String [5][5];
//        boolean bandera = false;
//        Scanner teclado = new Scanner (System.in);
//        int fila, asiento;
//        String respuesta;
//        
//        System.out.println("-----------Bienvenido al sistema de teatros-----------");
//        
//        //rellenamos la matriz con O porque está vacía
//        for (int f=0;f<5;f++) {
//            for (int c=0;c<5;c++) {
//                asientos[f][c]="O";
//            }
//        }
//        
//        while (bandera!=true) {
//            
//            System.out.println("Ingrese el número de fila y asiento a reservar");
//            System.out.print("Fila (entre 0 y 4): ");
//            fila = teclado.nextInt();
//            System.out.println(fila);
//            
//            System.out.print("Asiento (entre 0 y 4): ");
//            asiento = teclado.nextInt();
//            System.out.println(asiento);
//        
//            if (asientos[fila][asiento].equals("O")) {
//                asientos[fila][asiento] = "X";
//                System.out.println("Asiento reservado correctamente");
//                
//                System.out.println("¿Desea finalizar las reservas? S: Si. Cualquier otra letra:  No ");
//                respuesta = teclado.next();
//                    
//                //equalsIgnoreCase ignora si la letra ingresada es mayúscula o minúscula, le importa el caracter
//                    if (respuesta.equalsIgnoreCase("S"))  {
//                        bandera = true;
//                    }
//            }
//           else {
//               System.out.println("Asiento ocupado, seleccione otro");
//           }
//                
//                
//            }
//            
//            
//            
//        }
//        
//        
//
//    }
//
//   