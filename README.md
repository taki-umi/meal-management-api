
## ディレクトリ構成

```
src/main/kotlin/com/takiumi/meal/
├── domain/
│   ├── model/          # エンティティ・値オブジェクト（ビジネスロジック）
│   ├── service/        # ドメインサービス（ビジネスロジック）
│   └── repository/     # リポジトリインターフェース
├── usecase/           # アプリケーションサービス（ユーザーの操作単位）
├── infrastructure/    # インフラ層
│   ├── entity/        # JPAエンティティ
│   └── repository/    # リポジトリ実装
└── presentation/      # プレゼンテーション層
    ├── controller/    # RESTコントローラー
    └── dto/          # データ転送オブジェクト
```