package com.victor.dan.service;

import com.victor.dan.domain.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;
/**
 * @author victor
 */
public interface MenuService extends IService<Menu> {
    /**
     * 根据用户名获取用户权限
     * @param username
     * @return
     */
    List<Menu> findUserPermissions(String username);

    /**
     * 根据用户名获取用户菜单信息
     * @param username
     * @return
     */
    List<Menu> findUserMenus(String username);

    /**
     * 根据菜单查询，封装为map
     * @param menu
     * @return
     */
    Map<String, Object> findMenus(Menu menu);

    /**
     * 查询菜单列表
     * @param menu
     * @return
     */
    List<Menu> findMenuList(Menu menu);

    /**
     * 创建菜单
     * @param menu
     */
    void createMenu(Menu menu);

    /**
     * 更新菜单
     * @param menu
     * @throws Exception
     */
    void updateMenu(Menu menu) throws Exception;

    /**
     * 递归删除菜单/按钮
     * @param menuIds
     * @throws Exception
     */
    void deleteMeuns(String[] menuIds) throws Exception;

}
