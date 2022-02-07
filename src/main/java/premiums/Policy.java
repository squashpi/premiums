package premiums;

import java.util.ArrayList;
import java.util.EnumMap;

public class Policy {
    private String number;
    private Status status;
    private ArrayList <PolicyObject> policyObjects; 
    private EnumMap<RiskType, Double> sumInsured;

    public Policy(String num, Status status, ArrayList <PolicyObject> policyObjects) {
        this.number = num;
        this.status = status;
        this.policyObjects = policyObjects;
        this.sumInsured = new EnumMap<RiskType, Double>(RiskType.class);
        for (int i = 0; i < policyObjects.size(); i++) {
            ArrayList<PolicySubObject> policySubObjects = policyObjects.get(i).getPolicySubObjects();
            for (int j = 0; j < policySubObjects.size(); j++) {
                PolicySubObject obj = policySubObjects.get(j);
                RiskType rType = obj.getRiskType();
                if (this.sumInsured.containsKey(rType)) {
                    this.sumInsured.put(rType, this.sumInsured.get(rType) + obj.getSumInsured());
                } else {
                    this.sumInsured.put(rType, obj.getSumInsured());   
                }
            }
        }
    }

    public EnumMap<RiskType, Double> getSumInsured() {
        return this.sumInsured;
    }
}
