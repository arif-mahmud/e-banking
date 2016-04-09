package my.project.ebanking.actions;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ModelDriven;

import my.project.ebanking.domains.Beneficiary;
import my.project.ebanking.services.BeneficiaryService;

public class BeneficiaryAddConfAction{
	BeneficiaryService service;
	private String aliasName;
	private int bankAccNumber;
	private BigDecimal amount;	
	private Beneficiary beneficiary;

	public BeneficiaryService getService() {
		return service;
	}

	public void setService(BeneficiaryService service) {
		this.service = service;
	}
	
	public String execute() throws Exception{
		System.out.println(beneficiary.toString());
		service.AddBeneficiary(beneficiary);
		return "success";
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

	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	
}
