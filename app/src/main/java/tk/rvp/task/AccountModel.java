package tk.rvp.task;

public class AccountModel {
    String currencyName;
    String accountName;
    String accountNumber;
    String amount;
    String currencySymbol;
    String availableAmount;
    String overdraftAmount;

    public AccountModel(String currencyName, String accountName, String accountNumber, String amount, String currencySymbol, String availableAmount, String overdraftAmount) {
        this.currencyName = currencyName;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.currencySymbol = currencySymbol;
        this.availableAmount = availableAmount;
        this.overdraftAmount = overdraftAmount;
    }


    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
    }

    public String getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(String overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }
}
