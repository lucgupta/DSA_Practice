package basicConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
        //1st way to write code without using lambda
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        //2nd way to write code with lambda

        Consumer<Integer> con1 = integer -> System.out.println(integer);
        values.forEach(con1);

        //3rd way to write code

        values.forEach(i-> System.out.println(i));
    }
}
