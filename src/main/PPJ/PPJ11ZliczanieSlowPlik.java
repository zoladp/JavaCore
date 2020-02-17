package PPJ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class PPJ11ZliczanieSlowPlik {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<String> words = new TreeSet<String>();
        Scanner scn = new Scanner(System.in);

        System.out.print("Nazwa pliku tekstowego: ");
        String nazwaPliku = scn.next();
        Scanner fin = new Scanner(new File(nazwaPliku));

        System.out.println("Pobieranie słów z pliku " + nazwaPliku);

        while (fin.hasNext()) {
            String word = fin.next();
            words.add(word);
        }
        if(fin != null) fin.close();  // Lepiej użyć try na zasobie

        System.out.println("Liczba różnych słów w pliku: " + words.size());

        for(String w: words)
            System.out.println(w);

        scn.close();

    }
}
