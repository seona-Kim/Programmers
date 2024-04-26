import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }

        int answer = 0;
        while (!queue.isEmpty()) {
            int currentPriority = queue.poll();
            boolean hasHigherPriority = false;
            for (int priority : queue) {
                if (priority > currentPriority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            if (hasHigherPriority) {
                queue.offer(currentPriority);
            } else {
                answer++;
                if (location == 0) {
                    break;
                }
            }
            location = (location - 1 + queue.size()) % queue.size();
        }
        return answer;
    }
}