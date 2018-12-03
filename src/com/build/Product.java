package com.build;

import javax.swing.plaf.basic.BasicButtonUI;

/**
 * Author Eirunye
 * Created by on 2018/12/3.
 * Describe
 * E_mail eirunye@aliyun.com
 */
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
