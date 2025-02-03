package bubblesortconsole;

import java.util.Random;

public class BubbleSortConsole {

    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[10];
        int i,aux,fim;

        System.out.print("Vetor aleatório - 10\n");
        
        for(i=0;i<10;i++) {
            num[i]=r.nextInt(100);
            System.out.print(num[i]+"\n");
        }
        
        System.out.print("\nBubble Sort\n");
        
        for(fim=8;fim>=0;fim--) {
            for(i=0;i<=fim;i++) {
                if(num[i]>num[i+1]) {
                    aux=num[i];
                    num[i]=num[i+1];
                    num[i+1]=aux;
                }
            }
        }
        
        System.out.print("\nCrescente\n");
        
        for(i=0;i<10;i++) {
            System.out.print(num[i]+"\n");
        }
        
        System.out.print("\nDecrescente\n");
        
        for(i=9;i>=0;i--) {
            System.out.print(num[i]+"\n");
        }
    }
    
}
