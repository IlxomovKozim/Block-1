package deldel;

public class DelDel {
    public String delDel(String str){
        
        String new_str = str.replaceFirst("del", "");
        return new_str;
        
}
    public static void main(String[] args) {
        
        DelDel obj = new DelDel();
        
        System.out.println( obj.delDel("adelbc") );
        System.out.println( obj.delDel("adelHello") );
        System.out.println( obj.delDel("adedbc") );
        
    }
}
