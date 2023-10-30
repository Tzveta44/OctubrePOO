package com.corenetwork.modelo;

public class TablaDeMultiplicar {
    //1. Atributos

    private  int tabla;

    //2. Metodos

    public String  tablaMultiplicar(){
        String resultado="";
        for (int i=1; i<=10; i++){
            resultado += tabla+"*"+i+"="+(tabla*i)+"\n";
            //System.out.println(tabla +"x"+i+"="+(tabla*i)); se puede activar cuando la linea 11 no esta activa
        }

        return resultado;
    }
    //3. Constructores

    public TablaDeMultiplicar() {
    }

    public TablaDeMultiplicar(int tabla) {
        this.tabla = tabla;
    }
//4. Setters y Getters

    public int getTabla() {
        return tabla;
    }

    public void setTabla(int tabla) {
        this.tabla = tabla;
    }



}
