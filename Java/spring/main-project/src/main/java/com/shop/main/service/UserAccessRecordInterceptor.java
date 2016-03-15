package com.shop.main.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;


public class UserAccessRecordInterceptor implements AfterReturningAdvice{
	
	private static String RECORD_METHOD = "recordFunctionAccess";

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	}
}
