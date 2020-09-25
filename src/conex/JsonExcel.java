
package conex;

/**
 *
 * @author Jimmy
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;


public class JsonExcel {
    private JSONArray ordenes;
    private JSONObject objorden;
    private String respuesta= "";
    private String url;
    private String fecha;
    private String total;
    private int id;
    private Object ob;
    private ArrayList corr;
    
    
    
    public JsonExcel() {//Constructor
       
    }
    
    public void Urlcon(String url){
         //String url = "http://localhost/ClientephpWoocomerce/DataJson/DataOrigen.json";
	//String url = "http://localhost/ClientephpWoocomerce/index.php";
        
        this.url=url;
		try {
			respuesta = peticionHttpGet(this.url);
			//System.out.println("Esto Viene de la clase JsonExcel: " + respuesta);
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
                
                public void getRecorrerArrayList(){
                    
                ordenes=new JSONArray(respuesta); //aca le paso el json proveniente de la web a el jsonarray ordenes
                corr=new ArrayList(ordenes.length());
                
                for (int i=0;i<ordenes.length();i++) {
                    try {
                        
                     
                        JSONObject obj1;
                        corr.add(obj1=(JSONObject)ordenes.get(i));// se almacena directamente en forma de objetos para su manejo despues
                        
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                
                }
                
                }
                
    
    public String getRespuesta() {
        return respuesta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public Object getOb() {
        return ob;
    }

    public ArrayList getCorr() {
        return corr;
    }
    
    
    
    

   

        

      
    
    
    
}
