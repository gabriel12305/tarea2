package ec.edu.espol;
import java.util.ArrayList;
public class EquipoElectronico {
    private double precioFabricacion;
    private String codigo;
    private ArrayList<Componente> componentes;

    public EquipoElectronico(String codigo){
        this.codigo = codigo;
        componentes = new ArrayList<>();
    }
    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    public String getCodigo() {
        return codigo;
    }

    public double getPrecioFabricacion(){
        return precioFabricacion;
    }

    public void anadirComponente(Componente c){
        if (componentes.size() <10){
            if(c instanceof ComponenteCaliente ){
                ComponenteCaliente c1 = (ComponenteCaliente) c; 
                while(c1.getTemperaturaActual() < c1.getTemperaturaRequerida()){
                    c1.calentar();
                }
                componentes.add(c1);
            }
            else{
                componentes.add(c);
            }
        }
    }

    public void calcularPrecioFabricacion(){
        double precio = 0; 
        for(Componente c: componentes){
            // if(c instanceof ComponenteCaliente){
            //     ComponenteCaliente c1 =(ComponenteCaliente) c;
            //     precio += c1.getCosto();
            // }
            // else{
            //     precio += c.getCosto();
            // }
            precio+= c.getCosto();
        }
        precioFabricacion = precio;
    }

    public String toString(){
        StringBuilder texto = new StringBuilder();
        for(Componente c: componentes){
            texto.append(c + "\n");
        }
        return texto.toString();
    }

    


}
