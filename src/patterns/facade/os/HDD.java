package patterns.facade.os;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
class HDD {

    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("Copy data from disk");
        }else {
            System.out.println("Insert data disc\n");
        }
    }
}
