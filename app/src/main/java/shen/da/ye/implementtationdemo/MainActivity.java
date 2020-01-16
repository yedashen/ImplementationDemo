package shen.da.ye.implementtationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import shen.da.ye.yetoastutils.ToastUtils;

/**
 * @author ChenYe
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.toast_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ToastUtils().show(MainActivity.this, "测试");
            }
        });
    }
}
