package yun.mybatis.board_project;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.service.CityService;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional(transactionManager = "transactionManager")
@Commit
public class CityServiceTest extends DefaultTransactionDefinition {
    @Autowired
    CityService service;

    @Test
    public void getCityById() {
        City city = service.getCityById(1L);
        System.out.println("TEST : " + city);
        log.info("city : {}", city);
    }

    @Test
    public void getAllCity() {
        List<City> cities = service.getAllCity();
        for(City city : cities){
            System.out.println(city);
        };
    }


    @Test
    public void addCities() {
        service.addCity("뉴욕", "미국", 1_000_000L);
        service.addCity("런던", "영국", 2_000_000L);
        service.addCity("파리", "프랑스", 3_000_000L);
        this.getAllCity();
    }
}
