package com.example.learnquartz;

import com.example.learnquartz.utils.TimeUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;
import java.util.StringJoiner;

/**
 * @author huskyui
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        StringJoiner add = new StringJoiner(" ")
                .add("hello execute")
                .add(TimeUtils.getTimeStr(new Date()))
                .add("current thread ")
                .add(Thread.currentThread().getName())
                .add(context.getTrigger().getKey().getName());


        System.out.println(add.toString());
    }
}
