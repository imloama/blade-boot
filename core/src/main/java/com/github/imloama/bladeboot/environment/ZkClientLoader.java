package com.github.imloama.bladeboot.environment;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.I0Itec.zkclient.ZkClient;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ZkClientLoader {

    private ZkClientLoader INSTANCE = new ZkClientLoader();

    public ZkClientLoader init(@NonNull  String url, String path){
        ZkClient client = new ZkClient(url);
        if(StringUtils.isBlank(path)){
            path = "/bladebootConfig";
        }
        Map<String,String> attr = client.readData(path);
        //TODO
        return INSTANCE;
    }

}
