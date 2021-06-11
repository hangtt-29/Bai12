import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomExample {


    public void checkRandom() {
        try {
            int x;
            int y;
            Random rand = new Random();
            x = rand.nextInt(50);
            System.out.println("Số ranndom là:" + x);
            Scanner sn = new Scanner(System.in);
            System.out.println("Nhập 1 số bất kỳ từ bàn phím từ 10->50:");
            y = sn.nextInt();
            if (x > y) {
                System.out.println("Số random là số lớn hơn");

            } else if (x < y) {
                System.out.println("Số nhập từ bàn phím là số lớn nhất");
            } else {
                System.out.println("Hai số bằng nhau nhé");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Nhập vào 1 số phải là số");

        }


    }

}
