/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.cuadradro;

import java.awt.*;

/**
 *
 * @author professor
 */
public class VistaRectangulo extends javax.swing.JPanel {
PolygonObject Poly1;
    /**
     * Creates new form VistaRectangulo
     */
    private int x,  y,  base,  altura;

  

    public VistaRectangulo( int x, int y, int base, int altura) {
        initComponents();
        this.x = x;
        this.y = y;
        this.base = base;
        this.altura = altura;
        //Poly1 = new PolygonObject(new int[]{5,20,20,5}, new int[]{5,5,20,20},Color.blue);
        
    }
  

    public  void paintComponent(Graphics g){
        Poly1 = new PolygonObject(new int[]{x,x+base,x+base,x}, new int[]{y,y,y+altura,y+altura},Color.blue);   
       Poly1.drawPolygon(g);
    }
      public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
