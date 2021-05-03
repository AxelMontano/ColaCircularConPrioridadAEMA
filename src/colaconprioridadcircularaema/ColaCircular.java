package colaconprioridadcircularaema;

public class ColaCircular extends ColaSimple {
    
//Super
    public ColaCircular(int t){
        super(t);
    }
    
//Funcion eliminar
    @Override
    public boolean eliminar(){
        boolean respuesta= super.eliminar();
        if(ini==vector.length) ini=0;
        return respuesta;
    }
    
//Funcion insertar
    @Override
    public boolean insertar(Prioridad prioridadOBJ){
        if(Circular()){
            if(estaColaCircularLlena()) return false;
            fin++;
            vector[fin] = prioridadOBJ;     
            return true;
        }
        
        boolean respuesta= super.insertar(prioridadOBJ);
        if(respuesta) return true;
        else{}
        if(ini==0) return false;

        fin=0;
        vector[fin]= prioridadOBJ;
        return true;
   }
    
//Funcion estaColaCircularLlena
    private boolean estaColaCircularLlena(){
        return fin+1==ini;
    }

//Funcion Circular
    protected boolean Circular(){
        return fin<ini;
    }
    

}
