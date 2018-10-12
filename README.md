[![Build Status](https://travis-ci.org/vancefantasy/flyer-springmvc-rest.svg?branch=master)](https://travis-ci.org/vancefantasy/flyer-springmvc-rest)
[![Coverage Status](https://coveralls.io/repos/github/vancefantasy/flyer-springmvc-rest/badge.svg?branch=master)](https://coveralls.io/github/vancefantasy/flyer-springmvc-rest?branch=master)
[![License](https://img.shields.io/github/license/vancefantasy/flyer-springmvc-rest.svg)](https://github.com/vancefantasy/flyer-springbmvc-rest/blob/master/LICENSE)

# flyer-springmvc-rest是什么？
flyer-springmvc-rest是一个Java样例项目，这里维护了flyer-maker项目的模板。
flyer-maker是一个代码生成工具，可以动态生成工程代码，同时还尝试提供各类型项目工程搭建的参考，让开发人员在短时间构建生产可用的服务。

# 集成环境
- Java 8
- Spring(MVC) 4.3.18
- mapper、entity、dao、service、controller及对应单元测试
- 第三方工具包(guava,jodd,vjkit,common-*等)，满足缓存(内存)、字符串、日期、json、集合、Http、IO等的日常处理
- 异常处理最佳实践
- 全局拦截器，记录请求响应日志
- Logback集成(Rest接口调整日志级别等)
- 单元测试、Mock测试

# 单元测试
写好单元测试不是一件容易的事，这里分享下自己的经验：多数情况下使用单独的数据库运行单元测试，运行完清空数据库，会是一个明智的选择。事实上，在本项目中，就体现了类似的规则。
注意：为避免误清空其他环境数据，运行单元测试时会检测数据库名是否以'_ut'结尾。

# 贡献代码
欢迎提交Pull Request。有意见或建议，请提issue，也可以[邮件](mailto:vance.8807@gmail.com)。
