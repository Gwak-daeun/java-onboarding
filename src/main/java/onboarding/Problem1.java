package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {

    //각자 페이지 두 쪽을 구해서 List에 담는 메소드
    public static List<Integer> findPage(List<Integer> someone) {
        int leftPage = (int)(Math.random() * 399);

        if (leftPage == 0) {
            leftPage++;
        }

        int rightPage = leftPage + 1;

        someone.add(leftPage);
        someone.add(rightPage);

//        System.out.println(someone);

        return someone;
    }

    public static int calculator(List<Integer> someone) {

        List<Integer> pages = findPage(someone); //pages의 배열 크기는 2임 [@@,@@]

//        System.out.println(pages);

        int[] arr = new int[2];

        for (int i = 0; i < pages.size(); i++) {
            String num = String.valueOf(pages.get(i));

//            System.out.println("num.length() : " + num.length());


            int mul = 1;
            int sum = 0;

            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(j);
                int digit = Character.getNumericValue(c);
                mul *= digit;
                sum += digit;
            }

            if (mul > sum) {
//                System.out.println("mul : " + mul);
                arr[i] = mul;
            } else {
//                System.out.println("sum : " + sum);
                arr[i] = sum;
            }

        }

        if (arr[0] > arr[1]) {
            return arr[0];
        } else {
            return arr[1];
        }

    }

}

class Solution {
    public static void main(String[] args) {
        List<Integer> crong = new ArrayList<>();
        List<Integer> pobi = new ArrayList<>();

//        List<Integer> test1 = new ArrayList<>(); // pobi
//        List<Integer> test2 = new ArrayList<>(); // crong

//        test1.add(131);
//        test1.add(132);
//
//        test2.add(211);
//        test2.add(212);

       int crongTurn = Problem1.calculator(crong);
       int pobiTurn = Problem1.calculator(pobi);

//        int crongTurn = Problem1.calculator(test2);
//        int pobiTurn = Problem1.calculator(test1);

        if (pobiTurn > crongTurn) {
            System.out.println(1);
        } else if (crongTurn > pobiTurn) {
            System.out.println(2);
        } else if (crongTurn == pobiTurn) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}