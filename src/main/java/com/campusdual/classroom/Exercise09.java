package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(15);
    }

    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        int ini = 0;
        int primerValor = 0;
        do {
            System.out.println("Entra con valor: " + primerValor + ", sale con valor: " + (primerValor + 1));
            primerValor++;
            ini++;
        } while (ini < num);
    }
}