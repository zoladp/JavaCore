package ch03;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ZapisOdczytPlikow {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("src/mojplik.txt"));
        System.out.println(in.toString());

        String dir = System.getProperty("user.dir");
        System.out.println(dir);

    }
}
