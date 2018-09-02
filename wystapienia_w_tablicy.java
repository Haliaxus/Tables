package tablice;

import java.util.Random;

public class wystapienia_w_tablicy {

    public static void main(String[] args) {
        Random r = new Random();
        int tab[] = new int[20];
        int tab_suma[] = new int[10];
        int c;

        for(int i=0; i<tab_suma.length;i++)
        {
            tab_suma[i] = 0;
        }
        for(int i=0; i<tab.length; i++)
        {
            tab[i] = r.nextInt(10)+1;
        }
        for(int i=0; i<tab.length; i++) {
            for (int j = 0; j < tab_suma.length; j++) {
                if (tab[i] == j + 1)
                    tab_suma[j]++;
            }
        }
        for (int x:tab
             ) {
            System.out.print(x+", ");
        }
        System.out.println();
        for(int a=0; a<tab_suma.length;a++)
        {
            c=a+1;
            System.out.println("Liczba "+c+" wystapila "+tab_suma[a]+" razy.");
        }

    }
}
