package com.app;

public class Employe {
	

		private int empId;
		private String empName;
		private double empSal;
		
		public Employe() {
			super();
		}

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public double getEmpSal() {
			return empSal;
		}

		public void setEmpSal(double empSal) {
			this.empSal = empSal;
		}

		@Override
		public String toString() {
			return "Employe [empId=" + empId + ", empName=" + empName
					+ ", empSal=" + empSal + "]";
		}
		
		
		
		
	
}
