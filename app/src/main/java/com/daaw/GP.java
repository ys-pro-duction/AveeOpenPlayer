package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C2078Qw0;
import com.daaw.C9814yD;
import com.daaw.NW;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class GP extends FragmentC10191zb0 {
    public C2267Sr B0;
    public RecyclerView C0;
    public ArrayDeque D0 = new ArrayDeque();

    public class a implements FQ {
        public a() {
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return (C2138Rl0) FragmentC10191zb0.H.a(new C2138Rl0());
        }
    }

    public class b implements C9814yD.b {
        public b() {
        }

        @Override // com.daaw.C9814yD.b
        public void a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            ((C1773Od1) GP.this.C0.getAdapter()).C(i, i2, arrayList);
        }
    }

    public class c implements NW.c {
        public final /* synthetic */ C9814yD a;

        public c(C9814yD c9814yD) {
            this.a = c9814yD;
        }

        @Override // com.daaw.NW.c
        public void a(View view) {
            this.a.m(view);
        }
    }

    public static GP o() {
        GP gp = new GP();
        gp.setArguments(new Bundle());
        return gp;
    }

    public C4821gO0 m() {
        Activity activity = getActivity();
        if (activity == null) {
            return C4821gO0.d;
        }
        RecyclerView recyclerView = this.C0;
        if (recyclerView == null) {
            return C4821gO0.d;
        }
        C1773Od1 c1773Od1 = (C1773Od1) recyclerView.getAdapter();
        return c1773Od1 == null ? C4821gO0.d : FragmentC10191zb0.h(activity, c1773Od1);
    }

    public boolean n() {
        return this.C0 != null;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(AbstractC9815yD0.d0, viewGroup, false);
        AbstractC1765Ob1.t(viewInflate.findViewById(AbstractC5056hD0.u4));
        FragmentC10191zb0.F.a(1, viewInflate.findViewById(AbstractC5056hD0.p4));
        this.C0 = (RecyclerView) viewInflate.findViewById(AbstractC5056hD0.A2);
        this.C0.setLayoutManager(new LinearLayoutManager(getActivity()));
        C2267Sr c2267Sr = new C2267Sr(getActivity(), new a(), "nowplaying", "Playlist", true, 1);
        this.B0 = c2267Sr;
        c2267Sr.q(new WeakReference(this));
        this.C0.setAdapter(this.B0.G(getActivity(), 1));
        RecyclerView recyclerView = this.C0;
        recyclerView.j(new VU0(1, AbstractC1765Ob1.n(recyclerView, IC0.b)));
        C9814yD c9814yD = new C9814yD();
        c9814yD.y(AbstractC5056hD0.I);
        c9814yD.u(0.4f);
        c9814yD.v(getActivity().getResources().getColor(PC0.b));
        c9814yD.s(0.3f);
        c9814yD.t(0.1f);
        c9814yD.x(new b());
        this.C0.j(c9814yD);
        this.C0.l(c9814yD);
        this.C0.m(c9814yD.r());
        this.B0.M(new c(c9814yD));
        v((C2138Rl0) FragmentC10191zb0.H.a(new C2138Rl0()));
        u(C9732xv0.e, C9732xv0.b, C9732xv0.d, C9732xv0.c);
        s();
        return viewInflate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        p(false);
        super.onDestroy();
    }

    public void q(InterfaceC5694jX interfaceC5694jX) {
        C1773Od1 c1773Od1 = (C1773Od1) this.C0.getAdapter();
        if (c1773Od1 == null || !c1773Od1.B().y(interfaceC5694jX)) {
            return;
        }
        c1773Od1.k();
    }

    public void r() {
        C1773Od1 c1773Od1;
        if (n() && (c1773Od1 = (C1773Od1) this.C0.getAdapter()) != null) {
            c1773Od1.k();
        }
    }

    public void s() {
        AbstractC6278lb.f(getActivity());
        C4821gO0 c4821gO0M = m();
        FragmentC10191zb0.D.a(1, Boolean.valueOf(c4821gO0M.a), c4821gO0M.b, c4821gO0M.c);
    }

    public void t(Context context, String str) {
        if (this.C0 != null) {
            this.B0.o(context, str);
        }
    }

    public void u(int i, C2078Qw0 c2078Qw0, C2078Qw0.b bVar, InterfaceC6540mX interfaceC6540mX) {
        RecyclerView recyclerView;
        C1773Od1 c1773Od1;
        if (getActivity() == null || (recyclerView = this.C0) == null || (c1773Od1 = (C1773Od1) recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.B0 != null) {
            if (this.D0.size() > 1) {
                this.D0.removeFirst();
            }
            if (interfaceC6540mX != null && (this.D0.peekLast() == null || !((InterfaceC6540mX) this.D0.peekLast()).equals(interfaceC6540mX))) {
                this.D0.add(interfaceC6540mX);
            }
            Iterator it = this.D0.iterator();
            while (it.hasNext()) {
                int iE0 = this.B0.e0((InterfaceC6540mX) it.next());
                if (iE0 >= 0) {
                    RecyclerView.D dC0 = this.C0.c0(c1773Od1.z(iE0));
                    if (dC0 instanceof C6363ls) {
                        ((C6363ls) dC0).T();
                    }
                }
            }
        } else {
            c1773Od1.k();
        }
        if (((Boolean) FragmentC10191zb0.f0.a(Boolean.FALSE)).booleanValue()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.C0.getLayoutManager();
            int integer = getResources().getInteger(AbstractC9536xD0.b);
            if (i >= Math.max(linearLayoutManager.d2() - (integer + 1), 0)) {
                this.C0.s1(c1773Od1.z(i + integer));
            } else {
                this.C0.s1(c1773Od1.z(i));
            }
        }
    }

    public void v(C2138Rl0 c2138Rl0) {
        C2267Sr c2267Sr = this.B0;
        if (c2267Sr != null) {
            c2267Sr.g(true);
        }
    }

    public void p(boolean z) {
    }
}
