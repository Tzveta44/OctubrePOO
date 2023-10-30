import java.util.Scanner;

public class Arraid3 {
    public static void main(String[] args) {
        //Leer por consola una palabra
        //Definir un array de String
        //Obtener la longitud del Array considerando que en cada posicion se guardan 2 letras
        //Rellenar el array


        //Definir variables

        String palabra;
        String[] letras;
        Scanner teclado = new Scanner(System.in);

        //Leer la palabra
        System.out.println("Escriba la palabra: ");
        palabra = teclado.nextLine();

        if (palabra.length() % 3 == 0) {
            //es par

            letras = new String[palabra.length() / 3];
        } else {
            //Es impar
            letras = new String[palabra.length() / 3 + 1];

        }

        //Bucle

        for (int i = 0; i < letras.length; i++) {
            int posicionInicial = i * 3;
            System.out.println(posicionInicial);
            if (palabra.length() % 3 != 0 && i == letras.length - 1) {
                letras[i] = palabra.substring(posicionInicial);
                break;
            }
            //es impar
            letras[i] = palabra.substring(posicionInicial, posicionInicial + 2);
            System.out.println(letras[i]);


        }
    }
}