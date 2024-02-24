package com.xuecheng.system.controller;


import com.online.model.content.system.po.Dictionary;
import com.xuecheng.system.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author 青山
 * @since 2024-01-13
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/all")
    public List<Dictionary> queryAll(){
        return dictionaryService.queryAll();
    }


}

