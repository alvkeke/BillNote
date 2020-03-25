package com.alvkeke.tools.bill.Data;

public class Type {
    private long mId;
    private String mName;
    private int mIconId;

    public Type(long id, String name, int iconId)
    {
        mId = id;
        mName = name;
        mIconId = iconId;
    }

    public long getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public int getIconId()
    {
        return mIconId;
    }

    public void setName(String name)
    {
        mName = name;
    }

    public void setIcon(int iconId)
    {
        mIconId = iconId;
    }
}
