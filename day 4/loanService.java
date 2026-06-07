abstract class LoanRemote{
    public abstract int applyLoan(int applicantId, String loanType);
    public abstract int viewLoan(int applicantId);
    public abstract void cancelLoan(int applicantId);

    public void log(String message){
        System.out.println(message);
    }
}

public class loanService extends LoanRemote{

    String[][] loan;

    @Override
    public int applyLoan(int applicantId, String loanType) {
        for(int index = 0; index<)
        return 0;
    }

    @Override
    public void cancelLoan(int applicantId) {
        
        
    }

    @Override
    public int viewLoan(int applicantId) {
        
        return 0;
    }
    

}