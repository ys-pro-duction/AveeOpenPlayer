package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/* JADX INFO: renamed from: com.daaw.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9452wv {
    public ViewGroup a;
    public ViewGroup b;

    /* JADX INFO: renamed from: com.daaw.wv$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            dialogFragmentC7214ovK.i();
        }
    }

    /* JADX INFO: renamed from: com.daaw.wv$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9452wv.this.a.setVisibility(8);
        }
    }

    public void b(DialogFragmentC7214ov dialogFragmentC7214ov) {
        this.a.animate().alpha(0.0f).setDuration(dialogFragmentC7214ov.B).withEndAction(new b());
    }

    public boolean c() {
        return this.a.getVisibility() == 0;
    }

    public boolean d() {
        return this.b != null;
    }

    public void e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity) {
        this.a = (ViewGroup) viewGroup.findViewById(AbstractC5056hD0.u2);
        this.b = (ViewGroup) viewGroup.findViewById(AbstractC5056hD0.I1);
        ((ImageButton) viewGroup.findViewById(AbstractC5056hD0.v)).setOnClickListener(new a());
    }

    public void f(DialogFragmentC7214ov dialogFragmentC7214ov) {
        this.a.setVisibility(0);
        this.a.animate().alpha(1.0f).setDuration(dialogFragmentC7214ov.B);
    }

    public void g(C2591Vu c2591Vu, String str, KQ kq) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && d()) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(dialogFragmentC7214ovK.getActivity());
            if (c2591Vu == null || str == null) {
                this.b.removeAllViews();
                b(dialogFragmentC7214ovK);
                return;
            }
            this.b.removeAllViews();
            this.a.setAlpha(0.0f);
            f(dialogFragmentC7214ovK);
            c2591Vu.r(str);
            C8887uv.m(dialogFragmentC7214ovK, layoutInflaterFrom, c2591Vu, this.b, str, true, kq);
        }
    }
}
