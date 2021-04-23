package ButterCup;

public class Insumo {
    String idInsumo;
    String nombreInsumo;
    String descripcionInsumo;
    int cantidad;
    float precioInsumo;
    Postre listaPostres;
    Sucursal listaSucursal;

    // METODO CONSTRUCTOR DE INSUMO
    public Insumo(String idInsumo, String nombreInsumo, String descripcionInsumo, int cantidad, float precioInsumo){
        this.idInsumo = idInsumo;
        this.nombreInsumo = nombreInsumo;
        this.descripcionInsumo = descripcionInsumo;
        this.cantidad = cantidad;
        this.precioInsumo = precioInsumo;
    }
}
