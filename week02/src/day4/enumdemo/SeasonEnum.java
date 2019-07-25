package day4.enumdemo;

public enum SeasonEnum {
    SPRING("春天",1),SUMMER("夏天",2),AUTAMT("秋天",3),WINTER("冬天",4);

    private String name;
    private Integer num;
    SeasonEnum(String name,Integer num) {
        this.name = name;
        this.num = num;
    }
    public static String getName(Integer num){
        for (SeasonEnum s:SeasonEnum.values()){
            if (s.getNum() == num){
                return s.getName();
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
