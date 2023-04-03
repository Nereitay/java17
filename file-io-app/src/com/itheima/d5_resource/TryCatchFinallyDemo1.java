package com.itheima.d5_resource;

import java.io.*;

/**
 * try-catch-finally
 *      - finally：在异常处理时提供finally块来执行所有清除操作，比如说IO流中的释放资源
 *      - 特点：被finally控制的语句最终一定会执行，除非JVM退出
 *      - 异常处理标准格式：try….catch…finally
 * 目标：学会使用finally释放资源。
 */
public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {

            // System.out.println(10/ 0);

            /*
             1、创建一个字节输入流管道与原视频接通
             */
            is = new FileInputStream("file-io-app/src/out04.txt");

            /*
             2、创建一个字节输出流管道与目标文件接通
             */
            os = new FileOutputStream("file-io-app/src/out05.txt");

            /*
             3、定义一个字节数组转移数据
             */
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");

            System.out.println(10 / 0);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里
            System.out.println("========finally=========");
            try {
                /*
                 4、关闭流。
                 */
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // catch 异常后继续执行到此
        System.out.println(test(10, 2));
    }

    public static int test(int a, int b) {
        try {
            int c = a / b;
            /*
            除非JVM退出
             */
//            System.exit(0); // 结束虚拟机
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -111111; // 计算出现bug.
        } finally {
            System.out.println("--finally--");
            /*
                'return' inside 'finally' block
             哪怕上面有return语句执行，也必须先执行完这里才可以！
             开发中不建议在这里加return ，如果加了，返回的永远是这里的数据了，这样会出问题！
             */
            return 100;
        }
    }
}
