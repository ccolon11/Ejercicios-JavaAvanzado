package Ejercicio910y11;

 class Singleton {
     private Singleton instancia;
     private Contador contador;


    void setContador(Contador contador){
        this.contador = contador;
    }
    void getContador(){
        contador.numero();
    }
}
