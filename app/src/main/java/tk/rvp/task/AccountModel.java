package tk.rvp.task;

public class AccountModel {
    String currencyName;
    String accountName;
    String accountNumber;
    String amount;
    String currencySymbol;
    String availableAmount;
    String overdraftAmount;
    Boolean warning;
    Boolean layoutAcOverdraft;
    Boolean acNum;
    Boolean txtCurrency;
    int icPath;

    public AccountModel(String currencyName, String accountName, String accountNumber, String amount, String currencySymbol, String availableAmount, String overdraftAmount, Boolean warning, Boolean layoutAcOverdraft, Boolean acNum, Boolean txtCurrency, int icPath) {
        this.currencyName = currencyName;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.currencySymbol = currencySymbol;
        this.availableAmount = availableAmount;
        this.overdraftAmount = overdraftAmount;
        this.warning = warning;
        this.layoutAcOverdraft = layoutAcOverdraft;
        this.acNum = acNum;
        this.txtCurrency = txtCurrency;
        this.icPath = icPath;
    }

    public Boolean getWarning() {
        return warning;
    }

    public void setWarning(Boolean warning) {
        this.warning = warning;
    }

    public Boolean getLayoutAcOverdraft() {
        return layoutAcOverdraft;
    }

    public void setLayoutAcOverdraft(Boolean layoutAcOverdraft) {
        this.layoutAcOverdraft = layoutAcOverdraft;
    }

    public Boolean getAcNum() {
        return acNum;
    }

    public void setAcNum(Boolean acNum) {
        this.acNum = acNum;
    }

    public Boolean getTxtCurrency() {
        return txtCurrency;
    }

    public void setTxtCurrency(Boolean txtCurrency) {
        this.txtCurrency = txtCurrency;
    }

    public int getIcPath() {
        return icPath;
    }

    public void setIcPath(int icPath) {
        this.icPath = icPath;
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
