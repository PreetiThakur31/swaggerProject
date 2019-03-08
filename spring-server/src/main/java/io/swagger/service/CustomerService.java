package io.swagger.service;

import io.swagger.model.Customer;



public interface CustomerService {

	/**
	 *  to updatePrinters
	 * @param printerListDTO
	 * @param xMytollIdentity
	 */
	void addNewCustomer(Customer customer);
}