package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.GoodDTO;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Freebie;
import com.shangma.cn.entity.Good;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.GoodService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("good")
public class GoodController extends BaseController {

    @Autowired
    private GoodService goodService;

    @GetMapping
    public AxiosResult<PageVo<Good>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Good> page = goodService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Good> findById(@PathVariable Long id) {
        return AxiosResult.success(goodService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Good entity) {
        return toAxios(goodService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Good entity) {
        return toAxios(goodService.updateEntity(entity));
    }

    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteById(@PathVariable Long id) {
        return toAxios(goodService.deleteById(id));
    }

    @GetMapping("findAllgood")
    public  AxiosResult<PageVo<Good>> findAllgood(){
        PageVo<Good> all = goodService.findAll();
        return AxiosResult.success(all);
    }


    @PostMapping("findAll")
    public AxiosResult<PageVo<Good>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize,
            @RequestBody GoodDTO goodDTO){

        PageHelper.startPage(currentPage, pageSize);
        PageVo<Good> page = goodService.findGood(goodDTO);
        return AxiosResult.success(page);


    }

}
