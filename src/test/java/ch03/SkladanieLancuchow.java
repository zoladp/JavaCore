package ch03;

public class SkladanieLancuchow {
    public static void main(String[] args) {
        char ch = 'X';
        String str = "factor";
        String end = "TheShow";
        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);
        builder.insert(builder.length(),end);
        builder.delete(builder.length()-4,builder.length());
        String completedString = builder.toString();
        System.out.println(builder);
        System.out.println(completedString);
    }
}
