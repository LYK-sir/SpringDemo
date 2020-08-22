package org.motinyu.config;

import org.motinyu.MyFilter;
import org.motinyu.condition.EnegerCarCondition;
import org.motinyu.condition.OilCarCondition;
import org.motinyu.entity.Car;
import org.motinyu.entity.EnegerCar;
import org.motinyu.entity.OilCar;
import org.motinyu.entity.Student;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
/*给扫描器指定规则 过滤条件  includeFilters（包含） ANNOTATION  useDefaultFilters（禁止默认行为）*/
/*
@ComponentScan(value="org.motinyu",includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)},useDefaultFilters = false )
*/
/*excludeFilters（排除） 被Controller注解的类*/
/*
@ComponentScan(value="org.motinyu",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)}  )
*/

@ComponentScan(value="org.motinyu",includeFilters = {@ComponentScan.Filter(type =FilterType.CUSTOM ,value={MyFilter.class})},useDefaultFilters = false  )

public class MyConfig {

    @Bean  /**id="myStudent" */
    @Scope("prototype")/*定义该Bean的作用域为多对象实例  单例作用域singleton*/
    public Student myStudent(){
        Student student =new Student(1,"luyukun",23);
        return student;
    }

    @Bean
    @Conditional(OilCarCondition.class)/*条件注解*/
    public Car oilCar(){
        return new OilCar();
    }

    @Bean
    @Conditional(EnegerCarCondition.class)/*条件注解*/
    public Car enegerCar(){
        return new EnegerCar();
    }

}
