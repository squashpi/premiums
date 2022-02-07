package premiums;

import java.util.ArrayList;

public class PolicyObject {
    private String name;
    private ArrayList<PolicySubObject> policySubObjects;

    public PolicyObject(String name, ArrayList<PolicySubObject> policySubObjects) {
        this.name = name;
        this.policySubObjects = policySubObjects;
    }

    public ArrayList<PolicySubObject> getPolicySubObjects() {
        return this.policySubObjects;
    }
}
