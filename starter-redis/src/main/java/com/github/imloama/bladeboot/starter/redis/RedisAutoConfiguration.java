package com.github.imloama.bladeboot.starter.redis;

import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Bean
public class RedisAutoConfiguration implements  BladeLoader {

    @Override
    public void load(Blade blade) {
        //加载redis的配置
//        blade.ioc().addBean();
    }
}
