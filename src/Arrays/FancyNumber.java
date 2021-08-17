package Arrays;

import java.util.ArrayList;

public class FancyNumber {

    public static boolean fancyNumber(String number) {
        int [] array = new int[11];
        int prev = -1;
        int increment = 0;
        int consecutive = 1;
        ArrayList<Integer> brr = new ArrayList<>();
        ArrayList<Integer> crr = new ArrayList<>();
        int j=0;

//        for(int i = 0; i < number.length() -3; i++){
//            if(number.charAt(i) < number.charAt(i+1) && number.charAt(i+1) < number.charAt(i+2)
//            && number.charAt(i+2)< number.charAt(i+3))
//                return true;
//        }

        for(int i = 0; i < number.length(); i++){
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            array[num] += 1;
//            if(array[num] >= 4)
//                return true;
            if(prev == num){
                consecutive += 1;
            }

            else if(prev <= num+1){
                increment -= 1;
                consecutive = 1;
            }
            else if(num == prev+1){
//                if(brr.size() != 3){
//                    brr.add(prev);
//                }
                increment += 1;
                consecutive = 1;
//                consecutive = 1;
            }

            if(consecutive == 4)
                return true;

            if(increment == 3) {
                System.out.println("here");
                return true;
            }
            prev = num;
        }
        return false;
    }


    public static void main(String[] args) {
        String number = "12342733844";
        if(fancyNumber(number))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
