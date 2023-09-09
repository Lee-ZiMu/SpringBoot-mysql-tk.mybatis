package org.example.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Controller公共组件
 */
public abstract class BaseController {

    /**
     * 封装分页返回信息
     *
     * @param pageInfo
     * @return
     */
    private Map<String, Object> getDataTable(PageInfo<?> pageInfo) {
        Map<String, Object> rspData = new HashMap<>();
        rspData.put("list", pageInfo.getList());
        rspData.put("total", pageInfo.getTotal());
        rspData.put("pageNumber", pageInfo.getPageNum());
        rspData.put("pageSize", pageInfo.getPageSize());
        return rspData;
    }

    /**
     * 分页查询
     *
     * @param request
     * @param s
     * @return
     */
    protected Map<String, Object> findPages(QueryRequest request, Supplier<?> s) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        PageInfo<?> pageInfo = new PageInfo<>((List<?>) s.get());
        PageHelper.clearPage();
        return getDataTable(pageInfo);
    }

}
