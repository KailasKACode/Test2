package FinalFinallyFinilize;

public class FinilizeConcept {
	
	public FinilizeConcept() {
		System.out.println("This is finilize methods:  ");
	}
	
	public static void main(String[] args) {
		FinilizeConcept ft=new FinilizeConcept();
		FinilizeConcept ft1=new FinilizeConcept();
		FinilizeConcept ft2=new FinilizeConcept();
		ft2.equals(ft1);
		
		System.gc();//we can remove the the not usefull object in the memory 

	}

}
							