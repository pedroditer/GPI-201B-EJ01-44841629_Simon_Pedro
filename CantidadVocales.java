import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class CantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine(); //leemos la cadena

        // cantidades de cada vocal repetida
        Dictionary<Character, Integer> vocalesRepetidas = new Hashtable<>();
        vocalesRepetidas.put('a', 0);
        vocalesRepetidas.put('e', 0);
        vocalesRepetidas.put('i', 0);
        vocalesRepetidas.put('o', 0);
        vocalesRepetidas.put('u', 0);

        int cantidadVocales = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //obtenemos el caracter en la posicion i

            boolean esVocal = vocalesRepetidas.get(car) != null;
            if (esVocal) {
                cantidadVocales++; //contamos cantidad vocales +1

                // sumamos la vocal en su respectivo contador
                vocalesRepetidas.put(car, vocalesRepetidas.get(car)+1);
            }
        }


        //mostramos por pantalla cantidad de vocales
        System.out.println("Las cantidades de vocales son: ");

        // iteramos en los contadores de las vocales repetidas
        Iterator<Character> it = vocalesRepetidas.keys().asIterator();
        while (it.hasNext()) {
            char k = it.next();

            System.out.println(k +": "+ vocalesRepetidas.get(k));
        }

        System.out.println("Total: " + cantidadVocales + " vocales");
    }
}
