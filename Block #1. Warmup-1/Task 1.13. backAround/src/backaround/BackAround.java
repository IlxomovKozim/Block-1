package backaround;

public class BackAround {
    public String backAround(String str){
    
     int length = str.length();
     char lastIndex = str.charAt(length-1);
     String new_str = lastIndex+str+lastIndex;
     return new_str;
     
    }
    public static void main(String[] args) {
        
       BackAround obj = new BackAround();
        
       System.out.println(obj.backAround("cat")); 
       System.out.println(obj.backAround("Hello")); 
       System.out.println(obj.backAround("a"));
       
    }    
}
