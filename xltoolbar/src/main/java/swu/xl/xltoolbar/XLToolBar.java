package swu.xl.xltoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

public class XLToolBar extends RelativeLayout {

    //左边的控件
    private Button left_btn;
    //中间的控件
    private Button logo_btn;
    //右边的控件
    private Button right_btn;

    //布局文件id
    private int layout_id;

    /**
     * 构造函数：Java代码初始化
     * @param context
     */
    public XLToolBar(Context context, int layout_id) {
        super(context);

        this.layout_id = layout_id;

        //初始化操作
        init();
    }

    /**
     * 构造函数：Xml代码初始化
     * @param context
     * @param attrs
     */
    public XLToolBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        //解析属性
        if (attrs != null){
            //1.获取所有属性值的集合
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.XLToolBar);

            //2.解析单个属性
            layout_id = typedArray.getResourceId(R.styleable.XLToolBar_layout_id,layout_id);

            //3.释放资源
            typedArray.recycle();
        }

        //初始化操作
        init();
    }

    /**
     * 初始化操作
     */
    private void init() {
        //找到布局
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.tool_bar_layout, this);

        //找到对应的控件
        left_btn = inflate.findViewById(R.id.left);
        logo_btn = inflate.findViewById(R.id.logo);
        right_btn = inflate.findViewById(R.id.right);
    }

    public Button getLeft_btn() {
        return left_btn;
    }

    public void setLeft_btn(Button left_btn) {
        this.left_btn = left_btn;
    }

    public Button getLogo_btn() {
        return logo_btn;
    }

    public void setLogo_btn(Button logo_btn) {
        this.logo_btn = logo_btn;
    }

    public Button getRight_btn() {
        return right_btn;
    }

    public void setRight_btn(Button right_btn) {
        this.right_btn = right_btn;
    }
}
