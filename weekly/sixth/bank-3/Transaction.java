public final class Transaction {
    private final int transactionId;
    private final TransactionType type;
    private final double amount;
    private final String relatedAccountNumber;

    private static int nextTransactionId = 1;

    public Transaction(TransactionType type, double amount, String relatedAccountNumber) {
        this.transactionId = nextTransactionId++;
        this.type = type;
        this.amount = amount;
        this.relatedAccountNumber = relatedAccountNumber;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getRelatedAccountNumber() {
        return relatedAccountNumber;
    }

    @Override
    public String toString() {
        return transactionId + " " + type + " " + amount + " " + relatedAccountNumber;
    }
}