package com.takiumi.meal.infrastructure.entity.user

import com.takiumi.meal.domain.model.user.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

/**
 * ユーザーのJPA用Entity
 */
@Entity
@Table(name = "users")
class UserEntity (
    /* ユーザーID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    /* ユーザー名 */
    val name: String,
    /* Email */
    val email: String,
    /* 作成日時 */
    @CreationTimestamp
    val createdAt: LocalDateTime = LocalDateTime.now(),
    /* 更新日時 */
    @UpdateTimestamp
    val updatedAt: LocalDateTime = LocalDateTime.now()
) {
    /**
     * ユーザーのJAP用Entityからドメインモデルに変換して返却する
     * return 変換されたユーザー情報
     */
    fun toDomainModel(): User? {
        return id?.let {
            User(
                id = it,
                name = name,
                email = email,
                createdAt = createdAt,
                updatedAt = updatedAt
            )
        }
    }

    /**
     * ユーザードメインモデルからJPA用Entityに変換する
     * return ユーザーJPA用Entity
     */
    companion object {
        fun fromDomainModel(domain: User): UserEntity {
            return UserEntity(
                name = domain.name,
                email = domain.email,
                createdAt = domain.createdAt,
                updatedAt = domain.updatedAt
            )
        }
    }
}