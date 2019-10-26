package com.example.springdemo.interview.tree;

import sun.reflect.generics.tree.Tree;

/**
 * 寻找中序遍历时的下一个节点
 */
public class Inorder {

    public TreeNode next(TreeNode node){
        if(node==null){
            return null;
        }
        if(node.getRight()!=null){
            return first(node.getRight());
        }else{
            while (node.getParent()!=null&&node.getParent().getRight()==node){
                node=node.getParent();
            }
            return node.getParent();
        }
    }

    /**
     * 获取树的第一个最左节点
     * @param node
     * @return
     */
    public TreeNode first(TreeNode node) {
        if(node==null){
            return null;
        }
        TreeNode curNode=node;
        while (curNode.getLeft()!=null){
            curNode=curNode.getLeft();
        }
        return curNode;
    }

    public void traverse(TreeNode root){
        for (TreeNode node=first(root);
                node!=null;
                node=next(node)){
            System.out.print(node.getValue());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TreeCreator creator=new TreeCreator();
        Inorder inorder=new Inorder();
        TreeNode sampleTree=creator.crearteSampleTree();
        for(TreeNode node=inorder.first(sampleTree);
                node!=null;
                node=inorder.next(node)){
            System.out.print(node.getValue());
        }
        System.out.println();

        inorder.traverse(creator.createTree("",""));
        inorder.traverse(creator.createTree("A","A"));
        inorder.traverse(creator.createTree("AB","BA"));
    }
}
