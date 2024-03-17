public class Task4 {
    public static boolean task(int[] mas1, int[] mas2){
        if(min(mas1) > min(mas2) &&
                max(mas1) < max(mas2)){
            return true;
        }
        return false;
    }
    private static int min(int[] mas){
        int min = mas[0];
        for(int num : mas) if(num < min) min = num;
        return min;
    }
    private static int max(int[] mas){
        int max = mas[0];
        for(int num : mas) if(num > max) max = num;
        return max;
    }
}
