/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizador;

import conex.Conexion;
import org.json.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
       act=new JSONObject(act);
       System.out.println(act);
       //String pedido= act.getString("pqy");
       //System.out.println(pedido);
       JSONArray miArray= new JSONArray();
       System.out.println(miArray);
       act.put("Valores del Array: ",miArray);
        try {
            FileWriter file= new FileWriter("C:\\Users\\Jimmy\\Documents\\NetBeansProjects\\Sincronizador\\src\\conex\\DataOrigen.json");
       file.write(act.toString());
       file.flush();
       file.close();
        } catch (IOException e) {
            
        }
       
       
       
       
       
       
       
    }
    
    
}
