package util;

/**
 *
 * 包装类
 */
public class PackagingClass {
    public static void main(String[] args) {
        Integer integer = new Integer(5);
        Integer integer1 = new Integer(5);
        System.out.println(integer == integer1);//false
        byte a = 127;
        Byte aByte = Byte.valueOf(a);
        short b = 300;
        Short.valueOf(b);
        Long C =  Long.valueOf(12);
        Character d = Character.valueOf(' '); //Character的缓存数组是下于127，因为char没有负值。
        Float e = Float.valueOf(12);
        Double f = Double.valueOf(12);          //Double和Float没有缓存数组。

        Integer a1 = Integer.valueOf(127);
        Integer a2 = Integer.valueOf(127);
        Integer a3 = Integer.valueOf(128);
        Integer a4 = Integer.valueOf(128);
        System.out.println(a1 == a2); // true
        System.out.println(a4 == a3); //false
        //缓冲数组仅在调用valueOf()生成包装类对象时有效。（自动装箱即采用的valueOf()方法）
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
