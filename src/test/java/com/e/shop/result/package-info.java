/**
 * <p>结果层, 存放结果对象</p>
 * <p>结果对象也是也是参数的一种, 存放在 {@link com.bestv.common.test.environment.ParameterEnvironment} 中</p>
 * <p>与 {@link com.bestv.common.test.annotation.ParameterContainer}配合使用 </p>
 * <p>与 {@link com.bestv.common.test.annotation.Parameter}配合使用 </p>
 * <ul>
 *     <li>在获取结果方法所在的类中打上<code>ParameterContainer</code>注解表明这个类用于获取结果</li>
 *     <li>在获取结果方法上打上<code>Parameter</code>注解表明这个方法用于获取结果, 该方法返回结果必须为 {@link com.bestv.common.lang.result.BaseResult} 类型</li>
 * </ul>
 */
package com.e.shop.result-shop.result;