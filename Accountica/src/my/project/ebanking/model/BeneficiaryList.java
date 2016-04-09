package my.project.ebanking.model;

public class BeneficiaryList {
	private int bankAccNo;
	private String beneficiary;
	
	public BeneficiaryList(int bankAccNo, String beneficiary) {
		this.bankAccNo = bankAccNo;
		this.beneficiary = beneficiary;
	}
	
	public int getBankAccNo() {
		return bankAccNo;
	}

	public void setBankAccNo(int bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	@Override
	public String toString() {
		return "BeneficiaryList [bankAccNo=" + bankAccNo + ", beneficiary="
				+ beneficiary + "]";
	}
	
}
