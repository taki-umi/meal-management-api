package com.takiumi.meal.usecase.user

import com.takiumi.meal.domain.model.user.User
import com.takiumi.meal.domain.repository.user.UserRepository
import org.springframework.stereotype.Service

/**
 * ユーザー全取得ユースケース
 */
@Service
class GetAllUsersUseCase (
    private val userRepository: UserRepository
) {
    /**
     * ユースケース実行
     * return 全てのユーザー情報
     */
    fun execute(): List<User> {
        return userRepository.findAll()
    }
}