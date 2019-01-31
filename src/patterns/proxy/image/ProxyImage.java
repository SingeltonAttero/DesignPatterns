package patterns.proxy.image;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class ProxyImage implements Image{

    private final String file;
    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null){
            image = new RealImage(file);
        }
        image.display();
    }
}
