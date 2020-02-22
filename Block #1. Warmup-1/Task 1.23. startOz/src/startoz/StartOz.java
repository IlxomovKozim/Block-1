package startoz;

public class StartOz {
    public String startOz(String str){
        
    if( (str.charAt(0) == 'o') && str.charAt(1) != 'z'){
        return "o";
    }
    else if( (str.charAt(0) != 'o') &&  (str.charAt(1) == 'z') ){
        return "z";
    }
    else
        return str.substring(0, 2);
    
}
    public static void main(String[] args) {
        
        StartOz obj = new StartOz();
        
        System.out.println(obj.startOz("ozymandias"));
        System.out.println(obj.startOz("bzoo"));
        System.out.println(obj.startOz("oxx"));
        
    } 
}
