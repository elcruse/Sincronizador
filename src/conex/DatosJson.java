
package conex;
import org.json.*;
/**
 *
 * @author Jimmy
 */
public class DatosJson {
    
    private int stockDisponible;
    private String skustock;

    public DatosJson(int stockDisponible, String skustock) {
        this.stockDisponible = stockDisponible;
        this.skustock = skustock;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public String getSkustock() {
        return skustock;
    }

    public void setSkustock(String skustock) {
        this.skustock = skustock;
    }

    

   
    
    
}
