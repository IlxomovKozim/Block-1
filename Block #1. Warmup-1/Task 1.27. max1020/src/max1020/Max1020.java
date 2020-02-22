package max1020;

public class Max1020 {
    public int max1020(int a, int b){
        
    if( (a>=10 && a<=20) || (b>=10 && b<=20) ){
        if(a>=b){
            return a;
        }
        else
        return b;
    }
    else 
        return 0;
    
}
    public static void main(String[] args) {
      
        Max1020 obj = new Max1020();
        
        System.out.println( obj.max1020(19, 19) );
        System.out.println( obj.max1020(19, 11) );
        System.out.println( obj.max1020(11,  9) );
        
    } 
}
