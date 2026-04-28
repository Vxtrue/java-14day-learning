## Java+Spring Boot开发规范
1.  依赖注入：使用Lombok的@RequiredArgsConstructor构造器注入，禁止@Autowired字段注入
2.  日志：使用SLF4J + @Slf4j注解，禁止使用System.out.println打印日志
3.  代码风格：遵循Spring Boot官方规范，变量/方法命名采用小驼峰，类名采用大驼峰
4.  分层规范：严格遵循Controller→Service→Repository三层架构，业务逻辑必须写在Service层
5.  代码解释：用户有JavaScript基础，所有Java代码解释必须类比JS对应的逻辑，避免纯术语堆砌