
package interfaz;
import modelo.MergeSort;
/**
 *
 * @author wills
 */
public class InterfazApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {8, 3, 5, 1, 4, 2};

        MergeSort mergeSort = new MergeSort();

        System.out.println("Arreglo original:");

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }

        mergeSort.ordenar(arreglo, 0, arreglo.length - 1);

        System.out.println("\n\nArreglo ordenado:");

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }
}
    

