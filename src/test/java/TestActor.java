import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Actor;
import se.reky.hakan.model.Goblin;
import se.reky.hakan.model.Guard;
import se.reky.hakan.model.Player;

public class TestActor {

    Actor actor;

    Guard guard = new Guard();

    Goblin goblin = new Goblin();

    @Test
    public void testAttack () {

        System.out.println("Goblin health " + goblin.getHp() + " guard attacks goblin");

        guard.attack(goblin);

        System.out.println("Goblin health " + goblin.getHp() + " goblin attacks guard");

        goblin.attack(guard);

        System.out.println("Guard health " + guard.getHp());

        Assertions.assertEquals(0, goblin.getHp());

        Assertions.assertEquals(17, guard.getHp());

    }

}
