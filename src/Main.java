import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char letra = 'o';
        boolean bandera = true;
        long numeros = 8_000_000L;
        float numeroConDecimales = 9.5F;

        int[] numerosEnteros = new int[5];


        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (i + 1) * 5;
        }

        for (int elemento : numerosEnteros) {
            System.out.println("Elemento:" + elemento);
        }

        //Leer por la consola una palabra
        //Guardar cada letra en una posicion de un array de chars
        //Recomendacion se puede usar el metodo charAt

        //Definir variables

        String palabra;
        char[] letras;
        Scanner teclado = new Scanner(System.in);

        //Leer la palabra
        System.out.println("Escriba la palabra: " );
        palabra = teclado.nextLine();
        letras = new char[palabra.length()];


        //Bucle
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
            System.out.println(letras[i]);

            for (char elemento : letras) {
                letras[i]=palabra.charAt(i);
                System.out.println(letras[i]);
            }
        }

    }
}