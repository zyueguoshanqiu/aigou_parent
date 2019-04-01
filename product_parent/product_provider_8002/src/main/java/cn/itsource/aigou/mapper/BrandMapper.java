package cn.itsource.aigou.mapper;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 品牌信息 Mapper 接口
 * </p>
 *
 * @author zy
 * @since 2019-03-30
 */
public interface BrandMapper extends BaseMapper<Brand> {

    long queryPageCount(BrandQuery query);

    List<Brand> queryPageList(BrandQuery query);
}
