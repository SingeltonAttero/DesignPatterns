package patterns.abstracts.factory.rpg.specialization;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 29.01.19
 */
public abstract class SquadFactory {

    public abstract Magician createMagician();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();

}
