package icyhot;

public class IcyHot {
    public boolean icyHot(int temp1, int temp2){
        
        if(temp1>100 && temp2<0){
            return true;
        }
        else if(temp1<0 && temp2>100){
            return true;
        }
        else
            return false;
        
    }
    public static void main(String[] args) {
        
        IcyHot obj = new IcyHot();
        
        System.out.println(obj.icyHot(120, -1));
        System.out.println(obj.icyHot(-1, 120));
        System.out.println(obj.icyHot(2, 120));
        
    }  
}
