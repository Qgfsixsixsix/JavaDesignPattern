package com.design.pattern.behavioral.strategy.imooc;

/**
 * Created by geely
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
