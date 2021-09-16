package com.java_univer.task1.ball;
import com.java_univer.task1.ball.Ball;
public class BallTest {
    public void Test() {
        Ball ball1 = new Ball(0.22F, 0.54F, "red");
        Ball ball2 = new Ball();
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
    }
}
