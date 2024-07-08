package org.example.openfeign.provider.service;

import org.example.openfeign.api.User;

/**
 * @author Huang Z.Y.
 */
public interface UserService {

    User findById(Long id);

}
