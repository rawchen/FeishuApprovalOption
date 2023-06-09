/**
 * 通用类包
 */
package com.kingdee.feishuapprovaloption.entity.base;

/**
 * 所有状态枚举类型接口
 *
 * @param <T> 枚举类型的code值，一般用来保存到数据库或传送到客户端
 * @author TangGang
 */
public interface IEnum<T> {
	/**
	 * 返回当前枚举值，该值主要用于保存到数据库<br>
	 * 因为枚举序列值有可能发生变化，所以不能作为持久化内容
	 *
	 * @return 枚举代码
	 */
	T getCode();

	/**
	 * 枚举值的默认标签内容<br>
	 * 如可在代码里指定为中文标签，将来如果需要使用资源包则可根据{@link #getResourceKey()}的值从资源包中获取
	 *
	 * @return 枚举标签
	 */
	String getDefaultLabel();

	/**
	 * 枚举值的多语言支持对应的资源key
	 *
	 * @return 资源Key
	 */
	String getResourceKey();
}
