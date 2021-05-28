package com.sparta.tom.sortmanager.sortertesting;

import com.sparta.tom.sortmanager.binarytree.BinaryTree;
import com.sparta.tom.sortmanager.binarytree.BinaryTreeImplementation;
import com.sparta.tom.sortmanager.customexceptions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeTesting {


    @Test
    public void shouldReturnTrue(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        binaryTree.addElement(5);
        Assertions.assertTrue(binaryTree.findElement(5));
    }
    @Test
    public void shouldReturnFalse(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        binaryTree.addElement(5);
        Assertions.assertFalse(binaryTree.findElement(4));
    }
    @Test
    public void shouldReturnLeftChild() throws ChildNotFoundException {
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int[] input={1,7,4,9};
        binaryTree.addElements(input);
        Assertions.assertEquals(4,binaryTree.getLeftChild(7));
    }
    @Test
    public void shouldThrowChildNotFoundExceptionLeftChild(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int[] input={1};
        binaryTree.addElements(input);
        Assertions.assertThrows(ChildNotFoundException.class,()->binaryTree.getLeftChild(1));
    }
    @Test
    public void shouldReturnRightChild() throws ChildNotFoundException {
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int[] input={1,7,4,9};
        binaryTree.addElements(input);
        Assertions.assertEquals(9,binaryTree.getRightChild(7));
    }
    @Test
    public void shouldThrowChildNotFoundExceptionRightChild(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int[] input={1};
        binaryTree.addElements(input);
        Assertions.assertThrows(ChildNotFoundException.class,()->binaryTree.getRightChild(1));
    }
    @Test
    public void shouldAddElements(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int[] input={-5,20,3};
        binaryTree.addElements(input);
        Assertions.assertTrue(binaryTree.findElement(-5));
        Assertions.assertTrue(binaryTree.findElement(20));
        Assertions.assertTrue(binaryTree.findElement(3));
    }
    @Test
    public void shouldReturnRootNode(){
        BinaryTree binaryTree= new BinaryTreeImplementation();
        int output=-5;
        int[] input={-5,20,3,-7,1,0,17};
        binaryTree.addElements(input);
        Assertions.assertEquals(output, binaryTree.getRootElement());
    }
}
