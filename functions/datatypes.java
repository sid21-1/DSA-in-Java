import java.util.*;

public class datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int size = getsize(data);
        if (size != -1) {
            System.out.println(size);
        } else {
            System.out.println("Invalid data type.");
        }
    }

    static int getsize(String data) {
        switch (data.toLowerCase()) {
            case "integer":
                return 4;
            case "long":
                return 8;
            case "float":
                return 4;
            case "double":
                return 8;
            case "character":
                return 1;
            default:
                return -1;
        }
    }
}
