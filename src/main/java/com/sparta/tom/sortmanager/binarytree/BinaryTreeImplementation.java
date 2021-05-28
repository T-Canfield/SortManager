package com.sparta.tom.sortmanager.binarytree;

import com.sparta.tom.sortmanager.customexceptions.ChildNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImplementation implements BinaryTree {
    public Node root;
    static List<Integer> temporaryList = new ArrayList<>();

    @Override
    public int getRootElement() {
        return root.value;
    }
    @Override
    public int getNumberOfElements() {
        return countNodes(root);
    }

    public static int countNodes(Node node){
        if (node==null){
            return 0;
        }
        return 1 + countNodes(node.leftChild)+ countNodes(node.rightChild);
    }

    public Node binaryTreeAdder(Node currentNode, int value){
        if (currentNode == null){
            return new Node(value);
        }
        if(value<currentNode.value){
            currentNode.leftChild= binaryTreeAdder(currentNode.leftChild,value);
        }
        else if (value>currentNode.value){
            currentNode.rightChild= binaryTreeAdder(currentNode.rightChild,value);
        }

        return currentNode;

    }

    public boolean findNodeContainingValue(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        }else if (value == currentNode.value) {
            return true;
        }
        return value < currentNode.value
                ? findNodeContainingValue(currentNode.leftChild, value)
                : findNodeContainingValue(currentNode.rightChild, value);


    }
    public Node findNode(Node currentNode, int value) {
        if (value == currentNode.value) {
            return currentNode;
        }
        if (value < currentNode.value){
            currentNode=findNode(currentNode.leftChild, value);
        }
        else if (value > currentNode.value){
            currentNode=findNode(currentNode.rightChild, value);
        }
        return currentNode;
    }
    @Override
    public void addElement(int element) {
        root= binaryTreeAdder(root,element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int element:
                elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        return findNodeContainingValue(root,value);
    }

    @Override
    public int getLeftChild(int element)throws ChildNotFoundException {
        Node node =findNode(root,element);
        if(node.leftChild==null){
            throw new ChildNotFoundException("Left Child for node " + element + " doesn't exist");
        }
        return node.leftChild.value;
    }

    @Override
    public int getRightChild(int element)throws ChildNotFoundException {
        Node node =findNode(root,element);
        if(node.rightChild==null){
            throw new ChildNotFoundException("Right Child for node " + element + " doesn't exist");
        }
        return node.rightChild.value;
    }

    public void traversingInAscOrder(Node currentNode){
        if (currentNode!=null){
            traversingInAscOrder(currentNode.leftChild);
            temporaryList.add(currentNode.value);
            traversingInAscOrder(currentNode.rightChild);
        }
    }

    public void traversingInDescOrder(Node currentNode){
        if (currentNode!=null){
            traversingInDescOrder(currentNode.rightChild);
            temporaryList.add(currentNode.value);
            traversingInDescOrder(currentNode.leftChild);
        }
    }
    @Override
    public int[] getSortedTreeAsc() {
        int[] output= new int[getNumberOfElements()];
        int i=0;
        traversingInAscOrder(root);
        for (Integer element:
                temporaryList) {
            output[i++]=element;
        }
        temporaryList.clear();
        return output;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] output= new int[getNumberOfElements()];
        int i=0;
        traversingInDescOrder(root);
        for (Integer element:
                temporaryList) {
            output[i++]=element;
        }
        temporaryList.clear();
        return output;
    }

    public class Node{
        int value;
        Node leftChild;
        Node rightChild;

        public Node(Integer value) {
            this.value = value;
            rightChild=null;
            leftChild=null;
        }
    }
}
