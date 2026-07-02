package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.AbstractC2929Za1;
import com.daaw.AbstractC4976gw;
import com.daaw.BD0;
import com.daaw.C0752Ei;
import com.daaw.C0856Fi;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e extends RecyclerView.h {
    public final com.google.android.material.datepicker.a d;

    public static class a extends RecyclerView.D {
        public final TextView u;

        public a(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    public e(com.google.android.material.datepicker.a aVar) {
        this.d = aVar;
    }

    public int A(int i) {
        return this.d.R1().k().D + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void o(a aVar, int i) {
        int iA = A(i);
        aVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iA)));
        TextView textView = aVar.u;
        textView.setContentDescription(AbstractC4976gw.e(textView.getContext(), iA));
        C0856Fi c0856FiS1 = this.d.S1();
        if (AbstractC2929Za1.i().get(1) == iA) {
            C0752Ei c0752Ei = c0856FiS1.f;
        } else {
            C0752Ei c0752Ei2 = c0856FiS1.d;
        }
        this.d.U1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a q(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(BD0.u, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.d.R1().l();
    }

    public int z(int i) {
        return i - this.d.R1().k().D;
    }
}
