import java.util.Arrays;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        int[] c = new int[t];
        String s;
        s = input.nextLine();
        String[] ch = s.split("\\s");
        for (int i = 0; i < ch.length; i++){
            c[i] = Integer.parseInt(ch[i]);
        }

        int[] n = new int[10];
        s = input.nextLine();
        String[] ch2 = s.split("\\s");
        for (int i = 0; i < ch2.length; i++){
            n[i] = Integer.parseInt(ch2[i]);
        }

        int[] l = new int[10];
        s = input.nextLine();
        String[] ch3 = s.split("\\s");
        for (int i = 0; i < ch3.length; i++){
            l[i] = Integer.parseInt(ch3[i]);
        }

        int r = 0;
        for (int i = 0; i < l.length; i++) {
            r += n[i]*l[i];
        }
        System.out.println(r);
    }
}
