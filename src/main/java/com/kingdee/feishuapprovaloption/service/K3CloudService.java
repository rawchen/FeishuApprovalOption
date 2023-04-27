package com.kingdee.feishuapprovaloption.service;

import com.kingdee.feishuapprovaloption.entity.ApprovalSelectOutResult;
import com.kingdee.feishuapprovaloption.entity.ExternalOptionsParams;

/**
 * @author RawChen
 * @date 2023-04-25 11:59
 */
public interface K3CloudService {

	ApprovalSelectOutResult empinfo(ExternalOptionsParams params);

	ApprovalSelectOutResult department(ExternalOptionsParams params);

	ApprovalSelectOutResult organizations(ExternalOptionsParams params);

	ApprovalSelectOutResult currency(ExternalOptionsParams params);

	ApprovalSelectOutResult expense(ExternalOptionsParams params);
}
