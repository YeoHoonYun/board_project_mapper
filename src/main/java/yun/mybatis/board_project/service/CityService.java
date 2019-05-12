package yun.mybatis.board_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.repository.CityMapper;

import java.util.List;

@Service
@Transactional
public class CityService {
    @Autowired
    CityMapper cityMapper;

    public City getCityById(Long id) {
        return cityMapper.selectCityById(id);
    }

    public List<City> getAllCity() {
        return cityMapper.selectAllCity();
    }

    public void addCity(String name, String country, Long population) {
        cityMapper.insertCity(name, country, population);
    }
}
