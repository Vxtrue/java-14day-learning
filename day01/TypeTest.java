public class TypeTest {
    public static void main(String[] args) {
        // 变量必须声明类型，类比TS的let num: number = 10;
        int num = 10;
        String name = "Java学习";
        boolean isSuccess = true;
        
        // 函数必须声明返回值类型，参数也必须声明类型
        int result = jiafa(5, 3);
        System.out.println(result);
    }
    
    // 声明返回值类型为int，两个参数都必须声明类型
    public static int jiafa(int a, int b) {
        return a + b;
    }
}