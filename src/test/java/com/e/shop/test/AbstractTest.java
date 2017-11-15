package com.e.shop.test;

import com.bestv.common.test.util.TestBase;
import com.e.shop.Starter;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>测试基类, 所有的测试都要继承这个类</p>
 * <p>每个继承这个类的类都要在 resources/cases 文件夹下有个同名的csv测试用例文件, 例如AccessManageFacade.java 配 AccessManageFacade.csv </p>
 * Created by zjm on 2017/7/4.
 */
@SpringBootTest(classes = Starter.class)
public abstract class AbstractTest extends TestBase
{

}
