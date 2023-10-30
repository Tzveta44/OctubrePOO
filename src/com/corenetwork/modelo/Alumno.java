package com.corenetwork.modelo;

public class Alumno {

    //Atributos

    private  String nombreAlumno;
    private double[] notas;

    //Metodos



    //Constructores

    public Alumno(String nombre, int numParciales) {
        nombreAlumno=nombre;
        notas=new double[numParciales];
    }
    public void asignarValores(double nota, int posicion){
        notas[posicion]=nota;
    }
    public double promedio(){
        //Declaracion de variables

        double suma=0;

        //Estructutra

        for(int i=0; i<notas.length;i++){
            suma=suma+notas[i];

        }
        return suma/notas.length;
    }




public String mostrar() {
    // Declarara variables

    String resultado = "";

    //Estructuras

    for (int i = 0; i < notas.length; i++) {
        resultado = resultado + notas;
        System.out.println(notas[i]);

    }
    return resultado;
}


//Constructores

}
//Setters y Getters
