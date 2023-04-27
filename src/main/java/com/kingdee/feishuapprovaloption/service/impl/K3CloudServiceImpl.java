package com.kingdee.feishuapprovaloption.service.impl;

import com.alibaba.fastjson.JSON;
import com.kingdee.bos.webapi.sdk.K3CloudApi;
import com.kingdee.feishuapprovaloption.entity.*;
import com.kingdee.feishuapprovaloption.service.K3CloudService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RawChen
 * @date 2023-04-25 12:00
 */
@Service
public class K3CloudServiceImpl implements K3CloudService {
	@Override
	public ApprovalSelectOutResult empinfo(ExternalOptionsParams params) {
		ApprovalSelectOutResult result = new ApprovalSelectOutResult();
		try {
			List<ApprovalSelectOutField> fields = new ArrayList<>();
			ApprovalSelectOutOptions options = new ApprovalSelectOutOptions();
			K3CloudApi api = new K3CloudApi();
			List<List<Object>> resultList = api.executeBillQuery("{\"FormId\":\"BD_Empinfo\",\"FieldKeys\":\"FNAME,FSTAFFNUMBER\",\"FilterString\":[],\"OrderString\":\"\",\"TopRowCount\":0,\"StartRow\":0,\"Limit\":2000,\"SubSystemId\":\"\"}");
//            for (List<Object> objects : resultList) {
//                for (Object object : objects) {
//                    System.out.print(JSON.toJSONString(object) + "  ");
//                }
//                System.out.println();
//            }
			for (List<Object> list : resultList) {
				if ("0".equals(String.valueOf(list.get(1)).trim())) {
					continue;
				}
				fields.add(new ApprovalSelectOutField().setId(String.valueOf(list.get(1))).setValue(String.valueOf(list.get(0))));
			}
//            result.setResult(FeishuBase64.CBCEncrypter("123456", JSON.toJSONString(options)));
			options.setOptions(fields);
			result.setResult(JSON.toJSONString(options));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ApprovalSelectOutResult department(ExternalOptionsParams params) {
		ApprovalSelectOutResult result = new ApprovalSelectOutResult();
		try {
			List<ApprovalSelectOutField> fields = new ArrayList<>();
			ApprovalSelectOutOptions options = new ApprovalSelectOutOptions();
			K3CloudApi api = new K3CloudApi();
			List<List<Object>> resultList = api.executeBillQuery("{\"FormId\":\"BD_Department\",\"FieldKeys\":\"FNAME,FDEPTID\",\"FilterString\":[],\"OrderString\":\"\",\"TopRowCount\":0,\"StartRow\":0,\"Limit\":2000,\"SubSystemId\":\"\"}");
			for (List<Object> list : resultList) {
				if ("0".equals(String.valueOf(list.get(1)).trim())) {
					continue;
				}
				fields.add(new ApprovalSelectOutField().setId(String.valueOf(list.get(1))).setValue(String.valueOf(list.get(0))));
			}
			options.setOptions(fields);
			result.setResult(JSON.toJSONString(options));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ApprovalSelectOutResult organizations(ExternalOptionsParams params) {
		ApprovalSelectOutResult result = new ApprovalSelectOutResult();
		try {
			List<ApprovalSelectOutField> fields = new ArrayList<>();
			ApprovalSelectOutOptions options = new ApprovalSelectOutOptions();
			K3CloudApi api = new K3CloudApi();
			List<List<Object>> resultList = api.executeBillQuery("{\"FormId\":\"ORG_Organizations\",\"FieldKeys\":\"FNAME,FORGID\",\"FilterString\":[],\"OrderString\":\"\",\"TopRowCount\":0,\"StartRow\":0,\"Limit\":2000,\"SubSystemId\":\"\"}");
			for (List<Object> list : resultList) {
				if ("0".equals(String.valueOf(list.get(1)).trim())) {
					continue;
				}
				fields.add(new ApprovalSelectOutField().setId(String.valueOf(list.get(1))).setValue(String.valueOf(list.get(0))));
			}
			options.setOptions(fields);
			result.setResult(JSON.toJSONString(options));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ApprovalSelectOutResult currency(ExternalOptionsParams params) {
		ApprovalSelectOutResult result = new ApprovalSelectOutResult();
		try {
			List<ApprovalSelectOutField> fields = new ArrayList<>();
			ApprovalSelectOutOptions options = new ApprovalSelectOutOptions();
			K3CloudApi api = new K3CloudApi();
			List<List<Object>> resultList = api.executeBillQuery("{\"FormId\":\"BD_Currency\",\"FieldKeys\":\"FNAME,FCURRENCYID\",\"FilterString\":[],\"OrderString\":\"\",\"TopRowCount\":0,\"StartRow\":0,\"Limit\":2000,\"SubSystemId\":\"\"}");
			for (List<Object> list : resultList) {
				if ("0".equals(String.valueOf(list.get(1)).trim())) {
					continue;
				}
				fields.add(new ApprovalSelectOutField().setId(String.valueOf(list.get(1))).setValue(String.valueOf(list.get(0))));
			}
			options.setOptions(fields);
			result.setResult(JSON.toJSONString(options));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ApprovalSelectOutResult expense(ExternalOptionsParams params) {
		ApprovalSelectOutResult result = new ApprovalSelectOutResult();
		try {
			List<ApprovalSelectOutField> fields = new ArrayList<>();
			ApprovalSelectOutOptions options = new ApprovalSelectOutOptions();
			K3CloudApi api = new K3CloudApi();
			List<List<Object>> resultList = api.executeBillQuery("{\"FormId\":\"BD_Expense\",\"FieldKeys\":\"FNAME,FEXPID\",\"FilterString\":\"FDOCUMENTSTATUS='C'\",\"OrderString\":\"\",\"TopRowCount\":0,\"StartRow\":0,\"Limit\":2000,\"SubSystemId\":\"\"}");
			for (List<Object> list : resultList) {
				if ("0".equals(String.valueOf(list.get(1)).trim())) {
					continue;
				}
				fields.add(new ApprovalSelectOutField().setId(String.valueOf(list.get(1))).setValue(String.valueOf(list.get(0))));
			}
			options.setOptions(fields);
			result.setResult(JSON.toJSONString(options));
			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
