package com.nxj.review.dto.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nxj.review.dto.Result;
import com.nxj.review.entity.Voucher;

public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
