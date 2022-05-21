package object;

import java.util.LinkedList;

/**
 * 不使用任何内建的哈希表库设计一个哈希映射（HashMap）。
 *
 * @author Administrator
 */
public class MyHashMap {

  class Node {
    private Integer key;
    private Integer value;

    public Node(Integer key, Integer value) {
      this.key = key;
      this.value = value;
    }
  }

  private static Integer BASE = 2 << 8 - 1;
  private LinkedList[] list;

  /** 用空映射初始化对象 */
  public MyHashMap() {
    list = new LinkedList[BASE];
    for (int i = 0; i < BASE; i++) {
      list[i] = new LinkedList<>();
    }
  }

  /**
   * void put(int key, int value) 向 HashMap 插入一个键值对 (key, value) 。如果 key 已经存在于映射中，则更新其对应的值 value 。
   *
   * @param key
   * @param value
   */
  public void put(int key, int value) {
    int hash = hash(key);
    LinkedList<Node> link = list[hash];
    for (Node node : link) {
      if (node.key.equals(key)) {
        node.value = value;
        return;
      }
    }
    link.add(new Node(key, value));
  }

  /**
   * int get(int key) 返回特定的 key 所映射的 value ；如果映射中不包含 key 的映射，返回 -1
   *
   * @param key
   * @return
   */
  public int get(int key) {
    int hash = hash(key);
    LinkedList<Node> link = list[hash];
    for (Node node : link) {
      if (node.key.equals(key)) {
        return node.value;
      }
    }
    return -1;
  }

  /**
   * void remove(key) 如果映射中存在 key 的映射，则移除 key 和它所对应的 value 。
   *
   * @param key
   */
  public void remove(int key) {
    int hash = hash(key);
    LinkedList<Node> link = list[hash];
    for (Node node : link) {
      if (node.key.equals(key)) {
        link.remove(node);
        return;
      }
    }
  }

  private int hash(int key) {
    return key % BASE;
  }
}
