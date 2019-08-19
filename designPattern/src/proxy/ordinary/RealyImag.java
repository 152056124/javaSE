package proxy.ordinary;

public class RealyImag implements Item {
    private String path;
    public RealyImag(String path) {
        this.path = path;
        System.out.println("构造器");
    }

    @Override
    public void display(String path) {
        System.out.println("图片的位置在："+ path);
    }
}
