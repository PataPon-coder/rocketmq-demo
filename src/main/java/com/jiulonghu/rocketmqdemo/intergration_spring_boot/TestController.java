package com.jiulonghu.rocketmqdemo.intergration_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

/** 
* @FileName TestController.java
* @Description:TODO
* @author JackHisen(gu.weidong)
* @version V1.0
* @createtime 2018年3月22日 下午7:07:24 
* 修改历史：
* 时间           作者          版本        描述
*====================================================  
*
*/
@RestController
public class TestController {
	@Autowired
	RocketMQProvider rocketMQProvider;
	@RequestMapping("/testMQ")
	public String testMq() {
		rocketMQProvider.defaultMQProducer();
		return null;
	}
}