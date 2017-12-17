package com.my.mad7m_000.bindabledata;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by mad7m_000 on 28.11.2017.
 */

public class Counter extends BaseObservable {
    private int count;
    public Counter(int count) {
        this.count = count;
    }

    @Bindable
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        notifyPropertyChanged(BR.count);
    }
}
