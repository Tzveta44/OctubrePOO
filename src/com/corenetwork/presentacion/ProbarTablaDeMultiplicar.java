package com.corenetwork.presentacion;

import com.corenetwork.modelo.TablaDeMultiplicar;

public class ProbarTablaDeMultiplicar {
    public static void main(String[] args) {
        //Constructor vacio
        TablaDeMultiplicar t1=new TablaDeMultiplicar();
        t1.setTabla(5);
        System.out.println(t1.tablaMultiplicar());
        //Constructor completo
       // TablaDeMultiplicar t2= new TablaDeMultiplicar(5);
       // System.out.println(t2.tablaMultiplicar());
    }
}
