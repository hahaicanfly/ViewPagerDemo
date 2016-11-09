package com.example.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.IconPageIndicator;
import com.viewpagerindicator.PageIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View page1,page2,page3;
    private List<View> pageList;

    private PageIndicator mIndicator = null;
    private ViewPager mViewPager;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        init();

        mViewPager = (ViewPager) findViewById(R.id.mPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(pageList);
        mViewPager.setAdapter(adapter);
        mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        mIndicator.setViewPager(mViewPager);

    }

    private void init(){
        LayoutInflater inflater = getLayoutInflater();
        page1 = inflater.inflate(R.layout.page1,null);
        page2 = inflater.inflate(R.layout.page2,null);
        page3 = inflater.inflate(R.layout.page3,null);

        pageList = new ArrayList<View>();
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
    }




}
