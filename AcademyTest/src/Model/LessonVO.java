package Model;

import java.util.Objects;

public class LessonVO {
	private int no;			//과목 일련번호
	private String l_abbre; // 과목약어
	private String l_name; // 과목명
	
	
	public LessonVO() {
		super();
	}


	public LessonVO(int no, String l_abbre, String l_name) {
		super();
		this.no = no;
		this.l_abbre = l_abbre;
		this.l_name = l_name;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getL_abbre() {
		return l_abbre;
	}


	public void setL_abbre(String l_abbre) {
		this.l_abbre = l_abbre;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	@Override
	public int hashCode() {
		
		return Objects.hash(this.no , this.l_abbre, this.l_name);
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LessonVO) {
			return false;
		}
		LessonVO lvo = (LessonVO)obj;
		
		return lvo.no == this.no && lvo.l_abbre.equals(this.l_abbre) && lvo.l_name.equals(this.l_name);
	}
	
	
}
