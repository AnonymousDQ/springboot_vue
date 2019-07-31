package cc.mrbird.febs.system.dao;

import cc.mrbird.febs.system.domain.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author victor
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 根据用户名查询用户的权限
     * @param userName
     * @return
     */
    List<Menu> findUserPermissions(String userName);

    /**
     * 根据用户名查询用户拥有的菜单
     * @param userName
     * @return
     */
    List<Menu> findUserMenus(String userName);

    /**
     * 查找当前菜单/按钮关联的用户 ID
     *
     * @param menuId menuId
     * @return 用户 ID集合
     */
    List<String> findUserIdsByMenuId(String menuId);

    /**
     * 递归删除菜单/按钮
     *
     * @param menuId menuId
     */
    void deleteMenus(String menuId);
}