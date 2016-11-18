package com.example.sinovoice.mvpsample.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sinovoice.mvpsample.R;
import com.example.sinovoice.mvpsample.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements View.OnClickListener, IUserView{

    private EditText idText;
    private EditText firstText;
    private EditText lastText;
    private Button saveBtn;
    private Button readBtn;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        mUserPresenter = new UserPresenter(this);

        idText = (EditText) findViewById(R.id.id_Text);
        firstText = (EditText) findViewById(R.id.first_Text);
        lastText = (EditText) findViewById(R.id.last_Text);
        saveBtn = (Button) findViewById(R.id.save_Btn);
        readBtn = (Button) findViewById(R.id.read_Btn);

        saveBtn.setOnClickListener(this);
        readBtn.setOnClickListener(this);
    }

    @Override
    public int getId() {
        return Integer.parseInt(idText.getText().toString());
    }

    @Override
    public String getFirstName() {
        return firstText.getText().toString();
    }

    @Override
    public String getLastName() {
        return lastText.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        firstText.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        lastText.setText(lastName);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save_Btn:
                mUserPresenter.saveUser(getId(), getFirstName(), getLastName());
                break;
            case R.id.read_Btn:
                mUserPresenter.loadUser(getId());
                break;
            default:
                break;
        }
    }
}
