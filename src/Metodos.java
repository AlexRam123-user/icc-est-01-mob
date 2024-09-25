public class Metodos {

    public Metodos() {
        System.out.println("Se creo la clase Metodos");
    }

    public int[] sortByBubble(int[] arreglo) {

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public int[] sortByBubbleDes(int[] arregloDes) {

        int tamanio = arregloDes.length;

        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - i - 1; j++) {
                if (arregloDes[j] < arregloDes[j + 1]) { 
                    int aux = arregloDes[j];
                    arregloDes[j] = arregloDes[j + 1];
                    arregloDes[j + 1] = aux;
                }
            }
        }
        return arregloDes;
    }

    public void printArregloDes(int[] arregloDes) {
        for (int elemento : arregloDes) {
            System.out.println(elemento);
        }
    }

    public String[] sortByBubblePalabras(String[] palabras){
        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++) {
            for (int j = i+1; j < tamanio; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j])>0) {
                    String aux=palabras[i];
                    palabras[i]=palabras[j];
                    palabras[j]=aux;
                }
            }
        }
        return palabras;
    }

    public void printArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}
