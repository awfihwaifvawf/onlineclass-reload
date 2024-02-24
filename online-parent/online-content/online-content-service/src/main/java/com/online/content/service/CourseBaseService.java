package com.online.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.online.base.model.PageParams;
import com.online.base.model.PageResult;

import com.online.model.content.dto.QueryCourseParamsDto;
import com.online.model.content.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author 青山
 * @since 2024-01-13
 */
public interface CourseBaseService extends IService<CourseBase> {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParams);

}
