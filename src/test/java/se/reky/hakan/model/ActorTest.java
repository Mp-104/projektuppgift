package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    //Actor actor;

    Guard guard;

    Goblin goblin;

    @BeforeEach
    public void init () {
        guard = new Guard();
        goblin = new Goblin();
    }

    @Test
    public void testAttackGuard () {

        System.out.println("Goblin health " + goblin.getHp() + " guard attacks goblin");

        guard.attack(goblin);

        System.out.println("Goblin health " + goblin.getHp());

        assertEquals(0, goblin.getHp());

    }

    @Test
    public void testAttackGoblin () {

        goblin.attack(guard);

        System.out.println("Guard health " + guard.getHp());

        assertEquals(17, guard.getHp());
    }

}
