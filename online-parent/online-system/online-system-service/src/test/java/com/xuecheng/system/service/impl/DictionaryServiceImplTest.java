package com.xuecheng.system.service.impl;

import com.online.model.content.system.po.Dictionary;
import com.xuecheng.system.SystemServiceApplication;
import com.xuecheng.system.service.DictionaryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = SystemServiceApplication.class)
@ExtendWith(value = SpringExtension.class)
class DictionaryServiceImplTest {
    @Autowired
    private DictionaryService dictionaryService;
    @Test
    void queryAll() {
        List<Dictionary> list = dictionaryService.queryAll();
        for (Dictionary dictionary : list) {
            System.out.println(dictionary);
        }
    }
}