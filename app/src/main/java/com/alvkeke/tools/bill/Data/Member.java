package com.alvkeke.tools.bill.Data;

public class Member {
    private long mId;
    private String mName;

    public Member(long id, String name)
    {

        mId = id;
        mName = name;
    }

    public String getName()
    {
        return mName;
    }

    public void setName(String name)
    {
        mName = name;
    }

    public long getId()
    {
        return mId;
    }
}
