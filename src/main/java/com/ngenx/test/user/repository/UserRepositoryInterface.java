package com.ngenx.test.user.repository;

import com.ngenx.test.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryInterface extends JpaRepository<User, Long>
{
    public List<User> findByStatus(String status);

    public List<User> findByIdBetween(long start, long end);

}
