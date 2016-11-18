package com.example.sinovoice.mvpsample.model;

import android.util.SparseArray;

import com.example.sinovoice.mvpsample.bean.UserBean;

/**
 * Created by miaochangchun on 2016/11/18.
 */
public class UserModel implements IUserModel{
    private String mFristName;
    private String mLastName;
    private int mID;
    private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();

    @Override
    public void setId(int id) {
        mID = id;
    }

    @Override
    public void setFirstName(String firstName) {
        mFristName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    @Override
    public UserBean load(int id) {
        mID = id;
        UserBean userBean = mUsererArray.get(mID, new UserBean("not found", "not found"));
        return userBean;
    }
}
