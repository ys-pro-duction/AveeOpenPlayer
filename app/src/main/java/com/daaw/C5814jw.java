package com.daaw;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5814jw extends BaseAdapter {
    public static final int d;
    public final Calendar a;
    public final int b;
    public final int c;

    static {
        d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C5814jw() {
        Calendar calendarK = AbstractC2929Za1.k();
        this.a = calendarK;
        this.b = calendarK.getMaximum(7);
        this.c = calendarK.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(BD0.q, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(ND0.l), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C5814jw(int i) {
        Calendar calendarK = AbstractC2929Za1.k();
        this.a = calendarK;
        this.b = calendarK.getMaximum(7);
        this.c = i;
    }
}
