package util;

import java.util.function.Consumer;

public class Consumer1 implements Consumer<Integer> {

    @Override
    public void accept(Integer o) {
        System.out.println(o);
    }

}
