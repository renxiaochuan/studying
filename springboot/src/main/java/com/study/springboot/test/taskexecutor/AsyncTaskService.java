package com.study.springboot.test.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	
//	@Async
	public void executorAsyncTask(Integer i) {
		System.out.println("执行异步任务："+i);
	}
	
	@Async
	public void executorAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务plus："+(i+1));
	}
}
