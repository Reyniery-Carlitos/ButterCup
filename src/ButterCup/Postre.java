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
    public Sucursal listaPostres;
    ArrayList<Insumo> insumos = new ArrayList<Insumo>();

    // METODO CONSTRUCTOR DE LA CLASE POSTRE
    public Postre(String idPostre, String nombrePostre, float precio){
        this.idPostre = idPostre;
        this.nombrePostre = nombrePostre;
        this.precio = precio;

        this.insumos = new ArrayList<Insumo>();
    }

    // ASIGNAR LOS INSUMOS A LA RECETA DEL POSTRE
    public void AgregarInsumoReceta(Insumo nuevoInsumo){
        nuevoInsumo.listaPostres = this;
        this.insumos.add(nuevoInsumo);
    }

    // METODO PARA MOSTRAR LOS INSUMOS DE LA RECETA
    public void MostrarInsumosRecetaPostre(){
        int i = 0;
        System.out.println("POSTRE \t\t\t\t" + " INSUMOS");
        for (Insumo p: insumos) {
            System.out.println(this.nombrePostre + "\t | \t" + p.nombreInsumo);
            i++;
        }
    }
}
