package kyu8;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        int result=0;
        for (int i = 0; i < n.length; i++) {
            result+= Math.pow(n[i],2);
        }
        return result;
    }

    //second solution
    // return Arrays.stream(stops).map(i -> i * i).sum();
}
