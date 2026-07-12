package app;

import factory.FabricaLineaClaro;
import factory.FabricaCreadora;
import factory.FabricaLineaRapida;
import factory.FabricaLineaMovistar;
import model.PlanDatos;

public class Main{

    public static void main(String[] args) {
        int megasConsumidos= 1000;
        calculoPago("Linea Rapida", "Personal", megasConsumidos);
        calculoPago("Linea Rapida", "Negocio", megasConsumidos);
        calculoPago("Linea Rapida", "Academico", megasConsumidos);

        calculoPago("Claro", "Personal", megasConsumidos);
        calculoPago("Claro", "Negocio", megasConsumidos);
        calculoPago("Claro", "Academico", megasConsumidos);

        calculoPago("Movistar", "Personal", megasConsumidos);
        calculoPago("Movistar", "Negocio", megasConsumidos);
        calculoPago("Movistar", "Academico", megasConsumidos);
    }

    public static void calculoPago(String proveedor, String tipoPlan, int numeroMegasConsumido){
        FabricaCreadora fabrica;
        switch (proveedor.toLowerCase()) {

            case "linea rapida":
                fabrica = new FabricaLineaRapida();
                break;

            case "claro":
                fabrica = new FabricaLineaClaro();
                break;

            case "movistar":
                fabrica = new FabricaLineaMovistar();
                break;

            default:
                System.out.println("Proveedor no válido");
                return;
        }

        PlanDatos plan= fabrica.crearPlanDatos(tipoPlan);
        float pago= plan.calculoPago(numeroMegasConsumido);
        System.out.println("--------------------------------");
        System.out.println("Proveedor: "+proveedor);
        System.out.println("Plan: "+tipoPlan);
        System.out.println("Megas consumidos: "+numeroMegasConsumido);
        System.out.println("Pago total: S/ "+pago);
    }
}