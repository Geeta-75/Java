package CProject;

public class CProvider {
    int cProviderID;
    private String cProviderName;
    private long cProviderCon;

    // Constructor of CProvider class
    public CProvider(int cProviderID, String cProviderName, long cProviderCon) {
        this.cProviderID=cProviderID;
        this.cProviderName = cProviderName;
        this.cProviderCon = cProviderCon;
    }

    public int getCPID(){
        return cProviderID;
    }
    
    public String getCProviderName() {
		return cProviderName;
	}
    
    public long getCPCon() {
		return cProviderCon;
	}

}