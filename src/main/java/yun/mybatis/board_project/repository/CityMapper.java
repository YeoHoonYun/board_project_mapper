package yun.mybatis.board_project.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import yun.mybatis.board_project.model.City;

import java.util.List;

@Mapper
@Component
public interface CityMapper {
    @Select("SELECT ID,NAME, COUNTRY ,POPULATION FROM city WHERE ID = #{id}")
    City selectCityById(@Param("id") Long id);

    @Select("SELECT ID,NAME, COUNTRY ,POPULATION FROM city")
    List<City> selectAllCity();

    @Insert("INSERT INTO CITY (NAME, COUNTRY, POPULATION) VALUES (#{name}, #{country}, #{population})")
    void insertCity(@Param("name") String name, @Param("country") String country, @Param("population") Long population);
}
