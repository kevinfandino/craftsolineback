package proy.arq.springrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proy.arq.springrestapi.model.UserInfo;
import proy.arq.springrestapi.repository.UserRepository;

@Service
public class ServiceUserInfo implements UserInfoService {
	
	
	@Autowired
	private UserRepository eRepository;
	
	
	@Override
	public List<UserInfo> getUserInfo(){
		return eRepository.findAll();
	}
	
	@Override
	public UserInfo saveUserInfo(UserInfo userInfo) {
		return eRepository.save(userInfo);
	}

	@Override
	public UserInfo getSingleUserInfo(Long id) {
		Optional<UserInfo> userInfo = eRepository.findById(id);
		if(userInfo.isPresent()) {
			return userInfo.get();
		}
		throw new RuntimeException("Usuario no encontrado por el ID " +id);

	}

	@Override
	public void deleteUserInfo(Long id) {
		
		eRepository.deleteById(id);
		
	}

	@Override
	public UserInfo updateUserInfo(UserInfo userInfo) {
		return eRepository.save(userInfo);
	}
}
