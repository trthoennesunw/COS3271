import java.util.Scanner;

public class LoopsAPP {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i;
        for (i = 1; i < 5000; i=2*i+1) {
            System.out.println("Count is: " + i);
        }

    }
}
/*

The program uses a for loop with an updated expression. Instead of i++ as the usual counter, the loop updates with i=2*i+1.
This doubles the current value and adds once. The loop starts at i=1 and continues if it reaches under 5000 (i<5000).
On each pass, it prints out (“Count is: “) followed by the count by i. Essentially, each one of the values is one less than a power of two, which we can see in the loop.
It goes 1,3,7,15,31,63,127, 255, 1023, 207, 4095. The result is 12 lines of output. It shows how quickly it reaches its limit before it stops producing an output.
 */