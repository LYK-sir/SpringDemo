package org.motinyu.test;

import org.motinyu.config.MyConfig;
import org.motinyu.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void forApplication(){
        /*获取配置文件applicationCOntext.xml,取出Bean对象*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       /* Student student = (Student) context.getBean("student");
        System.out.println(student);*/
        String[] ids = context.getBeanDefinitionNames();
        for(String id :ids){
            System.out.println(id);
        }
    }

    public  static  void forAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

       /*获取所有Bean的名字*/
       String[] ids = context.getBeanDefinitionNames();
        for(String id :ids){
            System.out.println(id);
        }

      /* Student student1 = (Student) context.getBean("myStudent");
        Student student2 = (Student) context.getBean("myStudent");
        System.out.println(student1==student2);*/


    }

    public static void main(String [] args){
        forAnnotation();
    }

}
