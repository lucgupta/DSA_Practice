package Arrays;

import java.math.BigInteger;

public class NextSmallestPallindrom {

    public static String solve(String num) {
        int len = num.length();
        System.out.println(len);
        String left = num.substring(0, len / 2);
        System.out.println("left is : " + left);
        String middle = num.substring(len / 2, len - len / 2);
        System.out.println("middle is : " + middle);
        String right = num.substring(len - len / 2);
        System.out.println("right is : " + right);

        System.out.println(reverse(left));
        if (right.compareTo(reverse(left)) < 0) {
            System.out.println(left + middle + reverse(left));
            return left + middle + reverse(left);
        }

        String next = new BigInteger(left + middle).add(BigInteger.ONE).toString();
        System.out.println("next is : " + next);
        return next.substring(0, left.length() + middle.length())
                + reverse(next).substring(middle.length());
        }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(solve("2168576189279543123341"));
    }
}
