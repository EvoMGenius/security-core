package ru.themikhailz.service;

import org.springframework.security.core.context.SecurityContextHolder;
import ru.themikhailz.security.CustomUserDetailsImpl;

import java.util.UUID;

public class AuthServiceImpl implements AuthService {
    @Override
    public UUID getAuthorizedUserId() {
        CustomUserDetailsImpl userDetails = (CustomUserDetailsImpl) SecurityContextHolder.getContext()
                                                                                         .getAuthentication()
                                                                                         .getDetails();
        return userDetails.getId();

    }
}
