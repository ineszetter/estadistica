/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Programa sencillo para operaciones estadísticas 10/06/2019
 *
 * @author IC. María Inés Calderón Zetter
 */
public class Estadisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Defino un búfer para lectura del teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        //Imprimo Pantalla simpática en ASCII al inicio del programa "Números al azar"
        System.out.println("O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O");
        System.out.println("O  .-..-..-..-..-.-.-..---..---. .----..---.  O");
        System.out.println("O  | .` || || || | | || |- | |-< | || | \\ \\ O");
        System.out.println("O  `-'`-'`----'`-'-'-'`---'`-'`-'`----'`---'  O");
        System.out.println("O                                             O");
        System.out.println("O       .---..-.    .---..---,.---..---.      O");
        System.out.println("O       | | || |__  | | | / / | | || |-<      O");
        System.out.println("O       `-^-'`----' `-^-'`---'`-^-'`-'`-'     O");
        System.out.println("O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O:O");
        System.out.println(" María Inés Calderón Zetter ");
        System.out.println(" Análisis de Datos ");
        System.out.println(" ");
        //Defino un acumulador para mi manejo de ciclo for
        int x;

        //Defino la variables dónde manejaré los números generados al azar
        int Ran;

        //Defino por defecto mis máximos y mínimos en 1 para evaluarlos posteriormente
        int maximo = 1;
        int minimo = 1;

        //Defino variable para albergar los datos de la mediaa
        int media = 0;

        //Defino un arreglo de números enteros dónde albergaré los números aleatorios que se vayan generando
        int arr[] = new int[100];

        double desviacion = 0;
        double varianza = 0;

        //Defino una variable para manejo de números aleatorios
        Random rand = new Random();

        System.out.println("Números aleatorios");

        //Genero un ciclo for de 8 vueltas, las vueltas pueden ser tantas
        //como definamos el arreglo dónde vamos a almacenar los datos
        for (x = 0; x < 9; x++) {
            Ran = rand.nextInt(9);

            arr[x] = Ran;
            System.out.println("|" + Ran + "|");

            //Comparo y defino máximos y mínimos
            if (Ran > maximo) {
                maximo = Ran;
            }

            if (Ran < minimo) {
                minimo = Ran;
            }

            media = media + Ran;
            //En estos casos podríamos utilizar el operador de suma y asignación +=,
            //lo he omitido para facilitar la lectura del código
        }

        //Defino que la media es el valor de la media entre la cantidad de números generados
        media = media / x;

        // Defino que la varianza es igual la varianza de mi variable aleatoria
        // es una medida de dispersión definida como la esperanza del cuadrado de
        // la desviación de dicha variable respecto a su media (Wikipedia) de forma que:
        for (int i = 0; i < x; i++) {
            varianza += Math.pow(arr[i] - media, 2);
        }

        varianza = varianza / (double) x;
        //Una vez que ya tengo la varianza ya puedo calcular la desviación de forma:
        desviacion = Math.sqrt(varianza);

        //Finalmente imprimo mi valores
        System.out.println("\n Media : " + media);
        System.out.println("Varianza : " + varianza);
        System.out.println("Maximo : " + maximo);
        System.out.println("Minimo : " + minimo);
        System.out.println("Mediana : " + minimo + (maximo - minimo) / 2);
        System.out.println("Desviación estándar : " + desviacion);
    }
}
