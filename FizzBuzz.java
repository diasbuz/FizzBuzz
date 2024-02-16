import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    static class Condition {
        int divisor;
        String output;

        Condition(int divisor, String output) {
            this.divisor = divisor;
            this.output = output;
        }
    }

    private static final List<Condition> conditions = new ArrayList<>();

    //Initialization block for new conditions
    static {
        conditions.add(new Condition(3, "Fizz"));
        conditions.add(new Condition(5, "Buzz"));
        conditions.add(new Condition(7, "Jazz"));
    }

    public static List<String> fizzBuzzJazz(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            StringBuilder print = new StringBuilder();
            for (Condition condition : conditions) {
                if (i % condition.divisor == 0) {
                    print.append(condition.output);
                }
            }
            result.add(print.isEmpty() ? Integer.toString(i) : print.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 105;
        List<String> result = fizzBuzzJazz(n);
        for (String s :
                result) {
            System.out.print(s + " ");
        }
    }
}
