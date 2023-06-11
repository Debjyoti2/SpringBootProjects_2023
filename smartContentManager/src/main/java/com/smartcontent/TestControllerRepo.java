package com.smartcontent;

import org.springframework.data.repository.CrudRepository;

import com.smartcontent.entities.User;

public interface TestControllerRepo extends CrudRepository<User, Integer>{

	
}
