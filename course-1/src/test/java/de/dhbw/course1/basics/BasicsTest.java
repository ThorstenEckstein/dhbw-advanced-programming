package de.dhbw.course1.basics;

import main.java.de.dhbw.commons.Logger;
import de.dhbw.course1.basics.objectcontract.Passenger;
import de.dhbw.course1.basics.objectcontract.Train;
import de.dhbw.course1.basics.refsemantics.Account;
import de.dhbw.course1.basics.refsemantics.AccountManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicsTest {

    private final Logger logger = new Logger(BasicsTest.class);

    @Test
    @DisplayName(
            """
            Reference Semantics with primitives:
             Pass by Value: In the pass by value concept, the method is called by passing a value. The argument
             is a copy of the original one. This is called 'pass by value'. It does not affect the original parameter.
            """
    )
    //tag::ref-semantics-prim[]
    public void canDemonstrateReferenceSemanticsWithPrimitives() {
        // given - a primitive value
        AccountManager manager = new AccountManager();
        int amount = 2100;

        logger.log("Amount before deposit : " + amount);

        // when
        manager.depositV1(amount, 500);

        // then
        logger.log("Amount after deposit  : " + amount);
    }
    //end::ref-semantics-prim[]

    @Test
    @DisplayName(
            """
            Reference Semantics with objects:
             Although the argument variable is copied, just the reference ist copied. The object that is referenced
             is still the same and thus changed here!
            """
    )
    //tag::ref-semantics-obj[]
    public void canDemonstrateReferenceSemanticsWithObjects() {
        // given
        AccountManager manager = new AccountManager();
        Account account = new Account(1000);

        logger.log("Amount before deposit : " + account.getAmount());

        // when
        manager.depositV3(account, 300);

        // then
        logger.log("Amount after deposit  : " + account.getAmount());
    }
    //end::ref-semantics-obj[]

    //tag::ref-semantics[]
    @Test
    public void canExplainReferenceSemanticsByExample() {
        // given
        Account a1 = new Account();
        assertEquals(0, a1.getAmount(), "initial amount of instance 'a1'");

        // when
        Account a2 = Account.process(a1);

        // then
        assertEquals(350, a2.getAmount(), "processed amount of (new inner) instance 'a2'");

        assertEquals(0, a1.getAmount(), "amount of instance 'a1' is still the same");
    }
    //end::ref-semantics[]

    // --------------------------------------------------------------------------------
    //                               Object Contract
    // --------------------------------------------------------------------------------

    //tag::object-contract-1[]
    @Test
    public void canCommitEqualInstances() {
        // given
        Train train1 = new Train("RB-10");
        Train train2 = new Train("RB-10");

        // when
        boolean areEqual = train1.equals(train2);

        // then
        assertTrue(areEqual);
        logger.log(String.format(
                "%s == %s",
                train1.hashCode(),
                train2.hashCode()));
    }
    //end::object-contract-1[]

    //tag::object-contract-2[]
    @Test
    public void cannotCommitEqualInstances() {
        // given
        Passenger passenger1 = new Passenger("Max Mustermann");
        Passenger passenger2 = new Passenger("Max Mustermann");

        // when
        boolean areEqual = passenger1.equals(passenger2);

        // then
        assertFalse(areEqual);
        logger.log(String.format(
                "%s != %s",
                passenger1.hashCode(),
                passenger2.hashCode()));
    }
    //end::object-contract-2[]


    // #################################################
    // ################## ARCHIVE ######################
    // #################################################

    //@Test
    @DisplayName(
            """
            Reference Semantics:
             Pass by Reference: In the pass by reference concept, the method is called using an alias or reference
             of the actual parameter. This is called pass by reference. It forwards the unique identifier of the
             object to the method. If we made changes to the parameter's instance member, it would affect the original
             value. Java does not support pass by reference concept!
            """
    )
    //tag::ref-semantics-2[]
    public void canDemonstrateReferenceSemantics2() {
        // given
        AccountManager manager = new AccountManager();
        Account account = new Account();

        logger.log("Amount before deposit : " + account.getAmount());

        // when
        manager.depositV2(account, 750);

        // then
        logger.log("Amount after deposit  : " + account.getAmount());
    }
    //end::ref-semantics-2[]

}
