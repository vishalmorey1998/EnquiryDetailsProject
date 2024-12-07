package com.cjc.main.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.constant.ExceptionMessageConstant;
import com.cjc.main.exception.EnquiryNotFoundException;
import com.cjc.main.model.EnquiryDetalis;
import com.cjc.main.repository.EnquiryRepository;
import com.cjc.main.service.EnquiryService;
@Service
public class EnquiryServiceImpl implements EnquiryService
{
 @Autowired private EnquiryRepository enquiryRepository;
	@Override
	
	public EnquiryDetalis saveEnquiryDetails(EnquiryDetalis ed) {
		
		return enquiryRepository.save(ed);
		//return null;
	}
	@Override
	public EnquiryDetalis updateEnquiry(int enquiryId, EnquiryDetalis enquiry) {
		Optional<EnquiryDetalis> onEnquiry = enquiryRepository.findById(enquiryId);
		if(onEnquiry.isPresent())
		{
			return enquiryRepository.save(enquiry);
		}
		else {
			throw new EnquiryNotFoundException(ExceptionMessageConstant.ENQUIRY_NOT_FOUND +enquiryId);
		}
		
	}

}
