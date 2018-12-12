package com.cg.springpro.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springpro.dto.Customer;
import com.cg.springpro.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService service;
		@RequestMapping(value="/home")
		public String getAllCustomers(@ModelAttribute("my") Customer cust){
			return "AddCustomer";
		}
		@RequestMapping(value="addata", method= RequestMethod.POST)
		public String addCustomerdata(@Valid@ModelAttribute("my") Customer customer,BindingResult result){
			if(result.hasErrors()){
				return "AddCustomer";
			}else{
				service.addCustomer(customer);
				
				return "Welcome";	
			}
	
		}
		
		@RequestMapping(value="showall", method=RequestMethod.GET)
		public ModelAndView showData(){
			List<Customer> allCustomers = service.showAllCustomers();
			return new ModelAndView("customershow", "data", allCustomers);
			
		}
		@RequestMapping(value="searchmobile", method=RequestMethod.GET)
		public String searchData(@ModelAttribute("yy") Customer mob){
			return "searchmobile";
		}
		
		@RequestMapping(value="mobilesearch", method=RequestMethod.POST)
		public ModelAndView dataSearch(@ModelAttribute("yy") Customer mob){
			Customer mobSearch = service.showBalance(mob.getMobnum());
			//System.out.println(mobSearch);
			return new ModelAndView("showsearch","temp", mobSearch);
			
		}
		
		@RequestMapping(value="deposit", method=RequestMethod.GET)
		public String depositdata(@ModelAttribute("yy") Customer cust ){
			return "deposit";
		}
		
		@RequestMapping(value="dodeposit", method=RequestMethod.POST)
		public ModelAndView dodepositdata(@ModelAttribute("yy") @RequestParam("mobnum") String mobnum,@RequestParam("accbal")double amt){
			service.depositAmount(mobnum,amt);
			return new ModelAndView("depositsuccess","temp1",amt);

			
			
		}
		
		@RequestMapping(value="withdraw", method=RequestMethod.GET)
		public String withdrawdata(@ModelAttribute("aa") Customer cust ){
			return "withdraw";
		}
		
		@RequestMapping(value="dowithdraw", method=RequestMethod.POST)
		public ModelAndView dowithdrawdata(@ModelAttribute("aa") @RequestParam("mobnum") String mobnum,@RequestParam("accbal")double amt){
			service.withdrawAmount(mobnum,amt);
			return new ModelAndView("withdrawsuccess","temp2",amt);
	
			
		}
		
		@RequestMapping(value="transfer", method=RequestMethod.GET)
		public String transferdata( ){
			return "transfer";
		}
		
		@RequestMapping(value="dotransfer", method=RequestMethod.GET)
		public String fundTransferData(@RequestParam("smobnum") String sourcemobnum,@RequestParam("rmobnum") String targetmobnum,@RequestParam("acc")double amt){
			System.out.println("returning servfund()");
			service.fundtransfer(sourcemobnum,targetmobnum, amt);
			return "transfersuccess";
	
			
		}
		
		
}
