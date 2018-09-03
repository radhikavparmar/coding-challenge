package tk.rvp.task;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


@SuppressLint("ValidFragment")
public class MyAccountsFragment extends Fragment implements View.OnClickListener, AccountAdapter.OnViewDotsButtonClickListener {
    private Toolbar toolbar;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private AccountAdapter adapter;
    private ArrayList<AccountModel> accountModelArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_accounts, container, false);

        initView(view);

        return view;
    }


    private void initView(View view) {

        toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        mRecyclerView = view.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        AccountModel object = new AccountModel("Multi-Currency","X Account","78128321 | 44-62-11","6,725.14","£","1,697.32","0",false,false,false,true,R.drawable.logox);
        AccountModel object2 = new AccountModel("USD","Priviledge Account","78128321 | 44-62-11","6,725.14","$","1,697.32","4,500.00",true,true,true,false,R.drawable.bank);
        accountModelArrayList = new ArrayList<>();
        accountModelArrayList.add(object);
        accountModelArrayList.add(object2);


        adapter = new AccountAdapter(getActivity(), accountModelArrayList);
        mRecyclerView.setAdapter(adapter);
        adapter.setOnViewDotsButtonClickListener(this);

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


    @Override
    public void onItemClicked(View v, int position) {
        Toast.makeText(getContext(),"click",Toast.LENGTH_LONG).show();
    }
}
