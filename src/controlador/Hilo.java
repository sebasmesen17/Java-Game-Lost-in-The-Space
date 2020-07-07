
package controlador;

import modelo.Stats;
import vista.FRM_JuegoLOST;
import vista.FRM_MenuPrincipal;
import vista.FRM_Stats;


public class Hilo extends Thread{
    
    FRM_JuegoLOST frm_juego;
   public static boolean gameOver=true;
public Hilo(FRM_JuegoLOST frm_juego){

    this.frm_juego=frm_juego;
}    
    

public void run(){
    

    try{
        while(true){
            if(!gameOver){
                frm_juego.moverFondo();
                frm_juego.moverAtronauta();
                frm_juego.verificarColisiones();
                frm_juego.score();
                frm_juego.gameStatus();
                frm_juego.marcadorVidas();
                frm_juego.enemigo();
                frm_juego.enemigo2();
                frm_juego.enemigo3();
                frm_juego.enemigo4();
                frm_juego.vidas();
      
            }
            
            sleep(10);
        }
    
    }//try
    catch(Exception e)
    {
        System.out.println("Error en la ejecución del hilo"+e);

    }//catch
        
}//metodo run

}//class HILO
