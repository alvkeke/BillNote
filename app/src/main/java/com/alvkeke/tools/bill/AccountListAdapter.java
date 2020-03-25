package com.alvkeke.tools.bill;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.alvkeke.tools.bill.Data.Account;

import java.util.ArrayList;

public class AccountListAdapter extends BaseAdapter {

    private ArrayList<Account> mAccounts;

    public AccountListAdapter(ArrayList<Account> accounts)
    {
        mAccounts = accounts;
    }
    @Override
    public int getCount() {
        return mAccounts.size();
    }

    @Override
    public Object getItem(int position) {
        return mAccounts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mAccounts.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
