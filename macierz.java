package tablice;

import java.util.Random;

public class macierz {
    public static void main(String[] args) {
        Random r = new Random();
        int min, max;
        int macierz[][] = new int[5][5];
        int macierzmax[][] = new int[5][5];
        int macierzmin[][] = new int[5][5];
        for(int i=0;i<macierz.length;i++) {
            for(int j=0;j<macierz.length;j++)
            {
                macierz[i][j] = r.nextInt(11)-5;
            }
        }
        for(int i=0;i<macierz.length;i++) {
            min=5;
            max=-5;
            for(int j=0;j<macierz.length;j++)
            {
                if(macierz[i][j]>max) max=macierz[i][j];
                if(macierz[i][j]<min) min=macierz[i][j];
            }
            for (int y=0;y<macierz.length;y++)
            {
                macierzmax[i][y] = max;
                System.out.print(macierzmax[i][y]+" ");
            }
            for(int z=0;z<macierz.length;z++){
                macierzmin[i][z] = min;
                System.out.print(macierzmin[i][z]);
            }
            System.out.println();
        }
        for(int i=0;i<macierz.length;i++) {
            for(int j=0;j<macierz.length;j++)
            {
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
