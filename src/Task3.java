import java.util.Scanner;

public class Task3 {
    public static void task(){
        System.out.println("Enter N:\n>");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for(int i = 0; i < n; i++){
            mas[i] = in.nextInt();
        }
        if(n % 2 == 1){
            for(int i = 0; i < n; i++){
                System.out.println(mas[i]);
            }
        }else{
            for(int i = n - 1; i >= 0; i--){
                System.out.println(mas[i]);
            }
        }
    }
}