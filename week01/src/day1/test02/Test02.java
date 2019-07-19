package day1.test02;

public class Test02 {
    static Integer a = 10;

    public static void main(String[] args) {
        System.out.println(a.toString());

        //防止debug时出现错误：ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
        // JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840]
        // System.exit(0);
    }
}
