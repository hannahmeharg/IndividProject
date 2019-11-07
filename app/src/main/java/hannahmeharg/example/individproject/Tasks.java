package hannahmeharg.example.individproject;

import java.util.Date;
import java.util.UUID;

public class Tasks {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Tasks() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}