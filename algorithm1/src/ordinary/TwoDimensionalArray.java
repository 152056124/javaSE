package ordinary;

/**
 *
 * 二维数组的查找
 */
public class TwoDimensionalArray {
    public static boolean test01(int inter,int[][] array){
        if(array.length == 0||array[0].length == 0){
            return false;
        }
        int rows = array.length-1;
        int cols = array[0].length-1;
        int i = 0;
        int j = cols;
        while (i <= rows && j >= 0){
            if (array[i][j] < inter){
                i++;
            }else if (array[i][j] > inter){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
   /* public static boolean test02(int inte,int[][] array){
        if (array.length == 0 || array[0].length ==0){
            return false;
        }
        int rows = array.length - 1;
        int cows = array[0].length - 1;
        int i = 0;
        int j = cows;
        while (i <= rows && j >= 0 ){
            if(inte > array[i][j]){
                i++;
            }else  if(inte < array[i][j]){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
    */
    public static void main(String[] args) {
        int[][] a =new int[5][7];
       // System.out.println(test01(5, a));
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}
