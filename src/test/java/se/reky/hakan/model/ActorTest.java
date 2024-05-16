package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ActorTest {

    //Actor actor;

    private Guard guard;

    private Goblin goblin;


    @Test
    public void shouldReturn0WhenGuardAttacksFor20 () {

        guard = new Guard("Guard", 20, 20);
        goblin = new Goblin("Goblin", 20,3);

        System.out.println("Goblin health " + goblin.getHp() + " guard attacks goblin");

        guard.attack(goblin);

        System.out.println("Goblin health " + goblin.getHp());

        assertEquals(0, goblin.getHp());

    }

    @Test
    public void shouldReturn17WhenGoblinAttacksFor3 () {

        guard = new Guard("Guard", 20, 20);
        goblin = new Goblin("Goblin", 20,3);

        goblin.attack(guard);

        System.out.println("Guard health " + guard.getHp());

        assertEquals(17, guard.getHp());
    }

}
