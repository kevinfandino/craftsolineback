package proy.arq.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import proy.arq.springrestapi.model.UserInfo;
import proy.arq.springrestapi.service.UserInfoService;

@RestController
public class UserInfoController {
	
	@Autowired
	private UserInfoService eService;
	
	@GetMapping("/user")
	public List<UserInfo> getUserInfo() {
		return eService.getUserInfo();
	}

	@GetMapping("/user/{id}")
	public UserInfo getUserInfo(@PathVariable("id") Long id) {
		return eService.getSingleUserInfo(id);
	}

	@PostMapping("/user")
	public UserInfo saveUserInfo (@Valid @RequestBody UserInfo UserInfo) {
		return eService.saveUserInfo(UserInfo);
	}

	@PutMapping("/user/{id}")
	public UserInfo updateUserInfo(@PathVariable Long id, @RequestBody UserInfo UserInfo) {
		UserInfo.setUser_id(id);
		return eService.updateUserInfo(UserInfo);
	}

	@DeleteMapping("/user")
	public void deleteUserInfo(@RequestParam("id") Long id) {
		eService.deleteUserInfo(id);
	}

}
