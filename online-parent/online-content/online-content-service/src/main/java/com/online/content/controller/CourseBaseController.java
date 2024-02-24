package com.online.content.controller;


import com.online.base.model.PageParams;

import com.online.base.model.PageResult;
import com.online.content.service.CourseBaseService;
import com.online.model.content.dto.QueryCourseParamsDto;
import com.online.model.content.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程基本信息 前端控制器
 * </p>
 *
 * @author 青山
 * @since 2024-01-13
 */
@RestController
@Api(value = "课程信息编辑接口")
@RequestMapping("/course")
public class CourseBaseController {
    @Autowired
    private CourseBaseService courseBaseService;
    @ApiOperation("课程信息分页查询")
    @PostMapping ("/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required=false) QueryCourseParamsDto queryCourseParams){
        PageResult<CourseBase> courseBasePageResult = courseBaseService.queryCourseBaseList(pageParams, queryCourseParams);
        return courseBasePageResult;

    }
}

