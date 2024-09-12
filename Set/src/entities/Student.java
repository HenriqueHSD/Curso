package entities;

import java.util.Objects;

public class Student {
	private Integer codStudent;

	public Student(Integer codStudent) {
		this.codStudent = codStudent;
	}

	public Integer getCodStudent() {
		return codStudent;
	}

	public void setCodStudent(Integer codStudent) {
		this.codStudent = codStudent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codStudent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(codStudent, other.codStudent);
	}

	
	
	

}
