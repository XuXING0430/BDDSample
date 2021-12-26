package com.company.BDDTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class BDDSample {
    /**
     * EX 1
     */
    @Test
    public void testMethodReturnFalse() {
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
    public void shouldNotFull_givenElevatorNotOverWeight() {
        //
        int weight = 1000;

        //
        boolean isFull = Elevator.isFull(weight);

        //
        assertFalse(isFull);
    }

}
