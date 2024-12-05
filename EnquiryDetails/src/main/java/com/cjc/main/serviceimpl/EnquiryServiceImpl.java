package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.EnquiryDetalis;
import com.cjc.main.repository.EnquiryRepository;
import com.cjc.main.service.EnquiryService;
@Service
public class EnquiryServiceImpl implements EnquiryService
{
 @Autowired private EnquiryRepository enquiryRepository;
	@Override
	public EnquiryDetalis saveEnquiryDetails(EnquiryDetalis ed) {
		
		//return enquiryRepository.save(ed);
		return null;
	}

}
