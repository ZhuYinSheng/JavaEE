package club.banyuan.maven.task2;


import com.google.common.collect.Lists;
// 快速创建list集合 并且给一个初值
import org.apache.commons.lang3.StringUtils;
// 提供工具类包 StringUtils等
//不要修改这个类
public class Hello {

  public static void main(final String... args) {
    System.out.println(StringUtils.join(Lists.newArrayList("Hello,", "world!"), " "));
  }
}
