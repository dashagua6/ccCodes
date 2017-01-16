package com.hisoft.biz;

import com.hisoft.domain.User;
import com.hisoft.exception.UserHasExistException;

public interface IBusinessService {
	
	void regist(User user) throws UserHasExistException;
	User login(String name,String password);
}
