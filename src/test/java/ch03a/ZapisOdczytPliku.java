package ch03a;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZapisOdczytPliku {
    public static void main(String[] args) throws IOException {
        Paths sciezka;
        Scanner in = new Scanner(Paths.get("src/mojplik.txt"));
        PrintWriter out = new PrintWriter("mojplik.txt");

    }
}
