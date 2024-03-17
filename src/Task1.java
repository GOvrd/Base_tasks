public class Task1 {
    public static int task(String str){
        if(str.length() <= 5 && str.length() >= 3){
            String[] time = str.split(":");

            int minute  = Integer.parseInt(time[0]);
            int second  = Integer.parseInt(time[1]);

            if(minute > 0 && second >= 0 && second <= 59)
                return minute * 60 + second;
            else return -1;
        }else return -1;
    }
}
