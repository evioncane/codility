package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer[] result = {0,0};
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                result[0] = ++result[0];
            } else if (a.get(i) < b.get(i)) {
                result[1] = ++result[1];
            }
        }
        return Arrays.asList(result);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> result = Result.compareTriplets(Arrays.asList(17,28,30), Arrays.asList(99,16,8));
        System.out.println(result);
    }
}

