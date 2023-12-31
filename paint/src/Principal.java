
import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author HP
 */
public class Principal extends javax.swing.JFrame {
    
    final String NOMBRE_ARCHIVO = "dibujo.txt";
    Path rutaRelativa = Paths.get(NOMBRE_ARCHIVO);
    Path rutaAbsoluta = rutaRelativa.toAbsolutePath();
    
    FileWriter fichero = null;
    PrintWriter pw = null;
    Vector coorX = new Vector();
    Vector coorY = new Vector();
    Vector detalle = new Vector();
    String colorName = "negro";
    int xant,yant;
    Color color = new Color(0,0,0);
    public Principal() {
        initComponents();
    }
    
    public void Pinta(Graphics g, int x, int y){
        g.setColor(color);
        g.drawLine(xant,yant,x,y);
        xant = x;
        yant = y;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo.setBackground(new java.awt.Color(255, 255, 255));
        Lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LienzoMouseDragged(evt);
            }
        });
        Lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LienzoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("rojo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setText("negro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setText("azul");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Leer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseDragged
        // TODO add your handling code here:
        this.Pinta(Lienzo.getGraphics(), evt.getX(), evt.getY());
        coorX.addElement(xant);
        coorY.addElement(yant);
        detalle.addElement(colorName);
    }//GEN-LAST:event_LienzoMouseDragged

    private void LienzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LienzoMouseClicked

    private void LienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMousePressed
        // TODO add your handling code here:
        xant = evt.getX();
        yant = evt.getY();
    }//GEN-LAST:event_LienzoMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.color = jButton1.getBackground();
        this.colorName = jButton1.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.color = jButton2.getBackground();
        this.colorName = jButton2.getText();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.color = jButton3.getBackground();
        this.colorName = jButton3.getText();
        //JOptionPane.showMessageDialog(rootPane, colorName);

        /*for(int i = 0; i < detalle.size(); i++){
            JOptionPane.showMessageDialog(rootPane, detalle.elementAt(i));
        }*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            fichero = new FileWriter(rutaAbsoluta.toString(), false);
            pw = new PrintWriter(fichero);
            for(int i = 0; i < detalle.size(); i++){
                pw.print(coorX.elementAt(i) + "," + coorY.elementAt(i) + "," + detalle.elementAt(i) + "|");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero)
                    fichero.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(rutaAbsoluta.toString()));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        int cambio = 0;
        String temp = "";
        for(int i = 0; i < texto.length(); i++){
            if(cambio == 0){
                if(texto.charAt(i) == ','){
                    cambio = 1;
                    i++;
                    int a = Integer.parseInt(temp);
                    temp = "";
                    coorX.addElement(a);
                }else{
                    temp = temp + texto.charAt(i);
                }
            }
            if(cambio == 1){
                if(texto.charAt(i) == ','){
                    cambio = 2;
                    i++;
                    int a = Integer.parseInt(temp);
                    temp = "";
                    coorY.addElement(a);
                }else{
                    temp = temp + texto.charAt(i);
                }
            }
            if(cambio == 2){
                if(texto.charAt(i) == '|'){
                    cambio = 0;
                    detalle.addElement(temp);
                    temp = "";
                }else{
                    temp = temp + texto.charAt(i);
                }
            }
        }
        if(!detalle.isEmpty()){
            xant = (Integer)(coorX.elementAt(0));
            yant = (Integer)(coorY.elementAt(0));
            for(int i = 0; i < detalle.size()-1; i++){
                int m,n;
                if(detalle.elementAt(i).equals("*")){
                    this.color = jButton1.getBackground();
                    xant = (Integer)(coorX.elementAt(i+1));
                    yant = (Integer)(coorY.elementAt(i+1));
                }
                if(detalle.elementAt(i).equals("rojo")){
                    this.color = jButton1.getBackground();
                    m = (Integer)(coorX.elementAt(i));
                    n = (Integer)(coorY.elementAt(i));
                    this.Pinta(Lienzo.getGraphics(), m, n);
                }
                if(detalle.elementAt(i).equals("negro")){
                    this.color = jButton2.getBackground();
                    m = (Integer)(coorX.elementAt(i));
                    n = (Integer)(coorY.elementAt(i));
                    this.Pinta(Lienzo.getGraphics(), m, n);
                }
                if(detalle.elementAt(i).equals("azul")){
                    this.color = jButton3.getBackground();
                    m = (Integer)(coorX.elementAt(i));
                    n = (Integer)(coorY.elementAt(i));
                    this.Pinta(Lienzo.getGraphics(), m, n);
                }
            }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void LienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienzoMouseReleased
        // TODO add your handling code here:
        coorX.addElement(0);
        coorY.addElement(0);
        detalle.addElement("*");
    }//GEN-LAST:event_LienzoMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lienzo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
