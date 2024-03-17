public class Task6 {
    public static boolean task(int num){
        char[] str_num = Integer.toString(num).toCharArray();
        if(str_num.length > 1){
            if(is_palindrom(str_num)) return true;
            else{
                String new_str = "";
                for(int i = 0; i < str_num.length / 2; i++){
                    new_str += (((int)str_num[i * 2] + (int)str_num[i * 2 + 1]) - 48 * 2) ;
                }
                return task(Integer.parseInt(new_str));
            }
        }
        return false;
    }
    private static boolean is_palindrom(char[] mas){
        for(int i = 0; i < mas.length / 2 ; i++) if (mas[i] != mas[mas.length - 1 - i]) return false;
        return true;
    }
}
