package ec.edu.espol;

public class ComponenteCaliente extends Componente{
    private int temperaturaRequerida;
    private int temperaturaActual;

    public ComponenteCaliente(double costo, String nombre, int tr ){
        super(costo, nombre);
        temperaturaRequerida = tr;
        temperaturaActual = 20;
    }

    public int getTemperaturaRequerida(){
        return temperaturaRequerida;
    }

    public int getTemperaturaActual(){
        return temperaturaActual;
    }

    public double tasa(){
        if (temperaturaRequerida > 0 && temperaturaRequerida <= 30){
            return 0.10;
        }
        else if(temperaturaRequerida > 30 && temperaturaActual <= 100){
            return 0.20;
        }
        else if(temperaturaRequerida > 100){
            return 0.50;
        }
        else{
            return 0;
        }
    }
    @Override
    public double getCosto(){
        return super.getCosto()+(super.getCosto() * this.tasa());
    }

    public void calentar(){
        this.temperaturaActual += 1;
    }

    public String toString(){
        return "Componente<"+ super.getNombre() +"> - Calentado a <" + temperaturaActual +"> - Precio <"+ this.getCosto()+">";
    }
}
