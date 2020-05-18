# XLToolBar

详细内容博客地址:[自定义View-XLToolBar](https://fanandjiu.com/%E8%87%AA%E5%AE%9A%E4%B9%89View-XLToolBar/#more)

简介：

模仿系统的ToolBar 

app模块是使用例子，其运行效果：

![](![](https://android-1300729795.cos.ap-chengdu.myqcloud.com/project/Self_View/XLToolBar/XLToolBar.jpg))

### 1. 添加依赖

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
~~~
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
~~~

Step 2. Add the dependency
~~~
dependencies {
    implementation 'com.github.xiaoshitounen:XLToolBar:1.0.0'
}
~~~

### 2. Xml文件中静态添加使用

~~~xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:background="@color/colorAccent">

    <swu.xl.xltoolbar.XLToolBar
        android:id="@+id/tool_bar"
        android:layout_width="match_parent"
        android:layout_height="45dp"
        />

</RelativeLayout>
~~~

#### ① 属性

- layout_id：页面的布局文件

#### ② 页面样式

页面样式(layout_id)是一个xml文件，你可以自己定义你想要的样式。

想要传入自定义布局时，布局中一定要有三个Button，且其id依次是left，logo，right。

例子：
~~~xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F9F5F8">

    <Button
        android:id="@+id/left"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="左边"
        android:textSize="17sp"
        android:textColor="#4A3740"
        android:background="@null"
        android:layout_centerVertical="true"
        android:layout_marginStart="-8dp"
        />

    <Button
        android:id="@+id/logo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="@drawable/logo"
        android:layout_centerInParent="true"
        />

    <Button
        android:id="@+id/right"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="右边"
        android:textSize="17sp"
        android:textColor="#4A3740"
        android:background="@null"
        android:layout_centerVertical="true"
        android:layout_alignParentEnd="true"
        android:layout_marginEnd="-8dp"
        />


</RelativeLayout>
~~~

#### ③ 触摸事件回调

~~~java
XLToolBar toolBar = findViewById(R.id.tool_bar);
toolBar.getLeft_btn().setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "左边按钮被点击了", Toast.LENGTH_SHORT).show();
    }
});
toolBar.getRight_btn().setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "右边按钮被点击了", Toast.LENGTH_SHORT).show();
    }
});
~~~

### 3. Java代码中动态添加

本人没有实验，理论上可以。
