package com.takiumi.meal.domain.repository.user

import com.takiumi.meal.domain.model.user.User

/**
 * ユーザーRepository
 */
interface UserRepository {
    fun findAll(): List<User>
    fun findById(id: Long): User?
    fun save(user: User): User
    fun deleteById(id: Long)
}