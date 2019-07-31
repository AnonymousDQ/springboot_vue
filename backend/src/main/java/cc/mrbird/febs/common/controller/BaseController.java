package cc.mrbird.febs.common.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author victor
 * @description:基础Controller
 */
public class BaseController {
    /**
     * 封装好的响应体
     * @param pageInfo
     * @return
     */
    protected Map<String, Object> getDataTable(IPage<?> pageInfo) {
        Map<String, Object> rspData = new HashMap<>();
        rspData.put("rows", pageInfo.getRecords());
        rspData.put("total", pageInfo.getTotal());
        return rspData;
    }


}
