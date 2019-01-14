package com.example.aman.todo_aman;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.design.widget.TextInputLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextInputLayout loginUsername;
    private TextInputLayout loginPassword;
    private Button loginBttn;

    private static String usernameCredentialAdmin = "admin";
    private static String passwordCredentialAdmin = "admin";

    SharedPreference sharedPreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginUsername=findViewById(R.id.username_editext);
        loginPassword=findViewById(R.id.password_editext);

        loginBttn=findViewById(R.id.login_btn);
        loginBttn.setOnClickListener(this);

        sharedPreference=new SharedPreference(this);//shared pref.java ma lanako lagi
    }

    @Override
    public void onClick(View v) {
        String username;
        String password;

        username=loginUsername.getEditText().getText().toString();
        password=loginPassword.getEditText().getText().toString();

        if(username.equals(usernameCredentialAdmin)&& password.equals(passwordCredentialAdmin)){
            Intent intent=new Intent(this,UserDetailActivity.class);
            Toast.makeText(this,"Logged in as Admin", Toast.LENGTH_SHORT).show();
            startActivity(intent);

        }
        else if(!username.isEmpty()&& !password.isEmpty() && username.equals(sharedPreference.getUsername()) && password.equals(sharedPreference.getPassword())){
            Intent intent=new Intent(this,MainActivity.class);
            Toast.makeText(this,"Welcome "+ username, Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }
        else
            Toast.makeText(this,"Invalid Details", Toast.LENGTH_SHORT).show();
    }



    //////////////Thiss is not necessary only experimental
    public void create_ac(View v){
        Intent intent=new Intent(this,CreateAcActivity.class);
        startActivity(intent);
    }
    /////////////Not necessary
//    public void openActivity(View view){
//        @SuppressLint("WrongConstant") SharedPreferences pref= getSharedPreferences("usname",MODE_PRIVATE);
//        EditText uname= findViewById(R.id.username_editext);
//        EditText pass= findViewById(R.id.password_editext);
//        String username=uname.getText().toString();
//        String password=pass.getText().toString();
//        if(username.equals("admin")&&password.equals("admin")){
//            Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
//            startActivity(intent);
//        }
//        else{
//            if(!pref.contains("username")){
//                SharedPreferences.Editor editor=pref.edit();
//                editor.putString("username",username);
//                editor.putString("password",password);
//                editor.commit();
//                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
//                startActivity(intent);
//            }
//            else {
//                String usr=pref.getString("username","");
//                String pss=pref.getString("password","");
//                if(username.equals(usr)&&password.equals(pss)) {
//                    Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
//                    startActivity(intent);
//                }
//            }
//
//        }
//
//    }
}
