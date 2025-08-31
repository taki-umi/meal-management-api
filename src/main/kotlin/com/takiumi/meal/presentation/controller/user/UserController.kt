package com.takiumi.meal.presentation.controller.user

import com.takiumi.meal.domain.model.user.User
import com.takiumi.meal.usecase.user.GetAllUsersUseCase
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * ユーザーControllerクラス
 */
@RestController
@RequestMapping("api/users")
@Tag(name = "User", description = "ユーザー管理API")
class UserController (
    val useCase: GetAllUsersUseCase
) {
    /**
     * 有効なすべてのユーザー情報を返却する
     */
    @GetMapping
    @Operation(
        summary = "ユーザー一覧取得",
        description = "システムに登録されている全てのユーザー情報を取得します"
    )
    @ApiResponses(value = [
        ApiResponse(
            responseCode = "200",
            description = "取得成功"
        ),
        ApiResponse(
            responseCode = "500",
            description = "サーバーエラー"
        )
    ])
    fun getActiveUsers(): List<User> {
        return useCase.execute()
    }
}