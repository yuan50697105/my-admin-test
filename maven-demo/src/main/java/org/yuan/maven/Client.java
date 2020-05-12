package org.yuan.maven;

/**
 * @program: maven-demo
 * @description:
 * @author: yuane
 * @create: 2020-05-07 22:29
 */
public class Client {
    public static void main(String[] args) {
        Long a = 1L;
        Long b = 2L;
        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        System.out.println("a>b = " + (a > b));
        System.out.println("b.compareTo(a) = " + b.compareTo(a));

    }
}