package me.atm.algorithm.array;

/**
 * 实现一个支持动态扩容的数组
 *
 * @author Altman
 * @date 2019/08/14
 **/
public class DynamicArray<T> {

    /**
     * 数据
     */
    private T[] datas;

    /**
     * 索引
     */
    private int index;

    /**
     * 默认初始化 数组10个长度
     */
    public DynamicArray() {
        this.datas = (T[]) new Object[2];
        this.index = 0;
    }

    /**
     * 自定义长度
     */
    public DynamicArray(int size) {
        this.datas = (T[]) new Object[size];
        this.index = 0;
    }

    /**
     * 获取数组的长度
     */
    public int length() {
        return this.datas.length;
    }

    /**
     * 添加一个元素
     * 如果索引是当前size，需要扩容1倍
     */
    public void add(T t) {
        if (index == length()) {
            T[] newDatas = (T[]) new Object[length() * 2];

            for (int i = 0; i < length(); i++) {
                newDatas[i] = this.datas[i];
            }

            this.datas = newDatas;
        }

        this.datas[index] = t;

        index++;
    }

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.length());
    }
}
