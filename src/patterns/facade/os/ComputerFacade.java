package patterns.facade.os;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
public class ComputerFacade {

    private Power power = new Power();
    private DVDRom dvdRom = new DVDRom();
    private HDD hdd = new HDD();

    public void copy() {
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);
        dvdRom.upload();
        hdd.copyFromDVD(dvdRom);
    }
}
