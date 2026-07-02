package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.daaw.AbstractC2929Za1;
import com.daaw.AbstractC4976gw;
import com.daaw.C0752Ei;
import com.daaw.C0856Fi;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class c extends BaseAdapter {
    public static final int e = AbstractC2929Za1.k().getMaximum(4);
    public static final int f = (AbstractC2929Za1.k().getMaximum(5) + AbstractC2929Za1.k().getMaximum(7)) - 1;
    public final Month a;
    public Collection b;
    public C0856Fi c;
    public final CalendarConstraints d;

    public c(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.a = month;
        this.d = calendarConstraints;
        this.b = dateSelector.y();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.a.k(this.d.h());
    }

    public final String c(Context context, long j) {
        return AbstractC4976gw.a(context, j, j(j), i(j), g(j));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < b() || i > k()) {
            return null;
        }
        return Long.valueOf(this.a.l(l(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = com.daaw.BD0.p
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.a
            int r3 = r8.F
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.m(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.c.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.c == null) {
            this.c = new C0856Fi(context);
        }
    }

    public boolean g(long j) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.a.E;
    }

    public final boolean h(long j) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(long j) {
        throw null;
    }

    public final boolean j(long j) {
        return AbstractC2929Za1.i().getTimeInMillis() == j;
    }

    public int k() {
        return (b() + this.a.F) - 1;
    }

    public int l(int i) {
        return (i - b()) + 1;
    }

    public final void m(TextView textView, long j, int i) {
        C0752Ei c0752Ei;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j));
        if (this.d.f().w(j)) {
            textView.setEnabled(true);
            boolean zH = h(j);
            textView.setSelected(zH);
            c0752Ei = zH ? this.c.b : j(j) ? this.c.c : this.c.a;
        } else {
            textView.setEnabled(false);
            c0752Ei = this.c.g;
        }
        c0752Ei.b(textView);
    }

    public final void n(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.g(j).equals(this.a)) {
            int iM = this.a.m(j);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iM) - materialCalendarGridView.getFirstVisiblePosition()), j, iM);
        }
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public boolean p(int i) {
        return i >= b() && i <= k();
    }
}
