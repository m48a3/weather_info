package com.example.weather_info.repos;

import com.example.weather_info.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface Users_repo extends CrudRepository<User, String> {
}
