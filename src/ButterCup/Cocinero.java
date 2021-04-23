package ButterCup;

import java.util.ArrayList;

public class Cocinero {
    String idCocinero;
    String nombreCocinero;
    Sucursal sucursalLabora;
    ArrayList<Postre> postres = new ArrayList<Postre>();

    // METODO CONSTRUCTOR DE COCINERO
    public Cocinero(String idCocinero, String nombreCocinero, Sucursal sucursalLabora){
        this.idCocinero = idCocinero;
        this.nombreCocinero = nombreCocinero;
        this.sucursalLabora = sucursalLabora;
    }

    // METODO PARA AGREGAR POSTRES AL COCINERO
    public void AgregarPostres(Postre postresCocinero){
        // Asignando el postre del pedido del cliente
        postresCocinero.listaCocinero = this;
        this.postres.add(postresCocinero);
    }

    // METODO PARA MOSTRAR POSTRES AL COCINERO
    public void MostrarPostres(){
        int i = 0;

        for (Postre p: postres) {
            System.out.println("Postre: " + p.nombrePostre);
        }
    }
}

