package com.takiumi.meal.domain.model.user

import java.time.LocalDateTime

/**
 * ユーザードメインオブジェクト
 */
data class User (
    /* ユーザーID */
    val id: Long,
    /* ユーザー名 */
    val name: String,
    /* Email */
    val email: String,
    /* 作成日時 */
    val createdAt: LocalDateTime,
    /* 更新日時 */
    val updatedAt: LocalDateTime
) {
    /**
     * Emailの形式が正しいか確認
     * @return true: 正しい, false: 不正
     */
    fun isValidEmail(): Boolean {
        return email.contains("@") && email.contains(".")
    }
}