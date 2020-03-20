package com.capgemini.airlinereservationsystemangularfinal.dataresponse;

import java.util.List;

import com.capgemini.airlinereservationsystemangularfinal.beans.BookingBean;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingResponse {

	private int statusCode;
	private String message;
	private String description;
	
	private BookingBean bookingBean;
	private List<BookingBean> bookingList;
}
