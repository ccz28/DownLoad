package fire.com.ccz.download;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.tbruyelle.rxpermissions.RxPermissions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent service = new Intent(MainActivity.this, DownLoadService.class);
               service.putExtra("downloadurl", "https://qd.myapp.com/myapp/qqteam/Androidlite/qqlite_3.7.0.700_android_r110148_GuanWang_537057097_release_10000484.apk");
               startService(service);
           }
       });
    }
}
