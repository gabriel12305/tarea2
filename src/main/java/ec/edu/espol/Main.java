package ec.edu.espol;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
private static ArrayList<Componente> componentes= new ArrayList<>();

    public static Componente obtenerComponente(String nombre){
        for(Componente c : componentes){
            if(c.getNombre().equals(nombre)){
                return c;
            }
            // if(c instanceof ComponenteCaliente){
            //     ComponenteCaliente c1 =(ComponenteCaliente) c;
            //     if(c1.getNombre().equals(nombre)){
            //         return c;
            //     }
            // }
            // else{
            //     if(c.getNombre().equals(nombre)){
            //         return c;
            //     }
            // }
        }
        return null;
    }

    public static EquipoElectronico armarEquipoElectronico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu equipo electronico: ");
        EquipoElectronico equipoElectronico = new EquipoElectronico(sc.nextLine());
        int num = 0;
        while (num < 1 || num > 10 ){
            System.out.println("Introduce el # de componentes que quieres para tu equipo electonico: ");
            num = sc.nextInt();

        }
        sc.nextLine();

        while (num >= 1) {
            System.out.println("Introduce la componente que deseas agreagar: ");
            String nombre = sc.nextLine();
            if (obtenerComponente(nombre) != null){
                Componente componente = obtenerComponente(nombre);
                equipoElectronico.anadirComponente(componente);
                num -= 1;
            }
            else{
                System.out.println("Esa componente no existe");
            }
        }
        sc.close();
        equipoElectronico.calcularPrecioFabricacion();
        System.out.println("Costo total: "+equipoElectronico.getPrecioFabricacion());
        System.out.println(equipoElectronico);
        return equipoElectronico;
    }
    public static void main(String[] args) {
        ComponenteCaliente cc1 = new ComponenteCaliente(300, "Pc", 40);
        ComponenteCaliente cc2 = new ComponenteCaliente(100, "DiscoDuro", 110);
        Componente c1 = new Componente(25, "mouse");
        Componente c2 = new Componente(10, "audifonos");

        //EquipoElectronico computadora = new EquipoElectronico("001");
        // computadora.anadirComponente(cc1);
        // computadora.anadirComponente(cc2);
        // computadora.anadirComponente(c1);
        // computadora.anadirComponente(c2);
        // System.out.println(computadora.getComponentes().size());
        // System.out.println(computadora);
        // computadora.calcularPrecioFabricacion();
        // System.out.println(computadora.getPrecioFabricacion());
        // System.out.println(obtenerComponente("parlantes"));

        ComponenteCaliente pieza1= new ComponenteCaliente(3, "CPU", 20);
        componentes.add(pieza1);
        componentes.add(c1);
        componentes.add(c2);
        componentes.add(cc2);
        componentes.add(cc1);
        componentes.add(new ComponenteCaliente(50, "RAM", 30));
        componentes.add(new ComponenteCaliente(20, "GPU", 50));
        componentes.add(new ComponenteCaliente(40, "Ventiladores", 110));
        componentes.add(new ComponenteCaliente(70, "Placa Base", 30));
        componentes.add(new ComponenteCaliente(20, "PSU", 5));
        componentes.add(new ComponenteCaliente(45, "Disipadores", 30));
        componentes.add(new Componente(30,"Teclado"));
        componentes.add(new Componente(10,"DVD"));
        componentes.add(new Componente(70,"Monitor"));
        componentes.add(new Componente(40,"NIC"));
        armarEquipoElectronico();
        //HOLAAAAAAAAAAAAA

        //AAAA
    }
}