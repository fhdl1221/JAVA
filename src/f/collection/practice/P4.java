package f.collection.practice;

import java.util.*;

public class P4 {
    public static void main(String[] args) {
        // 테스트 1
        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 3, 2, 1, 3, 1)
        );
        System.out.println("입력: " + list1);
        System.out.println("출력: " + countFrequency(list1));

        // 테스트 2
        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(5, 5, 5, 5, 5)
        );
        System.out.println("\n입력: " + list2);
        System.out.println("출력: " + countFrequency(list2));

        // 테스트 3
        ArrayList<Integer> list3 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
        System.out.println("\n입력: " + list3);
        System.out.println("출력: " + countFrequency(list3));

        // 테스트 4
        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("\n입력: " + list4);
        System.out.println("출력: " + countFrequency(list4));
    }

    public static ArrayList<ArrayList<Integer>> countFrequency(ArrayList<Integer> list) {
        // 여기에 코드 작성
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(list == null || list.size() == 0) {
            return result;
        }

        ArrayList<Integer> check =  new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            int current = list.get(i);

            if(check.contains(current)) {
                continue;
            }

            int count = 0;
            for(int n: list) {
                if(n == current) {
                    count++;
                }
            }
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(current);
            pair.add(count);
            result.add(pair);

            check.add(current);
        }

        return result;
    }
}
