package shen.da.ye.yetoastutils;

import android.content.Context;
import android.widget.Toast;

/**
 * @author ChenYe created by on 2020/1/16 0016. 10:09
 **/

public class ToastUtils {

    public void show(Context ctx, String s) {
        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();
    }
}
