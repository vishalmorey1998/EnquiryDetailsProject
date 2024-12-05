package com.cjc.main.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.cjc.main.enquirystatus.EnquiryStatusEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EnquiryDetalis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId;
	private String customerName;
	private String emailId;
	private long contactNo;
	private String pancardNo;
	private int age;
	@CreationTimestamp
	private Date registerOn;
	@Enumerated(EnumType.STRING)
	private EnquiryStatusEnum enquiryStatus;
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
	private CibilDetails cibilD;
	

}
