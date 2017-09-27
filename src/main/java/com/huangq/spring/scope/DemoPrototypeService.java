package com.huangq.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by hq on 17/9/27.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
