package tk.rvp.task;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountModelViewHolder> {

    private static AccountAdapter.OnViewDotsButtonClickListener mListener;

    private Context context;
    private ArrayList<AccountModel> mArrayList;

    public AccountAdapter(Context context, ArrayList<AccountModel> arrayList) {

        this.context = context;
        this.mArrayList = arrayList;

    }


    @Override
    public AccountAdapter.AccountModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.cardview_account;
        boolean shouldAttachToParentImmediately = false;
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieView = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        AccountAdapter.AccountModelViewHolder viewHolder = new AccountAdapter.AccountModelViewHolder(movieView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AccountAdapter.AccountModelViewHolder holder, int position) {

        holder.currencySymbol1.setText(mArrayList.get(position).getCurrencySymbol());
        holder.currencySymbol2.setText(mArrayList.get(position).getCurrencySymbol());
        holder.currencySymbol3.setText(mArrayList.get(position).getCurrencySymbol());
        holder.accountName.setText(mArrayList.get(position).getAccountName());
        holder.accountNumber.setText(mArrayList.get(position).getAccountNumber());
        holder.amount.setText(mArrayList.get(position).getAmount());
        holder.availableAmount.setText(mArrayList.get(position).getAvailableAmount());
        holder.overdraftAmount.setText(mArrayList.get(position).getOverdraftAmount());
        holder.currencyName.setText(mArrayList.get(position).getCurrencyName());

    }

    @Override
    public int getItemCount() {
        if (mArrayList != null && mArrayList.size() > 0)
            return mArrayList.size();
        else
            return 0;
    }

    public void setOnViewDotsButtonClickListener(AccountAdapter.OnViewDotsButtonClickListener listener) {
        this.mListener = listener;
    }

    public interface OnViewDotsButtonClickListener {
        void onItemClicked(View v, int position);
    }

    public class AccountModelViewHolder extends RecyclerView.ViewHolder {


        public TextView currencySymbol1, currencySymbol2, currencySymbol3, accountName, accountNumber, amount, availableAmount, overdraftAmount, currencyName;
        public ImageView icDots;


        public AccountModelViewHolder(View view) {
            super(view);

            accountName = (TextView) view.findViewById(R.id.txt_ac_name);
            accountNumber = (TextView) view.findViewById(R.id.txt_ac_num);
            amount = (TextView) view.findViewById(R.id.txt_ac_amt);
            availableAmount = (TextView) view.findViewById(R.id.txt_ac_amt_avail);
            overdraftAmount = (TextView) view.findViewById(R.id.txt_ac_amt_overd);
            currencyName = (TextView) view.findViewById(R.id.currency_txt);
            currencySymbol1 = (TextView) view.findViewById(R.id.txt_symbol);
            currencySymbol2 = (TextView) view.findViewById(R.id.txt_symbol_);
            currencySymbol3 = (TextView) view.findViewById(R.id.txt_symbol__);
            icDots = (ImageView) view.findViewById(R.id.ic_dots);
            icDots.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int clickedPosition = getAdapterPosition();
                    mListener.onItemClicked(view, clickedPosition);
                }
            });


        }


    }


}
