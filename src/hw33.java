import java.util.Scanner;

public class hw33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");

        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("Длина заданной строки: " + str.length());

        String str1 = str + " " + str;
        System.out.println(str1);

        String str2 = str + " " + 123;
        System.out.println(str2);

        char ch = str.charAt(0);
        System.out.println(ch);




    }
}
