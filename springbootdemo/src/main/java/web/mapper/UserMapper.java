package web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import web.pojo.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserAll();
}
