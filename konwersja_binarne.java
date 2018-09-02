package tablice;

import java.util.Scanner;

public class konwersja_binarne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, i=0, wskaznik=0;
        int tab[] = new int[32];
        String minus = "1.";
        String plus = "0.";
        System.out.println("Program przekonwertuje Twoja liczbe i pokaze ja w zapisie binarnym.");
        System.out.print("Podaj liczbe: ");
        a = s.nextInt();
        b=a;
        if(a<0) a=(a*-1);
        while(a!=0)
        {
            tab[i]=a%2;
            a/=2;
            i++;
            wskaznik++;
        }
        if(b<0)
        System.out.print(minus);
        else System.out.print(plus);
        for(int j=wskaznik-1; j>=0; j--)
        {
            System.out.print(tab[j]);
        }
    }
}
