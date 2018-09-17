package com.example.harshad.mvvmdemo;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.example.harshad.mvvmdemo.BR;
import com.example.harshad.mvvmdemo.Model.User;

public class LoginViewModel extends BaseObservable {

    private User users;

    private String successMessage="Data successfully sended.";
    private String errorMessage="Something went wrong to the network.";
    private Context context;

    @Bindable
    private String toastMessage=null;

    public String getToastMessage(){
        return toastMessage;
    }

    public void setToastMessage(String toastMessage){
        this.toastMessage=toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public LoginViewModel(Context context) {
        this.context=context;
        users=new User("","","");
    }

    public void afterEmailTextChanged(CharSequence email){
        users.setEmail(email.toString());
    }

    public void afterNameTextChanged(CharSequence name){
        users.setUsername(name.toString());
    }

    public void afterPasswordTextChanged(CharSequence password){
        users.setPassword(password.toString());
    }

    public void onLongClicked(){
        if(users.isInputValid()){
            setToastMessage(successMessage);
        }else{
            setToastMessage(errorMessage);
        }
    }
}