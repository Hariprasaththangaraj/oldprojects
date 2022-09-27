package test;

public class StudentOne {
	
	
	
		private String firstName;
		private String lastName;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public StudentOne(String firstName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public StudentOne() {
			
		}
		public StudentOne(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "StudentOne [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
			
		
		
		
	}

