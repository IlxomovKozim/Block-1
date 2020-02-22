package missingchar;

public class MissingChar {
    public StringBuilder missingChar(String str, int n){ 
        
        StringBuilder   a = new StringBuilder(str);
        a.deleteCharAt(n);
        return a;
        
    } 
    public static void main(String[] args) {
        
       MissingChar obj = new MissingChar();
        
       System.out.println(obj.missingChar("kitten", 1)); 
       System.out.println(obj.missingChar("kitten", 0)); 
       System.out.println(obj.missingChar("kitten", 4));
    }
    
}
