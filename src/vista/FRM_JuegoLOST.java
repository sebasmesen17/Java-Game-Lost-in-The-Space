
package vista;
import controlador.Controlador_FRM_MenuPrincipal;
import controlador.Hilo;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class FRM_JuegoLOST extends javax.swing.JFrame  {

   public Hilo hilo;
    String estadoPersonaje="";
    public static int puntaje=0;
   public static int vidas=3;
    Controlador_FRM_MenuPrincipal controlador;
    int tiempo=0;
    FRM_Stats frm_stats;
    FRM_Info info;
    
    String nitro="";

    ImageIcon personaje = null;
    ImageIcon alien = null;
    ImageIcon astro = null;
    ImageIcon thor = null;
    ImageIcon fondo2 = null;
    ImageIcon enemigo2 = null;
    ImageIcon fondo1=null;
       public static int valor=0;
       int velocidad=+1;
    public FRM_JuegoLOST(FRM_Stats frm_stats) {
        super("                                                                       L O S T             I N             T H E             S P A C E");
        initComponents();
        setLocationRelativeTo(null);
       /* astro = new ImageIcon(getClass().getResource("../imagenes/Astronauta (1) (1).gif"));
        alien  = new ImageIcon(getClass().getResource("../imagenes/grootrotado (1).png"));
        thor = new ImageIcon(getClass().getResource("../imagenes/thor.png"));
        fondo1 = new ImageIcon(getClass().getResource("../imagenes/fondo grande.png"));
        fondo2 = new ImageIcon(getClass().getResource("../imagenes/fondo4.png"));
        enemigo2 = new ImageIcon(getClass().getResource("../imagenes/2meteorito2.png"));
        
       C:\Users\sebas\OneDrive\Documentos\LostInTheSpace\src\imagenes\Astronauta (1) (1).gif
        */
       
        astro = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\Astronauta (1) (1).gif");
        alien  = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\grootrotado (1).png");
        thor = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\thor.png");
        fondo1 = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\fondo grande.png");
        fondo2 = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\fondo4.png");
        enemigo2 = new ImageIcon("C:\\Users\\sebas\\OneDrive\\Documentos\\LostInTheSpace\\src\\imagenes\\2meteorito2.png");
        
         this.frm_stats = frm_stats;
        hilo = new Hilo(this);
        txt_score.setText("Puntaje: ");
        lbl_personaje.setIcon(astro);
    }//constructor
    
    public void personajeCustom(String ruta){
         ImageIcon personajeCustom  = new ImageIcon(ruta);
         lbl_personaje.setIcon(personajeCustom);
    }
    
    public void velocidad(int cantidad){
        velocidad = cantidad;
    }
    

    
    public void fondo1(){
        lbl_fondo.setIcon(fondo1);
    }
    
    
    public void fondo2(){
        lbl_fondo.setIcon(fondo2);
    }
    
    
    public void imagenMarciano(){
        lbl_personaje.setIcon(alien);

    }
    
    public void imagenThor(){
        lbl_personaje.setIcon(thor);

    }
    
    public void imagenAstro(){

        lbl_personaje.setIcon(astro);
    }
   
   
    
    public void moverFondo(){
        if(lbl_fondo.getY()<-4900){
            lbl_fondo.setLocation(lbl_fondo.getX(), 0);
        }
        lbl_fondo.setLocation(lbl_fondo.getX(), lbl_fondo.getY()-velocidad);
    }

    public void nitro(){
        if(nitro.equals("si")){
        lbl_fondo.setLocation(lbl_fondo.getX(), lbl_fondo.getY()-velocidad-75);
       
        }
    }
    public void vidas(){
        if(vidas==3){
            lbl_vida1.setVisible(true);
            lbl_vida2.setVisible(true);
            lbl_vida3.setVisible(true);
        }
         
    }
    
   
    
    
    public String returnPuntaje(){
        return txt_score.getText();
    }
    
    public void gameStatus(){
        if(vidas==0){
            Hilo.gameOver= true;
        }
        
    }
    
   public void score(){
        
        tiempo++;
        if(tiempo%50==0)
        {
            puntaje++;
            txt_score.setText("Puntaje: "+puntaje);
        }
     }   
   
   
    public void enemigo(){
        if(lbl_enemigo.getY()<-600){
          lbl_enemigo.setLocation((10)+(int)(Math.random()*800),(1000)+(int)(Math.random()*1500));
      }
      lbl_enemigo.setLocation(lbl_enemigo.getX(), lbl_enemigo.getY()-velocidad);
      if(nitro.equals("si")){
          lbl_enemigo.setLocation(lbl_enemigo.getX(), lbl_enemigo.getY()-velocidad-15);
      }

    }
    
    public void enemigo2(){
        if(lbl_enemigo2.getY()<-600){
          lbl_enemigo2.setLocation((10)+(int)(Math.random()*800),(1000)+(int)(Math.random()*1500));
      }
      lbl_enemigo2.setLocation(lbl_enemigo2.getX(), lbl_enemigo2.getY()-velocidad);
      if(nitro.equals("si")){
          lbl_enemigo2.setLocation(lbl_enemigo2.getX(), lbl_enemigo2.getY()-velocidad-15);
      }
      
    }
    
      public void enemigo3(){
        if(lbl_enemigo3.getY()<-600){
          lbl_enemigo3.setLocation((10)+(int)(Math.random()*800),(1000)+(int)(Math.random()*1500));
      }
      lbl_enemigo3.setLocation(lbl_enemigo3.getX(), lbl_enemigo3.getY()-velocidad);
      if(nitro.equals("si")){
          lbl_enemigo3.setLocation(lbl_enemigo3.getX(), lbl_enemigo3.getY()-velocidad-15);
      }
    }
      
        public void enemigo4(){
        if(lbl_enemigo4.getY()<-600){
          lbl_enemigo4.setLocation((10)+(int)(Math.random()*800),(1000)+(int)(Math.random()*1500));
      }
      lbl_enemigo4.setLocation(lbl_enemigo4.getX(), lbl_enemigo4.getY()-velocidad);
      
      if(nitro.equals("si")){
          lbl_enemigo4.setLocation(lbl_enemigo4.getX(), lbl_enemigo4.getY()-velocidad-15);
      }
    }
    

    
    

    public void  verificarColisiones()
    {

       if(lbl_personaje.getX()+70>lbl_enemigo.getX()&& lbl_enemigo.getX()+50>lbl_personaje.getX() && lbl_personaje.getY()+50>lbl_enemigo.getY()&& lbl_enemigo.getY()+50>lbl_personaje.getY())
        {
            vidas-=1;
            System.out.println("Colisión 1");
            lbl_enemigo.setLocation(lbl_enemigo.getX(), -700);
        }
       
       if(lbl_personaje.getX()+70>lbl_enemigo2.getX()&& lbl_enemigo2.getX()+50>lbl_personaje.getX() && lbl_personaje.getY()+50>lbl_enemigo2.getY()&& lbl_enemigo2.getY()+50>lbl_personaje.getY())
        {
            vidas-=1;
            System.out.println("Colisión 2");
            lbl_enemigo2.setLocation(lbl_enemigo2.getX(), -700);
        }
       
       if(lbl_personaje.getX()+70>lbl_enemigo3.getX()&& lbl_enemigo3.getX()+50>lbl_personaje.getX() && lbl_personaje.getY()+50>lbl_enemigo3.getY()&& lbl_enemigo3.getY()+50>lbl_personaje.getY())
        {
            vidas-=1;
            System.out.println("Colisión 3");
            lbl_enemigo3.setLocation(lbl_enemigo3.getX(), -700);
        }
       
       if(lbl_personaje.getX()+70>lbl_enemigo4.getX()&& lbl_enemigo4.getX()+50>lbl_personaje.getX() && lbl_personaje.getY()+50>lbl_enemigo4.getY()&& lbl_enemigo4.getY()+50>lbl_personaje.getY())
        {
            vidas-=1;
            System.out.println("Colisión 4");
            lbl_enemigo4.setLocation(lbl_enemigo4.getX(), -700);
        }
       
    }
    
    public void marcadorVidas(){
        if(vidas==2){
            lbl_vida2.setLocation(1000, 1000);
        }
        if(vidas==1){
            lbl_vida3.setLocation(1000, 1000);
        }
        if(vidas==0){
            lbl_vida1.setLocation(1000, 1000);
            this.setVisible(false);
            this.frm_stats.setVisible(true);
            estadoPersonaje= "quieto";       
            nitro="no";
            this.frm_stats.habilitar();

        }
        
    }

    
       public void moverAtronauta(){
           
         if(estadoPersonaje=="izquierda"){
           if(lbl_personaje.getX()>0){
           lbl_personaje.setLocation(lbl_personaje.getX()-30, lbl_personaje.getY());}
        }else if(estadoPersonaje=="derecha"){ 
            if(lbl_personaje.getX()<800){
           lbl_personaje.setLocation(lbl_personaje.getX()+30, lbl_personaje.getY());}
        }
       }
    
  
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_personaje = new javax.swing.JLabel();
        lbl_vida1 = new javax.swing.JLabel();
        lbl_vida3 = new javax.swing.JLabel();
        lbl_vida2 = new javax.swing.JLabel();
        txt_score = new javax.swing.JTextField();
        lbl_enemigo = new javax.swing.JLabel();
        lbl_enemigo2 = new javax.swing.JLabel();
        lbl_enemigo3 = new javax.swing.JLabel();
        lbl_enemigo4 = new javax.swing.JLabel();
        lbl_nitro = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(970, 838));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_personaje.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(lbl_personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, 280));

        lbl_vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casconegro.png"))); // NOI18N
        getContentPane().add(lbl_vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 40));

        lbl_vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casconegro.png"))); // NOI18N
        getContentPane().add(lbl_vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 50, 40));

        lbl_vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casconegro.png"))); // NOI18N
        getContentPane().add(lbl_vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 50, 40));

        txt_score.setEnabled(false);
        txt_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_scoreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        lbl_enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meteoritopequeño.png"))); // NOI18N
        getContentPane().add(lbl_enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, -1));

        lbl_enemigo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meteoritopequeño.png"))); // NOI18N
        getContentPane().add(lbl_enemigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        lbl_enemigo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meteoritopequeño.png"))); // NOI18N
        getContentPane().add(lbl_enemigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, -1, -1));

        lbl_enemigo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/meteoritopequeño.png"))); // NOI18N
        getContentPane().add(lbl_enemigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, -1, -1));

        lbl_nitro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nitro.setText("NITRO-> SPACE");
        lbl_nitro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(lbl_nitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        lbl_fondo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo grande.png"))); // NOI18N
        lbl_fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_fondo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbl_fondo.setMaximumSize(new java.awt.Dimension(1000, 700));
        lbl_fondo.setMinimumSize(new java.awt.Dimension(400, 350));
        lbl_fondo.setPreferredSize(new java.awt.Dimension(1000, 5961));
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
        lbl_fondo.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
      if(evt.getKeyCode()==37){
          estadoPersonaje= "izquierda";   
      }
       if(evt.getKeyCode()==39){
          estadoPersonaje= "derecha";   
      }
       
        if(evt.getKeyCode()==32){
          nitro= "si";   
      }
       
      
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
          estadoPersonaje= "quieto";       // TODO add your handling code here:
          nitro="no";
    }//GEN-LAST:event_formKeyReleased

    private void txt_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_scoreActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        lbl_personaje.setLocation(evt.getX(), lbl_personaje.getY());
    }//GEN-LAST:event_formMouseMoved

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRM_JUEGO_EMPRESARIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRM_JUEGO_EMPRESARIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRM_JUEGO_EMPRESARIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRM_JUEGO_EMPRESARIAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRM_JUEGO_EMPRESARIAL().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_enemigo;
    private javax.swing.JLabel lbl_enemigo2;
    private javax.swing.JLabel lbl_enemigo3;
    private javax.swing.JLabel lbl_enemigo4;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_nitro;
    private javax.swing.JLabel lbl_personaje;
    private javax.swing.JLabel lbl_vida1;
    private javax.swing.JLabel lbl_vida2;
    private javax.swing.JLabel lbl_vida3;
    private javax.swing.JTextField txt_score;
    // End of variables declaration//GEN-END:variables

  
}
