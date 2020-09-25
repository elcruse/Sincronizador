
package sincronizador;



import conex.JsonExcel;
import conex.Variables;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;




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
        JSONObject objorden;
        String respuesta= "";
        Variables v=null;
        float f=0;
        String url = "http://localhost/ClientephpWoocomerce/index.php";
        
        /*
        //String url = "http://localhost/ClientephpWoocomerce/DataJson/DataOrigen.json";
	String url = "http://localhost/ClientephpWoocomerce/index.php";	
		try {
			respuesta = peticionHttpGet(url);
			//System.out.println("Esto Viene de la Url: " + respuesta);
		} catch (Exception e) {
			// Manejar excepción
			e.printStackTrace();
		} 
                
                
                            
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
           
                
    }*/
        
                JsonExcel ur= new JsonExcel();
                ur.Urlcon(url);
                ur.getRecorrerArrayList();
                JSONObject obj1=(JSONObject)ur.getCorr().get(0);
                System.out.println("Primer array: "+obj1.getString("date_created"));
                 
                 
        
    }     
    
    
}
