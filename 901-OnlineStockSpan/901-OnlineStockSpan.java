// Last updated: 9/11/2026, 9:24:33 AM
class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }
        st.push(new int[] {price, span});
        return span;
    }
}