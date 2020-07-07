 
package vista;

import controlador.Controlador_Stats;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Stats;


public class FRM_Stats extends javax.swing.JFrame {

    DefaultTableModel modelo;
    String columna[];
    Date fecha;
    Controlador_Stats controlador;
    FRM_MenuPrincipal frm_principal;
    public FRM_Stats(FRM_MenuPrincipal frm) {
        initComponents();
        this.frm_principal=frm;
        columna = new String[4];
        columna[0]="Posicion";
        columna[1]="Nombre";
        columna[2]="Puntaje";
        columna[3]="Fecha";
        modelo=new DefaultTableModel();
        jTable1.setModel(modelo);
        modelo.setColumnIdentifiers(columna); 
        fecha = new Date();
        lbl_fecha.setText(fecha.toLocaleString());
        setLocationRelativeTo(null);
        controlador = new Controlador_Stats(this, frm_principal);
        btn_add.addActionListener(controlador);
        btn_jugardenuevo.addActionListener(controlador);

    }
    
    public void habilitar(){
        btn_add.setEnabled(true);
        this.txt_nombre.setEnabled(true);
        this.txt_nombre.setText("");
    }
    
    public void block(){
        txt_nombre.setEnabled(false);
        txt_nombre.setText("Debes de jugar para dejar huella");
        btn_add.setEnabled(false);
    }
    
    public void limpiar(){
        txt_nombre.setText("");
        int tamanio=modelo.getRowCount();
        for(int contador=0;contador<tamanio;contador++)
        {
            modelo.removeRow(0);
        }
    }
    

     public String returnFecha(){
        return lbl_fecha.getText();
    }
     
     public void cargarInformacionTabla(ArrayList<Stats> stats)
    {
       String informacion[]=new String [4];
       
       for(int contador=0;contador<stats.size();contador++)
       {
            if(contador==0)
            {
                informacion[0]="Primero";  
            }
            if(contador==1)
            {
                informacion[0]="Segundo";  
            }
            if(contador==2)
            {
                informacion[0]="Tercero";  
            }
            if(contador==3)
            {
                informacion[0]="Cuarto";  
            }
            if(contador==4)
            {
                informacion[0]="Quinto";  
            }
            if(contador==5)
            {
                informacion[0]="Sexto";  
            }
            if(contador==6)
            {
                informacion[0]="Setimo";  
            }
            if(contador==7)
            {
                informacion[0]="Octavo";  
            }
            if(contador==8)
            {
                informacion[0]="Noveno";  
            }   
            
            if(contador==9)
            {
                informacion[0]="Decimo";  
            } 

            informacion[1]=stats.get(contador).getNombre();
            informacion[2]=stats.get(contador).getPuntuacion()+"";
            informacion[3]=stats.get(contador).getFecha();
             modelo.addRow(informacion);
       }
       
       
    
    }   
    
    
    public String[] devolverInformacion(){

        String informacion[];
        informacion= new String[4];
        informacion[1]= txt_nombre.getText();
        informacion[3]=  this.returnFecha();
        informacion[2]= ""+FRM_JuegoLOST.puntaje;
        return informacion;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Nombre = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jt_scores = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_jugardenuevo = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(650, 569));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre.setText("Nombre: ");
        getContentPane().add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 50));

        lbl_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 230, 30));

        txt_nombre.setText("Debes de jugar para dejar huella");
        txt_nombre.setEnabled(false);
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jt_scores.setViewportView(jTable1);

        getContentPane().add(jt_scores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 590, 180));

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/checkkk.png"))); // NOI18N
        btn_add.setActionCommand("add");
        btn_add.setBorderPainted(false);
        btn_add.setEnabled(false);
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, 40));

        btn_jugardenuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/giphy plsy.gif"))); // NOI18N
        btn_jugardenuevo.setActionCommand("playagain");
        btn_jugardenuevo.setBorderPainted(false);
        getContentPane().add(btn_jugardenuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 170));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/black.jpg"))); // NOI18N
        lbl_fondo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_jugardenuevo;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane jt_scores;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
