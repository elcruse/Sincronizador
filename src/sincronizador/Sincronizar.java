
package sincronizador;



import conex.Variables;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;



/**
 *
 * @author Jimmy
 */
public class Sincronizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONArray ordenes;
        JSONObject objorden=new JSONObject();
        String respuesta= "";
        Variables v=null;
        float f=0;
        //String url = "http://localhost/ClientephpWoocomerce/DataJson/DataOrigen.json";
	String url = "http://localhost/ClientephpWoocomerce/index.php";	
		try {
			respuesta = peticionHttpGet(url);
			System.out.println("Esto Viene de la Url: " + respuesta);
		} catch (Exception e) {
			// Manejar excepción
			e.printStackTrace();
		} 
                objorden.put("Url",respuesta);
                ordenes=new JSONArray();
                //objorden.put("Valores Http",respuesta);
                //objorden=new JSONObject("{\"RespuestaHttp\":\"[{\\\"regular_price\\\":\\\"75,83\\\",\\\"sku\\\":\\\"codX1\\\",\\\"stock_quantity\\\":300,\\\"sale_price\\\":\\\"81,85\\\"}]\"}");
                //ordenes=new JSONArray("[{\"regular_price\":\"75,83\",\"sku\":\"codX1\",\"stock_quantity\":300,\"sale_price\":\"81,85\"}]");
                ordenes.put(objorden);
                int alg=ordenes.length();
          
                Object o=ordenes.get(0);
                System.out.println("Esto es:"+o.toString());
                System.out.println("Esto es: "+ordenes);
                System.out.println("Esto es: "+alg);
                
                ordenes.put(respuesta);
                
                
                //ordenes=objorden.getJSONArray("id");
                
                
                //ordenes.put(respuesta);
                
                //objorden=(JSONObject)ordenes.get(0);
                //String precom=objorden.getString("id");
                //Object precomp=objorden.get("regular_price");
                
                
                
                
                //float preventa=json.get("preventa");
                
                System.out.println("Esto es un Array: "+ordenes);
                System.out.println("Esto es un objeto: "+objorden);
                System.out.println("Esto es un objeto: "+objorden);
                System.out.println("Esto es un objeto: "+objorden);
                //System.out.println("Esto es Precio de compra con String: "+precom);
                
                
                
                
                /*for (int i=0;i<ordenes.length();i++) {
                    try {
                        String a="";
                        float c=0;
                        float b=0;
                        v=new Variables(a,b,c);
                        //JSONObject obj1=(JSONObject)ordenes.get(i);
                        //System.out.println(obj1.get(v.getPrecompra()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                
                }*/
                /*try {
       FileWriter file= new FileWriter("C:\\Users\\Jimmy\\Documents\\NetBeansProjects\\Sincronizador\\src\\conex\\DataOrigen.json");
       file.write(ordenes.toString());
       file.flush();
       file.close();
       System.out.println("Se envio archivo DataOrigen.json");
        } 
    catch (IOException e) {
            
        }*/
                             
	}

	public static String peticionHttpGet(String urlParaVisitar) throws Exception {
		// Esto es lo que vamos a devolver
		StringBuilder resultado = new StringBuilder();
		// Crear un objeto de tipo URL
		URL url = new URL(urlParaVisitar);

		// Abrir la conexión e indicar que será de tipo GET
		HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
		conexion.setRequestMethod("GET");
		// Búferes para leer
		BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
		String linea;
		// Mientras el BufferedReader se pueda leer, agregar contenido a resultado
		while ((linea = rd.readLine()) != null) {
			resultado.append(linea);
		}
		// Cerrar el BufferedReader
		rd.close();
		// Regresar resultado, pero como cadena, no como StringBuilder
		return resultado.toString();
           
                
    }
        
      
    
    
}
