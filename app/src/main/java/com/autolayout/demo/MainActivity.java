package com.autolayout.demo;

import android.app.Activity;
import android.os.Bundle;

import com.zjl.autolayout.AutoUtils;
/**
 * 
 * @author ZhengJingle
 *http://blog.csdn.net/zhengjingle/article/details/51742839
 */
public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		AutoUtils.auto(this);
		
	}

	
}
