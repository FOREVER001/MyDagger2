package com.client.mydagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    @Provides
    public Student getStudent(){
        return new Student("张三");
    }
}
