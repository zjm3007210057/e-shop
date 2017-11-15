/**
 * <p>参数层, 存放参数</p>
 * <p>参数通过 {@link com.bestv.common.test.environment.ParameterEnvironment} 获取</p>
 * <p>与 {@link com.bestv.common.test.annotation.ParameterContainer}配合使用 </p>
 * <p>与 {@link com.bestv.common.test.annotation.Parameter}配合使用 </p>
 * <ul>
 *     <li>在获取参数方法所在的类中打上<code>ParameterContainer</code>注解表明这个类用于获取参数</li>
 *     <li>在获取参数方法上打上<code>Parameter</code>注解表明这个方法用于获取参数</li>
 * </ul>
 */
package com.e.shop.param-shop.param;