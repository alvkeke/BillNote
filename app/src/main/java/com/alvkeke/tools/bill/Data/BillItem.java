package com.alvkeke.tools.bill.Data;

public class BillItem {
    private long mId;
    private long mTime;
    private int mMoney;
    private long mTypeId;
    private long mAccountId;
    private long mMemberId;
    private String mNote;

    public BillItem(long id, long time, int money, long typeId, long accountId)
    {
        mId = id;
        mTime = time;
        mMoney = money;
        mTypeId = typeId;
        mAccountId = accountId;
    }

    public long getId() {
        return mId;
    }

    public int getMoney() {
        return mMoney;
    }

    public long getAccountId() {
        return mAccountId;
    }

    public long getMemberId() {
        return mMemberId;
    }

    public long getTime() {
        return mTime;
    }

    public long getTypeId() {
        return mTypeId;
    }

    public String getNote() {
        return mNote;
    }

    public void setMember(long memberId)
    {
        mMemberId = memberId;
    }

    public void setNote(String note)
    {
        mNote = note;
    }
}
