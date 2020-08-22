package org.motinyu.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OilCarCondition implements Condition {
    /*当前环境是Oil，则加入OilCar*/
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        /*获取环境*/
        Environment environment = conditionContext.getEnvironment();
        String environmentProperty = environment.getProperty("car.type");/*car.type=Oil*/
        if(environmentProperty.contains("oil")){
            return true;
        }
        return false;
    }
}
