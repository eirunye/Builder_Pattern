# 建造者模式

# 简介
建造者模式也称为构建者模式。在开发中，是我们经常遇到的，它方便我们构建一些常用字段，让我们一目了然，还有一些方法的传参。

学习本篇本章我将知道如何构建构建者模式，进行开发。
建造者的使用场景以及优缺点。

# 场景

# 代码解析

```java
public class Product {

    private String name;

    public Product(Builder builder) {
        init(builder);
    }

    private void init(Builder builder) {
//        System.out.println(builder.getName());
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public static Product create() {
        return new Builder().build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String name;

        private Builder() {
        }

        public Product build() {
            return new Product(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return name;
        }
    }
}

```
# 下载
[**案例代码分析**](https://github.com/eirunye/Builder_Pattern)

# 总结

# 优缺点



