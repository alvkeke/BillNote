package com.alvkeke.tools.bill.Components;

import android.view.MotionEvent;

public interface SlidableListViewCallback {
	boolean canSlideOutRightEdge(int pos);
	boolean canSlideOutLeftEdge(int pos);
	boolean SlideToRightEdge(int position);
	boolean SlideToLeftEdge(int position);

	void onTouchDown(int pos, MotionEvent ev);
	void onTouchMove(int pos, MotionEvent ev);
	void onTouchUp(int pos, MotionEvent ev);

	boolean onShowViewClick(int pos);
	boolean onHideViewClick(int pos);
	boolean onShowViewLongClick(int pos);
	boolean onHideViewLongClick(int pos);

}
