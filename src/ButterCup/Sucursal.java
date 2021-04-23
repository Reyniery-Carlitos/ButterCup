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
    ArrayList<Postre> postres = new ArrayList<Postre>();
    double cantidadInsumo;

    // Metodo constructor de Sucursal
    public Sucursal(String idSucursal, String ubicacionSucursal){
        this.idSucursal = idSucursal;
        this.ubicacionSucursal = ubicacionSucursal;

        this.vendedoresSucursales = new ArrayList<Vendedor>();
        this.clientesSucursal = new ArrayList<Cliente>();
        this.postres = new ArrayList<Postre>();
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

        System.out.println("FECHA \t\t\t" + " SUCURSAL \t\t\t" + " INSUMOS \t\t\t" + " CANTIDAD");
        for (Cliente vs: clientesSucursal){
            if (this.dia == vs.dia && this.mes == vs.mes && this.anio == vs.anio) {
                for (int j = 0; j < vs.postrePedido.insumos.size(); j++){
                    cantidadInsumo = (vs.cantidad * 0.5) * vs.cantidad;
                    this.cantidadInsumo = cantidadInsumo;
                    System.out.println(vs.dia + "/" + vs.mes + "/" + vs.anio + " | " + this.ubicacionSucursal + " | " + vs.postrePedido.insumos.get(j) + " | " + this.cantidadInsumo);
                }
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
       int i = 0;
        for (Cliente vs: clientesSucursal) {
            if (this.mes == vs.mes && this.anio == vs.anio) {
                System.out.println(vs.mes + "-" + vs.anio + " | " + vs.postrePedido.idPostre + " | " + vs.postrePedido.nombrePostre + " | " + vs.cantidad + " | " + vs.postrePedido.precio + " | " + vs.total);
                i++;
            }
        }
    }

    // METODO PARA AGREGAR LOS POSTRES QUE SE VENDE EN CADA SUCURSAL
    public void AgregarPostre(Postre nuevoPostre){
        nuevoPostre.listaPostres = this;
        this.postres.add(nuevoPostre);
    }

    // METODO PARA MOSTRAR LOS INSUMOS DE LA RECETA
    public void MostrarInsumosRecetaPostre(){
        int i = 0;
        System.out.println("POSTRE \t\t\t\t" + " INSUMOS");
        for (Postre p: postres) {
            System.out.println();
            i++;
        }
    }

    // MOSTRAR EL REPORTE DE INSUMOS NECESARIOS GASTADOS
    public void MostrarReporteInsumo(String dia, String mes, String anio, int cantidad){
        int i = 0;
        System.out.println("FECHA \t\t\t" + " SUCURSAL \t\t\t" + " INSUMOS");
        for (Postre p: postres) {
            System.out.println(this.dia + "/" + this.mes + "/" + this.anio + "|" + this.ubicacionSucursal + "|" + p.insumos);
        }
    }

//
//    // METODO DE GASTOS DE INVENTARIO
//    public void AgregarInsumo(Insumo insumoNecesario, int cantidad, String dia, String mes, String anio){
//        insumoNecesario.listaSucursal = this;
//        this.insumos.add(insumoNecesario);
//        this.cantidad = cantidad;
//
//        this.dia = dia;
//        this.mes = mes;
//        this.anio = anio;
//    }

}
