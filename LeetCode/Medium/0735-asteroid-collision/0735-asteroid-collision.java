class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int value = asteroids[i];
            boolean alive = true;

            while (alive && value < 0 && !st.isEmpty() && st.peek() > 0) {

                if (st.peek() < Math.abs(value)) {
                st.pop();
                } 
                else if (st.peek() == Math.abs(value)) {
                    st.pop();
                    alive = false;
                } 
                else {
                    alive = false;
                }
            }

        if (alive) {
        st.push(value);
        }
    }

    int[] objects = new int[st.size()];

    for (int i = 0; i < st.size(); i++) {
        objects[i] = st.get(i);
    }

    return objects;
        
    } 
}