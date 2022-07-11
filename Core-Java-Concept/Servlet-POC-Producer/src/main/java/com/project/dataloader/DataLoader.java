package com.project.dataloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.project.entity.UserData;
import com.project.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner{

	private UserRepository userRepository;
	
	@Autowired
	public DataLoader(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		userRepository.save(new UserData(1,"Sam","BLR"));
		userRepository.save(new UserData(2,"Vinayak","ORL"));
		userRepository.save(new UserData(3,"Raju","PUN"));
		userRepository.save(new UserData(4,"Vijay","GCT"));
		userRepository.save(new UserData(5,"John","NYC"));
	
		
	}

}
