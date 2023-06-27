/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author krist
 */
public class RegistroJugadores {
    
    ArrayList<Jugador> arregloJugadores;
    EscritorJugador escritorJugador;
    LectorJugador lectorJugador;
    int puntuacionMax = 0;
    private final String nombreArchivo = "puntuaciones.csv";
    //boolean top = false;

    public RegistroJugadores() {
        arregloJugadores = new ArrayList<>();
        escritorJugador = new EscritorJugador(nombreArchivo);
        lectorJugador = new LectorJugador(nombreArchivo);
       arregloJugadores.addAll(lectorJugador.leer());
    }//constructor
    
    public void agregarPuntuacion(Jugador jugador) {
        if (jugador != null) {
            if (arregloJugadores.size() < 9) {
                if(jugador.getPuntuacion()>puntuacionMax){
                puntuacionMax = jugador.getPuntuacion();
                arregloJugadores.add(jugador);
                escritorJugador.escribir(arregloJugadores);
                Collections.sort(arregloJugadores);
 
                }
                 
            }
           
        }
    }
   /* ArrayList<Jugador> arregloOrdenado = arregloOrdenado(arregloJugadores);
    public ArrayList<Jugador> arregloOrdenado(ArrayList arregloJugadores){
    ArrayList<Jugador> arregloOrdenado = new ArrayList<>();
    
        for (int i = 0; i < arregloJugadores.size(); i++) {
            for (int j = 0; i+1 < arregloJugadores.size(); j++) {
                if(arregloJugadores.get(j)){
                
                }
            }
            
        }
    
    return arregloOrdenado;
    }*/
    
    
     public String[][] getDataMatriz() {
        arregloJugadores = new ArrayList<>();
        arregloJugadores.addAll(lectorJugador.leer());
        String[][] matrizData = new String[arregloJugadores.size()][Jugador.TBL_ETIQUETAS.length];
        for (int i = 0; i < arregloJugadores.size(); i++) {
            matrizData[i][0] = arregloJugadores.get(i).getNombre();
            matrizData[i][1] = arregloJugadores.get(i).getApellido();
            matrizData[i][2] = arregloJugadores.get(i).getNickName();
            matrizData[i][4] = arregloJugadores.get(i).getFecha();
            matrizData[i][3] = arregloJugadores.get(i).getPuntuacion() + "";
            
        }
        return matrizData;
    }
    
    
    
}//FIN CLASE
