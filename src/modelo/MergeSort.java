
package modelo;

/**
 *
 * @author wills
 */
public class MergeSort {
 
    public void ordenar(int[] arreglo, int izquierda, int derecha) {

        if (izquierda < derecha) {

            int medio = (izquierda + derecha) / 2;

            ordenar(arreglo, izquierda, medio);
            ordenar(arreglo, medio + 1, derecha);

            mezclar(arreglo, izquierda, medio, derecha);
        }
    }

    private void mezclar(int[] arreglo, int izquierda, int medio, int derecha) {

        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] arregloIzquierdo = new int[n1];
        int[] arregloDerecho = new int[n2];

        for (int i = 0; i < n1; i++) {
            arregloIzquierdo[i] = arreglo[izquierda + i];
        }

        for (int j = 0; j < n2; j++) {
            arregloDerecho[j] = arreglo[medio + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {

            if (arregloIzquierdo[i] <= arregloDerecho[j]) {
                arreglo[k] = arregloIzquierdo[i];
                i++;
            } else {
                arreglo[k] = arregloDerecho[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            arreglo[k] = arregloIzquierdo[i];
            i++;
            k++;
        }

        while (j < n2) {
            arreglo[k] = arregloDerecho[j];
            j++;
            k++;
        }
    }
 }
