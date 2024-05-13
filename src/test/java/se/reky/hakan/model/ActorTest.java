package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    //Actor actor;

    Guard guard = new Guard();

    Goblin goblin = new Goblin();

    @Test
    public void testAttack () {

        System.out.println("Goblin health " + goblin.getHp() + " guard attacks goblin");

        guard.attack(goblin);

        System.out.println("Goblin health " + goblin.getHp() + " goblin attacks guard");

        goblin.attack(guard);

        System.out.println("Guard health " + guard.getHp());

        assertEquals(0, goblin.getHp());

        assertEquals(17, guard.getHp());

    }

}
