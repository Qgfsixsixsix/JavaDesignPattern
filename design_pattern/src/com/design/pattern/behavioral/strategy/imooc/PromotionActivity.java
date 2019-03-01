package com.design.pattern.behavioral.strategy.imooc;

/**
 * 这个好比一个工厂
 * Created by geely
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        this.promotionStrategy.doPromotion();
    }

}
