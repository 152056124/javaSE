package day5.enumdemo2;

/**
 * 
 * 枚举类
 */
public enum PeopleEnum {
    STUDENTS(1,true,"学生"),TEACHER(2,false,"教师");
    private int count;
    private boolean sex;
    private String context;
    
    //构造方法默认私有。
    PeopleEnum(int count, boolean sex, String context) {
        this.count = count;
        this.sex = sex;
        this.context = context;
    }
    public String getContext(int count){
        this.count = count;
        context = this.context;
        return context;
    }
}
