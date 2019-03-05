package com.github.imloama.bladeboot.core;

import com.blade.Blade;
import com.blade.event.Event;
import com.blade.event.EventType;
import com.blade.kit.reload.FileChangeDetector;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.BindException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardWatchEventKinds;

import static com.blade.mvc.Const.*;

/**
 * 继承blade，重写获取配置文件等处理
 */
@Slf4j
@NoArgsConstructor
public class BladeImpl extends Blade {

}
