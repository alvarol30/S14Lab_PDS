package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class FabricaLineaMovistar extends FabricaCreadora{

    @Override
    public PlanDatos crearPlanDatos(String tipo){
        PlanDatos plan;

        switch (tipo.toLowerCase()){
            case "academico":
                plan = new PlanDatosAcademico();
                plan.setTasa(1.25f);
                break;
            case "personal":
                plan = new PlanDatosAcademico();
                plan.setTasa(0.8f);
                break;
            case "negocio":
                plan = new PlanDatosAcademico();
                plan.setTasa(1.6f);
                break;
            default:
                throw new IllegalArgumentException("Tipo de plan inválido");
        }
        return plan;
    }
}
