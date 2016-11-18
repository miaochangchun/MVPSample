package com.example.sinovoice.mvpsample.model;

import com.example.sinovoice.mvpsample.bean.UserBean;

/**
 * Created by miaochangchun on 2016/11/18.
 */
public interface IUserModel {
    void setId(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    UserBean load(int id);
}
