package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.EnquiryDetalis;
import com.cjc.main.service.EnquiryService;
@RequestMapping("/enquiry")
@RestController
public class EnquiryController {
	
	@Autowired private EnquiryService enquiryService;
	@PostMapping("/postData")
	public ResponseEntity<EnquiryDetalis> savaDetails(@RequestBody EnquiryDetalis ed)
	{
		EnquiryDetalis enquiry = enquiryService.saveEnquiryDetails(ed);
		
		
		
		return new ResponseEntity<EnquiryDetalis>(enquiry,HttpStatus.CREATED);
		
	}
	@PutMapping("/edit-enquiry/{enquiryId}")
	public ResponseEntity<EnquiryDetalis> onEditEnquiry(@PathVariable int enquiryId,
			                                               @RequestBody EnquiryDetalis enquiry)
	{
		
		EnquiryDetalis  enquiryRef = enquiryService.updateEnquiry(enquiryId,enquiry);
		return new ResponseEntity<EnquiryDetalis>(enquiryRef,HttpStatus.OK);
	}

}
