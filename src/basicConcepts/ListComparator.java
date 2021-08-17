package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparator {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(45);
        values.add(56);
        values.add(31);
        values.add(65);
        values.add(22);

        //if we want to sort in simple manner
        Collections.sort(values);

        /*if we want to sort on basis of our condition
        let's say on basis of last digit of the values
         */

        Collections.sort(values, ((o1, o2) ->
        {
            return o1%10>o2%10?1:-1;
        }));

        for(int i : values) {
            System.out.println(i);
        }
    }
}