
package conex;



/**
 *
 * @author Jimmy
 */
public class Variables {
 
    private String skuproduct;
    private float precompra;
    private float preventa;
    

    public Variables(String skuproduct, float precompra, float preventa) {
        
        this.skuproduct = skuproduct;
        this.precompra = precompra;
        this.preventa = preventa;
    }

   
   

    public String getSkuproduct() {
        return skuproduct;
    }

    public void setSkuproduct(String skuproduct) {
        this.skuproduct = skuproduct;
    }

    public float getPrecompra() {
        
        return precompra;
    }

    public void setPrecompra(float precompra) {
         
        this.precompra = precompra;
        
    }

    public float getPreventa() {
        
        return preventa;
    }

    public void setPreventa(float preventa) {
        this.preventa = preventa;
    }

    
    
    
    
}
