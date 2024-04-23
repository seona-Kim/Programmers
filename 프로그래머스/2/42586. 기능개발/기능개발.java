import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= cur) {
                queue.poll();
                count++;
            }
            list.add(count);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}