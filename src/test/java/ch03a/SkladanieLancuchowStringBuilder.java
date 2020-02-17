package ch03a;

public class SkladanieLancuchowStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Lorem");
        char c = 67;
        char space = 32;
        builder.append(c).append(space);
        String s = "Ipsum dolor sit amet";
        builder.append(s);
        builder.appendCodePoint(260);
        System.out.println(builder);
        builder.insert(6,"xwstawiamx");
        System.out.println(builder);
        builder.setCharAt(6,'~');
        System.out.println(builder);
        builder.appendCodePoint(128);
        System.out.println(builder);
        builder.insert(6,'@');
        System.out.println(builder);
        System.out.println(builder.length());
        builder.deleteCharAt(38);
        System.out.println(builder);
        builder.deleteCharAt(33);
        System.out.println(builder);
        builder.delete(24,30);
        System.out.println(builder);
        builder.delete(6,23);
        System.out.println(builder);


    }
}
