package colaconprioridadcircularaema;

public class Prioridad {
    
//Declaramos valores
    private char dato;
    private int nivel;
    
    public Prioridad() {
        this.dato = "".charAt(0);
        this.nivel = 0;
    }

    public Prioridad(char dato, int nivel) {
        this.dato = dato;
        this.nivel = nivel;
    }

//Get´s
    public char getDato() {
        return dato;
    }

    public int getNivel() {
        return nivel;
    }

//Set´s
    public void setDato(char dato) {
        this.dato = dato;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }   

}
