package com.jbk.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttendanceRecordDTO {
	
	private String id;
	private List<Integer> rollNo;
	private String username;
	private long subId;
	private String date;
	private String time;
	private int counts;
	
	
}
