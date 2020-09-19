
package conex;

import Interfaces.Consultar;
import java.sql.*;

public class Conexion {
    
private String bd = "woocommerce";   
private String login = "root"; 
private String password = "1230";
private String url = "jdbc:mysql://localhost/"+bd;
private static Connection conn;
private static  ResultSet resultado,result;
private static  Statement sentencia;
private static String q;


public Conexion() {

//Statement st=null;
conn=null;        
try {
Class.forName("org.gjt.mm.mysql.Driver");
conn = DriverManager.getConnection(url, login, password);
if (conn != null)
         {
 System.out.println("Conexion establecida.");
 //st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

//conn.close();
               }
}
catch(SQLException|ClassNotFoundException ex) {
System.out.println("Error al conectar ");
       }

}

public Connection getConnection(){
return conn;
 }

public void desconestar(){
    conn=null;
    if(conn==null){
    System.out.println("Conexion Terminada.");
         }
   }

public static Variables getBuscarIdPrecio(int id){
    Variables r=null;
     q="SELECT * FROM precios WHERE idprecio='"+id+"'";
     try {
        sentencia = conn.createStatement();
        resultado=sentencia.executeQuery(q);
        if(resultado.next()){
            id=resultado.getInt("idprecio");
        }
        System.out.println("Consulta exitosa");
    } catch (Exception e) {
        System.out.println("Error al ejecutar");
    }
    r= getasignar();//se asigna el valor conseguido
    return r;
}

public static Variables getasignar(){
Variables r=null;  
int id;
String sku;
float precompra;
float prevent;
    try {
        if(resultado.first()){
        id=resultado.getInt("idprecio");
        sku=resultado.getString("skuproduc");
        precompra=resultado.getFloat("precompe");
        prevent=resultado.getFloat("prevenpe");
        r = new Variables(sku,precompra,prevent);
        }
    } catch (Exception e) {
    }
    return r;
}

public static DatosJson getBuscarIdStock(int id){
 DatosJson s=null;
 q="SELECT * FROM stock WHERE idstock='"+id+"'";
     try {
        sentencia = conn.createStatement();
        result=sentencia.executeQuery(q);
        if(result.next()){
            id=result.getInt("idstock");
        }
        System.out.println("Consulta exitosa");
    } catch (Exception e) {
        System.out.println("Error");
    }
    s=asignar();//se guarda el metodo
 return s;
 }


public static DatosJson asignar(){
DatosJson s=null;  
int id;
String sku;
int stockdisp;
    try {
        if(result.first()){
        id=result.getInt("idstock");
        sku=result.getString("skuproducto");
        stockdisp=result.getInt("stockdisp");
        s= new DatosJson(stockdisp,sku);
        }
    } catch (Exception e) {
    }
    return s;
}


}



