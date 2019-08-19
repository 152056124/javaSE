package proxy.ordinary;

public class ProxyImag implements Item {
    private String path;
    private RealyImag realyImag;

    public ProxyImag(String path) {
        this.path = path;
    }

    @Override
    public void display(String path) {
        if(realyImag == null){
            realyImag = new RealyImag(path);
        }
        realyImag.display(path);
    }
}
