package com.testng.features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class My_Transform implements IAnnotationTransformer {
	
public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

annotation.setRetryAnalyzer(Retry_Purpose.class);

}

}
