package com.cinema.userticketing;

import com.cinema.userticketing.User_TicketingVO;

public interface User_TicketingDAO {

	public void create(User_TicketingVO vo) throws Exception;

	public User_TicketingVO read(Integer b_num) throws Exception;

	public void delete(Integer b_num) throws Exception;

}
