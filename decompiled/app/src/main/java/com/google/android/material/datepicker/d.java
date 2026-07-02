package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC5894kD0;
import com.daaw.BD0;
import com.google.android.material.datepicker.a;

/* JADX INFO: loaded from: classes3.dex */
public class d extends RecyclerView.h {
    public final CalendarConstraints d;
    public final a.m e;
    public final int f;

    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ MaterialCalendarGridView B;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.B = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.B.getAdapter().p(i)) {
                d.this.e.a(this.B.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.D {
        public final TextView u;
        public final MaterialCalendarGridView v;

        public b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(AbstractC5894kD0.u);
            this.u = textView;
            AbstractC2317Td1.q0(textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(AbstractC5894kD0.q);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public d(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, a.m mVar) {
        Month monthK = calendarConstraints.k();
        Month monthG = calendarConstraints.g();
        Month monthJ = calendarConstraints.j();
        if (monthK.compareTo(monthJ) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthJ.compareTo(monthG) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f = (c.e * com.google.android.material.datepicker.a.V1(context)) + (com.google.android.material.datepicker.b.j2(context) ? com.google.android.material.datepicker.a.V1(context) : 0);
        this.d = calendarConstraints;
        this.e = mVar;
        x(true);
    }

    public Month A(int i) {
        return this.d.k().p(i);
    }

    public CharSequence B(int i) {
        return A(i).n();
    }

    public int C(Month month) {
        return this.d.k().r(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void o(b bVar, int i) {
        Month monthP = this.d.k().p(i);
        bVar.u.setText(monthP.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(AbstractC5894kD0.q);
        if (materialCalendarGridView.getAdapter() == null || !monthP.equals(materialCalendarGridView.getAdapter().a)) {
            c cVar = new c(monthP, null, this.d, null);
            materialCalendarGridView.setNumColumns(monthP.E);
            materialCalendarGridView.setAdapter((ListAdapter) cVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b q(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(BD0.s, viewGroup, false);
        if (!com.google.android.material.datepicker.b.j2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.d.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i) {
        return this.d.k().p(i).o();
    }
}
