package ordinary;

import java.util.Arrays;

public class ReplaceSpace {
    static String demo01(StringBuffer str){
        String s = str.toString();
        if (str.length() == 0){
            return s;
        }
        char[] old = s.toCharArray();
        int i = 0;
        int addLength = 0;
        while (i < old.length){
            if(old[i] == ' '){
                addLength++;
            }
            i++;
        }
        int newLength = s.length() + addLength * 2;
        char[] newChar = new char[newLength];
        i = 0;
        int j = 0;
        while (i <= old.length - 1){
            if(old[i] != ' '){
                newChar[j++] = old[i++];
            }else {
                newChar[j++] = '2';
                newChar[j++] = '0';
                newChar[j++] = '%';
                i++;
            }
        }
        return new String(newChar);
    }
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("String Hello World ");
        String a = demo01(s);
        System.out.println(a);
    }
}
