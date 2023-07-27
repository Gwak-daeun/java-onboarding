package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2 {

    static String cryptogram = "browoanoommnaon";

    public static void solution(String cryptogram) {
        System.out.println(cryptogram);

        String[] word = cryptogram.split("");

        List<String> wordArr = new ArrayList<>();

        for (String i : word) {
            wordArr.add(i);
        }

        System.out.println(wordArr);

        for (int i = 0; i < wordArr.size(); i++) {

            for (int j = 0; j < wordArr.size() - 1; j++) {
                if (wordArr.get(j).equals(wordArr.get(j + 1))) {
                    System.out.println("같다 : " + wordArr.get(j) + ", " + wordArr.get(j+1));
                    wordArr.remove(j+1);
                    wordArr.remove(j);
                }
            }
        }

        System.out.println(wordArr);
    }

    public static void main(String[] args) {
        Problem2.solution(cryptogram);
    }
}
