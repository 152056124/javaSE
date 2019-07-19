package Find;

/**
 * 遍历查找
 */
public class TraversalLookup {
    public static boolean demo(int[] a,int b){
        for (int i : a) {
            if (i == b){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,6,33,5,88,9};
        System.out.println(demo(a, 9));
        System.out.println(demo(a, 10));
    }
}
