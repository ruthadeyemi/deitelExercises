package chapterFour;
//4.18
public class CreditLimitCalculator {
        int accountNumber;
        int beginningBalance;
        int totalItemsCharges;
        int totalCreditsApplied;
        int allowedCreditLimit;
        public void setAccountDetails(int accountNumber,int beginningBalance,int totalItemsCharges,int totalCreditsApplied,int allowedCreditLimit){
            setAccountNumber(accountNumber);
            setBeginningBalance(beginningBalance);
            setTotalItemsCharges(totalItemsCharges);
            setTotalCreditsApplied(totalCreditsApplied);
            setAllowedCreditLimit(allowedCreditLimit);
        }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
            this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setTotalCreditsApplied(int totalCreditsApplied) {
            this.totalCreditsApplied = totalCreditsApplied;
    }

    public int getTotalCreditsApplied() {
        return totalCreditsApplied;
    }

    public void setTotalItemsCharges(int totalItemsCharges) {
            this.totalItemsCharges = totalItemsCharges;
    }

    public int getTotalItemsCharges() {
        return totalItemsCharges;
    }

    public void setBeginningBalance(int beginningBalance) {
            this.beginningBalance = beginningBalance;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public int getNewBalance(){
            return (getBeginningBalance() + getTotalItemsCharges() - getTotalCreditsApplied());
    }
    public boolean creditLimitExceed(){
            return (getNewBalance() > getAllowedCreditLimit())? false:true;
    }
}
