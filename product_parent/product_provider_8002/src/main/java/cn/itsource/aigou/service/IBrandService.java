package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.aigou.util.PageList;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author zy
 * @since 2019-03-30
 */
public interface IBrandService extends IService<Brand> {

    PageList<Brand> queryPage(BrandQuery query);
}
