package colaconprioridadcircularaema;

public class ColaSimple {
    
//Declaramos los valores
    protected int ini;
    protected int fin;
    protected Prioridad[] vector;
    
    public ColaSimple(int tamaño){
        this.ini=-1;
        this.fin=-1;
        this.vector = new Prioridad [tamaño];
    }

//Funcion Insertar
    public boolean insertar(Prioridad objeto){

        if(estaColaLlena()) return false;
        fin++;
        vector[fin] = objeto;
        if(ini == -1) ini=0;
        OrdenarPrioridad();
        return true;
    }
    
//Funcion Eliminar
    public boolean eliminar(){
        if(estaColaVacia())return false;
        if(hayUnSoloDato()){
            ini =-1; fin =-1;
            return true;
        }
        ini++;
        return true;
    }
    
//Funcion OrdenarPrioridad
    private void OrdenarPrioridad(){
        Prioridad aux;
        int t1 = fin, t2 = fin-1;
        
        if(hayUnSoloDato()){
            return;
        }
        
        while (t1 != ini){
            if(vector[t1].getNivel() > vector[t2].getNivel()){
                aux = new Prioridad(vector[t1].getDato(), vector[t1].getNivel());
                vector[t1] = vector[t2];
                vector[t2] = aux;
                t2--; t1--;
            }else{
                break;
            }
        }
    }
    
//Funcion estaColaLlena
    public boolean estaColaLlena(){
        return fin == vector.length-1;
    }

//Funcion estaColaVacia   
    protected boolean estaColaVacia(){
        return ini == -1 && fin == -1;
    }

//Funcion hayUnSoloDato   
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }
    
//Get´s
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
    
    //public char getValor(int pos){
    //    return vector[pos];
    //}
    
    public Prioridad getVector(int posicion) {
         return vector[posicion];
    }
    
    public int getTam() {
         return vector.length;
    }
      
    }

