//Proszę napisać klasę o nazwie literki której konstruktor inicjuje pole klasy: int liczba zapisując w nim liczbę całkowitą
// złożoną z pięciu przypadkowych cyfr.
package kolokwium;
import java.util.Random;

public class Kolokwium1 {
 int liczba=0;
 int x;
 
 Kolokwium1(){
     this.liczba=liczba;
     this.x=x;
 }
     
     void wypisz(){
     Random r = new Random();
     for(int i=0; i<5; i++){
         liczba = r.nextInt();
         System.out.print(liczba);
 }
}
}
