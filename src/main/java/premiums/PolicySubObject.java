package premiums;

public class PolicySubObject {
    private String name;
    private double sumInsured;
    private RiskType riskType;

    public PolicySubObject(String name, double sumInsured, RiskType riskType) {
        this.name = name;
        this.sumInsured = sumInsured;
        this.riskType = riskType;
    }

    public double getSumInsured() {
        return this.sumInsured;
    }

    public RiskType getRiskType() {
        return this.riskType;
    }
}
