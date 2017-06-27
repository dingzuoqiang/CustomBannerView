

一个简单方便的轮播图，可设置 项目中图片，网络图片，以及 View
支持自动播放，手势触摸，item点击事件,点点的样式宽高、颜色、大小、位置   蒙层等。

   <com.dzq.widget.CustomBannerView
           android:id="@+id/banner"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_weight="1"
           app:autoPlayDuration="2000"
           app:defaultImage="@drawable/bg_banner"
           app:indicatorMargin="@dimen/indicatorMargin"
           app:indicatorPosition="rightBottom"
           app:indicatorShape="oval"
           app:indicatorSpace="@dimen/indicatorSpace"
           app:isAutoPlay="true"
           app:isIndicatorVisible="true"
           app:scrollDuration="1000"
           app:selectedIndicatorColor="@color/color_ec407a"
           app:selectedIndicatorHeight="5dp"
           app:selectedIndicatorWidth="5dp"
           app:unSelectedIndicatorColor="@color/color_71d9e7"
           app:unSelectedIndicatorHeight="5dp"
           app:unSelectedIndicatorWidth="5dp"

           />

       <com.dzq.widget.CustomBannerView
           android:id="@+id/banner2"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_marginTop="5dp"
           android:layout_weight="1"
           app:autoPlayDuration="2000"
           app:defaultImage="@drawable/bg_banner"
           app:indicatorMargin="@dimen/indicatorMargin"
           app:indicatorPosition="rightBottom"
           app:indicatorShape="rect"
           app:indicatorSpace="@dimen/indicatorSpace"
           app:isAutoPlay="false"
           app:isIndicatorVisible="true"
           app:scrollDuration="1000"
           app:selectedIndicatorColor="@color/color_ec407a"
           app:selectedIndicatorHeight="5dp"
           app:selectedIndicatorWidth="10dp"
           app:unSelectedIndicatorColor="@color/color_71d9e7"
           app:unSelectedIndicatorHeight="10dp"
           app:unSelectedIndicatorWidth="5dp"

           />

       <com.dzq.widget.CustomBannerView
           android:id="@+id/banner3"
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:layout_marginTop="5dp"
           android:layout_weight="1"
           app:cornerRadii="5dp"
           app:indicatorMargin="@dimen/indicatorMargin"
           app:indicatorPosition="centerTop"
           app:indicatorShape="rect"
           app:indicatorSpace="@dimen/indicatorSpace"
           app:isAutoPlay="false"
           app:isIndicatorVisible="true"
           app:maskEndColor="#00000000"
           app:maskStartColor="#99000000"
           app:scrollDuration="1000"
           app:selectedIndicatorColor="#00CAA9"
           app:selectedIndicatorHeight="10dp"
           app:selectedIndicatorWidth="25dp"
           app:unSelectedIndicatorColor="#26000000"
           app:unSelectedIndicatorHeight="10dp"
           app:unSelectedIndicatorWidth="10dp" />