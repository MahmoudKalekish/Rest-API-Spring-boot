package com.kalekish.userCrud.services;

import com.kalekish.userCrud.dtos.ApiResponseDto;
import com.kalekish.userCrud.dtos.UserDetailsRequestDto;
import com.kalekish.userCrud.exceptions.UserAlreadyExistsException;
import com.kalekish.userCrud.exceptions.UserNotFoundException;
import com.kalekish.userCrud.exceptions.UserServiceLogicException;
import com.kalekish.userCrud.modals.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    ResponseEntity<ApiResponseDto<?>> registerUser(UserDetailsRequestDto newUserDetails)
            throws UserAlreadyExistsException, UserServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> getAllUsers()
            throws UserServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> updateUser(UserDetailsRequestDto newUserDetails, int id)
            throws UserNotFoundException, UserServiceLogicException;

    ResponseEntity<ApiResponseDto<?>> deleteUser(int id)
            throws UserServiceLogicException, UserNotFoundException;

}
