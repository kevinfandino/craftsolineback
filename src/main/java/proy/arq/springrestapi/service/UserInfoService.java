package proy.arq.springrestapi.service;

import java.util.List;

import proy.arq.springrestapi.model.UserInfo;

public interface UserInfoService {
	
	List<UserInfo> getUserInfo();
	
	UserInfo saveUserInfo(UserInfo userInfo);
	
	UserInfo getSingleUserInfo (Long id);
	
	void deleteUserInfo (Long id);

	UserInfo updateUserInfo (UserInfo userInfo);
}
