 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.Circumferencia;

import java.awt.Graphics;

/**
 *
 * @author professor
 */
public class VistaCircumferencia extends javax.swing.JPanel {

    /**
     * Creates new form VistaCircumferencia
     */
    private int x;
    private int y;
    private  int diametroX;
    private int diametroY;
    public VistaCircumferencia() {
        initComponents();
        
    }

    public VistaCircumferencia(int x, int y, int diametroX, int diametroY) {
        initComponents();
        this.x = x;
        this.y = y;
        this.diametroX = diametroX;
        this.diametroY = diametroY;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDiametroX(int diametroX) {
        this.diametroX = diametroX;
    }

    public void setDiametroY(int diametroY) {
        this.diametroY = diametroY;
    }

   
    
    
    public  void paintComponent(Graphics g){
        g.fillOval(x,y,diametroX,diametroY);//x,y,width,height
        //x= discancia del borde de la izkierda a la circumferencia
        //y= distancia del arriba kon el borde de la circumferecia
        //witdh= ancho
        //height=altura
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
