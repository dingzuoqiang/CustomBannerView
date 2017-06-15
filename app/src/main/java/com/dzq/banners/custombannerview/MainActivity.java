package com.dzq.banners.custombannerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dzq.banners.custombannerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CustomBannerView customBannerView;
    boolean slideable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideable = !slideable;
                customBannerView.setSlideable(slideable);
                Toast.makeText(MainActivity.this, "最上方view可滑动：" + slideable, Toast.LENGTH_SHORT).show();
            }
        });

        customBannerView = (CustomBannerView) findViewById(R.id.banner);
        List<Integer> viewRes = new ArrayList<>();
        viewRes.add(R.drawable.a1);
        viewRes.add(R.drawable.a2);
        viewRes.add(R.drawable.a3);
        viewRes.add(R.drawable.a4);
        viewRes.add(R.drawable.a5);
        customBannerView.setViewRes(viewRes);

//        List<String> urls = new ArrayList<>();
//        urls.add("http://pic.58pic.com/58pic/13/20/45/08h58PICR7Y_1024.jpg");
//        urls.add("http://pic36.nipic.com/20131227/10080014_160615476000_2.jpg");
//        urls.add("http://img3.3lian.com/2013/v10/4/d/81.jpg");
//        urls.add("http://pic9.nipic.com/20100814/668573_170129076821_2.jpg");
//        customBannerView.setViewUrls(urls);
//        customBannerView.setOnBannerItemClickListener(new CustomBannerView.OnBannerItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
//            }
//        });

        CustomBannerView customBannerView2 = (CustomBannerView) findViewById(R.id.banner2);

        customBannerView2.setViewRes(viewRes);

        CustomBannerView customBannerView3 = (CustomBannerView) findViewById(R.id.banner3);
        customBannerView3.setLoop(false);
        customBannerView3.setViewRes(viewRes);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
