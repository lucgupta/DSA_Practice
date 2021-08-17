package basicConcepts;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 34, 45, 15, 9);

        /*
        Here, filter -> filters out elements on basis of condition
              map -> doubles the filtered elements
              findFirst -> returns first element from latest values, which gives type as Optional
              orElse -> if we don't get anything from above function, it returns its passed value
              (Optional meaning -> if we don't get anything from findFirst, it will not throw error)

         */

        System.out.println(values.stream()
                                .filter(i-> i%5 == 0)
                                .map(i-> i*2)
                                .findFirst()
                                .orElse(0));

        /*
        Here, to find just first element, we're going through all elements of the list.
        here filter and map functions are called lazy functions
        So, just to check for starting elements to find first element, we can do below
         */

        System.out.println(values.stream()
                .filter(StreamDemo3::isDivisible)
                .map(StreamDemo3::mapDouble)
                .findFirst()
                .orElse(0));
    }

    //it will now run for elements till we find one element where condition is true
    public static boolean isDivisible(int i) {
        System.out.println("In isDivisible " + i);
        return i%5 == 0;
    }

    //it will run for one element only
    public static int mapDouble(int i) {
        System.out.println("In mapDouble" + i);
        return i*2;
    }
}
