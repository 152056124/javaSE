package day4.arraylistdemo;

import java.util.Arrays;

/**
 *
 * 自写ArrayList类
 */
public class MyArrayList<T> {
    //存元素的数组
    private Object[] obj;

    //默认数组
    private static final Object[] DEFAULT_DATE = new Object[0];

    //数组元素的个数
    private int size;

    //数组的长度
    private int count;

    public MyArrayList(){
        obj = DEFAULT_DATE;
    }
    //后接
    public void add(T context){
        copyAdd();
        obj[size++] = context;
    }
    //扩容
    public void copyAdd(){
        if(size >= count){
           obj =  Arrays.copyOf(obj,obj.length+16);
           count += 16;
        }
    }

    //get方法
    public T get(int index){
        if (index < 0 || index > count){
            return (T)err();
        }
        return (T)obj[index];
    }
    //删除
    public Object[] delete(int index){
        if (index < 0 || index > count){
            return null;
        }
        Object[] a1 = Arrays.copyOfRange(obj, 0, index );
        Object[] a2 = Arrays.copyOfRange(obj, index + 1, count - 1);
        Object[] a = Arrays.copyOf(a1, a1.length + a2.length);
        System.arraycopy(a2,0,a,a1.length,a2.length );
        obj = a;
        return obj;
    }
    //修改
    public Object[] set(int index,Object context){
        if (index < 0 || index > count){
            return err();
        }
        Object[] a1 = Arrays.copyOfRange(obj, 0, index );
        Object[] a2 = Arrays.copyOfRange(obj, index + 1, count - 1);
        Object[] a = Arrays.copyOf(a1, a1.length + a2.length);
        Object[] a3 = {context};
        System.arraycopy(a3,0,a,a1.length ,1 );
        System.arraycopy(a2,0,a,a1.length + 1 ,a2.length  - 1);
        obj = a;
        return obj;

    }

    //插入
    public Object[] insert(int index,Object context){
        if (index < 0 || index > count){
            return err();
        }
        Object[] a1 = Arrays.copyOfRange(obj, 0, index );
        Object[] a2 = Arrays.copyOfRange(obj, index , count - 1);
        String s = Arrays.toString(a2);
        Object[] a = Arrays.copyOf(a1, a1.length + a2.length + 1);
        Object[] a3 = {context};
        System.arraycopy(a3,0,a,a1.length ,1 );
        System.arraycopy(a2,0,a,index + 1 ,a2.length  - 1);

        obj = a;
        return obj;

    }
    private static Object[] err(){
        Object[] err01 = {"java.lang.ArrayIndexOutOfBoundsException"};
        Arrays.toString(err01);
        return err01;
    }
    @Override
    public String toString() {
        return "MyArrayList{" +
                "obj=" + Arrays.toString(obj) +
                '}';
    }
}
