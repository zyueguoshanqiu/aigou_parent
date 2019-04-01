package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.domain.ProductType;
import cn.itsource.aigou.mapper.ProductTypeMapper;
import cn.itsource.aigou.service.IProductTypeService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author zy
 * @since 2019-03-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> treeData() {
//        return treeDataRecursion(0l);
        return treeDataLoop();

    }

    private List<ProductType> treeDataLoop() {
        //1：查询所有的数据：
        List<ProductType> allProductTypes = productTypeMapper.selectList(null);
        //获取到所有的数据的key--value的键值对：
        Map<Long,ProductType> map=new HashMap<>();
        for (ProductType pt : allProductTypes) {
            map.put(pt.getId(),pt);
        }
        //最终返回的结果：一级菜单
        List<ProductType> result=new ArrayList<>();

        //2：遍历：组装父子结构：
        for (ProductType currentProductType : allProductTypes) {
            //2.1：判断是否是一级菜单：
            if(currentProductType.getPid()==0){
                // 是一级菜单：返回
                result.add(currentProductType);
            }else{
                ProductType parent =map.get(currentProductType.getPid());
                parent.getChildren().add(currentProductType);
            }

        }

        return result;
    }

     public List<ProductType> treeDataRecursion(long id) {
         List<ProductType> childByPid = getChildByid(id);
         if(childByPid==null||childByPid.size()==0){
             return null;
         }
         for (ProductType productType : childByPid) {
             productType.setChildren(treeDataRecursion(productType.getId()));
         }
         return childByPid;

    }

    public List<ProductType> getChildByid(Long id){
        Wrapper<ProductType> wrapper = new EntityWrapper<>();
        wrapper.eq("pid", id);
        return productTypeMapper.selectList(wrapper);

    }
}
