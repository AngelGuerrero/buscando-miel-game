/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FRM_AreaJuego;
import static java.lang.Thread.sleep;

/**
 *
 * @author krist
 */
public class HiloJuego extends Thread {
     FRM_AreaJuego frmAreaJuego;//Referencia ala ventana
    public boolean gameOver = false;//Variable que me va a servir para condicionar la ejecución del hilo

    public HiloJuego(FRM_AreaJuego frmAreaJuego) {
        this.frmAreaJuego = frmAreaJuego;
    }//Fin del constructor

    public void run() {
        try {
            //Me ejecuta el proceso siempre y cuando gameOver sea diferente a true
            while(!gameOver){
            frmAreaJuego.moverFondo();
            frmAreaJuego.moverPersonaje();
            frmAreaJuego.moverAbeja();
            frmAreaJuego.detectarColision();
            sleep(40);
            }
           // frmAreaJuego.mensaje("Juego terminado");
            frmAreaJuego.dispose();
        } catch (Exception e) {
            e.getMessage();
        }

    }//Fin del metodo run
    
}
