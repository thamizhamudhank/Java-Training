package New_11;

public class Solution {
    Solution() {
        this(10, 20);
        System.out.println("First constructor");
    }
    Solution (int i, double j){
        System.out.println("Second constructor");
    }

    public static void main(String[] args) {
        Solution s1=new Solution();
    }
}
