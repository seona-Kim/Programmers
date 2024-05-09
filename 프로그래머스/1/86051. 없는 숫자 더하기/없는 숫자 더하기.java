class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        for (int number : numbers) {
            totalSum -= number;
        }
        return totalSum;
    }
}