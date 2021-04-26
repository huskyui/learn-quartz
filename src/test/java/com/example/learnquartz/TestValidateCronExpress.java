package com.example.learnquartz;

import org.quartz.CronExpression;

/**
 * @author huskyui
 */
public class TestValidateCronExpress {
    public static void main(String[] args) {
        // 通过，但不一定是可以正确执行，如果复杂的话，可以写多个trigger,触发同一个job
        boolean validExpression = CronExpression.isValidExpression("0 0 0 L-3 * ? *");
        System.out.println(validExpression);
    }
}
