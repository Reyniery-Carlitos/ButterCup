package ButterCup;

import java.util.ArrayList;

public class Sucursal {
    String idSucursal;
    String ubicacionSucursal;
    String dia;
    String mes;
    String anio;
    int cantidad;
    Vendedor vendedores;
    Cliente clientes;
    ArrayList<Vendedor> vendedoresSucursales = new ArrayList<Vendedor>();
    ArrayList<Cliente> clientesSucursal = new ArrayList<Cliente>();
    ArrayList<Insumo> insumos = new ArrayList<Insumo>();

    // Metodo constructor de Sucursal
    public Sucursal(String idSucursal, String ubicacionSucursal){
        this.idSucursal = idSucursal;
        this.ubicacionSucursal = ubicacionSucursal;

        this.vendedoresSucursales = new ArrayList<Vendedor>();
        this.clientesSucursal = new ArrayList<Cliente>();
    }

    // AGREGAR VENDEDORES A LAS SUCURSALES
    public void AsignarVendedor(Vendedor nuevoVendedor){
        // AGREGANDO VENDEDORES A LAS SUCURSALES
        nuevoVendedor.listaVendedores = this;
        this.vendedoresSucursales.add(nuevoVendedor);
    }

    // MOSTRAR INFORMACION DE POSTRES
    public void MostrarVendedoresSucursales(){
        int i = 0;
        for (Vendedor v: vendedoresSucursales){
            System.out.println("Vendedor: " + v.idVendedor + " " + v.nombreVendedor);
            i++;
        }
    }

    // METODO PARA AGREGAR LOS CLIENTES
    public void AsignarCliente(Cliente nuevoCliente){
        // AGREGANDO CLIENTES A LAS SUCURSALES
        if (this.idSucursal == nuevoCliente.sucursalCliente.idSucursal){
            nuevoCliente.sucursalCliente = this;
            this.clientesSucursal.add(nuevoCliente);
        } else{
            System.out.println("WARNING: ESTA INTENTANDO AGREGAR UN CLIENTE INCORRECTO \n ---------------------------------------------------------------");
        }
    }

    // METODO PARA MOSTRAR EL REPORTE DIARIO
    public void ReporteDiario(String dia, String mes, String anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        System.out.println("===================================> REPORTE DIARIO " + this.ubicacionSucursal + " <================================");
        System.out.println("FECHA \t\t\t"+ " POSTRE ID \t\t" + " NOMBRE POSTRE \t\t" + " CANTIDAD \t\t" + " PRECIO UNIDAD \t\t" + " TOTAL \t\t");
        for (Cliente vs: clientesSucursal) {
            if (this.dia == vs.dia && this.mes == vs.mes && this.anio == vs.anio) {
                System.out.println(vs.dia + "/" + vs.mes + "/" + vs.anio + " | " + vs.postrePedido.idPostre + " | " + vs.postrePedido.nombrePostre + " | " + vs.cantidad + " | " + vs.postrePedido.precio + " | " + vs.total);
            }
        }
    }

    // METODO PARA MOSTRAR EL REPORTE MENSUAL
    public void ReporteMensual(String mes, String anio){
        this.mes = mes;
        this.anio = anio;
        System.out.println("*********************************************************************************************************************");
        System.out.println("===================================> REPORTE MENSUAL " + this.ubicacionSucursal + " <================================");
        System.out.println("FECHA \t\t\t"+ " POSTRE ID \t\t" + " NOMBRE POSTRE \t\t" + " CANTIDAD \t\t" + " PRECIO UNIDAD \t\t" + " TOTAL \t\t");
        for (Cliente vs: clientesSucursal) {
            if (this.mes == vs.mes && this.anio == vs.anio) {
                System.out.println(vs.mes + "-" + vs.anio + " | " + vs.postrePedido.idPostre + " | " + vs.postrePedido.nombrePostre + " | " + vs.cantidad + " | " + vs.postrePedido.precio + " | " + vs.total);
            }
        }
    }

    // METODO DE GASTOS DE INVENTARIO
    public void AgregarInsumo(Insumo insumoNecesario, int cantidad, String dia, String mes, String anio){
        insumoNecesario.listaSucursal = this;
        this.insumos.add(insumoNecesario);
        this.cantidad = cantidad;

        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
}
