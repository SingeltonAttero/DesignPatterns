package patterns.abstracts.factory.rpg.squad;

import patterns.abstracts.factory.rpg.specialization.Archer;
import patterns.abstracts.factory.rpg.specialization.Magician;
import patterns.abstracts.factory.rpg.specialization.SquadFactory;
import patterns.abstracts.factory.rpg.specialization.Warrior;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 29.01.19
 */
public class ElfSquadFactory extends SquadFactory {

    @Override
    public Magician createMagician() {
        return new ElfMagician();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

}

class ElfMagician implements Magician {
    @Override
    public void cast() {
        System.out.println("Elf magic cast spell");
    }
}

class ElfArcher implements Archer{

    @Override
    public void shoot() {
        System.out.println("Elf shoot arrow");
    }
}

class ElfWarrior implements Warrior{

    @Override
    public void attack() {
        System.out.println("Elf attack sword");
    }
}
