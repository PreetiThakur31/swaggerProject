package io.swagger.service;

import io.swagger.model.Customer;
import io.swagger.model.CustomerATMDetails;
import io.swagger.model.CustomerAccount;
import io.swagger.model.CustomerAddress;
import io.swagger.model.db.ATMDetails;
import io.swagger.model.db.CustomerAccountsData;
import io.swagger.model.db.CustomerAddressData;
import io.swagger.model.db.CustomerData;
import io.swagger.model.db.CustomersATMData;
import io.swagger.model.db.TollBankRepository;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CustomerServiceImpl implements CustomerService {

private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private TollBankRepository saveNewCustomerRepository;
	
	@Autowired
	private io.swagger.model.db.ATMDetailsRepository ATMDetailsRepository;
	
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
     
     List<CustomerAccount> customerAccountsDetails = customer.getCustomerAccount();
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
     
     logger.info("EXITING CustomerServiceImpl addNewCustomer method.");
     }
	
	}

	@Override
	@Transactional
	public void deleteCustomer(String customerId) {
		logger.info("ENTERING CustomerServiceImpl deleteCustomer method.");
		saveNewCustomerRepository.deleteByCustomerId(customerId);
		logger.info("EXITING CustomerServiceImpl deleteCustomer method.");
	}

	@Override
	public Customer findCustomer(String customerId) {
		logger.info("ENTERING CustomerServiceImpl deleteCustomer method.");
		
		CustomerData customerData = saveNewCustomerRepository.findByCustomerId(customerId);
		
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setCustomerFirstName(customerData.getCustomerFirstName());
		customer.setCustomerLastName(customerData.getCustomerLastName());
		customer.setEmailId(customerData.getEmailId());
		customer.setMobileNo(customerData.getMobileNo());
		
		List<CustomerAccountsData> customerAccountList = customerData.getCustomerAccounts();
		List<CustomerAccount> listCustomerAccount = new ArrayList<>();
		
		for(CustomerAccountsData customerAccountsData : customerAccountList){
		CustomerAccount customerAccount = new CustomerAccount();
		customerAccount.setAccountNo(customerAccountsData.getAccountNo());
		customerAccount.setAccountType(customerAccountsData.getAccountType()); 
		customerAccount.setAvailableBalance(customerAccountsData.getBalance());
		customerAccount.setCredit(customerAccountsData.getCredit());
		customerAccount.setDebit(customerAccountsData.getDebit());
		listCustomerAccount.add(customerAccount);
		}
		
		CustomerAddressData customerAddressData = customerData.getCustomerAddressData();
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setAddressLine1(customerAddressData.getAddressLine1());
		customerAddress.setAddressLine2(customerAddressData.getAddressLine2());
		customerAddress.setCity(customerAddressData.getCity());
		customerAddress.setCountry(customerAddressData.getCountry());
		customerAddress.setPincode(customerAddressData.getPincode());
		customerAddress.setState(customerAddressData.getState());
		
		
		
		customer.setCustomerAccount(listCustomerAccount);
		customer.setCustomerAddress(customerAddress);
	
		logger.info("EXITING CustomerServiceImpl deleteCustomer method.");
		return customer;
		
	}

	@Override
	public void saveCustomerATMDetails(String customerId,CustomerATMDetails ATMDetails) {
		logger.info("ENTERING CustomerServiceImpl saveCustomerATMDetails method.");
		
		
		ATMDetails aTMDetails = new ATMDetails();
		aTMDetails.setATMNumber(ATMDetails.getAtMNumber());
		aTMDetails.setMaxWithdrawLimit(ATMDetails.getMaxWithdrawLimit());
		aTMDetails.setNameOnTheCard(ATMDetails.getNameOnTheCard());
		
		CustomersATMData customersATMData = new CustomersATMData();
		customersATMData.setATMDetails(aTMDetails);
		customersATMData.setCustomerId(customerId);
		
		ATMDetailsRepository.save(customersATMData);
		
	   logger.info("EXITING CustomerServiceImpl saveCustomerATMDetails method.");
		
	}

	@Override
	public CustomerATMDetails findCustomerATMDetails(String customerId) {
		
		logger.info("ENTERING CustomerServiceImpl findCustomerATMDetails method.");
		
		CustomersATMData customerATMData = ATMDetailsRepository.findByCustomerId(customerId);
		
		CustomerATMDetails customerATMDetails = new CustomerATMDetails();
		customerATMDetails.setAtMNumber(customerATMData.getATMDetails().getATMNumber());
		customerATMDetails.setMaxWithdrawLimit(customerATMData.getATMDetails().getMaxWithdrawLimit());
		customerATMDetails.setNameOnTheCard(customerATMData.getATMDetails().getNameOnTheCard());
		
		
		logger.info("EXITING CustomerServiceImpl findCustomerATMDetails method.");
		return customerATMDetails;
	}

	

	

		
}
