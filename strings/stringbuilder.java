package strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Siddhanth");
        System.out.println(sc);
        System.out.println(sc.charAt(0));

        sc.setCharAt(0, 'P');
        System.out.println(sc);

        sc.insert(0, 'S');
        System.out.println(sc);

        sc.insert(4, 'd');
        System.out.println(sc);

        sc.delete(2, 5);
        System.out.println(sc);

        sc.append('a');
        sc.append('b');
        System.out.println(sc);
    }
}
