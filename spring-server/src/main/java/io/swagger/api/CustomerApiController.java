package io.swagger.api;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Customer;
import io.swagger.model.CustomerATMDetails;
import io.swagger.service.CustomerService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-02T12:34:28.497Z")

@RestController
public class CustomerApiController implements CustomerApi {

    
    private static final Logger logger = LoggerFactory.getLogger(CustomerApiController.class);

    @Inject
    private CustomerService customerService;
    
    

    public ResponseEntity<Void> addcustomer(@ApiParam(value = "Customer object that needs to be stored" ,required=true )  @Valid @RequestBody Customer customer) {
    logger.info("AddCustomerApiController addcustomer START.");
    	
		this.customerService.addNewCustomer(customer);
		 
		logger.info("AddCustomerApiController addcustomer END.");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCustomer(@NotNull @ApiParam(value = "Customer object that needs to be stored", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId) {
    	
    	logger.info("CustomerApiController deleteCustomer START.");
    	this.customerService.deleteCustomer(customerId);
    	logger.info("AddCustomerApiController deleteCustomer END.");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<?> findCustomer(@NotNull @ApiParam(value = "Customer object that needs to be stored", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId) {
    	
    	logger.info("AddCustomerApiController findCustomer START.");
    	Customer customer = this.customerService.findCustomer(customerId);
    	logger.info("AddCustomerApiController findCustomer END.");
        return new ResponseEntity<>(customer,HttpStatus.OK);
    }

    
    public ResponseEntity<Void> saveCustomerATMDetails(@NotNull @ApiParam(value = "Customer ATM object that needs to be fetched", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId,@ApiParam(value = "Customer object that needs to be stored" ,required=true )  @Valid @RequestBody CustomerATMDetails customerATM) {
        
    	logger.info("AddCustomerApiController findCustomer START.");
    	this.customerService.saveCustomerATMDetails(customerId,customerATM);
    	logger.info("AddCustomerApiController findCustomer END.");
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    public ResponseEntity<CustomerATMDetails> getCustomerATMDetails(@NotNull @ApiParam(value = "Customer ATM object that needs to be fetched", required = true) @Valid @RequestParam(value = "customerId", required = true) String customerId) {
        
    	logger.info("AddCustomerApiController getCustomerATMDetails START.");
    	CustomerATMDetails customerATMDetails = this.customerService.findCustomerATMDetails(customerId);
    	logger.info("AddCustomerApiController getCustomerATMDetails END.");
    	
    	
    	
        return new ResponseEntity<CustomerATMDetails>(customerATMDetails,HttpStatus.OK);
    }
    
    

}
