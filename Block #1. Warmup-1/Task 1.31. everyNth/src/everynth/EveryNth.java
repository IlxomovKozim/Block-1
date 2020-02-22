package everynth;

public class EveryNth {
    public String everyNth(String str, int n){
        
       char[] ch = str.toCharArray();
       String new_str = "";
       for(int i=0; i<ch.length; i=i+n){
           new_str += Character.toString(ch[i]);   
       }
       return new_str;
      
    }
    public static void main(String[] args) {
        
        EveryNth obj = new EveryNth();
        
        System.out.println( obj.everyNth("Miracle", 2) );
        System.out.println( obj.everyNth("abcdefg", 2) );
        System.out.println( obj.everyNth("abcdefg", 3) );
        
    }  
}
