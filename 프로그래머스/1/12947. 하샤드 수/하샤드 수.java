class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        
        // 각 자릿수의 합을 구함
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        // 원래의 숫자가 자릿수의 합으로 나누어 떨어지는지 확인
        boolean answer = (x % sum == 0);
        
        return answer;
    }
}
