public class MathDemo {
    public int min(int a, int b) {
        if(a<b) {
            return a;
        }
        return b;
    }

    public int max(int a, int b) {
        if(a<b) {
            return b;
        }

        return a;
    }

    public int sum(int[] args) {
        int result=0;
        for(int i=0;i<args.length;i++) {
            result+=args[i];

        }
        return result;
    }
}