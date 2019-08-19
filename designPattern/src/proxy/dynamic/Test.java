package proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        People people = new People();
        MyProxy myProxy = new MyProxy(people);
        PeopleInterface peopleInterface = (PeopleInterface) Proxy.newProxyInstance(PeopleInterface.class.getClassLoader(),
                people.getClass().getInterfaces(),myProxy);
        int run = peopleInterface.run(12);
        System.out.println(run);
        peopleInterface.print("123");
    }
}
