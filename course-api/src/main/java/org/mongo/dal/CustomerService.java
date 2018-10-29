package org.mongo.dal;

import java.util.List;

import org.models.Customer;
import org.models.Transaction;
import org.models.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements CustomerDAL{
	@Autowired
	MongoTemplate mongotemplate;
	
	@Override
	public Customer getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(customer.getId_customer()));
		return mongotemplate.findOne(query, Customer.class);
	}
	
	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return mongotemplate.findAll(Customer.class);
	}

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSaldo() {
		// TODO Auto-generated method stub
		//mongotemplate.find(Query.query(Criteria.where("id_customer")),Customer.class).getSaldo();
		return 0;
	}

	@Override
	public Transaction getTransactionList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voucher> getVoucher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createNewCustomer(Customer customer) {
		mongotemplate.save(customer);
		return customer;
	}

	@Override
	public void UpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(customer.getId_customer()));
		
		Update update = new Update();
		
		update.update("phoneNumber", customer.getPhoneNumber());
		
		mongotemplate.updateFirst(query,update,Customer.class);
		
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(customer.getId_customer()));
		
		mongotemplate.remove(query, Customer.class);
	}

	

}
