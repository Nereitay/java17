package com.itheima.d10_genericity_interface;

/**
 * 泛型接口
 *
 * 约定增删改查功能
 * @param <E>
 */
public interface Data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
