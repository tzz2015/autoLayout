package com.autolayout.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zjl.autolayout.AutoUtils;

/**
 * 杭州融科网络
 * 刘宇飞创建 on 2017/5/19.
 * 描述：http://blog.csdn.net/zhengjingle/article/details/51742839
 */

public class MianFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main, null);
        AutoUtils.auto(view);
        return view;
    }
}
