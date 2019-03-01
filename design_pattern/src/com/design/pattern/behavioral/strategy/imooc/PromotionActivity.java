package com.design.pattern.behavioral.strategy.imooc;

/**
 * ����ñ�һ������
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
