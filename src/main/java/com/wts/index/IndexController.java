package com.wts.index;

import com.jfinal.core.Controller;

/**
 *
 * IndexController
 */
public class IndexController extends Controller {
	public void index() {
		renderText("你好");
	}
}



