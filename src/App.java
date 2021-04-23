import ButterCup.*;

public class App {
    public static void main(String[] args){
        // CREANDO LAS SUCURSALES DE BUTTERCUP
        Sucursal s1 = new Sucursal("1000", "Buttercup TGU");
        Sucursal s2 = new Sucursal("1001", "Buttercup NY");
        Sucursal s3 = new Sucursal("1002", "Buttercup SPS");

        // CREANDO LOS CLIENTES
        Cliente c1 = new Cliente("2000", "Carlos Rubio");
        Cliente c2 = new Cliente("2001", "Andres Funez");
        Cliente c3 = new Cliente("2002", "Monica Valeriano");
        Cliente c4 = new Cliente("2003", "Nicolle Alvarenga");
        Cliente c5 = new Cliente("2004", "Antony Dominguez");
        Cliente c6 = new Cliente("2005", "Jireth Valladares");
        Cliente c7 = new Cliente("2006", "Emmely Boquin");
        Cliente c8 = new Cliente("2007", "Mel Gibson");
        Cliente c9 = new Cliente("2008", "John Travolta");
        Cliente c10 = new Cliente("2009", "Rene Descartes");
        Cliente c11 = new Cliente("2010", "Alex Caceres");
        Cliente c12 = new Cliente("2011", "Leonel Cabrera");
        Cliente c13 = new Cliente("2012", "Rony Baca");
        Cliente c14 = new Cliente("2013", "Ana Mejia");
        Cliente c15 = new Cliente("2014", "Reina Diaz");
        Cliente c16 = new Cliente("2015", "Ney Zuniga");

        // CREANDO LOS VENDEDORES
        Vendedor v1 = new Vendedor("4000", "Maria Hernandez", s1);
        Vendedor v2 = new Vendedor("4001", "Lidia Flores", s2);
        Vendedor v3 = new Vendedor("4002", "Rony Oliva", s3);
        Vendedor v4 = new Vendedor("4003", "Nataly Ramirez", s2);
        Vendedor v5 = new Vendedor("4004", "Evelin Martinez", s1);

        // CREANDO LOS COCINEROS
        Cocinero co1 = new Cocinero("5000", "Regulo Ramirez", s1);
        Cocinero co2 = new Cocinero("5001", "Suyapa Arevalo", s1);
        Cocinero co3 = new Cocinero("5002", "Estefany Morales", s2);
        Cocinero co4 = new Cocinero("5003", "Aishly Herrera", s2);
        Cocinero co5 = new Cocinero("5004", "Jairo Raudales", s3);
        Cocinero co6 = new Cocinero("5005", "Dennys Dominguez", s3);

        // CREANDO LOS POSTRES
        Postre p1 = new Postre("6000", "Pastel Oreo", 40);
        Postre p2 = new Postre("6001", "Malteada de Vainilla", 50);
        Postre p3 = new Postre("6002", "Malteada de Vainilla con Chocolate", 80);
        Postre p4 = new Postre("6003", "Pastel Fresas con Crema", 220);
        Postre p5 = new Postre("6004", "Pastel Vainilla con Crema", 200);
        Postre p6 = new Postre("6005", "Postre Caramelo chocolatado", 80);
        Postre p7 = new Postre("6006", "Malteada de Chocolate blanco con Fresas", 110);
        Postre p8 = new Postre("6007", "Licuado de Fresa con Vainilla y granola", 70);
        Postre p9 = new Postre("6008", "Pastel tres leches", 450);
        Postre p10 = new Postre("6009", "Licuado de leche con Banano y granola", 80);

        // CREANDO LOS INSUMOS
        Insumo i1 = new Insumo("9000", "Fresas", "Descripcion insumo 1", 50, 25);
        Insumo i2 = new Insumo("9001", "Vainilla", "Descripcion insumo 2", 80, 8);
        Insumo i3 = new Insumo("9002", "Leche", "Descripcion insumo 3", 60, 13);
        Insumo i4 = new Insumo("9003", "Chocolate", "Descripcion insumo 4", 50, 50);
        Insumo i5 = new Insumo("9004", "Chocolate blanco", "Descripcion insumo 5", 20, 55);
        Insumo i6 = new Insumo("9005", "Granola", "Descripcion insumo 6", 80, 35);
        Insumo i7 = new Insumo("9006", "Bananos", "Descripcion insumo 7", 200, 1);
        Insumo i8 = new Insumo("9007", "Harina", "Descripcion insumo 8", 250, 10);
        Insumo i9 = new Insumo("9008", "Galletas Oreo", "Descripcion insumo 9", 150, 5);
        Insumo i10 = new Insumo("9009", "Crema", "Descripcion Insumo 10", 100, 10);

        // ASIGNAR INSUMOS AL POSTRE
        p1.AgregarInsumoReceta(i3);
        p1.AgregarInsumoReceta(i8);
        p1.AgregarInsumoReceta(i9);

        p2.AgregarInsumoReceta(i2);
        p2.AgregarInsumoReceta(i3);

        p3.AgregarInsumoReceta(i2);
        p3.AgregarInsumoReceta(i3);
        p3.AgregarInsumoReceta(i4);

        p4.AgregarInsumoReceta(i1);
        p4.AgregarInsumoReceta(i3);
        p4.AgregarInsumoReceta(i8);
        p4.AgregarInsumoReceta(i10);

        p5.AgregarInsumoReceta(i2);
        p5.AgregarInsumoReceta(i3);
        p5.AgregarInsumoReceta(i8);
        p5.AgregarInsumoReceta(i10);

        p6.AgregarInsumoReceta(i3);
        p6.AgregarInsumoReceta(i4);

        p7.AgregarInsumoReceta(i3);
        p7.AgregarInsumoReceta(i5);
        p7.AgregarInsumoReceta(i1);

        p8.AgregarInsumoReceta(i1);
        p8.AgregarInsumoReceta(i2);
        p8.AgregarInsumoReceta(i3);
        p8.AgregarInsumoReceta(i6);

        p9.AgregarInsumoReceta(i3);
        p9.AgregarInsumoReceta(i8);

        p10.AgregarInsumoReceta(i3);
        p10.AgregarInsumoReceta(i6);
        p10.AgregarInsumoReceta(i7);

        // REALIZANDO PEDIDOS DE LOS CLIENTES
        c1.Pedir(p3, s1, 2, "23", "Diciembre", "2021");
        c2.Pedir(p10, s2,1, "23", "Diciembre", "2021");
        c3.Pedir(p1, s3,1, "13", "Abril", "2021");
        c4.Pedir(p6, s2,2, "01", "Octubre", "2021");
        c5.Pedir(p4,s1,1, "13", "Abril", "2021");
        c6.Pedir(p9, s1,3, "08", "Febrero", "2021");
        c7.Pedir(p8, s1,2,"15", "Noviembre", "2021");
        c8.Pedir(p2, s2,1, "14", "Noviembre", "2021");
        c9.Pedir(p7, s2,5, "23", "Diciembre", "2021");
        c10.Pedir(p5, s3,3, "23", "Diciembre", "2021");
        c11.Pedir(p7, s3, 6, "17", "Abril", "2021");
        c12.Pedir(p5, s1, 8, "31", "Enero", "2021");
        c13.Pedir(p10, s2, 5, "15", "Noviembre", "2021");
        c14.Pedir(p2, s1, 3, "12", "Mayo", "2021");
        c15.Pedir(p4, s2, 4, "09", "Mayo", "2021");
        c16.Pedir(p6, s3, 7, "11", "Noviembre", "2021");

        // ASIGNAR POSTRES AL COCINERO
        co1.AgregarPostres(p1);
        co1.AgregarPostres(p3);
        co1.AgregarPostres(p5);
        co1.AgregarPostres(p7);
        co1.AgregarPostres(p9);
        co2.AgregarPostres(p2);
        co2.AgregarPostres(p4);
        co2.AgregarPostres(p6);
        co2.AgregarPostres(p8);
        co2.AgregarPostres(p10);

        co3.AgregarPostres(p2);
        co3.AgregarPostres(p4);
        co3.AgregarPostres(p6);
        co3.AgregarPostres(p8);
        co3.AgregarPostres(p10);
        co4.AgregarPostres(p1);
        co4.AgregarPostres(p3);
        co4.AgregarPostres(p5);
        co4.AgregarPostres(p7);
        co4.AgregarPostres(p9);

        co5.AgregarPostres(p1);
        co5.AgregarPostres(p10);
        co5.AgregarPostres(p8);
        co5.AgregarPostres(p3);
        co5.AgregarPostres(p5);
        co6.AgregarPostres(p2);
        co6.AgregarPostres(p4);
        co6.AgregarPostres(p6);
        co6.AgregarPostres(p7);
        co6.AgregarPostres(p9);

        // METODO PARA ASIGNAR CLIENTE A LA SUCURSAL
        s1.AsignarCliente(c1);
        s1.AsignarCliente(c6);
        s1.AsignarCliente(c5);
        s1.AsignarCliente(c7);
        s1.AsignarCliente(c12);
        s1.AsignarCliente(c14);
        s2.AsignarCliente(c4);
        s2.AsignarCliente(c8);
        s2.AsignarCliente(c2);
        s2.AsignarCliente(c9);
        s2.AsignarCliente(c13);
        s3.AsignarCliente(c15);
        s3.AsignarCliente(c3);
        s3.AsignarCliente(c10);
        s3.AsignarCliente(c9); // PRUEBA PARA VALIDAR QUE NO HAY INCONSISTENCIA DE INFORMACION AL AGREGAR EL MISMO CLIENTE A VARIAS SUCURSALES DONDE EL NO COMPRO
        s3.AsignarCliente(c11);
        s3.AsignarCliente(c16);

        // ASIGNAR VENDEDORES A LAS SUCURSALES
        s1.AsignarVendedor(v1);
        s1.AsignarVendedor(v2);

        s2.AsignarVendedor(v3);
        s2.AsignarVendedor(v4);

        s3.AsignarVendedor(v5);

        // ASIGNAR LOS POSTRES QUE VENDE CADA SUCURSAL
        s1.AgregarPostre(p1);
        s1.AgregarPostre(p2);
        s1.AgregarPostre(p3);
        s1.AgregarPostre(p4);
        s1.AgregarPostre(p5);
        s1.AgregarPostre(p6);
        s1.AgregarPostre(p7);
        s1.AgregarPostre(p8);
        s1.AgregarPostre(p9);
        s1.AgregarPostre(p10);

        // MOSTRAR EL REPORTE DIARIO
        s1.ReporteDiario("23", "Diciembre", "2021");
        s2.ReporteDiario("23", "Diciembre", "2021");
        s3.ReporteDiario("23", "Diciembre", "2021");

        // MOSTRAR EL REPORTE MENSUAL
        s1.ReporteMensual("Noviembre", "2021");
        s2.ReporteMensual("Noviembre", "2021");
        s3.ReporteMensual("Noviembre", "2021");

        // MOSTRAR REPORTE DEL TOTAL DE INSUMOS GASTADOS
//        s1.MostrarReporteInsumo("23", "Diciembre", "2021", 10);

        // MOSTRAR RECETA
        p1.MostrarInsumosRecetaPostre();
        p2.MostrarInsumosRecetaPostre();
        p3.MostrarInsumosRecetaPostre();
        p4.MostrarInsumosRecetaPostre();
        p5.MostrarInsumosRecetaPostre();
        p6.MostrarInsumosRecetaPostre();
        p7.MostrarInsumosRecetaPostre();
        p8.MostrarInsumosRecetaPostre();
        p9.MostrarInsumosRecetaPostre();
        p10.MostrarInsumosRecetaPostre();
    }
}
