package com.example.sinovoice.mvpsample.presenter;

import com.example.sinovoice.mvpsample.bean.UserBean;
import com.example.sinovoice.mvpsample.model.IUserModel;
import com.example.sinovoice.mvpsample.model.UserModel;
import com.example.sinovoice.mvpsample.view.IUserView;

/**
 * Created by miaochangchun on 2016/11/18.
 */
public class UserPresenter {
    private IUserView userView;
    private IUserModel userModel;

    public UserPresenter(IUserView userView) {
        this.userView = userView;
        userModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        userModel.setId(id);
        userModel.setFirstName(firstName);
        userModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean userBean = userModel.load(id);
        userView.setFirstName(userBean.getFirstName());
        userView.setLastName(userBean.getLastName());
    }
}
