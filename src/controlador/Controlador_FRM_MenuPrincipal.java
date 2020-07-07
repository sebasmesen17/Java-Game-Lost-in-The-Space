
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import vista.FRM_Info;
import vista.FRM_JuegoLOST;
import vista.FRM_MenuPrincipal;
import vista.FRM_Stats;


public class Controlador_FRM_MenuPrincipal implements ActionListener{

    FRM_MenuPrincipal frm_principal;
    FRM_JuegoLOST frm_juego;
    FRM_Stats frm_stats;
    FRM_Info frm_info;
    File archivo;
    String direccion=""; 

    
    
    public Controlador_FRM_MenuPrincipal(FRM_MenuPrincipal frm){
        this.frm_principal=frm;
        frm_stats = new FRM_Stats(frm);
        frm_juego = new FRM_JuegoLOST(frm_stats);
        frm_juego.hilo.start();
        frm_info = new FRM_Info(); 
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("hard")){
            frm_juego.setVisible(true);
            frm_juego.velocidad(25);
            frm_juego.fondo1();
            frm_principal.setVisible(false);
            frm_juego.hilo.gameOver=false;
            frm_juego.vidas=3;
            FRM_JuegoLOST.puntaje=0;
        }
        
        if(e.getActionCommand().equals("easy")){
            frm_juego.setVisible(true);
            frm_juego.velocidad(17);
            frm_juego.fondo2();
            frm_principal.setVisible(false);
            frm_juego.hilo.gameOver=false;
            frm_juego.vidas=3;
            FRM_JuegoLOST.puntaje=0;
        }
        
        if(e.getActionCommand().equals("salir")){
            System.exit(0);
        }
        
         if(e.getActionCommand().equals("Estadisticas")){
            frm_stats.setVisible(true);
            frm_stats.block();
         
        }
         if(e.getActionCommand().equals("i")){
           frm_info.setVisible(true);
        }
         
          
          if(e.getActionCommand().equals("alien")){
           frm_juego.imagenMarciano();
              JOptionPane.showMessageDialog(null, "Groot seleccionado, ¡Suerte!");
        }
          
          if(e.getActionCommand().equals("astro")){
           frm_juego.imagenAstro();
           JOptionPane.showMessageDialog(null, "Astronauta saludón seleccionado, ¡Suerte!");
        }
          
          if(e.getActionCommand().equals("thor")){
           frm_juego.imagenThor();
           JOptionPane.showMessageDialog(null, "Thor seleccionado, ¡Suerte!");
        }
          
          if(e.getActionCommand().equals("new")){
     JOptionPane.showMessageDialog(null,"Bienvenido al cargador de personajes \n ADVERTENCIAS:\n 1.Preferiblemente la imagen debe ser en formato png. \n 2. La resolución debe de ser recomendablemente 155x200 px \n 3. Puede que el juego no funcione de la forma correcta con su imagen. ");

      this.seleccionarCarpeta();
      frm_juego.personajeCustom(direccion);
      
        }
          
          
          
    }
    
              public void seleccionarCarpeta()
    {
        JFileChooser ruta = new JFileChooser();
        ruta.setFileSelectionMode(JFileChooser.FILES_ONLY);
        ruta.showOpenDialog(null);
        archivo = ruta.getSelectedFile();
        direccion= archivo.getAbsolutePath()+"\\";
        
        
       
    }
    
}//class
