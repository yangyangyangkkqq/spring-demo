package com.example.springdemo.interview.tree;

import sun.reflect.generics.tree.Tree;

/**
 * 遍历树
 */
public class TreeTraversal {
    /**
     * 前序遍历
     * @param root
     */
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(TreeNode root){
        if (root==null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }

    /**
     * 后序遍历
     * @param root
     */
    public void postOrder(TreeNode root){
        if (root==null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());
    }

    /**
     * 根据前序中序直接生成后序
     * @param preOrder
     * @param inOrder
     * @return
     */
    public String postOrder2(String preOrder,String inOrder){
        if (preOrder.isEmpty()){
            return "";
        }
        char rootValue=preOrder.charAt(0);
        int rootIndex=inOrder.indexOf(rootValue);
        return postOrder2(
                preOrder.substring(1,1+rootIndex),
                inOrder.substring(0,rootIndex))+
        postOrder2(
                preOrder.substring(1+rootIndex),
                inOrder.substring(1+rootIndex))+
        rootValue;
    }
    public static void main(String[] args) {
        TreeTraversal traversal=new TreeTraversal();
        TreeCreator creator=new TreeCreator();
        traversal.preOrder(creator.crearteSampleTree());
        System.out.println();
        traversal.inOrder(creator.crearteSampleTree());
        System.out.println();
        traversal.postOrder(creator.crearteSampleTree());
        System.out.println();
        System.out.println("=======================");
        TreeNode tree=creator.createTree("ABDEGCF","DBGEACF");
        traversal.postOrder(tree);
        System.out.println();
        System.out.println(traversal.postOrder2("ABDEGCF","DBGEACF"));
}
}
