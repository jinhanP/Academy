package Model;

import java.util.Objects;

public class TraineVO {
	private int no;				// 수강 일련번호
	private String sd_name;		// 학번
	private	String l_abbre;		// 과목약어
	private String t_section;	// 과목구분
	private String t_date;		// 등록일
	
	
	
	public TraineVO() {
		super();
		
	}



	public TraineVO(int no, String sd_name, String l_abbre, String t_section, String t_date) {
		super();
		this.no = no;
		this.sd_name = sd_name;
		this.l_abbre = l_abbre;
		this.t_section = t_section;
		this.t_date = t_date;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getSd_name() {
		return sd_name;
	}



	public void setSd_name(String sd_name) {
		this.sd_name = sd_name;
	}



	public String getL_abbre() {
		return l_abbre;
	}



	public void setL_abbre(String l_abbre) {
		this.l_abbre = l_abbre;
	}



	public String getT_section() {
		return t_section;
	}



	public void setT_section(String t_section) {
		this.t_section = t_section;
	}



	public String getT_date() {
		return t_date;
	}



	public void setT_date(String t_date) {
		this.t_date = t_date;
	}



	@Override
	public int hashCode() {
		return Objects.hash(this.no, this.sd_name, this.l_abbre, this.t_date, this.t_section);
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TraineVO) {
			return false;
		}
		TraineVO tvo = (TraineVO)obj;
		
		return tvo.no == this.no && tvo.sd_name.equals(this.sd_name) && tvo.l_abbre.equals(this.l_abbre) && tvo.t_date.equals(this.t_date) && tvo.t_section.equals(this.t_section);
	}
	
	
	
}

