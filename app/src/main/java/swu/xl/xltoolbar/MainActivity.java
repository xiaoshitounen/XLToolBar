package swu.xl.xltoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}
