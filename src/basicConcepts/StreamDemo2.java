package basicConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 34, 45, 15, 9);

        //We want to print sum of elements divisible by 5
        //using for loop
        int result = 0;
        for(int i : values) {
            if(i%5==0)
                result += i;
        }
        System.out.println(result);

        //using stream api

        System.out.println(values.stream()
                .filter(i-> i%5==0)
                .reduce(0, Integer ::sum));

        //How does it work internally

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5 == 0;
            }
        };

        System.out.println(values.stream().filter(p).reduce(0, (c,e) -> c+e));
    }
}
