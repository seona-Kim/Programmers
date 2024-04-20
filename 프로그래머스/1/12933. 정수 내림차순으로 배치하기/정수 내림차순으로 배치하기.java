import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        Arrays.sort(arr);
        long answer = Long.parseLong(new StringBuilder(new String(arr)).reverse().toString());
        return answer;
    }
}
