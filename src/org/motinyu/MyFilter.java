package org.motinyu;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        /*扫描器扫描"org.motinyu"包中所有的类，getClassName（）可以获取该包中所有被三层注解的类*/
        String className = classMetadata.getClassName();
        /*只过滤出和学生相关的三层组件*/
        if(className.contains("Student")){
            return true;
        }
        return false;
    }
}
