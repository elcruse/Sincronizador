
package sincronizador;


import org.json.*;
import java.io.IOException;


/**
 *
 * @author Jimmy
 */
public class Sincronizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Conexion con=new Conexion();
        //con.getConnection();
        //con.desconestar();
       JSONObject act=new JSONObject();
       act.put("sku","1998");
       act.put("pqy","35");
       act.put("lug","Franelas");
       act.put("price",new Integer(4));
       act.put("price",new Double(4.5));
       System.out.println(act);
       //String pedido= act.getString("pqy");
       //System.out.println(pedido);
       JSONArray miArray= new JSONArray();
       miArray.put(act);
       System.out.println(miArray);
       //act.put("Valores del Array: ",miArray);
        
           
    }
    
    
}
