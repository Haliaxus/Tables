package tablice;

import java.util.Random;

public class tablica_pierwsza {
    public static void main(String[] args) {
    Random r = new Random();
    int min = 10, max = -10, suma=0, sredniaplus=0, sredniaminus=0;
    double srednia;
    int tab[] = new int[20];

    for(int i=0; i<tab.length; i++)
    {
        tab[i] = r.nextInt(21)-10;
    }
        for (int x: tab
             ) {
            System.out.print(x+", ");
            suma+=x;
            if(min>x) min=x;
            if(max<x) max=x;
        }
        srednia = suma/tab.length;

    for(int x: tab)
    {
        if(x>srednia) sredniaplus++;
        if(x<srednia) sredniaminus++;
    }
        System.out.println();
        System.out.println("Srednia Twojej tablicy wynosi: "+srednia);
        System.out.println("Elementow wiekszych od sredniej jest: "+sredniaplus);
        System.out.println("Elementow mniejszych od sredniej jest: "+sredniaminus);
        System.out.println("Liczba minimalna w tablicy to: "+min);
        System.out.println("Liczba maxymalna w tablicy to: "+max);
}
}