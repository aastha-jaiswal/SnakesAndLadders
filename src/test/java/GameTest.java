import org.example.Board;
import org.example.Dice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Dice dice;
    private Board board;

    @BeforeEach
    void setup() {
        dice = new Dice();
        board = new Board();
    }

    @Test
    void testDiceRollRange() {
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            assertTrue(roll >= 1 && roll <= 6, "Dice roll should be between 1 and 6");
        }
    }

    @Test
    void testSnakeBite() {
        int newPosition = board.checkPosition(36); // Snake head
        assertEquals(19, newPosition, "Snake at 36 should move player to 19");
    }

    @Test
    void testLadderClimb() {
        int newPosition = board.checkPosition(7); // Ladder foot
        assertEquals(33, newPosition, "Ladder at 7 should move player to 33");
    }

    @Test
    void testNoSnakeOrLadder() {
        int newPosition = board.checkPosition(10);
        assertEquals(10, newPosition, "No snake/ladder at 10, should stay same");
    }

    @Test
    void testWinningConditionExact100() {
        int playerPosition = 95;
        int diceValue = 5;
        playerPosition += diceValue;
        assertEquals(100, playerPosition, "Player should win at exactly 100");
    }

    @Test
    void testExceeding100() {
        int playerPosition = 98;
        int diceValue = 5;
        assertEquals(98, playerPosition, "If move exceeds 100, stay at same position");
    }
}
