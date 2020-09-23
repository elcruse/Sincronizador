
package conex;

/**
 *
 * @author Jimmy
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;
import static sincronizador.Sincronizar.peticionHttpGet;

public class JsonExcel {
    private JSONArray ordenes;
    private JSONObject objorden;
    private String respuesta= "";
    private String url;

    public JsonExcel(String url) {
        this.url = url;
    }
    
    public void Urlcon(){
         String url = "http://localhost/ClientephpWoocomerce/DataJson/DataOrigen.json";
	//String url = "http://localhost/ClientephpWoocomerce/index.php";	
		try {
			respuesta = peticionHttpGet(url);
			System.out.println("Esto Viene de la Url: " + respuesta);
		} catch (Exception e) {
			
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
            }
                
    public void array(String respuesta ){
    this.respuesta=respuesta;
                ordenes=new JSONArray(this.respuesta);
                //objorden=new JSONObject("{\"RespuestaHttp\":\"[{\\\"regular_price\\\":\\\"75,83\\\",\\\"sku\\\":\\\"codX1\\\",\\\"stock_quantity\\\":300,\\\"sale_price\\\":\\\"81,85\\\"}]\"}");
                //ordenes=new JSONArray("[{\"regular_price\":\"75,83\",\"sku\":\"codX1\",\"stock_quantity\":300,\"sale_price\":\"81,85\"}]");
                objorden=(JSONObject)ordenes.getJSONObject(0);
                String precom=objorden.getString("regular_price");
                Object precomp=objorden.get("regular_price");
    }

    public JSONArray getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(JSONArray ordenes) {
        this.ordenes = ordenes;
    }

    public JSONObject getObjorden() {
        return objorden;
    }

    public void setObjorden(JSONObject objorden) {
        this.objorden = objorden;
    }

   

        

      
    
    
    
}
