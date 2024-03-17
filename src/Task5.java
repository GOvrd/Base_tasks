public class Task5 {
    public static String task(String str){
        char[] old_str = str.toCharArray();
        int n = (int)Math.floor(old_str.length / 2.);
        for(int i = 0; i < n; i++){
            char temp = old_str[i * 2];
            old_str[i * 2] = old_str[i * 2 + 1];
            old_str[i * 2 + 1] = temp;
        }
        return new String(old_str);
    }
}
