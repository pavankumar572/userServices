package com.user.services.userServices;/* pavankuma.siripurapu created on 1/21/2021 */

import com.user.services.userServices.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
