package com.cinema.userticketing;

import java.util.Date;

public class User_TicketingVO {

	
	private Integer b_num; //예매번호
	private Integer m_num; //영화번호
	private String u_id; //사용자 아이디
	private String m_title; //영화제목
	private String m_runningtime; //상영시간
	private String m_theater; //상영관
	private String b_seat; //좌석
	private String m_money; //금액
	private Date b_date; //예매날짜
	public Integer getB_num() {
		return b_num;
	}
	public void setB_num(Integer b_num) {
		this.b_num = b_num;
	}
	public Integer getM_num() {
		return m_num;
	}
	public void setM_num(Integer m_num) {
		this.m_num = m_num;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getM_title() {
		return m_title;
	}
	public void setM_title(String m_title) {
		this.m_title = m_title;
	}
	public String getM_runningtime() {
		return m_runningtime;
	}
	public void setM_runningtime(String m_runningtime) {
		this.m_runningtime = m_runningtime;
	}
	public String getM_theater() {
		return m_theater;
	}
	public void setM_theater(String m_theater) {
		this.m_theater = m_theater;
	}
	public String getB_seat() {
		return b_seat;
	}
	public void setB_seat(String b_seat) {
		this.b_seat = b_seat;
	}
	public String getM_money() {
		return m_money;
	}
	public void setM_money(String m_money) {
		this.m_money = m_money;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	@Override
	public String toString() {
		return "User_TicketingVO [b_num=" + b_num + ", m_num=" + m_num + ", u_id=" + u_id + ", m_title=" + m_title
				+ ", m_runningtime=" + m_runningtime + ", m_theater=" + m_theater + ", b_seat=" + b_seat + ", m_money="
				+ m_money + ", b_date=" + b_date + "]";
	}
	
	
	
	
	
}
