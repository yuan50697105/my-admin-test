package com.example.commons.batch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-05 11:51
 */
@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser,Long> {
}