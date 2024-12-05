package com.cjc.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.EnquiryDetalis;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryDetalis, Integer>
{

}
