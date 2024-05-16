package se.reky.hakan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

class PlayerInteractionTest {


    private PlayerInteraction getPlayerInteraction(String dataForScanner) {

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
    public void shouldReturnDataForSetupPlayer () {

        getPlayerInteraction("Player1").setupPlayer(player);

        assertEquals("Player1", player.getName());

    }

    @Test
    public void shouldReturnAssignedHpValue () {

        getPlayerInteraction("Player2").updatePlayerHealth(player,2);

        assertEquals(2, player.getHp());

    }

}
