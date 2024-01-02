import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input.txt"));
        String answ1 = "";
        String answ2 = "";
        String answ3 = "";
        int reg = 1;
        while (in.hasNext()) {
            String[] temp1 = in.nextLine().split(" ");
            for (String elem:temp1) {
                for (int j = 0; j < elem.length();j++) {
                    if (reg % 3 == 1) {
                        answ1 += elem.substring(j,j+1);
                    }
                    if (reg % 3 == 2) {
                        answ2 += elem.substring(j,j+1);
                    }
                    if (reg % 3 == 0) {
                        answ3 += elem.substring(j,j+1);
                    }
                    reg++;
                }
            }
        }
        System.out.println("Зашифрованный текст:");
        System.out.println(answ1);
        System.out.println(answ2);
        System.out.println(answ3);

    }

}
