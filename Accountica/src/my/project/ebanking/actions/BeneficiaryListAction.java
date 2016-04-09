package my.project.ebanking.actions;

import java.util.Iterator;
import java.util.List;

import my.project.ebanking.domains.Beneficiary;
import my.project.ebanking.services.BeneficiaryService;

public class BeneficiaryListAction {
	BeneficiaryService service;
	List<Beneficiary> benList; 

	public BeneficiaryService getService() {
		return service;
	}

	public void setService(BeneficiaryService service) {
		this.service = service;
	}
	
	
	public List<Beneficiary> getBenList() {
		return benList;
	}

	

	public String execute() throws Exception{
		benList = service.getBeneficiaryList();
		Iterator<Beneficiary> bnlist = benList.iterator();
		while(bnlist.hasNext()){
			Beneficiary bn = bnlist.next();
			System.out.println(bn.toString());
		}
		return "success";
	}

}
