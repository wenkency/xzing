package cn.carhouse.zxingsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.carhouse.permission.Permission;
import cn.carhouse.permission.PermissionListenerAdapter;
import cn.carhouse.permission.XPermission;
import cn.carhouse.zxing.CaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view) {
        XPermission.with(this)
                .permissions(Permission.CAMERA)
                .request(new PermissionListenerAdapter() {
                    @Override
                    public void onSucceed() {
                        startActivity(new Intent(MainActivity.this, CaptureActivity.class));
                    }
                });

    }
}
