package ca.ubc.cs.cpsc210.servicecard.tests;

import ca.ubc.cs.cpsc210.servicecard.model.FoodServicesCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Unit tests for FoodServiceCard class
public class FoodServicesCardTest {
    public static final int INITIAL_BALANCE = 10000;
    private FoodServicesCard testCard;

    @BeforeEach
    public void runBefore() {
        testCard = new FoodServicesCard(INITIAL_BALANCE);
    }

    @Test
    public void testXXXXXX() {
        // template for unit tests
    }

    @Test
    public void testConstrBal() {
        assertEquals(testCard.getBalance(), INITIAL_BALANCE);
        assertEquals(testCard.getRewardPoints(), 0);
    }

    @Test
    public void testReload() {
        int amount = 1000;
        testCard.reload(amount);
        assertEquals(testCard.getBalance(), INITIAL_BALANCE + amount);
    }

    @Test
    public void testPurchaseBalanceSmall() {
        int amount = 1000;
        boolean okay = testCard.makePurchase(amount);
        assertTrue(okay);
        assertEquals(testCard.getBalance(), INITIAL_BALANCE - amount);
    }

    @Test
    public void testPurchaseBalanceLarge() {
        int amount = INITIAL_BALANCE+1;
        boolean okay = testCard.makePurchase(amount);
        assertFalse(okay);
        assertEquals(testCard.getBalance(), INITIAL_BALANCE);
    }

    @Test
    public void testRewardSmall() {
        int amount = FoodServicesCard.POINTS_NEEDED_FOR_CASH_BACK-1;
        testCard.reload(amount + 10);
        testCard.makePurchase(amount);
        assertEquals(testCard.getBalance(), INITIAL_BALANCE + amount + 10 - amount);
        assertEquals(testCard.getRewardPoints(), amount*FoodServicesCard.REWARD_POINTS_PER_CENT_CHARGED);
    }

    @Test
    public void testReward10Rewards() {
        int quanta = 10;
        int purchaseAmount = FoodServicesCard.POINTS_NEEDED_FOR_CASH_BACK*quanta+1;
        int reloadAmount = purchaseAmount +100;
        testCard.reload(reloadAmount);
        testCard.makePurchase(purchaseAmount);
        assertEquals(testCard.getBalance(), INITIAL_BALANCE + reloadAmount - purchaseAmount
                + FoodServicesCard.CASH_BACK_REWARD*quanta);
        assertEquals(testCard.getRewardPoints(), purchaseAmount*FoodServicesCard.REWARD_POINTS_PER_CENT_CHARGED
                - FoodServicesCard.POINTS_NEEDED_FOR_CASH_BACK*quanta);
    }
}