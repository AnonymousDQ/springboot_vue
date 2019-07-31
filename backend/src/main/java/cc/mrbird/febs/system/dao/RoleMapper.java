package cc.mrbird.febs.system.dao;

import cc.mrbird.febs.system.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author victor
 */
public interface RoleMapper extends BaseMapper<Role> {
	/**
	 * 根据用户名查询角色列表
	 * @param userName
	 * @return
	 */
	List<Role> findUserRole(String userName);
	
}