package com.xsoft.dianliangpin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xsoft.dianliangpin.beans.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mAddUserBtn;
    private Button mDelUserBtn;
    private Button mUpdateUserBtn;
    private Button mUpdateUserNameBtn;
    private Button mGetUserBtn;
    private Button mGetUserListBtn;

    private Long id = 10001L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        NetService.getInstance().testGetTime(1);
        initView();
    }

    private void initView() {
        mAddUserBtn = (Button)findViewById(R.id.add_user);
        mAddUserBtn.setOnClickListener(this);

        mDelUserBtn = (Button)findViewById(R.id.del_user);
        mDelUserBtn.setOnClickListener(this);

        mUpdateUserBtn = (Button)findViewById(R.id.update_user);
        mUpdateUserBtn.setOnClickListener(this);

        mUpdateUserNameBtn = (Button)findViewById(R.id.update_username);
        mUpdateUserNameBtn.setOnClickListener(this);

        mGetUserBtn = (Button)findViewById(R.id.get_user);
        mGetUserBtn.setOnClickListener(this);

        mGetUserListBtn = (Button)findViewById(R.id.get_users);
        mGetUserListBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mAddUserBtn) {
            User u = new User(id, "benylwang_"+id, 29);
            id++;
            NetService.getInstance().addUser(u);
        } else if (view == mDelUserBtn) {
            NetService.getInstance().delUser(10000L);
        } else if (view == mUpdateUserBtn) {
            User u = new User(id, "jack", 30);
            NetService.getInstance().updateUser(10000L, u);
        } else if (view == mUpdateUserNameBtn) {
            NetService.getInstance().updateUserName(10000L, "gg");
        } else if (view == mGetUserBtn) {
            NetService.getInstance().getUser(10000L);
        } else if (view == mGetUserListBtn) {
            NetService.getInstance().getUserList();
        }
    }
}
