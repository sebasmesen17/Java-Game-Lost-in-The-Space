
package modelo;

import java.io.Serializable;

public class Stats implements Serializable{
    
    private String posicion;
    private String nombre;
    private int puntuacion;
    private String fecha;

    public Stats(String posicion, String nombre, int puntuacion, String fecha) {
        this.posicion = posicion;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
