package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.astuetz.PagerSlidingTabStrip;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class FP extends FragmentC10191zb0 {
    public HashMap B0 = new HashMap();
    public String C0 = "";
    public View D0;
    public PagerSlidingTabStrip E0;
    public RecyclerView F0;
    public C1773Od1 G0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FP.this.u(null, (String) view.getTag());
        }
    }

    public class b {
        public int a = 0;

        public b() {
        }
    }

    public static FP x() {
        FP fp = new FP();
        fp.setArguments(new Bundle());
        return fp;
    }

    public void A(int i) {
        RecyclerView.p layoutManager = this.F0.getLayoutManager();
        if (layoutManager == null || i == -1) {
            return;
        }
        layoutManager.A1(i);
    }

    public void B() {
        NW nwB;
        if (q()) {
            C1773Od1 c1773Od1 = (C1773Od1) this.F0.getAdapter();
            if ((c1773Od1 == null || (nwB = c1773Od1.B()) == null) ? false : nwB.g(true)) {
                return;
            }
            v(null, this.C0, true);
        }
    }

    public void C() {
        RecyclerView recyclerView = this.F0;
        D(recyclerView != null ? (C1773Od1) recyclerView.getAdapter() : null);
    }

    public final void D(C1773Od1 c1773Od1) {
        AbstractC6278lb.f(getActivity());
        C4821gO0 c4821gO0P = p(c1773Od1);
        FragmentC10191zb0.D.a(0, Boolean.valueOf(c4821gO0P.a), c4821gO0P.b, c4821gO0P.c);
    }

    public void E(Context context, String str) {
        C1773Od1 c1773Od1;
        RecyclerView recyclerView = this.F0;
        if (recyclerView == null || (c1773Od1 = (C1773Od1) recyclerView.getAdapter()) == null) {
            return;
        }
        c1773Od1.B().o(context, str);
    }

    public void F() {
        RecyclerView.h adapter;
        RecyclerView recyclerView = this.F0;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int iF = adapter.f();
        for (int i = 0; i < iF; i++) {
            RecyclerView.D dC0 = this.F0.c0(i);
            if (dC0 instanceof C6363ls) {
                ((C6363ls) dC0).T();
            }
        }
    }

    public boolean l() {
        String str = this.C0;
        return (str == null || str.equals("/")) ? false : true;
    }

    public View m() {
        if (this.F0 == null) {
            return null;
        }
        if (TextUtils.isEmpty(this.C0) || this.C0.equals("/")) {
            return this.F0.getChildAt(1);
        }
        return null;
    }

    public int n() {
        RecyclerView.p layoutManager = this.F0.getLayoutManager();
        if (layoutManager == null || !(layoutManager instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) layoutManager).b2();
    }

    public C4821gO0 o() {
        RecyclerView recyclerView = this.F0;
        return p(recyclerView != null ? (C1773Od1) recyclerView.getAdapter() : null);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String strT = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a0);
        this.C0 = strT;
        if (strT == null) {
            this.C0 = "";
        }
        u(null, this.C0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String strT = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().t(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a0);
        this.C0 = strT;
        if (strT == null) {
            this.C0 = "";
        }
        View viewInflate = layoutInflater.inflate(AbstractC9815yD0.c0, viewGroup, false);
        AbstractC1765Ob1.t(viewInflate.findViewById(AbstractC5056hD0.u4));
        FragmentC10191zb0.F.a(0, viewInflate.findViewById(AbstractC5056hD0.p4));
        this.D0 = viewInflate.findViewById(AbstractC5056hD0.l);
        s(0.0f);
        this.E0 = (PagerSlidingTabStrip) viewInflate.findViewById(AbstractC5056hD0.q3);
        int color = getResources().getColor(PC0.a);
        this.E0.setTextColor(color);
        this.E0.setTextColorSelected(color);
        this.E0.setDividerColor(color);
        this.E0.setUnderlineColor(color);
        this.E0.setIndicatorColor(color);
        this.E0.setOnClickListener(new a());
        this.F0 = (RecyclerView) viewInflate.findViewById(AbstractC5056hD0.A2);
        this.F0.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.F0;
        recyclerView.j(new VU0(1, AbstractC1765Ob1.n(recyclerView, IC0.b)));
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.r3);
        AbstractC1765Ob1.i(viewFindViewById, viewFindViewById.getParent());
        this.G0 = new Lr(getActivity(), 0, new WeakReference(this)).F(getActivity());
        u(null, this.C0);
        F();
        C();
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    public final C4821gO0 p(C1773Od1 c1773Od1) {
        Activity activity = getActivity();
        return activity == null ? C4821gO0.d : FragmentC10191zb0.h(activity, c1773Od1);
    }

    public boolean q() {
        return this.E0 != null;
    }

    public void r() {
        String str = this.C0;
        int iLastIndexOf = str.charAt(str.length() + (-1)) == '/' ? str.lastIndexOf(47, str.length() - 2) : str.lastIndexOf(47);
        u(null, iLastIndexOf <= 0 ? "/" : str.substring(0, iLastIndexOf));
    }

    public void s(float f) {
        View view = this.D0;
        if (view == null) {
            return;
        }
        view.setPivotX(1.0f);
        this.D0.setScaleX(f);
    }

    public void t(C1773Od1 c1773Od1, String str) {
        if (c1773Od1 == null) {
            c1773Od1 = (C1773Od1) this.F0.getAdapter();
        }
        if (c1773Od1 == null) {
            return;
        }
        C1773Od1 c1773Od1W = w(c1773Od1, str);
        this.C0 = c1773Od1W.B().e();
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().g0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a0, this.C0);
        z(c1773Od1W);
    }

    public void u(C1773Od1 c1773Od1, String str) {
        v(c1773Od1, str, false);
    }

    public void v(C1773Od1 c1773Od1, String str, boolean z) {
        RecyclerView recyclerView;
        C1773Od1 c1773Od12;
        if (str.length() <= 0 || str.charAt(0) != '/') {
            str = "/";
        }
        if (c1773Od1 == null) {
            c1773Od1 = this.G0;
        }
        if (z || c1773Od1 == null || (recyclerView = this.F0) == null || (c1773Od12 = (C1773Od1) recyclerView.getAdapter()) == null || !c1773Od1.B().p(str).equals(c1773Od12.B().e())) {
            if (str.length() > 0 && str.charAt(0) == '/') {
                if (c1773Od1 == null) {
                    c1773Od1 = this.G0;
                }
                this.E0.v();
                this.E0.u(c1773Od1.B().k(), c1773Od1.B().h(), c1773Od1.B().e());
                str = str.substring(1, str.length());
            }
            C1773Od1 c1773Od1W = w(c1773Od1, str);
            this.C0 = c1773Od1W.B().e();
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().g0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.a0, this.C0);
            z(c1773Od1W);
        }
    }

    public C1773Od1 w(C1773Od1 c1773Od1, String str) {
        String strSubstring;
        if (str == null || str.isEmpty()) {
            return c1773Od1;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            strSubstring = "";
        } else {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1, str.length());
            str = strSubstring2;
        }
        C1773Od1 c1773Od1D = c1773Od1.B().d(getActivity(), str);
        if (c1773Od1D == null) {
            return c1773Od1;
        }
        this.E0.u(c1773Od1D.B().k(), c1773Od1D.B().h(), c1773Od1D.B().e());
        return w(c1773Od1D, strSubstring);
    }

    public void y(InterfaceC5694jX interfaceC5694jX) {
        C1773Od1 c1773Od1;
        RecyclerView recyclerView = this.F0;
        if (recyclerView == null || (c1773Od1 = (C1773Od1) recyclerView.getAdapter()) == null || !c1773Od1.B().y(interfaceC5694jX)) {
            return;
        }
        c1773Od1.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(com.daaw.C1773Od1 r8) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r7.F0
            androidx.recyclerview.widget.RecyclerView$h r0 = r0.getAdapter()
            com.daaw.Od1 r0 = (com.daaw.C1773Od1) r0
            r1 = 0
            if (r0 == 0) goto L61
            com.daaw.NW r2 = r0.B()
            java.lang.String r2 = r2.e()
            com.daaw.NW r3 = r8.B()
            java.lang.String r3 = r3.e()
            int r4 = r3.length()
            r5 = 1
            if (r4 <= r5) goto L27
            com.daaw.X61$a r4 = com.daaw.X61.h
            r4.r(r5)
        L27:
            int r4 = r3.length()
            int r6 = r2.length()
            if (r4 >= r6) goto L3a
            boolean r4 = r2.contains(r3)
            if (r4 == 0) goto L3a
            r1 = 1
        L38:
            r5 = 0
            goto L40
        L3a:
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L38
        L40:
            if (r1 == 0) goto L48
            java.util.HashMap r3 = r7.B0
            r3.remove(r2)
            goto L62
        L48:
            com.daaw.FP$b r2 = new com.daaw.FP$b
            r2.<init>()
            int r3 = r7.n()
            r2.a = r3
            java.util.HashMap r3 = r7.B0
            com.daaw.NW r4 = r0.B()
            java.lang.String r4 = r4.e()
            r3.put(r4, r2)
            goto L62
        L61:
            r5 = 0
        L62:
            if (r0 == r8) goto L8c
            if (r0 == 0) goto L69
            r0.A()
        L69:
            r7.D(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r7.F0
            r0.setAdapter(r8)
            if (r1 != 0) goto L75
            if (r5 == 0) goto L8c
        L75:
            java.util.HashMap r0 = r7.B0
            com.daaw.NW r8 = r8.B()
            java.lang.String r8 = r8.e()
            java.lang.Object r8 = r0.get(r8)
            com.daaw.FP$b r8 = (com.daaw.FP.b) r8
            if (r8 == 0) goto L8c
            int r8 = r8.a
            r7.A(r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.FP.z(com.daaw.Od1):void");
    }
}
