package com.alvkeke.tools.bill.Data;

public class Account {
    private long mId;
    private String mName;

    public Account(long id, String name)
    {
        mId = id;
        mName = name;
    }

    public long getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
    }
}
