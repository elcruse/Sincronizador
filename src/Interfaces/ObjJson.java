
package Interfaces;

import conex.DatosJson;
import conex.Variables;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jimmy
 */
public class ObjJson {

private Variables r;
private DatosJson s;
private JSONObject json;
private JSONArray array;

    public ObjJson(Variables r, DatosJson s) {
        this.r = r;
        this.s = s;
    }
    
    public void JsonObj(){
    try {
         json=new JSONObject();
         DecimalFormat formato= new DecimalFormat("#.00");
         json.put("sku",r.getSkuproduct());
         json.put("regular_price",formato.format(r.getPrecompra()));
         json.put("sale_price",formato.format(r.getPreventa()));
         json.put("stock_quantity",s.getStockDisponible());
         array=new JSONArray();
         array.put(json);
        System.out.println(array);
        } 
    catch (JSONException e) {
    System.out.println(e);
        }
    try {
       FileWriter file= new FileWriter("C:\\Users\\Jimmy\\Documents\\NetBeansProjects\\Sincronizador\\src\\conex\\DataOrigen.json");
       file.write(array.toString());
       file.flush();
       file.close();
       System.out.println("Se envio archivo DataOrigen.json");
        } 
    catch (IOException e) {
            
        }
    
    }

    public Variables getR() {
        return r;
    }

    public void setR(Variables r) {
        this.r = r;
    }

    public DatosJson getS() {
        return s;
    }

    public void setS(DatosJson s) {
        this.s = s;
    }


    
    
    
}
