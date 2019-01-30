package patterns.facade.os;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
public class ComputerFacade {

    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    public void copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
        dvdRom.upload();
        hdd.copyFromDVD(dvdRom);
    }
}
