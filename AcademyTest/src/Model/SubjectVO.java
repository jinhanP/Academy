package Model;

import java.util.Objects;

public class SubjectVO {
	
	private int no;			// 학과 일련번호
	private String s_num;	// 학과 번호
	private String s_name;	// 학과명
	
	public SubjectVO() {
		super();
		
	}

	public SubjectVO(int no, String s_num, String s_name) {
		super();
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}
	public SubjectVO(String s_num, String s_name) {
		super();
		this.s_num = s_num;
		this.s_name = s_name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "SubjectDAO [no=" + no + ", s_num=" + s_num + ", s_name=" + s_name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.no, this.s_num, this.s_name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SubjectVO) {
			return false;
		}
		SubjectVO sjvo = (SubjectVO)obj;
		
		return sjvo.no == this.no && sjvo.s_num.equals(this.s_num) && sjvo.s_name.equals(this.s_name);
	}
	
	
}
