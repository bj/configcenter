/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-08-20 15:31 创建
 */
package org.antframework.configcenter.biz.provider;

import org.antframework.configcenter.facade.api.manage.ProfileManageService;
import org.antframework.configcenter.facade.order.manage.AddOrModifyProfileOrder;
import org.antframework.configcenter.facade.order.manage.DeleteProfileOrder;
import org.antframework.configcenter.facade.order.manage.FindAllProfileOrder;
import org.antframework.configcenter.facade.order.manage.QueryProfileOrder;
import org.antframework.configcenter.facade.result.manage.AddOrModifyProfileResult;
import org.antframework.configcenter.facade.result.manage.DeleteProfileResult;
import org.antframework.configcenter.facade.result.manage.FindAllProfileResult;
import org.antframework.configcenter.facade.result.manage.QueryProfileResult;
import org.bekit.service.ServiceEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 环境管理服务提供者
 */
@Service
public class ProfileManageServiceProvider implements ProfileManageService {
    @Autowired
    private ServiceEngine serviceEngine;

    @Override
    public AddOrModifyProfileResult addOrModifyProfile(AddOrModifyProfileOrder order) {
        return serviceEngine.execute("addOrModifyProfileService", order);
    }

    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileOrder order) {
        return serviceEngine.execute("deleteProfileService", order);
    }

    @Override
    public FindAllProfileResult findAllProfile(FindAllProfileOrder order) {
        return serviceEngine.execute("findAllProfileService", order);
    }

    @Override
    public QueryProfileResult queryProfile(QueryProfileOrder order) {
        return serviceEngine.execute("queryProfileService", order);
    }
}
