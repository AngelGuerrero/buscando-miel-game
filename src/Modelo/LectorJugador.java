/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krist
 */
public class LectorJugador {

    public String nombreAchivo;
    ArrayList<Jugador> arregloJugadores;
//-----------------------------------------------------------------------------//

    public LectorJugador(String nombreAchivo) {
        this.nombreAchivo = nombreAchivo;
    }//fin constructor con parametros
//-----------------------------------------------------------------------------// 

    public ArrayList<Jugador> leer() {
        try {
            CSVReader csvReader = null;
            List<String[]> arregloVectores = null;
            arregloJugadores = new ArrayList<>();

            csvReader = new CSVReader(new FileReader(nombreAchivo));
            arregloVectores = csvReader.readAll();
            for (String[] linea : arregloVectores) {
                Jugador jugador = new Jugador(linea[0], linea[1], linea[2], linea[3], Integer.parseInt(linea[4]));
                arregloJugadores.add(jugador);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (CsvException cs) {
            cs.printStackTrace();
        }
        return arregloJugadores;
    }//fin leer
}
