package model;

public abstract class PlanDatos{
    private String nombre;
    private float tasa;

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public abstract float calculoPago(int datos);

    public String toString(){
        return "Nombre: "+nombre+
                "\nTasa: "+tasa;
    }
}
