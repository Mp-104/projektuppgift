package se.reky.hakan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

class PlayerInteractionTest {

//    3) Du ska testa att metoden playerSetup(Player player) i interfacet PlayerInteraction
//      (implementationsklassen är SimplePlayerInteraction) sätter spelarens namn. Använd den
//      privata metoden som du själv har skapat och som ger dig en instans av PlayerInteraction
//      och skicka med det tänkta namnet på spelaren till Scannern. Kalla därefter på metoden
//      .playerSetup() och verifiera därefter, med lämplig metod i Assertions-klassen, att
//      player.getName() motsvarar värdet av det namn du har valt (namnet du skickade in till
//      Scannern).


    private PlayerInteraction playerInteraction (String dataForScanner) {

        PlayerInteraction playerInteraction;

        playerInteraction = new SimplePlayerInteraction(new IOHandler(new Scanner(dataForScanner)));

        return playerInteraction;

    }


    private Player player;

    @BeforeEach
    public void init () {
        player = new Player();

    }

    @Test
    public void testPlayerName () {

        playerInteraction("Player1").setupPlayer(player);

        assertEquals("Player1", player.getName());

    }

    @Test
    public void testUpdatePlayerHealth () {

        playerInteraction("Player2").updatePlayerHealth(player,2);

        assertEquals(2, player.getHp());

    }

}
