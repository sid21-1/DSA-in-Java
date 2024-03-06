public class print {
    static int c = 0; // Declare c as static

    public static void printNo() { // Remove static from method declaration
        if (c == 3)
            return;
        System.out.println(c);
        c++;
        printNo();
    }

    public static void main(String[] args) {
        printNo();
    }
}
