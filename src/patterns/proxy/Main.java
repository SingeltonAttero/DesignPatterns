package patterns.proxy;

import patterns.proxy.image.Image;
import patterns.proxy.image.ProxyImage;
import patterns.proxy.image.RealImage;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 01.02.19
 */
public class Main {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("/opt/Pencil/resources");
        Image realImage = new RealImage("/opt/Pencil/resources");

        /*image.display();*/

        /*realImage.display();*/
    }
}
