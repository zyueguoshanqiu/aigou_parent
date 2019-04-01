package cn.itsource.aigou.service.impl;

import cn.itsource.aigou.domain.Brand;
import cn.itsource.aigou.mapper.BrandMapper;
import cn.itsource.aigou.query.BrandQuery;
import cn.itsource.aigou.service.IBrandService;
import cn.itsource.aigou.util.LetterUtil;
import cn.itsource.aigou.util.PageList;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author zy
 * @since 2019-03-30
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public PageList<Brand> queryPage(BrandQuery query) {
        long total = 0L;
        total = brandMapper.queryPageCount(query);
        if (total == 0) {
            return new PageList<>();
        } else {
            List<Brand> list = brandMapper.queryPageList(query);
            return new PageList<>(total, list);
        }
    }
    @Override
    public boolean insert(Brand entity) {
        entity.setCreateTime(new Date().getTime());
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()));
        return super.insert(entity);
    }

    @Override
    public boolean updateById(Brand entity) {
        entity.setUpdateTime(new Date().getTime());
        entity.setFirstLetter(LetterUtil.getFirstLetter(entity.getName()));
        return super.updateById(entity);
    }
}
