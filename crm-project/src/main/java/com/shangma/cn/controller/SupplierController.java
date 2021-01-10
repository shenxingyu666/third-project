package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController {

    
    @Autowired
    private SupplierService supplierService;

    @GetMapping
    public AxiosResult<PageVo<Supplier>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Supplier> page = supplierService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Supplier> findById(@PathVariable Long id) {
        return AxiosResult.success(supplierService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Supplier entity) {
        return toAxios(supplierService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(supplierService.batchDeleteByIds(ids));
    }


    @GetMapping("findAllSupplier")
    public  AxiosResult<PageVo<Supplier>> findAllSupplier(){
        PageVo<Supplier> all = supplierService.findAll();
        return AxiosResult.success(all);
    }

}
