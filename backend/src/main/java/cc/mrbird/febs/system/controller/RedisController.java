package cc.mrbird.febs.system.controller;

import cc.mrbird.febs.common.annotation.Log;
import cc.mrbird.febs.common.domain.FebsResponse;
import cc.mrbird.febs.common.domain.RedisInfo;
import cc.mrbird.febs.common.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author victor
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @Log("Redis基本信息")
    @GetMapping("info")
    public FebsResponse getRedisInfo() throws Exception {
        List<RedisInfo> infoList = this.redisService.getRedisInfo();
        return new FebsResponse().data(infoList);
    }
    @Log("Redis的keys的size")
    @GetMapping("keysSize")
    public Map<String, Object> getKeysSize() throws Exception {
        return redisService.getKeysSize();
    }
    @Log("Redis的内存信息")
    @GetMapping("memoryInfo")
    public Map<String, Object> getMemoryInfo() throws Exception {
        return redisService.getMemoryInfo();
    }
}
