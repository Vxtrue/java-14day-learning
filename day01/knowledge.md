# Java 学习总结（Day01）

## 项目与运行
- Java 代码以类为组织单位，`public` 顶级类名需与文件名一致（如 `Calculator.java` 对应 `public class Calculator`）。
- 程序入口是 `main`：`public static void main(String[] args)`，不是每个类都要写，入口类才需要。
- 运行流程是“先编译再运行”：`javac ...` 生成 `.class`，再 `java 主类名` 执行。
- Windows 下源码含中文时，建议固定编译参数：`javac -encoding UTF-8 ...`。
- `java ClassTest` 找不到主类常见原因：目录不对、未生成 `.class`、类名与文件名不匹配。

## 类、对象、构造方法
- `class` 是类型模板，`new` 后得到对象实例；对象变量（如 `vip`）不是方法。
- 构造方法名必须与类名同名，用于创建对象时初始化字段。
- `this.xxx = xxx` 用于区分“当前对象字段”和“同名参数”。
- 一个类可有多个构造方法（重载），通过不同参数组合支持不同初始化路径。
- 构造方法不只是赋值，实战常做“参数校验 + 默认值处理 + 初始化约束”。

## 方法与 static
- 方法通用结构：`访问修饰符 + [static] + 返回类型 + 方法名 + 参数列表`。
- 业务代码通常优先实例方法；纯工具、无状态逻辑才优先 `static`。
- 判断是否用 `static` 的关键：方法是否依赖对象状态（实例字段或 `this`）。
- 返回类型约束的是“最终返回值类型”，不等于“中间运算自动按该类型计算”。
- 典型坑：`int / int` 先做整数除法，再转 `double`；要保留小数需先参与浮点运算。

## 输入处理与流程控制
- `Scanner scanner = new Scanner(System.in)`：创建控制台输入读取器；`nextLine()` 读取整行。
- `.trim()` 去掉首尾空白，提升输入容错；不加也能跑，但边界体验更差。
- `while (true) + break` 适合命令行持续交互；退出条件放循环体内更直观。
- 字符串比较用 `equals` / `equalsIgnoreCase`，不要用 `==` 比内容。
- `split("\\s+")` 按一个或多个空白切分表达式，适合解析“数字 运算符 数字”。

## 异常与集合
- `throw` 是主动抛异常，当前方法立即中断；`try-catch` 是捕获并处理异常，决定流程是否继续。
- `@throws` 是文档注释（Javadoc），用于声明异常契约；真正触发异常的是代码中的 `throw`。
- `NumberFormatException` 常见于字符串转数字失败；`IllegalArgumentException` 常用于参数非法。
- `ArrayList` 用于有序列表；常用 `add/get/set/remove/contains/size`。
- `HashMap` 用于键值查找；常用 `put/get/remove/containsKey/getOrDefault`，默认无序。
- `for (String w : words)` 是增强 `for`，按元素遍历；`getOrDefault(w, 0)` 是“有则取值，无则给默认值”。
