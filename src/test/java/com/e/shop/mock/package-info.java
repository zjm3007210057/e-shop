/**
 * <p>mock层, 存放mock逻辑</p>
 * <p>与 {@link com.bestv.common.test.annotation.MockContainer}配合使用 </p>
 * <p>与 {@link com.bestv.common.test.annotation.ProcessMock}配合使用 </p>
 * <ul>
 *     <li>在mock方法所在的类中打上<code>MockContainer</code>注解表明这个类用于mock</li>
 *     <li>在mock方法上打上<code>ProcessMock</code>注解表明这个方法用于mock, 该方法返回结果必须为 {@link com.bestv.common.test.domain.MockContext} 类型</li>
 * </ul>
 */
package com.e.shop.mock-shop.mock;