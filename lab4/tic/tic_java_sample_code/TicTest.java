package tic;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class TicTest {
    Tic anas= new tic();
	@Test
	void test1() {
		Tic board = new Tic(3, 2);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
		//testing ability to declare a board
	}

	


}
