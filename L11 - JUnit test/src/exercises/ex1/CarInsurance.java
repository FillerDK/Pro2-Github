package exercises.ex1;

public class CarInsurance {
    private final double basisPremium; // invariant: basisPremium > 0;

    /**
     * Create a CarInsurance.
     * Pre: basisPremium > 0.
     */
    public CarInsurance(double basisPremium) {
        this.basisPremium = basisPremium;
    }

    public double getBasisPremium() {
        return basisPremium;
    }

    /**
     * Calculate and return a premium based of the following rules:
     * - person with age below 25: 25% is added to the basis premium,
     * - woman: the basis premium is reduced with 5%,
     * - if the person have been driving without damages for:
     *    - 0 to 2 years, the basis premium is reduced with 0%,
     *    - 3 to 5 years, the basis premium is rediced with 15%,
     *    - 6 to 8 years, the basis premium is reduced with 25%,
     *    - more than 8 yearsm the basis premium is reduced with 35%,
     * Throws a RuntimeException, if age < 18, or yearsWithoutDamage < 0,
     * or YearsWithoutDamage > age-18.
     */
    public double calculatePremium(int age, boolean isWoman,
                                   int yearsWithoutDamage) {
        if (age < 18) {
            throw new TooYoungException("Too young!");
        } else if (yearsWithoutDamage < 0 || yearsWithoutDamage > age-18) {
            throw new InvalidYearsException("Too few years!");
        }

        double premium = basisPremium;

        if (age < 25) {
            premium = basisPremium * 1.25;
        }
        if (isWoman) {
            premium -= basisPremium * 0.05;
        }
        if (yearsWithoutDamage <= 2) {
            premium -= basisPremium * 0;
        } else if (yearsWithoutDamage <= 5) {
            premium -= basisPremium * 0.15;
        } else if (yearsWithoutDamage <= 8) {
            premium -= basisPremium * 0.25;
        } else {
            premium -= basisPremium * 0.35;
        }
        return premium;
    }
}
