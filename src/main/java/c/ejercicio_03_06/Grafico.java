package c.ejercicio_03_06;

import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class Grafico extends Coordenada{
    
    private int ancho;
    private int alto;

    public Grafico() {
        this.ancho = 0;
        this.alto = 0;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    // Graficos 
    public void dibujarCirculo(Graphics g){
        g.drawOval(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        //g.fillOval(this.getX(), this.getY(), this.getAncho(), this.getAlto());
    }
    
    public void dibujarRectangulo(Graphics g){
        g.drawRect(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        //g.fillRect(this.getX(), this.getY(), this.getAncho(), this.getAlto());
    }
    
    public void dibujarCuadrado(Graphics g){
        g.drawRect(this.getX(), this.getY(), this.getAncho(), this.getAlto());
        //g.fillRect(this.getX(), this.getY(), this.getAncho(), this.getAlto());
    }
    
    public  void dibujarEstrella(Graphics g){
       int[] cx = {30,25,15,23,20,30,40,37,45,35};
       int[] cy = {10,20,20,28,40,34,40,28,20,20};
       g.create(this.getX(), this.getY(), this.getAncho(), this.getAlto()).drawPolygon(cx, cy,10);
       //g.create(this.getX(), this.getY(), this.getAncho(), this.getAlto()).fillPolygon(cx, cy,10);
       
    }
    
    public void dibujarTriangulo(Graphics g){
       int[] cx = {50,100,0};
       int[] cy = {0,100,100};
       g.create(this.getX(), this.getY(), this.getAncho(), this.getAlto()).drawPolygon(cx, cy,3);
       //g.create(this.getX(), this.getY(), this.getAncho(), this.getAlto()).fillPolygon(cx, cy, 3);
    }
    
    
}
