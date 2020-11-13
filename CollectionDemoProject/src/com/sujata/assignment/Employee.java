package com.sujata.assignment;

public class Employee {

	private int eId;
	private String eName;
	
	public Employee(){
		
	}

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	
	
}
