/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author krist
 */
public class Jugador implements Comparable<Jugador> {
   
    public String nombre;
    public String apellido;
    public String nickName;
    public String fecha;
    public int puntuacion;
    public static String [] TBL_ETIQUETAS = {"Nombre", "Apellido", "NickName", "Fecha", "Puntuacion"}; 

    public Jugador(String nombre, String apellido, String nickName, String fecha, int puntuacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickName = nickName;
        this.fecha = fecha;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


    @Override
    public int compareTo(Jugador jugador) {
        if (this.puntuacion > jugador.getPuntuacion()) {
            return -1;
        } else {
            if (this.puntuacion < jugador.getPuntuacion()) {
                return 1;
            } else {
                return 0;
            }
        }
     
    }
    
    
    
    
    
}//FIN CLASE 
