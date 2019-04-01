package cn.itsource.aigou.service;

import cn.itsource.aigou.domain.ProductType;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * 商品目录 服务类
 * </p>
 *
 * @author zy
 * @since 2019-03-31
 */
public interface IProductTypeService extends IService<ProductType> {

    List<ProductType> treeData();
}
