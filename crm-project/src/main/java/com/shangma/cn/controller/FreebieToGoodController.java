package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.FreebieToGood;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.FreebieToGoodService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("freebieToGood")
public class FreebieToGoodController extends BaseController {

    @Autowired
    private FreebieToGoodService freebieToGoodService;

    @GetMapping
    public AxiosResult<PageVo<FreebieToGood>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<FreebieToGood> page = freebieToGoodService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<FreebieToGood> findById(@PathVariable Long id) {
        return AxiosResult.success(freebieToGoodService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody FreebieToGood entity) {
        return toAxios(freebieToGoodService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody FreebieToGood entity) {
        return toAxios(freebieToGoodService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(freebieToGoodService.batchDeleteByIds(ids));
    }

    @GetMapping("freebieChange/{freebieId}")
    public AxiosResult<Void> freebieChange(@PathVariable Long freebieId){

        return toAxios(freebieToGoodService.freebieChange(freebieId));
    }
}
