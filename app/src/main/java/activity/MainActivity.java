package activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import adapter.UserAdapter;
import cn.cong.firstproject.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView lv;
    private TextView tv_user, tv_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserAdapter adapter = new UserAdapter();
        lv.setAdapter(adapter);
        Init();
    }

    private void Init() {
        lv = findViewById(R.id.lv);
        tv_user = findViewById(R.id.tv_user);
        tv_add = findViewById(R.id.tv_add);
        tv_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_add:
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
                break;
        }
    }
}
