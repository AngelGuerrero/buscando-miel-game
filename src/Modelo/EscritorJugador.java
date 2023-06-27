/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krist
 */
public class EscritorJugador {

    private String nombreArchivo;
    //-----------------------------------------------------------------------------//

    public EscritorJugador(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }//fin constructor con parametros
    //-----------------------------------------------------------------------------//

    public List procesarJugadores(ArrayList<Jugador> arregloJugadores)//lo que hace esto que me mueve el arreglo que recibe por parametro y lo pasa a un ArrayList
    {
        List<String[]> arregloVectores = new ArrayList<>();//un ArrayList de vectores                                                              
        for (Jugador jugador : arregloJugadores) {//se iguala al cliente a la posicion que tiene el arregloClentes 
            arregloVectores.add(new String[]{jugador.getNombre(), jugador.getApellido(), jugador.getNickName(), jugador.getFecha(), jugador.getPuntuacion() + ""});
        }
        return arregloVectores;
    }//fin procesar

    public void escribir(ArrayList<Jugador> jugadores) {
        try {
            CSVWriter csvOutput = new CSVWriter(new FileWriter(nombreArchivo, false));
            csvOutput.writeAll(procesarJugadores(jugadores));
            csvOutput.close();
        } catch (IOException io) {
            io.printStackTrace();
        }//fin catch
    }//fin escribir

}//fin EscritorCliente

