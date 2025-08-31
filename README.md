
<div id="top"></div>

# meal-management-api

コミュニティ用食事管理アプリのバックエンド。

## 使用技術一覧

<!-- シールド一覧 -->
<!-- 該当するプロジェクトの中から任意のものを選ぶ-->
<p style="display: inline">
  <!-- バックエンドのフレームワーク一覧 -->
  <img src="https://img.shields.io/badge/-SpringBoot-092E20.svg?logo=springboot&style=for-the-badge">
  <!-- バックエンドの言語一覧 -->
  <img src="https://img.shields.io/badge/-Kotlin-CC99FF.svg?logo=kotlin&style=for-the-badge">
  <!-- ミドルウェア一覧 -->
  <img src="https://img.shields.io/badge/-MySQL-4479A1.svg?logo=mysql&style=for-the-badge&logoColor=white">
  <!-- インフラ一覧 -->
  <img src="https://img.shields.io/badge/-Docker-1488C6.svg?logo=docker&style=for-the-badge">
  <img src="https://img.shields.io/badge/-githubactions-FFFFFF.svg?logo=github-actions&style=for-the-badge">
  <img src="https://img.shields.io/badge/-Amazon%20aws-232F3E.svg?logo=amazon-aws&style=for-the-badge">
</p>

## 目次

1. [プロジェクトについて](#プロジェクトについて)
2. [ディレクトリ構成](#ディレクトリ構成)
3. [開発環境構築](#開発環境構築)
4. [アプリケーション起動方法](#アプリケーション起動方法)
5. [トラブルシューティング](#トラブルシューティング)

## プロジェクトについて

<p align="right">(<a href="#top">トップへ</a>)</p>

## ディレクトリ構成

本リポジトリはDDD設計に則ります。

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

<p align="right">(<a href="#top">トップへ</a>)</p>

## 開発環境構築

<p align="right">(<a href="#top">トップへ</a>)</p>

## アプリケーション起動方法

<p align="right">(<a href="#top">トップへ</a>)</p>

## トラブルシューティング

<p align="right">(<a href="#top">トップへ</a>)</p>