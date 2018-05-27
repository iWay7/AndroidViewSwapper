# AndroidViewSwapper
Android ViewFlipper 替代布局。由于 ViewFlipper 在 Dialog 中可能存在问题，因此造了个轮子。 

### 本应用的示例

![image](https://github.com/iWay7/AndroidViewSwapper/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
##### 在布局文件中声明一个 ViewSwapper 视图及其子视图即可使用：
```
<site.iway.androidhelpers.ViewSwapper
    android:id="@+id/viewSwapper"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:displayedChild="1"
    app:inAnimation="@anim/slide_right_in_300"
    app:outAnimation="@anim/slide_left_out_300">
    
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="PAGE 1"
        android:textSize="32sp" />
        
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="PAGE 2"
        android:textSize="32sp" />
        
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="PAGE 3"
        android:textSize="32sp" />
        
</site.iway.androidhelpers.ViewSwapper>
```

##### 支持的可配置属性：
```
app:displayedChild 预先切换到子视图，可用于编辑时预览
app:inAnimation 配置进入动画
app:outAnimation 配置出去动画
```

##### 通过代码设定要显示的子视图：
```
viewSwapper.setDisplayedChild(1);
```