package premiums;

import java.util.EnumMap;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PremiumCalculator {
    private static double coefficientDefaultFire = 0.014;
    private static double coefficientSpecialFire = 0.024;
    private static double coefficientDefaultTheft = 0.11;
    private static double coefficientSpecialTheft = 0.05;

    public static double calculate(Policy policy) {
        double premium = 0.0;
        for (EnumMap.Entry<RiskType, Double> entry : policy.getSumInsured().entrySet()) {
            RiskType key = entry.getKey();
            double value = entry.getValue();
            if (key == RiskType.FIRE) {
                if (value > 100) {
                    premium += value * PremiumCalculator.coefficientSpecialFire;
                } else {
                    premium += value * PremiumCalculator.coefficientDefaultFire;
                }
            } else if (key == RiskType.THEFT) {
                if (value > 15) {
                    premium += value * PremiumCalculator.coefficientSpecialTheft;
                } else {
                    premium += value * PremiumCalculator.coefficientDefaultTheft;
                }
            }
        }
        BigDecimal bdPremium = new BigDecimal(premium).setScale(2, RoundingMode.HALF_UP);

        return bdPremium.doubleValue();
    }
}
