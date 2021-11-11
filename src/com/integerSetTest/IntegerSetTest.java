package com.integerSetTest;

import com.integerSet.IntegerSet;

public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet s1 = new IntegerSet ();
        IntegerSet s2 = new IntegerSet ();
        int array1[] = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int array2[] = {0, 10, 20, 30, 35, 45, 55, 65, 75, 80, 90, 100};

        //se usa un ciclo para inserar los elementos de cada arreglo en las instancias creadas
        for (int x : array1) {
            s1.insertarElemento (x);
        }

        for (int x : array2) {
            s2.insertarElemento (x);
        }

//        Muestra arreglos instanciados
        System.out.println("\n------Arrays--------");
        System.out.println (s1.toSetString());
        System.out.println (s2.toSetString());

        System.out.println("\n------Unión--------");
//        Se crea una nueva instancia la cual contendrá todos los elementos de s1 y s2
        IntegerSet union = IntegerSet.union (s1, s2);
        System.out.println (union.toSetString());

        System.out.println("\n------Intersección--------");
//        Se crea una nueva instancia, la cual contendrá los elementos que compartan los arreglos s1 y s2
        IntegerSet interseccion = IntegerSet.interseccion (s1, s2);
        System.out.println (interseccion.toSetString());


        System.out.println("\n------Comparación--------");
        System.out.println (IntegerSet.esIgual (s1, s2));
    }
}
