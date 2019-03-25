/*W pliku wpisane są dane o studentachw formie czwórek:
int nr_albumu
String imię
String nazwisko
double ocena
Prosze napisać program który podwyższy wszystkie oceny w tym pliku o 0,5.
*/
package kolokwium;
import java.io.RandomAccessFile;
public class Kolokwium3 {

    public static void main(String[] args) {
    long p;
    double i;
    try{
        RandomAccessFile raf = new RandomAccessFile("nazwapliku","rw");
        while(raf.getFilePointer() <raf.length()){
        raf.readInt();
        raf.readUTF();
        raf.readUTF();
        p = raf.getFilePointer();
        i = raf.readDouble();
        i = i + 0.5;
        raf.seek(p);    //poszukaj p
        raf.writeDouble(i);    //zamieniamy ocene na nowa
        raf.close();
    }}
    catch (Exception e){
        System.out.println("Błąd");
    }
    
    }
    
}
