//W pliku tekstowym o nazwie list.txt w kolejnych 10 kolumnach rozdzielonych 
//spacjami wpisano liczny całkowite. Prosze napisać funkcję, która zwraca
//średnią liczb w drugiej kolumnie.


import java.io.BufferedReader;
import java.io.FileReader;

public class Kolokwium2 {
public static double moja(){
try{
            BufferedReader br = new BufferedReader(new FileReader("list.txt"));
            String s;
            double x;
            int a=0,b;
            int i=0;
            String tab[] = new String[9];
            do{
              s = br.readLine();
              if(s != null)
              tab = s.split(" ");
              b = Integer.parseInt(tab[1]);
              a=a+b;
              i++;
            }
            while(s != null);
            
            x=a/i;
            System.out.println(x);
            br.close();
                 return x;  

       }catch(Exception e){
           System.out.println("Błąd odczytu");
       }

}

    public static void main(String[] args) {
    
    }
    
}
