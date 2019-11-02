package edu.cscc;

import static org.junit.jupiter.api.Assertions.*;

class RPSLSpockTest {
    private RPSLSpock rPSLSpock;

    /**
     * Base RPSLSpockTest class.
     * @author Girma Duresso
     */

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        rPSLSpock= new RPSLSpock();
    }

    /**
     *Constructor
     * @param rPSLSpock computes isValidPick test.
     */

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void compute() {
    }

    @org.junit.jupiter.api.Test
    void isValidPickNull() {
        assertFalse(rPSLSpock.isValidPick(null));
    }
    @org.junit.jupiter.api.Test
    void isValidPickRock() {
       assertTrue(rPSLSpock.isValidPick("rock"));
    }
    @org.junit.jupiter.api.Test
    void isValidPickFalse() {
        assertFalse(rPSLSpock.isValidPick("Girma"));
    }
    @org.junit.jupiter.api.Test
    void isValidPickPaper() {
        assertTrue(rPSLSpock.isValidPick("paper"));
    }
    @org.junit.jupiter.api.Test
    void isValidPickLizard() {
        assertTrue(rPSLSpock.isValidPick("lizard"));
    }
    @org.junit.jupiter.api.Test
    void isValidPickScissors() {
        assertTrue(rPSLSpock.isValidPick("scissors"));
    }
    @org.junit.jupiter.api.Test
    void isValidPickSpock() {
        assertTrue(rPSLSpock.isValidPick("spock"));

    }

    @org.junit.jupiter.api.Test
    void generatePick() {
        for(int i=0;i<1000000;i++) {
            assertNotNull(rPSLSpock.generatePick());
        }
    }

    @org.junit.jupiter.api.Test
    void isComputerWin1() {
        assertTrue(rPSLSpock.isComputerWin("rock","lizard"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin2() {
        assertTrue(rPSLSpock.isComputerWin("rock","scissors"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin3() {
        assertFalse(rPSLSpock.isComputerWin("paper","scissors"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin4() {
        assertTrue(rPSLSpock.isComputerWin("paper","spock"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin5() {
        assertFalse(rPSLSpock.isComputerWin("rock","spock"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin6() {
        assertTrue(rPSLSpock.isComputerWin("scissors","lizard"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin7() {
        assertFalse(rPSLSpock.isComputerWin("paper","lizard"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin8() {
        assertTrue(rPSLSpock.isComputerWin("lizard","spock"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin9() {
        assertTrue(rPSLSpock.isComputerWin("paper","spock"));
    }
    @org.junit.jupiter.api.Test
    void isComputerWin10() {
        assertTrue(rPSLSpock.isComputerWin("spock","rock"));
    }

}