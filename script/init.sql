-- script/init.sql
-- 文字コード設定
SET NAMES utf8mb4;
SET CHARACTER SET utf8mb4;

-- usersテーブルの作成
CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- サンプルデータの挿入
INSERT INTO users (email, name) VALUES
('user1@example.com', 'テストユーザー1'),
('user2@example.com', 'テストユーザー2'),
('trainer@example.com', 'トレーナー太郎'),
('admin@example.com', '管理者花子'),
('test@example.com', 'テスト次郎');
