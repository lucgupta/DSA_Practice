package basicConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        //different ways of printing values
        values.forEach(i-> System.out.println(i));

        //if we want to double the elements
        values.forEach(i-> System.out.println(i*2));

        //using stream api
        // here we're doubling and adding elements

        System.out.println(values.stream().map(i->i*2).reduce(0, (c,e)-> c+e));

        //How does upper lines works

        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        Stream s = values.stream();

        Stream s1 = s.map(f);

        Integer result = (Integer)s1.reduce(0, b);

        System.out.println(result);

    }
}
