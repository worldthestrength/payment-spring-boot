/*
 *  Copyright 2019-2021 felord.cn
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.felord.payment.wechat.v3.model.payscore;

import lombok.Data;

import java.time.LocalDate;

/**
 * 直连商户-商户申请获取对账单API参数
 *
 * @author felord.cn
 * @since 1.0.13.RELEASE
 */
@Data
public class PayScoreBillParams {

    /**
     * 账单日期，必传。
     * <p>
     * 格式yyyy-MM-DD，仅支持三个月内的账单下载申请。
     */
    private LocalDate billDate;
    /**
     * 支付分服务ID，必传。
     */
    private String serviceId;

}
