import java.io.*;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("input.txt"));
            Scanner in1 = new Scanner(System.in);
            System.out.print("Введите признак: ");
            String str = in1.next();
            switch (str) {
                case "0":
                    System.out.println("Введите символ: ");
                    String p = in1.next();
                    String answ = "";
                    while (in.hasNext()) {
                        String[] temp1 = in.nextLine().split(" ");
                        for (String elem:temp1) {
                            for (int j = 0; j < elem.length();j++) {
                                if (!elem.substring(j, j+1).equals(p)) {
                                    answ += elem.substring(j,j+1);
                                }
                            }
                            answ += " ";
                        }
                        answ += "\n";
                    }
                    System.out.print(answ);
                    break;
                case "1":
                    System.out.println("Введите символ: ");
                    String p1 = in1.next();
                    System.out.println("Введите индекс: ");
                    int ind = in1.nextInt();
                    String answ2 = "";
                    int rel = 1;
                    while (in.hasNext()) {
                        String[] temp1 = in.nextLine().split(" ");
                        for (String elem:temp1) {
                            for (int j = 0; j < elem.length();j++) {
                                if (rel == ind) {
                                    answ2 += elem.substring(j,j+1) + p1;
                                } else {
                                    answ2 += elem.substring(j,j+1);
                                }
                                rel++;
                            }
                            answ2 += " ";
                        }
                        answ2 += "\n";
                    }
                    System.out.print(answ2);
                    break;
                default:
                    break;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
