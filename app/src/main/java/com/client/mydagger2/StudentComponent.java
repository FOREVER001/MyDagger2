package com.client.mydagger2;

import dagger.Component;

@Component(modules = StudentModule.class) //快递员拿到了包裹
public interface StudentComponent {
    //送到收获地址---注入到Activity
    void injectMainActivity(MainActivity mainActivity);
}
