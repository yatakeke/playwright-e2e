### springboot-test-automation

this is the repository for studying some library/tools of test automation
- gradle (multi project, sourcesets)
- playwright
- github actions


### how to execute E2ETest
define the `POSTGRES_URL` environment variables
```shell
gradle bootRun
```
in another terminal
```shell
gradle e2eTest
```

### 今後やっていきたいこと
- [ ] マイグレーションツールの導入
- [ ] buildの高速化
- [ ] ワークフローごとのテストの実行分け
- [ ] 自動デプロイ