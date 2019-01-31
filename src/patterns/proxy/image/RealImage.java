package patterns.proxy.image;

import java.io.File;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class RealImage implements Image {

    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    private void load(){
        System.out.println("load " + file);
    }

    @Override
    public void display() {
        System.out.println("display " + file);
    }
}
