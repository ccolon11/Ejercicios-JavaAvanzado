package Ejercicio910y11;
//Agregado patron Strategy al ejercicio anterior, patron Singleton
//por cuanto, este ultimo no cumple el principio SOLID de
// Responsabilidad Unica
public class Main {
    public static void main(String[] args){

    Singleton primernumero = new Singleton();
    Contador contador = new Primero();
    primernumero.setContador(contador);
    primernumero.getContador();


    }
}
