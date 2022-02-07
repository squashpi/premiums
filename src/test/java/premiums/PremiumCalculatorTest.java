package premiums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class PremiumCalculatorTest {

    @DisplayName("Test PremiumCalculator.calculate() with special coefficients")
    @Test
    void testCalculateSpecial() {
        PolicySubObject tv = new PolicySubObject("TV", 102.51, RiskType.THEFT);
        PolicySubObject livingRoom = new PolicySubObject("Living Room", 500, RiskType.FIRE);
        ArrayList<PolicySubObject> subObjects = new ArrayList<PolicySubObject>();
        subObjects.add(tv);
        subObjects.add(livingRoom);
        PolicyObject house = new PolicyObject("House", subObjects);
        ArrayList<PolicyObject> objects = new ArrayList<PolicyObject>();
        objects.add(house);
        Policy policy = new Policy("LV20-02-100000-5", Status.REGISTERED, objects);
        assertEquals(17.13, PremiumCalculator.calculate(policy));
    }

    @DisplayName("Test PremiumCalculator.calculate() with default coefficients")
    @Test
    void testCalculateDefault() {
        PolicySubObject tv = new PolicySubObject("TV", 8, RiskType.THEFT);
        PolicySubObject livingRoom = new PolicySubObject("Living Room", 100, RiskType.FIRE);
        ArrayList<PolicySubObject> subObjects = new ArrayList<PolicySubObject>();
        subObjects.add(tv);
        subObjects.add(livingRoom);
        PolicyObject house = new PolicyObject("House", subObjects);
        ArrayList<PolicyObject> objects = new ArrayList<PolicyObject>();
        objects.add(house);
        Policy policy = new Policy("LV30-03-200000-6", Status.REGISTERED, objects);
        assertEquals(2.28, PremiumCalculator.calculate(policy));
    }

}
