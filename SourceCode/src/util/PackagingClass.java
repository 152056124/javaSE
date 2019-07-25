package util;

/**
 *
 * 包装类
 */
public class PackagingClass {
    public static void main(String[] args) {
        Integer integer = new Integer(5);
        Integer a1 = Integer.valueOf(127);
        Integer a2 = Integer.valueOf(127);
        Integer a3 = Integer.valueOf(128);
        Integer a4 = Integer.valueOf(128);
        System.out.println(a1 == a2); // true
        System.out.println(a4 == a3); //false
        //如果传入Integer的数处于-128到127之间，则存储于cache数组中，为同一个对象引用。
        // 如果超过，则为不同对象。

        //  public static Integer valueOf(int i) {
        //        if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        //    }

        //        static final int low = -128;
        //        static final int high;
        //        static final Integer cache[];
}
}
