package ProgamaGimnasio;
public class Planes {
    
    private String nombre_plan; 
    private int horas;
    private double Precio;
    
    
    public Planes(String nombre_plan, int horas, double precio) {
        this.nombre_plan = nombre_plan;
        this.horas = horas;
        this.Precio = precio;
    }


    //SETTERS Y GETTERS


    public String getNombre_plan() {
        return nombre_plan;
    }


    public void setNombre_plan(String nombre_plan) {
        this.nombre_plan = nombre_plan;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }


}
