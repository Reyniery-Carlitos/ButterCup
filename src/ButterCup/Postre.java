package ButterCup;

import java.util.ArrayList;

public class Postre{
    String idPostre;
    String nombrePostre;
    float precio;
    float costoInsumo;
    float gastoUnitario;
    int cantidad;
    float total = 0;
    public Cliente listaCliente;
    public Cocinero listaCocinero;
    Insumo insumosNecesarios;
    ArrayList<Insumo> insumos = new ArrayList<Insumo>();

    // METODO CONSTRUCTOR DE LA CLASE POSTRE
    public Postre(String idPostre, String nombrePostre, float precio){
        this.idPostre = idPostre;
        this.nombrePostre = nombrePostre;
        this.precio = precio;

        this.insumos = new ArrayList<Insumo>();
    }

//    // RECETA PASTEL DE TRES LECHES
//    public void PastelTresLeches(Insumo productoInsumo, int cantidad){
//        productoInsumo.listaPostres = this;
//        this.insumos.add(productoInsumo);
//
//        gastoUnitario = cantidad * insumosNecesarios.precioInsumo;
//        this.gastoUnitario = gastoUnitario;
//    }
//
//    // MOSTRAR LOS INSUMOS DE LA RECETA
//    public void MostrarRecetaPastelTresLeches(){
//        int i = 0;
//        for(Insumo x: insumos){
//            System.out.println("Insumo: " + x.nombreInsumo + " Gasto total: " + this.gastoUnitario);
//        }
//    }
//
//    // RECETA PASTEL OREO
//    public void PastelOreo(Insumo productoInsumo, int cantidad){
//        productoInsumo.listaPostres = this;
//        this.insumos.add(productoInsumo);
//    }
//
//    // MOSTRAR LOS INSUMOS DE LA RECETA
//    public void MostrarPastelOreo(){
//        int i = 0;
//        for(Insumo x: insumos){
//            gastoUnitario = this.cantidad * x.precioInsumo;
//            System.out.println("Insumo: " + x.nombreInsumo + " Gasto total: " + gastoUnitario);
//        }
//    }
}
