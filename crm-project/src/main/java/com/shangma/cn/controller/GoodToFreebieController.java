package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.FreebieDto;
import com.shangma.cn.entity.FreebieToGood;
import com.shangma.cn.entity.GoodToFreebie;
import com.shangma.cn.service.FreebieToGoodService;
import com.shangma.cn.service.GoodToFreebieService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goodToFreebie")
public class GoodToFreebieController extends BaseController {

    @Autowired
    private GoodToFreebieService goodToFreebieService;

    @GetMapping
    public AxiosResult<PageVo<GoodToFreebie>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<GoodToFreebie> page = goodToFreebieService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<GoodToFreebie> findById(@PathVariable Long id) {
        return AxiosResult.success(goodToFreebieService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody GoodToFreebie entity) {
        return toAxios(goodToFreebieService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody GoodToFreebie entity) {
        return toAxios(goodToFreebieService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(goodToFreebieService.batchDeleteByIds(ids));
    }

    @GetMapping("goodChange/{goodId}")
    public AxiosResult<Void> freebieChange(@PathVariable Long goodId){

        return toAxios(goodToFreebieService.goodChange(goodId));
    }

    @PostMapping("findAll")
    public AxiosResult<PageVo<GoodToFreebie>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize,
            @RequestBody FreebieDto freebieDto){

        PageHelper.startPage(currentPage, pageSize);
        PageVo<GoodToFreebie> page = goodToFreebieService.find(freebieDto);
        return AxiosResult.success(page);


    }

}
