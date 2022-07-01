/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.ejercicio_03_06;

/**
 *
 * @author admin
 */
public class Coordenada {
    
    private int x;
    private int y;

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String mostrarCoordenada(){
        return "("+ this.getX()+","+this.getY()+")";
    }
    
}
