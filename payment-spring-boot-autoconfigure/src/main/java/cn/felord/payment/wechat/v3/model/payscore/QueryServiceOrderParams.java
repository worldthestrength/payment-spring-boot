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
package cn.felord.payment.wechat.v3.model.payscore;

import lombok.Data;

/**
 * 查询支付分订单请求参数
 *
 * @author felord.cn
 * @since 1.0.2.RELEASE
 */
@Data
public class QueryServiceOrderParams {
    /**
     * 商户服务订单号，同{@link QueryServiceOrderParams#queryId} 二选一，而且不能同时为null
     */
    private String outOrderNo;
    /**
     * 回跳查询ID，同{@link QueryServiceOrderParams#outOrderNo} 二选一，而且不能同时为null
     */
    private String queryId;
    /**
     * 服务ID，必填
     */
    private String serviceId;
}
