package patterns.facade.os;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
class DVDRom {

    private boolean hasData = false;

    public boolean hasData() {
        return hasData;
    }

    public void load(){
        hasData = true;
    }

    public void upload(){
        hasData = false;
    }
}
