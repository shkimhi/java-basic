package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성 제한
    }

    public static int sum(int[] values) {
        int sum = 0;
        for(int a : values){
            sum += a;
        }
        return sum;
    }

    public static double average(int[] values) {
        double sum = 0;
        for(int a : values){
            sum += a;
        }
        return sum/values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int i = 1; i<values.length; i++){
            if(values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int a : values){
            if(a>max){
                max =a;
            }
        }
        return max;
    }
}
