public class Calculator {
	private int result;
	
	
	public void add(int... params){
		for(Integer param : params){       
			this.result += param;
			}
	}
			
	public void subt(int params,int params1){  
		this.result=params - params1;
	}
	
	public void multipl(int params,int params1){
		this.result=params * params1;
	}				
   
	public void div(int params,int params1){
		this.result=params / params1;
	}
	
    public void mdl(int params,int params1){
    	this.result=params % params1;
	}
    
    public void sqr(int params,int params1){
    	double d=Math.pow(params,params1);
    	this.result = (int)d;
    }
	
	
	
	public int getResult(){
		return this.result;
	}
	
	public void cleanResult(){
		this.result = 0 ;
	}

}
