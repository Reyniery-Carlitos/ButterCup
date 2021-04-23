package ButterCup;

import java.util.ArrayList;

public class Vendedor {
    String idVendedor;
    String nombreVendedor;
    Sucursal sucursalLabora;
    Cliente nuevoCliente;
    Cliente listaClientes;
    Sucursal listaVendedores;
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    // METODO CONSTRUCTOR DE VENDEDOR
    public Vendedor(String idVendedor, String nombreVendedor, Sucursal sucursalLabora){
        this.idVendedor = idVendedor;
        this.nombreVendedor = nombreVendedor;
        this.sucursalLabora = sucursalLabora;

        this.clientes = new ArrayList<Cliente>();
    }

    // METODO PARA ASIGNAR CLIENTES A LOS VENDEDORES
    public void AsignarClientes(Cliente nuevoCliente){
        nuevoCliente.listaVendedores = this;
        this.clientes.add(nuevoCliente);
    }

    // MOSTRAR LOS CLIENTES ASIGNADOS A LOS EMPLEADOS
    public void MostrarClientes(){
        for(Cliente c: clientes){
            System.out.println("Clientes: " + c.idCliente + " " + c.nombreCliente);
        }
    }
}
