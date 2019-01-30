package patterns.facade;

import patterns.facade.os.ComputerFacade;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 30.01.19
 */
public class Main {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.copy();
    }
}
