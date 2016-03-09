package prob2;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
        //더하기
    	Money result = new Money(this.amount + money.amount);
    	return result;
    }
    public Money minus( Money money ) {
        //빼기
    	Money result = new Money(this.amount - money.amount);
    	return result;
    }
    public Money multiply( Money money ) {
        //곱하기
    	Money result = new Money(this.amount * money.amount);
    	return result;
    }
    public Money devide( Money money ) {
        //나누기
    	Money result = new Money(this.amount / money.amount);
    	return result;
    }
    
    public boolean equals(Object obj){
    	if(!(obj instanceof Money)){
    		return false;
    	}
    	Money temp = (Money)obj;
    	if(this.amount != temp.amount)
    		return false;
    	return true;
    }

}
