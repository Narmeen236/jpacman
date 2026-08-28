package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {

    @Test
    public void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = mock(Square.class);
        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

    @Test
    public void testBoardWithNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        Board board = new Board(grid);

        board.squareAt(0, 0);
    }
}
