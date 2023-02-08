package de.dhbw.course10.basics.refsemantics;

import main.java.de.dhbw.commons.Logger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefSemanticsTest {

    private final Logger logger = new Logger(RefSemanticsTest.class);

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
             Although the argument variable is copied, just the reference is copied. The object that is referenced
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