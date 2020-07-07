/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Stats;
import vista.FRM_JuegoLOST;
import vista.FRM_MenuPrincipal;
import vista.FRM_Stats;

public class Controlador_Stats implements ActionListener{
   
    Stats stats;
     FRM_Stats frm_stats;  
    public Archivos_Stats archivo;
    ArrayList<Stats> estadisticas;
    FRM_JuegoLOST frm_juego;
    FRM_MenuPrincipal frm_principal;

    
    public Controlador_Stats(FRM_Stats stats, FRM_MenuPrincipal frm_principal){
        this.frm_stats=stats;
        this.frm_principal=frm_principal;
           archivo = new Archivos_Stats();
        estadisticas = new ArrayList<Stats>();
        estadisticas = archivo.returnDatos();
        frm_stats.cargarInformacionTabla(estadisticas);
        
    }

   
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("add")){
            
            String informacion[] = frm_stats.devolverInformacion();
            archivo.cargarArchivo();
            ArrayList<Stats> datos = this.archivo.returnDatos();
                                 //String posicion, String nombre, String puntuacion, String fecha
            Stats stat = new Stats(informacion[0],informacion[1],Integer.parseInt(informacion[2]), informacion[3]);

            datos.add(stat);
            
            datos = this.acomodarArray(datos);
            archivo.crearArchivo();
            
            

            if (datos.size() == 11)
            {
                datos.remove(10);
            }

            for (int contador = 0; contador < datos.size(); contador++)
            {
               archivo.escribirInformacion(datos.get(contador));
            }
           
            frm_stats.limpiar();

            frm_stats.cargarInformacionTabla(datos);

        }
        
        if(e.getActionCommand().equals("playagain")){
            frm_principal.setVisible(true);
          
        
        }
            
        }
    
    
    public ArrayList<Stats> acomodarArray (ArrayList<Stats> estadistica) {
        Stats temporal;
        for (int i = 0; i < estadistica.size(); i++) {
            for (int j = 0; j < estadistica.size() - 1; j++) {
                if (estadistica.get(j).getPuntuacion() < estadistica.get(j + 1).getPuntuacion()) {
                    temporal = estadistica.get(j);
                    estadistica.set(j, estadistica.get(j + 1));
                    estadistica.set(j + 1, temporal);
                }
            }
        }
        return estadistica;
    }
    
     }//class
    




