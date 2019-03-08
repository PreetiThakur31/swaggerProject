package io.swagger.service;

import io.swagger.model.Customer;
import io.swagger.model.CustomerAccount;
import io.swagger.model.CustomerAddress;
import io.swagger.model.db.CustomerAccountsData;
import io.swagger.model.db.CustomerAddressData;
import io.swagger.model.db.CustomerData;
import io.swagger.model.db.TollBankRepository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {

private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private TollBankRepository saveNewCustomerRepository;
	
	@Override
	public void addNewCustomer(Customer customer) {
     logger.info("ENTERING CustomerServiceImpl addNewCustomer method.");
     
     if(customer!=null && customer.getCustomerId()!= null && customer.getCustomerId()!= ""){
     CustomerData costomerData = new CustomerData();
     costomerData.setCustomerId(customer.getCustomerId());
     costomerData.setCustomerFirstName(customer.getCustomerFirstName());
     costomerData.setCustomerLastName(customer.getCustomerLastName());
     costomerData.setMobileNo(customer.getMobileNo());
     costomerData.setEmailId(customer.getEmailId());
     
     List<CustomerAccount> customerAccountsDetails = customer.getCustomerAccountDetails();
     List<CustomerAccountsData> customerAccountsList = new ArrayList<CustomerAccountsData>();
     
     for(CustomerAccount customerAccountDetails : customerAccountsDetails){
     CustomerAccountsData customerAccountsData = new CustomerAccountsData();
     customerAccountsData.setAccountNo(customerAccountDetails.getAccountNo());
     customerAccountsData.setAccountType(customerAccountDetails.getAccountType());
     customerAccountsData.setBalance(customerAccountDetails.getAvailableBalance());
     customerAccountsData.setCredit(customerAccountDetails.getCredit());
     customerAccountsData.setDebit(customerAccountDetails.getDebit());
     customerAccountsData.setCustomerData(costomerData);
     
     customerAccountsList.add(customerAccountsData);
     }
     costomerData.setCustomerAccounts(customerAccountsList);
     
     //model
     CustomerAddress customerAddress = customer.getCustomerAddress();
     
     //repo 
     CustomerAddressData customerAddressData = new CustomerAddressData();
     customerAddressData.setAddressLine1(customerAddress.getAddressLine1());
     customerAddressData.setAddressLine2(customerAddress.getAddressLine2());
     customerAddressData.setCity(customerAddress.getCity());
     customerAddressData.setCountry(customerAddress.getCountry());
     customerAddressData.setPincode(customerAddress.getPincode());
     customerAddressData.setState(customerAddress.getState());
     customerAddressData.setCustomerData(costomerData);
     
     costomerData.setCustomerAddressData(customerAddressData);
     
     saveNewCustomerRepository.save(costomerData);
     
     logger.info("ENTERING CustomerServiceImpl addNewCustomer method.");
     }
	
	}	
		
}
