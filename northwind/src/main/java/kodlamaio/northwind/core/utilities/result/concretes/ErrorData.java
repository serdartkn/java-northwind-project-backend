package kodlamaio.northwind.core.utilities.result.concretes;

public class ErrorData  extends Result{
	
	public ErrorData() {
		super(false);
	}
	
	public ErrorData(String message){
		super(false, message);
	}

}
