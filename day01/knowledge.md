# Java 学习总结（Day01，易懂版）

## 先记住这 6 句
- Java 程序入口在 `main`，不是文件顶层代码。
- `public` 类名要和文件名一致。
- 字符串内容比较用 `equals`，不用 `==`。
- `throw` 负责抛异常，`try-catch` 负责接异常。
- 业务代码优先实例方法，工具方法再考虑 `static`。
- 运行是两步：`javac` 编译，`java` 执行。

## 一、项目怎么运行（你最常遇到的问题）
- 正常流程：先编译再运行。

```bash
cd d:\Code\java-14day-learning\day01
javac -encoding UTF-8 ClassTest.java
java ClassTest
```

- 报“找不到主类”时先查这 3 点：
- 当前目录对不对（是不是在 `day01`）。
- 有没有生成对应 `.class` 文件。
- 文件名和 `public class` 名是不是一致。

## 二、类、对象、构造方法（你问得最多）
- `class` 是模板，对象是 `new` 出来的实例。
- 例子：`DiscountCalculator vip = new DiscountCalculator(0.2);`
- 左边是“类型 + 变量名”，右边是“创建对象”。
- 构造方法和类同名，用来初始化对象。
- `this.rate = rate;`：左边是对象字段，右边是传入参数。

常见误区：
- `vip` 不是方法，是对象变量名。
- `new apply(100)` 错，因为 `apply` 是方法不是类。

## 三、方法与 static（怎么判断要不要加）
- 先看方法是否依赖对象状态（实例字段 / `this`）。
- 不依赖：可 `static`（如纯计算工具）。
- 依赖：不要 `static`（如方法用到 `rate` 字段）。

一句话口诀：
- 和对象无关 -> 可 `static`
- 和对象有关 -> 不要 `static`

## 四、输入处理（计算器里每行的意义）
- `Scanner scanner = new Scanner(System.in)`：创建控制台输入工具。
- `nextLine()`：读一整行。
- `.trim()`：去掉首尾空格，提升容错。
- `while (true)`：持续交互，输入 `exit` 后 `break` 退出。
- `split("\\s+")`：把 `12 + 3` 拆成 `["12", "+", "3"]`。

## 五、字符串判断（最容易写错）
- Java 里不要用 `input == "exit"` 比较内容。
- 正确写法：
- 区分大小写：`"exit".equals(input)`
- 忽略大小写：`"exit".equalsIgnoreCase(input)`

## 六、异常处理（throw 和 try-catch）
- `throw`：手动抛出异常，当前方法立即中断。
- `try-catch`：捕获并处理异常，程序可以继续跑。
- `@throws`：只是文档说明，不执行代码。

最常见两个异常：
- `NumberFormatException`：字符串转数字失败。
- `IllegalArgumentException`：参数不合法（如除数为 0）。

## 七、集合（ArrayList / HashMap）
- `ArrayList`：有序列表，常用 `add/get/set/remove/size`。
- `HashMap`：键值对查找，常用 `put/get/remove/containsKey/getOrDefault`。
- `for (String w : words)`：增强 for，按元素遍历。
- `getOrDefault(w, 0)`：有值就取，没有就给默认值 0。

词频统计核心三行：

```java
for (String w : words) {
    int oldCount = countMap.getOrDefault(w, 0);
    countMap.put(w, oldCount + 1);
}
```

## 八、你现在的理解状态（已掌握）
- 能区分“类 / 对象 / 构造方法 / 普通方法”。
- 能看懂 `throw` 与 `try-catch` 的分工。
- 能看懂 `split("\\s+")`、`equalsIgnoreCase`、增强 `for`。
- 下一步重点建议：开始写 3 个小练习（用户类、购物车类、词频统计）。
