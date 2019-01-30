package patterns.facade.os;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
class DVDRom {

    private boolean hasData = false;

    boolean hasData() {
        return hasData;
    }

    void load() {
        hasData = true;
    }

    void upload() {
        hasData = false;
    }
}
