package com.zze0.demo.shardingjdbc.sharding;

import com.alibaba.fastjson.JSON;
import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

public final class ModuloHintShardingAlgorithm implements HintShardingAlgorithm<String> {

    private static final Logger logger = LoggerFactory.getLogger(ModuloHintShardingAlgorithm.class);

    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<String> hintShardingValue) {
        Collection<String> result = new ArrayList<>();

        for (String each : collection) {
            for (String value : hintShardingValue.getValues()) {
                if (each.endsWith(value)) {
                    result.add(each);
                }
            }
        }
        if(logger.isInfoEnabled()) {
            logger.info("hint sharding ds result: {}", JSON.toJSONString(result));
        }
        return result;
    }
}
