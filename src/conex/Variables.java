/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conex;

/**
 *
 * @author Jimmy
 */
public class Variables {
 
    private String skuproduct;
    private double precompra;
    private double preventa;
    

    public Variables(String skuproduct, double precompra, double preventa) {
        
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

    public double getPrecompra() {
        return precompra;
    }

    public void setPrecompra(double precompra) {
         
        this.precompra = precompra;
        
    }

    public double getPreventa() {
        return preventa;
    }

    public void setPreventa(double preventa) {
        this.preventa = preventa;
    }

    
    
    
    
}
