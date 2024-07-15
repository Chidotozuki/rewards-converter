class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts miles value
    public RewardValue(double value, boolean isMiles) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = value * MILES_TO_CASH_RATE;
        } else {
            this.cashValue = value;
            this.milesValue = value / MILES_TO_CASH_RATE;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}