package endup;

public class EndUp {
    public String endUp(String str){ 
    
    StringBuilder sb = new StringBuilder(str);
    int length = str.length();
    if(length>2){
    String last3 = str.substring(length-3, length);
    StringBuilder upcase = sb.replace(length-3, length, last3.toUpperCase());
    return upcase.toString();
}
    else 
        return str;
    
}
    public static void main(String[] args) {
        
        EndUp obj = new EndUp();
        
        System.out.println( obj.endUp("Hello") );
        System.out.println( obj.endUp("hi there") );
        System.out.println( obj.endUp("hi") );
        
    } 
}
