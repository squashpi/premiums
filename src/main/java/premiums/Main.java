package premiums;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PolicySubObject tv = new PolicySubObject("TV", 102.51, RiskType.THEFT);
        PolicySubObject livingRoom = new PolicySubObject("Living Room", 500, RiskType.FIRE);
        ArrayList<PolicySubObject> subObjects = new ArrayList<PolicySubObject>();
        subObjects.add(tv);
        subObjects.add(livingRoom);
        PolicyObject house = new PolicyObject("House", subObjects);
        ArrayList<PolicyObject> objects = new ArrayList<PolicyObject>();
        objects.add(house);
        Policy policy = new Policy("LV20-02-100000-5", Status.REGISTERED, objects);
        System.out.print(PremiumCalculator.calculate(policy));
        System.out.println(" EUR");
    }
}
