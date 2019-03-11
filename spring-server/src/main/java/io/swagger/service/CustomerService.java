package io.swagger.service;

import io.swagger.model.Customer;
import io.swagger.model.CustomerATMDetails;



public interface CustomerService {

	/**
	 *  to updatePrinters
	 * @param printerListDTO
	 * @param xMytollIdentity
	 */
	void addNewCustomer(Customer customer);

	void deleteCustomer(String customerId);

	Customer findCustomer(String customerId);

	void saveCustomerATMDetails(String customerId, CustomerATMDetails customerATMDetails);

	CustomerATMDetails findCustomerATMDetails(String customerId);

	
}