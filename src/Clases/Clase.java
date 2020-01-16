/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jairo
 */
public class Clase {
 int alumnos;
 String nombre;

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 public Clase(int alumnos, String nombre) {

	this.alumnos=alumnos;
	this.nombre=nombre;
}
 
 public String toString(){
     String mensaje= "Este alumno "+this.Alumnos+" se llama: "+this.nombre;
     return mensaje;
 }
 
 
 
 
}
 

