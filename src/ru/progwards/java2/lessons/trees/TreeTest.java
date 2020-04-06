package ru.progwards.java2.lessons.trees;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class TreeTest {
    static final int ITERATIONS = 1000;
    public static void main(String[] args) throws TreeException {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        BinaryTree<Integer, String> tree = new BinaryTree<>();
        AvlTree<Integer, String> avlTree = new AvlTree<>();
        for(int i=0; i<ITERATIONS; i++) {
            int key = ThreadLocalRandom.current().nextInt() % 10;
//            if (!map.containsKey(key)) {
//                map.put(key, key);
//                tree.add(key, "key=" + key);
//            }
            map.put(key, key);
            avlTree.put(key, "key=" + key);
        }
        System.out.println("add passed OK");
        avlTree.process(System.out::println);
//        tree.process(System.out::println);
//        ArrayList<BinaryTree.TreeLeaf> sorted = new ArrayList<>();
//        tree.process(sorted::add);
//        for(BinaryTree.TreeLeaf leaf: sorted) {
//            System.out.println(leaf.toString());
//        }

        for(Integer i:map.keySet()) {
            avlTree.find(i);
            avlTree.delete(i);
//            tree.delete(i);
        }
        System.out.println("\n");
        System.out.println("find&delete passed OK");
        avlTree.process(System.out::println);
//        tree.process(System.out::println);

    }
}