package com.github.imloama.bladeboot;


import com.blade.Blade;

public final class BladeApplication {

    private BladeApplication(){}

    private static final Blade INSTANCE = Blade.of();


    public static void run(String ...args){
        run(null, args);
    }

    public static void run(Class clasz, String ...args){
        // 读取配置文件

        // 启动应用
        INSTANCE.start(clasz, args);
    }


}
