package com.skey.designpattern.strategy;

/**
 * 针对小孩的价格策略
 *
 * @author ALion
 * @version 2019/2/17 22:20
 */
public class ChildStrategy implements Strategy {

    @Override
    public double getPrice(double originalPrice) {
        return originalPrice * 0.7;
    }

}
