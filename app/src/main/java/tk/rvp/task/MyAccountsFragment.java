package tk.rvp.task;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


@SuppressLint("ValidFragment")
public class MyAccountsFragment extends Fragment implements View.OnClickListener {
    Activity mContext;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_accounts, container, false);

        initView(view);

        return view;
    }


    private void initView(View view) {



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onStart() {
        super.onStart();

    }




    public void startOTPfragment() {
//        login_btn.setEnabled(false);
//        OtpFragment fr = new OtpFragment();
//        loginBundle.putString("number", phone_number);
//        loginBundle.putString("password", password);
//        fr.setArguments(loginBundle);
//        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fragment_container_login, fr);
//        fragmentTransaction.commit();
    }


}