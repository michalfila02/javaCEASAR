
package cezar;

public class Cezar {

    public static void main(String[] args) {
        String tekst="wiadomsc do zaszyfrowania";
        String wynik;
        StringBuilder ab = new StringBuilder();
        char x;
        int i,j,n;
        n=31300;
        System.out.println(tekst);
        j=tekst.length();
        //String szyfr[j];
        for(i=0;i<j;i++)
        {
            x=tekst.charAt(i);
            x=(char)(x+n);
          ab.append(x);
        }
        wynik=ab.toString();
        System.out.println(wynik);
    }
    
}
