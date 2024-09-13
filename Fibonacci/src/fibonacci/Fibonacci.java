package fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guilherme
 */
public class Fibonacci {
    public static void main(String[] args) {
      
        List<Integer> fibonacci = new ArrayList<>();
        
        int numA = 0;
        int numB = 1;
        
        //Entrada do Usuario
        int inputUser = 55;
        
        fibonacci.add(numA);
        
        for(int i = 0; i < inputUser; i++ ){
            fibonacci.add(numB);
            
           int nextNum = numA + numB;
           numA = numB;
           numB = nextNum;
        }
        
        if(fibonacci.contains(inputUser)){
            System.out.println("O número " + inputUser + " está na sequencia Fibonacci.");
        }else{
            System.out.println("O número " + inputUser + " não está na sequencia Fibonacci.");
        }
        
        
        
        
        
        
        
        
    }

}
