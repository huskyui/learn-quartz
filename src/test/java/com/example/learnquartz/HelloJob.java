package com.example.learnquartz;

import com.example.learnquartz.utils.TimeUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author huskyui
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {



        System.out.println("hello execute "+ TimeUtils.getTimeStr(new Date()) +" current thread " + Thread.currentThread().getName());
    }
}
