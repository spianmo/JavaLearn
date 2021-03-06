package org.spianmo.algorithm.Tree;

import java.util.Arrays;

/**
 * @ClassName TestBTree
 * @Description TODO
 * @Author Finger
 * @Date 11/3/2020
 **/
public class TestBTree {
    public static void main(String[] args) {
        BTreeClass bTree = new BTreeClass();
        bTree.createBTree("a(b(c(d),e(f(g),h(i,j))),k(l(m(n,o),p(q)),r(s)))");
        System.out.println("==========>二叉树高度" + bTree.height());
        System.out.println(bTree.toString());
        System.out.println("=============前序遍历=============");
        System.out.println(Arrays.toString(bTree.preOrder().toArray(new Character[]{})));
        System.out.println("=============中序遍历=============");
        System.out.println(Arrays.toString(bTree.inOrder().toArray(new Character[]{})));
        System.out.println("=============后序遍历=============");
        System.out.println(Arrays.toString(bTree.postOrder().toArray(new Character[]{})));
        System.out.println("=============结点个数=============");
        System.out.println(bTree.countNode());
    }
}
