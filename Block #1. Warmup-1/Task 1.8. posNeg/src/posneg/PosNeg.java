package posneg;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        
    if(a < 0 || b < 0){
        return true;
    }
    else if(a < 0 && b < 0 && negative == true){
        return true;
    }
    else{
        return false;
    }
    
} 
    public static void main(String[] args) {
        
       PosNeg obj = new PosNeg();
       
       System.out.println(obj.posNeg(1, -1, false)); 
       System.out.println(obj.posNeg(-1, 1, false)); 
       System.out.println(obj.posNeg(-4, -5, true));
       
    } 
}
