package site.iway.androidviewswapper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import site.iway.androidhelpers.ViewSwapper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewSwapper viewSwapper = findViewById(R.id.viewSwapper);
        findViewById(R.id.page1).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSwapper.setDisplayedChild(0);
            }
        });
        findViewById(R.id.page2).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSwapper.setDisplayedChild(1);
            }
        });
        findViewById(R.id.page3).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                viewSwapper.setDisplayedChild(2);
            }
        });
    }
}
