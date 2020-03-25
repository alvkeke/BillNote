package com.alvkeke.tools.bill;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.alvkeke.tools.bill.Components.SlidableListViewCallback;
import com.alvkeke.tools.bill.Data.BillItem;

import java.util.ArrayList;

public class BillListAdapter extends BaseAdapter implements SlidableListViewCallback {

	private ArrayList<BillItem> mBillItems;
	private Context mContext;
	private LayoutInflater mInflater;

	public BillListAdapter(Context context, ArrayList<BillItem> bills)
	{
		mInflater = LayoutInflater.from(context);
		mContext = context;
		mBillItems = bills;
	}

	@Override
	public int getCount() {
		return mBillItems.size();
	}

	@Override
	public BillItem getItem(int position) {
		return mBillItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		BillItem item = mBillItems.get(position);
		if (item == null) return 0;
		return item.getId();
	}

	@Override
	public boolean canSlideOutRightEdge(int pos)
	{
		return mBillItems.get(pos).getMoney() > 0;
	}

	@Override
	public boolean canSlideOutLeftEdge(int pos)
	{
		return mBillItems.get(pos).getMoney() < 0;
	}

	@Override
	public boolean SlideToRightEdge(int position)
	{
		Log.e("debug", "slide to right side.");
		return false;
	}

	@Override
	public boolean SlideToLeftEdge(int position)
	{
		Log.e("debug", "remove item : " + position);
		mBillItems.remove(position);
		notifyDataSetChanged();
		return true;
	}

	@Override
	public void onTouchDown(int pos, MotionEvent ev)
	{

	}

	@Override
	public void onTouchMove(int pos, MotionEvent ev)
	{

	}

	@Override
	public void onTouchUp(int pos, MotionEvent ev)
	{

	}

	@Override
	public boolean onShowViewClick(int pos)
	{
		Log.e("debug", "show item " + pos + " was clicked.");
		Toast.makeText(mContext, "item "+pos + " was clicked.", Toast.LENGTH_LONG).show();
		return false;
	}

	@Override
	public boolean onHideViewClick(int pos)
	{
		Log.e("debug", "hide item " + pos + " was clicked.");
		return false;
	}

	@Override
	public boolean onShowViewLongClick(int pos)
	{
		Log.e("debug", "show item " + pos + " was long clicked.");
		return false;
	}

	@Override
	public boolean onHideViewLongClick(int pos)
	{
		Log.e("debug", "hide item " + pos + " was long clicked.");
		return false;
	}

	static final class ViewHolder{
		LinearLayout showView;
		TextView hiddenView;
		ImageView ivIcon;
		TextView tvTypename;
		TextView tvMoney;
		TextView tvNote;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;

		if (convertView == null)
		{
			holder = new ViewHolder();
			convertView = mInflater.inflate(R.layout.item_list_bill, null);
			holder.showView = convertView.findViewById(R.id.show_view_item_bill);
			holder.hiddenView = convertView.findViewById(R.id.hidden_view_item_bill);
			holder.ivIcon = convertView.findViewById(R.id.im_icon_item_bill);
			holder.tvMoney = convertView.findViewById(R.id.tv_money_item_bill);
			holder.tvTypename = convertView.findViewById(R.id.tv_typename_item_bill);
			holder.tvNote = convertView.findViewById(R.id.tv_note_item_bill);

			convertView.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) convertView.getTag();
		}

		holder.ivIcon.setBackgroundColor(Color.BLUE);
		holder.tvMoney.setText(Integer.toString(getItem(position).getMoney()));

		if (getItem(position).getMoney() > 0)
		{
			holder.showView.setBackgroundColor(mContext.getResources().getColor(R.color.color_money_add));
		}
		else
		{
			holder.showView.setBackgroundColor(mContext.getResources().getColor(R.color.color_money_sub));
		}

		return convertView;
	}
}
