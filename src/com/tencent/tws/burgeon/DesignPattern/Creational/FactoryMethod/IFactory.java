 package com.tencent.tws.burgeon.DesignPattern.Creational.FactoryMethod;

/**
 * Created by Administrator on 2016/1/7.
 */
public interface IFactory {
    public <T extends IProduct> T createProduct(Class<T> clz);
}
