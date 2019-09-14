package chengmo.soft.mes.service;


import chengmo.soft.mes.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService extends BaseService<City>{
    public List<City> queryAll();
}

