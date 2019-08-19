package proxy.dynamic;

public class People implements PeopleInterface {
    @Override
    public int run(int sum) {
        return sum;
    }

    @Override
    public void print(String str) {
        System.out.println("print: " + str);
    }
}
