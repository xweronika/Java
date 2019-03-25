
public class choinka {

 
    public static void main(String[] args) {
       int h = 5;
       int lg,ls;
       for(int w=1;w<=h;w++){
           ls = h - w ; //liczba spacji
           for(int s = 1;s<=ls;s++)
            System.out.print(" ");
           
           lg = 2*w-1; // liczba gwiazdek
           for(int g = 1;g<=lg;g++)
            System.out.print("*");
           
           System.out.println();
       }
    }
    
}
