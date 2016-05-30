/**
 * @Description: TODO
 */
package com.exercise;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureTimeOutTest {

	public static void main(String[] args) {
		// 注册中心，用来存放待监控的线程
		final Set<Thread> register = new HashSet<Thread>();
		// 创建一个线程池，并将一个任务提交到此线程池中执行。
		Future<String> result = new ThreadPoolExecutor(1, 1, 0,
				TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(),
				new ThreadFactory() {
					@Override
					public Thread newThread(Runnable r) {
						Thread thread = new Thread(r);
						thread.setName("test-thread");
						// 将线程放到注册中心中，便于监控此线程的状态
						register.add(thread);
						return thread;
					}
				}).submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// 线程sleep 10s，模拟超时
//				Thread.sleep(10000);
//				return null;
				String reslut = sendRuquest();
				System.out.println("1111111111111111");
				
				System.out.println("22222222222222222");
				return reslut;
			}
		});
		
		
		// 定时查看线程池状态
		Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(
				new Runnable() {
					@Override
					public void run() {
						for (Thread thread : register) {
							System.out.println(thread.getName() + " "
									+ thread.getState());
						}
					}
				}, 0, 1, TimeUnit.SECONDS);
		
		
		try {
			// 3s超时，超时后观察线程的状态
			System.out.println(result.get(20, TimeUnit.MILLISECONDS));
		} catch (Exception e) {
			// 加上cancel之后，不会继续执行
			 result.cancel(true);
			e.printStackTrace();
		}
	}
	
	
	private static String sendRuquest(){
		String urlStr = "http://127.0.0.1:8080/ucf-webapp/api/ylz_cid_queryWageGrade_api/35011113333333319d3022715/btof/a12345678/";
		
        //发送 GET 请求
        String s=HttpRequest.sendGet(urlStr, "");
		return s;
	}
	
	
	
	
	
	
}
