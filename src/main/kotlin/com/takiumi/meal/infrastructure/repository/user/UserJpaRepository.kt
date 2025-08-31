package com.takiumi.meal.infrastructure.repository.user

import com.takiumi.meal.infrastructure.entity.user.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserJpaRepository : JpaRepository<UserEntity, Long>