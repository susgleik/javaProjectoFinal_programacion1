package ProgamaGimnasio;



class Instructor {

    private String nombre;
    private int IDI;
    
    

    public Instructor (String nombre, int IDI){

        this.nombre = nombre;
        this.IDI = IDI;    
    }

    //SETTERS & GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIDI() {
        return IDI;
    }

    public void setIDI(int iDI) {
        IDI = iDI;
    }

    

}
