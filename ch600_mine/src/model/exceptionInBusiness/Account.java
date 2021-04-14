package model.exceptionInBusiness;

public class Account {
	private long balance;// 잔고
	
	public Account(long balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account kim = new Account(500);
		try {
			kim.withdraw(-12313213); // 인출	
		} catch(BizException be) {
			be.print();
		}
		
	}

	/**
	 * 
	 * @param amount 음수 0 양수 : Boundary Condition Test.
	 * @return
	 * @throws BizException
	 */
	private long withdraw(long amount) throws BizException {
		if (amount < 0) { // 업무에서 파악할부분.
			throw new BizException("출금 금액은 0보다 커야합니다.");
		}
		if (balance < amount) {
			throw new BizException("잔고가부족하여 인출이 불가능합니다.");
		} else {
			balance -= amount;
			return amount;
		}
	}

}
