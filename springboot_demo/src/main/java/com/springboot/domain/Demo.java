package com.springboot.domain;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("第"+(random.nextInt(6)+1)+"排"+"第"+(random.nextInt(11)+1)+"个");
    }
}
