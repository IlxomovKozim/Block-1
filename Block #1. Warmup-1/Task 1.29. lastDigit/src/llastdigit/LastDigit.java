package llastdigit;

public class LastDigit {
    public boolean lastDigit(int a, int b){ 
        
           int lastdigit1 = a%10;
           int lastdigit2 = b%10;
           if(lastdigit1 == lastdigit2){
               return true;
           }
           else
               return false;
           
}
    public static void main(String[] args) {
        
        LastDigit obj = new LastDigit();
        
        System.out.println( obj.lastDigit(7, 17) );
        System.out.println( obj.lastDigit(6, 17) );
        System.out.println( obj.lastDigit(3, 113) ); 
        
    }  
}
