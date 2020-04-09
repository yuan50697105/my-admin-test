package com.example.commons.quartz.batch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-05 17:58
 */
@Repository
public interface AccessRepository extends JpaRepository<Access,Integer> {
}
