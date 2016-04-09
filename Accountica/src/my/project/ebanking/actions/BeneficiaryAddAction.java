package my.project.ebanking.actions;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ModelDriven;

import my.project.ebanking.domains.Beneficiary;

public class BeneficiaryAddAction  implements ModelDriven<Beneficiary>{
	private String aliasName;
	private int bankAccNumber;
	private BigDecimal amount;	
	private Beneficiary beneficiary;
		
	public String execute() throws Exception{
		return "success";
	}
	
	

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}



	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}



	public String getAliasName() {
		return aliasName;
	}



	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}



	public int getBankAccNumber() {
		return bankAccNumber;
	}



	public void setBankAccNumber(int bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}



	public BigDecimal getAmount() {
		return amount;
	}



	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	@Override
	public Beneficiary getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
