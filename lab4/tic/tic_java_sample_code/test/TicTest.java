import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;
class TicTest {
    Tic anas= new Tic(2,3);
	Tic anas2= new Tic(2,3);
	@Test
	void test1() {
		Tic board = new Tic(3 ,3);
		Tic board2 = new Tic(3,3);
		assertEquals(board.rowNumber(), board2.rowNumber());
		//testing ability to declare a board
	}

	@Test
	void test2(){
		Tic empty = new Tic(2,3);
		assertEquals(empty.rowNumber(),anas.rowNumber());
	}

	@Test
	void test3(){
		assertEquals(3,anas.colsNumber());
	}

	@Test
	void test4(){
		assertEquals(9,anas.boardSize(3,3));
	}
	@Test
	void test5(){
		assertEquals(6,anas.boardSize(2,3));
	}
}
