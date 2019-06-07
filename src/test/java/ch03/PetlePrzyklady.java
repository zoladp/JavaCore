package ch03;

public class PetlePrzyklady {
    //for
    public static void main(String[] args) {
        int i; //zadeklarowany poza petla
        for (i = 0; i < 5; i++) {
            System.out.println(i + " - > komunikat");
            //if (i % 2 == 0) i=1;
            //else if (i == 3) i=1;
        }
        while (i < 7) {
            System.out.println(i);
            i++;
        }
        do {
            i*=6562;
            System.out.println("w do while: "+i);
        } while(i==7);

    }
}
