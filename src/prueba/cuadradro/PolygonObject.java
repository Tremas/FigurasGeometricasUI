/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.cuadradro;

import java.awt.*;

/**
 * Created by professor on 20/06/2016.
 */
public class PolygonObject {
    Polygon P;
    Color c;

    public PolygonObject(int[] x, int[]y, Color c) {
        P = new Polygon();
        P.xpoints = x;
        P.ypoints = y;
        P.npoints = x.length;
        this.c = c;
    }
    void drawPolygon(Graphics g){
        g.setColor(c);
        g.drawPolygon(P);
    }
}