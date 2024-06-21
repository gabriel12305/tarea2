package ec.edu.espol;

public class Componente {
    private double costo;
    private String nombre;

    public Componente(double costo, String nombre){
        this.costo = costo;
        this.nombre = nombre;
    }

    public Componente(String nombre){
        this.nombre = nombre;
        costo = 10;
    }

    public String getNombre(){
        return nombre;
    }

    public double getCosto(){
        return costo;
    }

    public String toString(){
        return "Costo: " + costo + " Nombre: " + nombre;
    }
}
