package notstring;

public class NotString {
    public String notString(String str){
        
    if(str.startsWith("not ")){
        return str;
    }
    else{
        str = str.replaceAll(str, "not "+str);
        return str;
    }
    
} 
    public static void main(String[] args) {
       
       NotString obj = new NotString();
       
       System.out.println(obj.notString("candy")); 
       System.out.println(obj.notString("not x")); 
       System.out.println(obj.notString("not bad"));
       
    }   
}
