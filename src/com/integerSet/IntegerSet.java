package com.integerSet;
import java.util.Arrays;

public class IntegerSet {

/*
    Cada objeto IntegerSet puede
    almacenar enteros en el rango de 0 a 100. El conjunto es
    representado por una matriz de valores booleanos. el elemento de
    la matriz a [i] es verdadera si el entero i está en el conjunto. O
    elemento de la matriz a [j] es falso si el entero j no es
    está en el set.
*/

    private static final int MIN = 0;

    private static final int MAX = 100;

    private boolean[] a;

/*    El constructor sin argumentos inicializa la matriz de Java en un conjunto vacío
      (es decir, un conjunto cuya representación de matriz contiene todos los
      valores falsos).*/

    public IntegerSet() {
        a = new boolean[MAX + 1];
    }

    /*Método que crea un nuevo array y que utiliza un ciclo para evaluar mediante OR || los elementos positivos
    * de c1 y c2 y los incluye todos dentro del nuevo arreglo*/

    public static IntegerSet union(IntegerSet c1, IntegerSet c2) {
        IntegerSet r = new IntegerSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] | c2.a[i];
        }
        return r;
    }

    /*Método que crea un nuevo array y dentro de ese arrreglo recibe los elementos
    que sean positivos y que compartan c1 y c2, utiliza AND para evaluar los valores
    de ambos arreglos*/
    public static IntegerSet interseccion(IntegerSet c1, IntegerSet c2) {
        IntegerSet r = new IntegerSet();
        for (int i = 0; i <= MAX; ++i) {
            r.a[i] = c1.a[i] & c2.a[i];
        }
        return r;
    }

//    Metodo para insertar un elemento en específico al establecer a[i] como verdadero

    public void insertarElemento(int i) {
        a[i] = true;
    }


//    Metodo que elimina un elemento en especifico, al establecer a[i] como falso
    public void borrarElemento(int i) {
        a[i] = false;
    }



    /*
    Método que retorna un string con una lista separada por comas. Si el elemento es positivo, se incluye en la lista,
    si no existe, entonces se usa un "-" para representarlo

    */

    public String toSetString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= MAX; ++i) {
            if (a[i])
                sb.append(i).append(",");
            else
                sb.append("-").append(",");
        }
        return sb.toString();
    }

//    Método que determina si dos grupos son iguales, se usa el método Arrays.equals() para evaluar
    public static boolean esIgual(IntegerSet c1, IntegerSet c2) {
        return Arrays.equals(c1.a, c2.a);
    }

}


