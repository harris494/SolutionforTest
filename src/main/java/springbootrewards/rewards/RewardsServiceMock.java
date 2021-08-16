package springbootrewards.rewards;

import com.example.service.springbootrewards.model.Customer;
import com.example.service.springbootrewards.model.CustomerTransaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RewardsServiceMock {

	private static List<CustomerTransaction> transactions = new ArrayList<CustomerTransaction>();
	private static long index;
	
	static {
		
		transactions.add( new CustomerTransaction(index++, new Customer(1, "tong"), 170.0, "Purchase 1", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(2, "sun"), 55.0, "Purchase 2", new Date()) );
		transactions.add( new CustomerTransaction(index++, new Customer(3, "harris"), 200.0, "Purchase 3", new Date()) );
	
	}
	
	
	public List<CustomerTransaction> getAll() {
		return transactions;
	}
	
}



