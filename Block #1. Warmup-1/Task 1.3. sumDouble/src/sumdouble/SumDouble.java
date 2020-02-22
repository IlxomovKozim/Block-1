package sumdouble;

public class SumDouble {
    public int sumDouble(int a, int b) {
        
        if(a == b){
        return a+a+a+a;
        
  }
        else{
            
    return a+b;
    
        }      
} 
    public static void main(String[] args) {
        
        SumDouble obj = new SumDouble();
        
        System.out.println(obj.sumDouble(1, 2)); 
        System.out.println(obj.sumDouble(3, 2)); 
        System.out.println(obj.sumDouble(2, 2)); 
        
    }  
}
