package frontback;

public class FrontBack {
public StringBuilder frontBack(String str){
    
    StringBuilder sb = new StringBuilder(str);
    
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length()-1);
    
    String parF = Character.toString(firstChar);
    String parL = Character.toString(lastChar);
    
    StringBuilder exFirst = sb.replace(0, 1, parL);
    StringBuilder exLast =  exFirst.replace(str.length()-1, str.length(), parF);  
    
    return exLast;
    
} 
    public static void main(String[] args) {
        
        FrontBack obj = new FrontBack();
        
        System.out.println(obj.frontBack("code"));
        System.out.println(obj.frontBack("a"));
        System.out.println(obj.frontBack("ab"));
        
    }   
}
