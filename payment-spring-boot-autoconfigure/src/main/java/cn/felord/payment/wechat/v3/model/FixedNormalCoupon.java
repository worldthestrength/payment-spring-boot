/*
 *
 *  Copyright 2019-2022 felord.cn
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
 *
 */
package cn.felord.payment.wechat.v3.model;

import lombok.Data;


/**
 * 固定面额满减券使用规则,	stock_type为NORMAL时必填
 * <p>
 * 满transactionMinimum 减少 couponAmount
 *
 * @author felord.cn
 * @since 1.0.0.RELEASE
 */
@Data
public class FixedNormalCoupon {

    /**
     * 面额，单位分
     */
    private Long couponAmount;
    /**
     * 门槛   满M元可用
     */
    private Long transactionMinimum;

}
