package day5.reflection;

import java.io.Serializable;

public class EntityClass implements Serializable {
    private static final long serialVersionUID = 2L;
    private int count;
    public transient String name = "zzz";

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EntityClass{" +
                "count=" + count +
                ", name='" + name + '\'' +
                '}';
    }
}
