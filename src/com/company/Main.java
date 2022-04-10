package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int param1 =14;
        int param2 =9;
        int param3 =7;
        suma(param1,param2,param3);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static void suma(int a, int b, int c){
        int resultadoSuma = a+b+c;
        System.out.println("El resultado de la suma de los tres parametros es: "+ resultadoSuma);

    }

}

class Coche {
    public int puertas = 8;

    public void incrementarPuertas(){
        this.puertas++;
    }

    

}