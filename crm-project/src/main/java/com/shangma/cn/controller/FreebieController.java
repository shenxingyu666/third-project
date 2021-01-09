package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.Good;
import com.shangma.cn.service.FreebieService;
import com.shangma.cn.service.GoodService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("freebie")
public class FreebieController extends BaseController {

    @Autowired
    private FreebieService freebieService;

    @GetMapping
    public AxiosResult<PageVo<Freebie>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Freebie> page = freebieService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Freebie> findById(@PathVariable Long id) {
        return AxiosResult.success(freebieService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Freebie entity) {
        return toAxios(freebieService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Freebie entity) {
        return toAxios(freebieService.updateEntity(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id) {
        return toAxios(freebieService.deleteById(id));
    }

    @GetMapping("findAllFreebie")
    public  AxiosResult<PageVo<Freebie>> findAllFreebie(){
        PageVo<Freebie> all = freebieService.findAll();
        return AxiosResult.success(all);
    }
}
