package object;

import java.util.LinkedList;

/**
 * 705. 设计哈希集合 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。
 *
 * <p>实现 MyHashSet 类：
 *
 * <p>void add(key) 向哈希集合中插入值 key 。 bool contains(key) 返回哈希集合中是否存在这个值 key 。 void remove(key) 将给定值
 * key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
 *
 * @author Administrator
 */
public class MyHashSet {
  private static Integer BASE = 2 << 8 - 1;
  private LinkedList<Integer>[] list;

  public MyHashSet() {
    list = new LinkedList[BASE];
    for (Integer i = 0; i < BASE; i++) {
      list[i] = new LinkedList<>();
    }
  }

  public void add(int key) {
    int hash = hash(key);
    LinkedList<Integer> link = list[hash];
    for (Integer value : link) {
      if (value.equals(key)) {
        return;
      }
    }
    link.add(key);
  }

  public void remove(int key) {
    int hash = hash(key);
    LinkedList<Integer> link = list[hash];
    for (Integer value : link) {
      if (value.equals(key)) {
        link.remove(value);
        return;
      }
    }
  }

  public boolean contains(int key) {
    int hash = hash(key);
    LinkedList<Integer> link = list[hash];
    if (link.isEmpty()) {
      return false;
    }
    for (Integer value : link) {
      if (value.equals(key)) {
        return true;
      }
    }
    return false;
  }

  private int hash(int key) {
    return key % BASE;
  }
}
