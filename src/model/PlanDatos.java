package model;

public abstract class PlanDatos{
    protected String nombre;
    protected float tasa;

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float calculoPago(int datos){
        return tasa * datos;
    }

    public String toString(){
        return "Nombre: "+nombre+
               "\nTasa: "+tasa;
    }
}
