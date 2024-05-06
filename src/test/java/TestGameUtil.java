import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;
import se.reky.hakan.util.GameUtil;

public class TestGameUtil {

    GameUtil gameUtil;

    @BeforeEach
    public void init () {
        gameUtil = new GameUtil();
    }

    @Test
    public void testThrowGameException () {

        Assertions.assertThrows(GameException.class, () -> {gameUtil.toLowerCaseButFirstLetterCapitalized(null);});

    }

}
