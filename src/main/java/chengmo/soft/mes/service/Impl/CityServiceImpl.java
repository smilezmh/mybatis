package chengmo.soft.mes.service.Impl;


import java.util.List;

import chengmo.soft.mes.dao.CityMapper;
import chengmo.soft.mes.entity.City;
import chengmo.soft.mes.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper=null;

    @Override
    public Integer add(City t) {
        return cityMapper.insertSelective(t);
    }

    @Override
    public Integer delete(int id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public City queryById(int id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<City> queryAll() {
        return cityMapper.queryAll();
    }

    @Override
    public Integer update(City t) {
        return cityMapper.updateByPrimaryKeySelective(t);
    }
}
