package televisao;

public class Tv {
    
    public static void main(String[] args){
        
        Smartv t1 = new Smartv("Samsung", 60, 5.989, true);
        t1.status();
        t1.resol();
       
      
        Smartv t2 = new Smartv("LG", 52, 4.567, true);
        t2.status();
        t2.resol();
    
    
}
}