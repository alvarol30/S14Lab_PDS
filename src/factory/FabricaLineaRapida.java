package factory;

import model.PlanDatos;
import model.PlanDatosAcademico;
import model.PlanDatosNegocio;
import model.PlanDatosPersonal;

public class FabricaLineaRapida extends FabricaCreadora{

    @Override
    public PlanDatos crearPlanDatos(String tipo){
        PlanDatos plan;

        switch (tipo.toLowerCase()){
            case "academico":
                plan = new PlanDatosAcademico();
                plan.setTasa(1.0f);
                break;
            case "personal":
                plan = new PlanDatosAcademico();
                plan.setTasa(0.5f);
                break;
            case "negocio":
                plan = new PlanDatosAcademico();
                plan.setTasa(1.5f);
                break;
            default:
                throw new IllegalArgumentException("Tipo de plan inválido");
        }
        return plan;
    }
}
