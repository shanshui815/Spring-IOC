# Spring-IOC
 

***

**目的：解耦，消除类与类之间的依赖关系**



![例子](https://github.com/zhangxixian/Spring-IOC/blob/master/img/Spring-IOC-img1.png)

* 第一阶段（代码里未实现）

两个实现类；一个业务逻辑类



* 第二阶段

一个接口；两个实现类；一个业务逻辑类；

* 第三阶段

一个接口；两个实现类；一个业务逻辑类；一个容器类；

>>* 优点
    
	容器类用于获取两个实现类，业务逻辑类里就不用分别去实例化个实现类了选择不同的Generator不需要修改Service
	
>>* 缺点

	1. Container对所管理的所有组件产生了依赖
	2. ReportService对Container依赖，因为其封装有查找逻辑，所以在重用之前还要修改
	
>>* 目标

	去掉ReportService对Container依赖


* 第四阶段 

一个接口；两个实现类；一个业务逻辑类；一个容器类；一个服务定位器；





 
