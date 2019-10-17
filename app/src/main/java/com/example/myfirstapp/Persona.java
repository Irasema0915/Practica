package com.example.myfirstapp;

import java.io.Serializable;

//Seria sirve para poder empaquetar
public class Persona implements Serializable {

    private String Nombre;
    private Integer Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Persona(String nombre, Integer edad) {
        Nombre = nombre;
        Edad = edad;
    }

    public String soymayor(){
        if (Edad>18){
            return "soy mayor";
        }else{
            return "soy menor";
        }
    }
}
