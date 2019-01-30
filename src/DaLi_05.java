import static lib.Misc.IO.*;
import static lib.Misc.Randomizer.*;

public class DaLi_05 {
    public static void main(String[] args) {

        ex02();

    }

    public static void ex00() {

    }

    public static void ex01() {
        int n = 0;
        while (n != -1) {
            print("Enter Your Grade:");
            n = scanInt();
            println("You" + (n > 50 ? " " : " did not ") + "pass.");
        }
    }
    public static void ex02() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int a = randomInt(100), b = randomInt(100), t = 0;
            if (a < b) t = a;
            a = b;
            b = t;
            printf("\n%d : Enter result of %d - %d",count++, a, b);
            int result = scanInt();
            if (result == a - b)
                print("You win.");
            else printf("You lose: %d - %d = %d", a, b, (a - b));
        }
        printf("\nCorrect answers = %d", count);
    }
    public static void ex03() {

    }
    public static void ex04() {

    }
    public static void ex05() {

    }
    public static void ex06() {

    }
    public static void ex07() {

    }
    public static void ex08() {

    }
    public static void ex09() {

    }
    public static void ex10() {

    }
    public static void ex11() {

    }
    public static void ex12() {

    }
    public static void ex13() {

    }
    public static void ex14() {

    }
    public static void ex15() {

    }
    public static void ex16() {

    }
    public static void ex17() {

    }
    public static void ex18() {

    }
    public static void ex19() {

    }
    public static void ex20() {

    }
    public static void ex21() {

    }
    public static void ex22() {

    }
    public static void ex23() {

    }
    public static void ex24() {

    }
    public static void ex25() {

    }
    public static void ex26() {

    }
    public static void ex27() {

    }
    public static void ex28() {

    }
    public static void ex29() {

    }
    public static void ex30() {

    }
}
