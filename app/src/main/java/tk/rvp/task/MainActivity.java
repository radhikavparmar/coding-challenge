package tk.rvp.task;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout tabAccounts, tabCard, tabMarket, tabMore;
    ImageView icAccounts, icCard, icMarket, icMore;
    TextView txtAccounts, txtCard, txtMarket, txtMore;
    ImageButton centerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        onClickListeners();

    }


    private void initView() {
        tabAccounts = (LinearLayout) findViewById(R.id.tab_accounts);
        tabCard = (LinearLayout) findViewById(R.id.tab_card);
        tabMarket = (LinearLayout) findViewById(R.id.tab_market);
        tabMore = (LinearLayout) findViewById(R.id.tab_more);
        icAccounts = (ImageView) findViewById(R.id.ic_wallet);
        icCard = (ImageView) findViewById(R.id.ic_card);
        icMarket = (ImageView) findViewById(R.id.ic_market);
        icMore = (ImageView) findViewById(R.id.ic_more);
        txtAccounts = (TextView) findViewById(R.id.txt_wallet);
        txtCard = (TextView) findViewById(R.id.txt_card);
        txtMarket = (TextView) findViewById(R.id.txt_market);
        txtMore = (TextView) findViewById(R.id.txt_more);
        centerButton = (ImageButton) findViewById(R.id.center_button);
        MyAccountsFragment fragment = new MyAccountsFragment();
        callFragment(fragment);
    }

    private void onClickListeners() {
        tabAccounts.setOnClickListener(this);
        tabCard.setOnClickListener(this);
        tabMarket.setOnClickListener(this);
        tabMore.setOnClickListener(this);
        centerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab_accounts:
                MyAccountsFragment fragment = new MyAccountsFragment();
                icMarket.setBackground(getDrawable(R.drawable.marketplace));
                icMore.setBackground(getDrawable(R.drawable.more));
                icCard.setBackground(getDrawable(R.drawable.card));
                icAccounts.setBackground(getDrawable(R.drawable.ic_wallet));
                txtAccounts.setTextColor(getColor(R.color.black));
                txtCard.setTextColor(getColor(R.color.disabled_grey));
                txtMarket.setTextColor(getColor(R.color.disabled_grey));
                txtMore.setTextColor(getColor(R.color.disabled_grey));
                callFragment(fragment);
                break;
            case R.id.tab_card:
                CardFragment cardFragment = new CardFragment();
                icMarket.setBackground(getDrawable(R.drawable.marketplace));
                icMore.setBackground(getDrawable(R.drawable.more));
                icCard.setBackground(getDrawable(R.drawable.card_active));
                icAccounts.setBackground(getDrawable(R.drawable.wallet_grey));
                txtAccounts.setTextColor(getColor(R.color.disabled_grey));
                txtCard.setTextColor(getColor(R.color.black));
                txtMarket.setTextColor(getColor(R.color.disabled_grey));
                txtMore.setTextColor(getColor(R.color.disabled_grey));
               callFragment(cardFragment);
                break;
            case R.id.tab_market:
                MarketFragment marketFragment = new MarketFragment();
                icMarket.setBackground(getDrawable(R.drawable.marketplace_active));
                icMore.setBackground(getDrawable(R.drawable.more));
                icCard.setBackground(getDrawable(R.drawable.card));
                icAccounts.setBackground(getDrawable(R.drawable.wallet_grey));
                txtAccounts.setTextColor(getColor(R.color.disabled_grey));
                txtCard.setTextColor(getColor(R.color.disabled_grey));
                txtMarket.setTextColor(getColor(R.color.black));
                txtMore.setTextColor(getColor(R.color.disabled_grey));
                callFragment(marketFragment);
                break;
            case R.id.tab_more:
                MoreFragment moreFragment = new MoreFragment();
                icMarket.setBackground(getDrawable(R.drawable.marketplace));
                icMore.setBackground(getDrawable(R.drawable.more_active));
                icCard.setBackground(getDrawable(R.drawable.card));
                icAccounts.setBackground(getDrawable(R.drawable.wallet_grey));
                txtAccounts.setTextColor(getColor(R.color.disabled_grey));
                txtCard.setTextColor(getColor(R.color.disabled_grey));
                txtMarket.setTextColor(getColor(R.color.disabled_grey));
                txtMore.setTextColor(getColor(R.color.black));
                callFragment(moreFragment);

                break;
            case R.id.center_button:
                break;
        }
    }

    public void callFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

    }
}
