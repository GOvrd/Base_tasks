public class Task2 {
    public static int task(int num){
        num = Math.abs(num);
        int result = 1;
        while(num >= 9){
            result++;
            num /= 10;
        }
        return result;
    }
}