package ch03;

import java.util.Scanner;

public class BreakZEtykieta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        etykieta:
        for (int i = 0; i <= 10; i++) {
            System.out.print("Petla: "+i+" -> ");
            for (int j = 0; j <= 5; j++) {
                if(i==8) break etykieta;
//                else if(i>6) continue;
//                System.out.print("petla razy i:"+i+" j:"+j+" | ");
                System.out.print(" j:"+j+" | ");
            }
            System.out.println();
        }

    }
}
