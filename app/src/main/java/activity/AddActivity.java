package activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.cong.firstproject.R;

/**
 * Created by ASUS on 2017/12/4.
 */

public class AddActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn_add;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user);
        Init();
    }

    private void Init() {
        btn_add=findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
   switch (v.getId()){
    case R.id.btn_add:
        addUser();
   }
    }

    private void addUser() {


    }
}
