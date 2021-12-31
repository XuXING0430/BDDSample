package com.company.BDDTest.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BDDSample {
    /**
     * EX 1
     */
    @Test
    public void testMethodIsFullReturnFalse() {
        int weight = 1000;

        boolean isFull = Elevator.isFull(weight);

        assertFalse(isFull);
    }

//    // better solution
//    public void shouldNotAduit_givenPersonAgeLessThan18() {
//        // Given person age less than 18
//        Long age = 15;
//
//        // When check the person row is audit
//        boolean isAudit = Method.isAudit(age);
//
//        // Then the result should be not audit
//        assertFalse(isAudit);
//    }

    /**
     * When_AgeLessThan18_Expect_isAdultAsFalse
     *
     */
    @Test
    public void When_ElevatorNotOverWeight_Expect_isFullAsFalse() {
        // given
        int weight = 1000;

        // when
        boolean isFull = Elevator.isFull(weight);

        // then
        assertFalse(isFull);
    }


    /**
     * EX 3
     */
    @Test
    public void shouldReturnFalse_givenElevatorNotOverWeight() {
        // Given elevator weight
        int weight = 1000;

        // When check elevator is full
        boolean isFull = Elevator.isFull(weight);

        // Then should return false
        assertFalse(isFull);
    }


    /**
     * Better
     */
    @Test
    public void shouldNotFull_givenElevatorNotOverWeight() {
        // Given not over weight elevator
        int weight = 1000;

        // When check elevator is full
        boolean isFull = Elevator.isFull(weight);

        // Then elevator is not full
        assertFalse(isFull);
    }

}
