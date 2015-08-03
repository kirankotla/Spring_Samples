package com.app;

import java.util.List;
import java.util.Set;

public class Employe {
	

		private int empId;
		private List<String> details;
		private Set<String> marks;
		public Employe() {
			super();
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public List<String> getDetails() {
			return details;
		}
		public void setDetails(List<String> details) {
			this.details = details;
		}
		public Set<String> getMarks() {
			return marks;
		}
		public void setMarks(Set<String> marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return "Employe [empId=" + empId + ", details=" + details
					+ ", marks=" + marks + "]";
		}
		
		
		
		
		
	
}
