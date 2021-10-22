package com.user_service.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user_service.entity.User;
import com.user_service.helper.Contact;
import com.user_service.helper.ResponceTemplete;
import com.user_service.repositories.UserRepository;
import com.user_service.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private RestTemplate restTemplete;

	@Autowired
	private UserRepository userServicerRepository;

	@Override
	public User saveUser(User user) {
		
		return userServicerRepository.save(user);
	}

	@Override
	public Optional<User> getUserById(int userId) {
		return userServicerRepository.findById(userId);
	}

	@Override
	public ResponceTemplete getUserAndDepartment(int userId) {

		ResponceTemplete responceTemplete = new ResponceTemplete();
		User user = userServicerRepository.findByUserId(userId);
		
		Contact contact = restTemplete
				.getForObject("http://CONTACT-SERVICE/contact_service/getContactbyId/"+ user.getCId(), Contact.class);
		responceTemplete.setUser(user);
		responceTemplete.setContact(contact);
		return responceTemplete;
	}

}
