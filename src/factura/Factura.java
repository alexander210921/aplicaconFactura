package factura;
public class Factura {
    public static double TotalDeCompras=0;
    public static String producto[]=new String[100];
    public static int precio[]=new int[100];
    public static int cantidad[]=new int[100];
    public static int contador=1;
    public void AlmacenarProducto(String Producto[],int precio[],int id_producto,int cantidad){        
        this.producto[contador]=Producto[id_producto];
        this.precio[contador]=precio[id_producto];
        this.cantidad[contador]=cantidad;
        this.contador++;        
    } 
    
    public static void main(String[] args) {
       login login= new login();
       login.setVisible(true);        
    }    
}
