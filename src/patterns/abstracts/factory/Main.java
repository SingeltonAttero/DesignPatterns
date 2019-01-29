package patterns.abstracts.factory;

import patterns.abstracts.factory.rpg.specialization.Archer;
import patterns.abstracts.factory.rpg.specialization.Magician;
import patterns.abstracts.factory.rpg.specialization.Warrior;
import patterns.abstracts.factory.rpg.squad.ElfSquadFactory;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 29.01.19
 */
public class Main {

    public static void main(String[] args) {
        createSquadElf(new ElfSquadFactory());
    }


    public static void createSquadElf(ElfSquadFactory elfSquadFactory){
        Archer archer = elfSquadFactory.createArcher();
        Magician magician = elfSquadFactory.createMagician();
        Warrior warrior = elfSquadFactory.createWarrior();
        warrior.attack();
        archer.shoot();
        magician.cast();
    }

}
