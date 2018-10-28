package org.mongo.dal;

import java.util.List;

import org.models.Customer;
import org.models.Transaction;
import org.models.Voucher;

public interface CustomerDAL{
	
	public Customer getCustomer();
	public int getBalance();
	public int getSaldo();
	public Transaction getTransactionList();
	public List<Voucher> getVoucher();
	public Customer createNewCustomer(Customer customer);
	public void UpdateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public List<Customer> getAll();
}