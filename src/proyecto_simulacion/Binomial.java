/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_simulacion;

/**
 *
 * @author Batman
 */
public class Binomial {
    
     //BERNOULLI------------------------------------>
    
    public static int Bernoulli(double P){
        double x = Math.random();
      
        if(x<=P){
            return(1);          
        }else{
            return(0);
        }  
    }
    
    // BINOMIAL------------------------------------->
    
    public static int Bin(double P, int ensayos){
        int exitos = 0; 
        for (int i = 0; i <ensayos ;i++){
            if(Bernoulli(P)==1){
                exitos++;
            }
        }
        return(exitos);
    }
    
}
