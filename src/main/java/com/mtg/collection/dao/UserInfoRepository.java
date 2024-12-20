package com.mtg.collection.dao;

import com.mtg.collection.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long>
{
    Optional<UserInfo> findByEmail(String email);
}
