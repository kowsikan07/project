package com.example.demo.model;


	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class CustomerDetails {
		@Id
		private int id;
		private String Name;
		private int age;
		private String Country;
		private  int aadharno;
		private String Emailid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		public int getAadharno() {
			return aadharno;
		}
		public void setAadharno(int aadharno) {
			this.aadharno = aadharno;
		}
		public String getEmailid() {
			return Emailid;
		}
		public void setEmailid(String emailid) {
			Emailid = emailid;
		}
		@Override
		public String toString() {
			return "CustomerDetails [id=" + id + ", Name=" + Name + ", age=" + age + ", Country=" + Country
					+ ", aadharno=" + aadharno + ", Emailid=" + Emailid + "]";
		}
		
		
		
		
		
		
		
	}

