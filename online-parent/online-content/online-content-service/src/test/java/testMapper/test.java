package testMapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.online.base.model.PageParams;

import com.online.base.model.PageResult;
import com.online.content.ServiceContentApplication;

import com.online.content.mapper.CourseBaseMapper;

import com.online.content.service.CourseBaseService;
import com.online.model.content.dto.QueryCourseParamsDto;
import com.online.model.content.po.CourseBase;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = ServiceContentApplication.class)
@RunWith(SpringRunner.class)
public class test {
    @Autowired
    private CourseBaseMapper courseBaseMapper;
    @Autowired
    private CourseBaseService courseBaseService;

    @Test
    public void testService(){
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java");
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1L);
        pageParams.setPageSize(2L);
        PageResult<CourseBase> courseBasePageResult = courseBaseService.queryCourseBaseList(pageParams, courseParamsDto);
        System.out.println(courseBasePageResult);
    }
}
