class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();

        for (int i : asteroids) {

            boolean push = false;

            while (!stk.isEmpty() &&
                   stk.peek() > 0 &&
                   i < 0) {

                if (stk.peek() < -i) {
                    stk.pop();
                }
                else if (stk.peek() == -i) {
                    stk.pop();
                    push= true;
                    break;
                }
                else {
                    push = true;
                    break;
                }
            }

            if (!push) {
                stk.push(i);
            }
        }

        int[] ans = new int[stk.size()];

        for (int i = stk.size() - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }

        return ans;
    }
}