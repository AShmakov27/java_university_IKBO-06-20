package com.java_univer;
import com.java_univer.MovableCircle;
import com.java_univer.MovablePoint;
public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3, 1, 5, 3);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(2, 4, 5, 2, 6);
        MovableCircle mCCopy = movableCircle.copy();
        System.out.println("Before coping");
        System.out.println(movableCircle);
        System.out.println(mCCopy);
        movableCircle.moveUp();
        movableCircle.moveRight();
        System.out.println("After coping");
        System.out.println(movableCircle);
        System.out.println(mCCopy);
    }
}
