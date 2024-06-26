package se.reky.hakan.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.Assert.assertThrows;

public class GameUtilTest {

    private GameUtil gameUtil;

    @BeforeEach
    public void init () {
        gameUtil = new GameUtil();
    }

    @Test
    public void shouldThrowGameExceptionIfNull () {

        assertThrows(GameException.class, () -> {gameUtil.toLowerCaseButFirstLetterCapitalized(null);});

    }

}
