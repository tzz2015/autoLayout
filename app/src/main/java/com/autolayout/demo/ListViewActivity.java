package com.autolayout.demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zjl.autolayout.AutoUtils;

/**
 * @author ZhengJingle
 * http://blog.csdn.net/zhengjingle/article/details/51742839
 */
public class ListViewActivity extends Activity {

    RecyclerView recyclerView;
    MyAdapter adapter;

    String[] datas = {
            "辅导费",
            "梵蒂冈地方", "发给对方",
            "android:bufferType"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO �Զ����ɵķ������
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        AutoUtils.auto(this);//


        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView1);
        recyclerView.setAdapter(new MyAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private class MyAdapter extends
            RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        @Override
        public int getItemCount() {
            return datas.length;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv_comment.setText(datas[position]);
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // TODO �Զ����ɵķ������
            View view = View.inflate(ListViewActivity.this, R.layout.list_item, null);

            MyViewHolder viewHolder = new MyViewHolder(view);

            return viewHolder;
        }

        class MyViewHolder extends ViewHolder {
            public View view;
            public TextView tv_name, tv_comment, tv_like, tv_ding;
            public ImageView iv_head;

            public MyViewHolder(View view) {
                super(view);
                this.view = view;

                tv_name = (TextView) view.findViewById(R.id.textView1);
                tv_comment = (TextView) view.findViewById(R.id.textView2);
                tv_like = (TextView) view.findViewById(R.id.textView3);
                tv_ding = (TextView) view.findViewById(R.id.textView4);
                iv_head = (ImageView) view.findViewById(R.id.imageView2);

                AutoUtils.auto(view);
            }
        }

    }

}
