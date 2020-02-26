import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] argc){
        pierwszaIOstatniaLiteraD("dd hahahha dywywywywy dwwwwwwwwwwwwwd");
        Klucz key = findKey("jajko", "kbklp");
        System.out.println(key.toString());
    }
    public static ArrayList<String> pierwszaIOstatniaLiteraD(String slowa){
        String[] tab = slowa.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<tab.length; i++){
            if(tab[i].length() >= 1 && tab[i].charAt(0) == 'd' && tab[i].charAt(tab[i].length() - 1) == 'd') {
                list.add(tab[i]);
            }
        }
        return list;
    }
    public static String szyfrowanie(String slowo, Klucz klucz){
        int x= 0;
        int szyfr = 0;
        StringBuilder sb = new StringBuilder();
       for(int i = 0; i<slowo.length(); i++){
           x = slowo.charAt(i) - 'a';
           szyfr = (x*klucz.A + klucz.B)%26;
           sb.append((char)(szyfr+'a'));
       }
       return sb.toString();
    }
    public static void zad752(String slowa, Klucz klucz){
        String output = "";
        if(slowa.length() > 10)
            output = szyfrowanie(slowa, klucz);
        System.out.println(output);

    }
    public static Klucz findKey(String decrypted, String encrypted){
        Klucz klucz = new Klucz(0, 0);
        for(klucz.A = 0; klucz.A <= 25; klucz.A++){
            for(klucz.B = 0; klucz.B <=25; klucz.B++){
                if(szyfrowanie(decrypted, klucz).equals(encrypted))
                    return klucz;
            }
        }
        return null;
    }
    /*public static void klucze(String dwaSlowa, Klucz klucz){
        String[] podzielone = dwaSlowa.split(" ");
        for(klucz.A = 0; klucz.A <=25; klucz.A++) {
            for (klucz.B = 0; klucz.B <= 25; klucz.B++) {
                if (szyfrowanie(podzielone[0], klucz).equals(podzielone[1]))
                    System.out.println("szyfrujacy " + "(" + klucz.A + "," + klucz.B + ")");
            }
        }
        for(int A=0; A<=25; A++) {
            for (int B = 0; B <= 25; B++) {
                if (szyfrowanie(podzielone[0], klucz).equals(podzielone[1]))
                    System.out.println("deszyfrujacy " + "(" + klucz.A + "," + klucz.B + ")");
            }
        }
    }*/
}//75 i testy, obrazek
