package com.takiumi.meal.infrastructure.repository.user

import com.takiumi.meal.domain.model.user.User
import com.takiumi.meal.domain.repository.user.UserRepository
import com.takiumi.meal.infrastructure.entity.user.UserEntity
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    /* ユーザーRepository */
    private val userJpaRepository: UserJpaRepository
) : UserRepository {
    /**
     * すべてのユーザーを取得する
     * return すべてのユーザー情報
     */
    override fun findAll(): List<User> {
        return userJpaRepository.findAll().mapNotNull { it.toDomainModel() }
    }

    /**
     * ユーザーIDを指定して、ユニークなユーザー情報を取得する
     * return 指定したユーザー情報
     */
    override fun findById(id: Long): User? {
        return userJpaRepository.findById(id).orElse(null)?.toDomainModel()
    }

    /**
     * ユーザー情報を保存する
     * return 保存したユーザー情報
     */
    override fun save(user: User): User {
        val entity = UserEntity.fromDomainModel(user)
        val savedEntity = userJpaRepository.save(entity)
        return savedEntity.toDomainModel()!!
    }

    /**
     * 指定したユーザーIDのユーザー情報を削除する
     */
    override fun deleteById(id: Long) {
        userJpaRepository.deleteById(id)
    }
}