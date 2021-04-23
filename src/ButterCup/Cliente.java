package ButterCup;

import java.util.ArrayList;

public class Cliente {
    String idCliente;
    String nombreCliente;
    int cantidad;
    String dia, mes, anio;
    public Vendedor listaVendedores;
    float subtotal;
    float total = 0;
    public Postre postrePedido;
    public Vendedor vendedorPedido;
    public Sucursal sucursales;
    Sucursal sucursalCliente;
    ArrayList<Postre> postres = new ArrayList<Postre>();

    // METODO CONSTRUCTOR DE CLIENTE
    public Cliente(String idCliente, String nombreCliente){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;

        this.postres = new ArrayList<Postre>();
    }

    // METODO PARA REALIZAR PEDIDOS DEL CLIENTE
    public void Pedir(Postre postrePedido, Sucursal sucursalCliente, int cantidad, String dia, String mes, String anio){
        this.postrePedido = postrePedido;
        this.cantidad = cantidad;
        this.sucursalCliente = sucursalCliente;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        // Asignando el postre del pedido del cliente
        postrePedido.listaCliente = this;
        this.postres.add(postrePedido);

        subtotal = cantidad * postrePedido.precio;
        this.total = total;
        this.total += subtotal;
    }

    // MOSTRAR INFORMACION DE POSTRES
    public void InformacionPedido(){
        int i = 0;
        for (Postre p: this.postres){
            System.out.println(p.idPostre + " " + p.nombrePostre + " " + this.cantidad + " " + p.precio);
        }
        System.out.println("Total: " + this.total);
    }
}
