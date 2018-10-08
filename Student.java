package collection.demos.list;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String email;
	private String adharNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	
	public Student() {
		super();
	}
	public Student(int id, String name, String email, String adharNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.adharNo = adharNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(adharNo, email, id, name);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(adharNo, other.adharNo) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", adharNo=" + adharNo + "]";
	}
	
	
}
