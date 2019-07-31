package cc.mrbird.febs.system.dao;

import cc.mrbird.febs.system.domain.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author victor
 */
public interface DeptMapper extends BaseMapper<Dept> {

	/**
	 * 递归删除部门
	 *
	 * @param deptId deptId
	 */
	void deleteDepts(@Param("id")String deptId);
}