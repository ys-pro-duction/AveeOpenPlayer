package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3290av;
import com.daaw.C3569bv;
import com.daaw.C9814yD;
import com.daaw.DialogFragmentC7214ov;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7493pv {
    public ScrollView a;
    public RecyclerView b;
    public View c;
    public View d;
    public View e;
    public ImageButton f;
    public ImageButton g;
    public GridLayout h;
    public C3290av i;
    public C3569bv j;
    public final List k = new ArrayList();
    public int l = -1;

    /* JADX INFO: renamed from: com.daaw.pv$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7493pv.this.e.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7493pv.this.a.fullScroll(130);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7493pv.this.d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7493pv.this.a.fullScroll(130);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7493pv.this.h();
            C7493pv.this.A();
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7493pv.this.g();
            C7493pv.this.B();
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            DialogFragmentC7214ov.Q.a(Integer.valueOf(dialogFragmentC7214ovK.L), dialogFragmentC7214ovK.K);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$h */
    public class h implements View.OnClickListener {
        public final /* synthetic */ String[] B;

        public h(String[] strArr) {
            this.B = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return;
            }
            int iIntValue = ((Integer) view.getTag()).intValue();
            String[] strArr = this.B;
            if (iIntValue < strArr.length) {
                DialogFragmentC7214ov.R.a(Integer.valueOf(dialogFragmentC7214ovK.L), Integer.valueOf(C7493pv.this.l), dialogFragmentC7214ovK.K, strArr[iIntValue]);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$i */
    public class i implements KQ {
        public i() {
        }

        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(C7493pv.this.i.A());
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$j */
    public class j implements C9814yD.b {
        public j() {
        }

        @Override // com.daaw.C9814yD.b
        public void a(int i, int i2) {
            int iMin = Math.min(C7493pv.this.k.size() - 1, Math.max(i2, 1));
            if (i == iMin) {
                return;
            }
            C7493pv c7493pv = C7493pv.this;
            int i3 = c7493pv.l;
            DialogFragmentC7214ov.i iVar = (i3 < 0 || i3 >= c7493pv.k.size()) ? null : (DialogFragmentC7214ov.i) C7493pv.this.k.get(C7493pv.this.l);
            DialogFragmentC7214ov.i iVar2 = (DialogFragmentC7214ov.i) C7493pv.this.k.get(i);
            C7493pv.this.k.remove(i);
            C7493pv.this.k.add(iMin, iVar2);
            C7493pv c7493pv2 = C7493pv.this;
            c7493pv2.l = iVar != null ? c7493pv2.k.indexOf(iVar) : -1;
            C7493pv c7493pv3 = C7493pv.this;
            c7493pv3.D(c7493pv3.k, true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$k */
    public class k implements C3290av.c {
        public final /* synthetic */ C9814yD a;

        public k(C9814yD c9814yD) {
            this.a = c9814yD;
        }

        @Override // com.daaw.C3290av.c
        public void a(View view) {
            this.a.m(view);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$l */
    public class l implements C3290av.d {
        public l() {
        }

        @Override // com.daaw.C3290av.d
        public boolean a(int i, View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return false;
            }
            dialogFragmentC7214ovK.m(1);
            C7493pv.this.s(i, true);
            C7493pv.this.j.J(i, view);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pv$m */
    public class m implements C3290av.d {
        public m() {
        }

        @Override // com.daaw.C3290av.d
        public boolean a(int i, View view) {
            DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
            if (dialogFragmentC7214ovK == null) {
                return false;
            }
            dialogFragmentC7214ovK.m(1);
            C7493pv.this.s(i, true);
            C7493pv.this.j.J(i, view);
            return true;
        }
    }

    public static String C(String str, Context context) {
        int i2;
        return (context != null && (i2 = i(str)) > 0) ? context.getString(i2) : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int i(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7493pv.i(java.lang.String):int");
    }

    public static void p(C2279Su c2279Su, List list) {
        int iC = c2279Su.c();
        for (int i2 = 0; i2 < iC; i2++) {
            C2591Vu c2591VuA = c2279Su.a(i2);
            if (c2591VuA == null) {
                AbstractC0441Bk1.c("CustomPropertiesList is null");
            } else {
                list.add(new DialogFragmentC7214ov.i(C(c2591VuA.C(), com.daaw.avee.a.i()), c2591VuA, c2591VuA.s("_id", -1)));
            }
        }
    }

    public final void A() {
        if (this.e.getVisibility() == 0) {
            g();
        } else {
            n();
        }
    }

    public final void B() {
        if (this.d.getVisibility() == 0) {
            h();
        } else {
            o();
        }
    }

    public final void D(List list, boolean z) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK == null) {
            return;
        }
        t(dialogFragmentC7214ovK.K, list);
        y(this.l);
        dialogFragmentC7214ovK.r(z);
    }

    public void E(int i2) {
        if (i2 < 0 || i2 >= this.k.size()) {
            return;
        }
        DialogFragmentC7214ov.i iVar = (DialogFragmentC7214ov.i) this.k.get(i2);
        this.j.D(i2, new B61(iVar.a, iVar.c()));
    }

    public final void g() {
        if (DialogFragmentC7214ov.k() == null) {
            return;
        }
        this.g.animate().rotation(0.0f).setDuration(r0.B);
        this.e.animate().alpha(0.0f).setDuration(r0.B).withEndAction(new a());
    }

    public final void h() {
        if (DialogFragmentC7214ov.k() == null) {
            return;
        }
        this.f.animate().rotation(0.0f).setDuration(r0.B);
        this.d.animate().alpha(0.0f).setDuration(r0.B).withEndAction(new c());
    }

    public DialogFragmentC7214ov.i j(int i2) {
        if (i2 < 0 || i2 >= this.k.size()) {
            return null;
        }
        return (DialogFragmentC7214ov.i) this.k.get(i2);
    }

    public boolean k() {
        C3290av c3290av = this.i;
        boolean z = c3290av == null || c3290av.A();
        View view = this.c;
        return (view == null || view.getVisibility() == 8) && z;
    }

    public boolean l() {
        return this.g != null;
    }

    public void m(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Activity activity, String[] strArr) {
        this.c = viewGroup.findViewById(AbstractC5056hD0.f);
        this.e = viewGroup.findViewById(AbstractC5056hD0.W0);
        this.d = viewGroup.findViewById(AbstractC5056hD0.X0);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(AbstractC5056hD0.D);
        this.g = imageButton;
        imageButton.setOnClickListener(new e());
        ImageButton imageButton2 = (ImageButton) viewGroup.findViewById(AbstractC5056hD0.E);
        this.f = imageButton2;
        imageButton2.setOnClickListener(new f());
        ((Button) viewGroup.findViewById(AbstractC5056hD0.Y)).setOnClickListener(new g());
        GridLayout gridLayout = (GridLayout) this.e;
        this.h = gridLayout;
        gridLayout.removeAllViews();
        h hVar = new h(strArr);
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK == null) {
            return;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                View viewInflate = dialogFragmentC7214ovK.n(strArr[i2]) ? View.inflate(activity, AbstractC9815yD0.l, null) : View.inflate(activity, AbstractC9815yD0.k, null);
                Button button = (Button) viewInflate.findViewById(AbstractC5056hD0.z);
                button.setOnClickListener(hVar);
                button.setText(C(strArr[i2], viewInflate.getContext()));
                button.setTag(Integer.valueOf(i2));
                this.h.addView(viewInflate);
            } catch (Exception e2) {
                AbstractC0441Bk1.b(e2, "error inflating");
            }
        }
        this.a = (ScrollView) viewGroup.findViewById(AbstractC5056hD0.M2);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(AbstractC5056hD0.A2);
        this.b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        C3290av c3290av = new C3290av(activity, null, this.a);
        this.i = c3290av;
        C3569bv c3569bv = new C3569bv(activity, AbstractC9815yD0.d, 0, c3290av, new i());
        this.j = c3569bv;
        this.b.setAdapter(c3569bv);
        C9814yD c9814yD = new C9814yD();
        c9814yD.y(AbstractC5056hD0.I);
        c9814yD.u(0.4f);
        c9814yD.v(activity.getResources().getColor(PC0.f));
        c9814yD.s(0.3f);
        c9814yD.t(0.1f);
        c9814yD.x(new j());
        this.b.j(c9814yD);
        this.b.l(c9814yD);
        this.b.m(c9814yD.r());
        this.i.G(new k(c9814yD));
        this.i.H(new l());
        this.j.G(new m());
    }

    public final void n() {
        if (DialogFragmentC7214ov.k() == null) {
            return;
        }
        this.g.animate().rotation(-45.0f).setDuration(r0.B);
        this.e.setVisibility(0);
        this.e.animate().alpha(1.0f).setDuration(r0.B);
        this.a.post(new b());
    }

    public final void o() {
        if (DialogFragmentC7214ov.k() == null) {
            return;
        }
        this.f.animate().rotation(-45.0f).setDuration(r0.B);
        this.d.setVisibility(0);
        this.d.animate().alpha(1.0f).setDuration(r0.B);
        this.a.post(new d());
    }

    public void q(C2695Wu c2695Wu) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && l()) {
            int iC = c2695Wu.c();
            this.k.clear();
            int i2 = 0;
            while (i2 < iC) {
                C2279Su c2279SuA = c2695Wu.a(i2);
                if (c2279SuA == null) {
                    AbstractC0441Bk1.c("CustomPropertiesList is null");
                } else {
                    this.k.add(new DialogFragmentC7214ov.i(i2 == 0 ? dialogFragmentC7214ovK.getString(JD0.g7) : dialogFragmentC7214ovK.getResources().getQuantityString(FD0.k, i2, Integer.valueOf(i2)), c2279SuA, c2279SuA.s("_id", -1), true));
                    p(c2279SuA, this.k);
                }
                i2++;
            }
            y(this.l);
        }
    }

    public void r(int i2) {
        s(i2, false);
    }

    public void s(int i2, boolean z) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK == null) {
            return;
        }
        this.l = i2;
        dialogFragmentC7214ovK.w(i2, z);
        C3569bv c3569bv = this.j;
        if (c3569bv != null) {
            c3569bv.I(i2);
        }
        if (i2 < 0 || i2 >= this.k.size()) {
            dialogFragmentC7214ovK.y(null);
            return;
        }
        DialogFragmentC7214ov.i iVar = (DialogFragmentC7214ov.i) this.k.get(i2);
        C2591Vu c2591VuB = iVar.b();
        C2279Su c2279SuA = iVar.a();
        if (c2591VuB != null) {
            dialogFragmentC7214ovK.y(c2591VuB);
        } else {
            dialogFragmentC7214ovK.y(c2279SuA);
        }
    }

    public void t(C2695Wu c2695Wu, List list) {
        c2695Wu.m();
        C2279Su c2279Su = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            DialogFragmentC7214ov.i iVar = (DialogFragmentC7214ov.i) list.get(i4);
            C2279Su c2279SuA = iVar.a();
            C2591Vu c2591VuB = iVar.b();
            if (c2279SuA != null) {
                c2279SuA.G0();
                c2695Wu.r(i2, c2279SuA);
                i2++;
                c2279Su = c2279SuA;
                i3 = 0;
            } else if (c2591VuB != null && c2279Su != null) {
                c2279Su.I0(i3, c2591VuB);
                i3++;
            }
        }
    }

    public void u(int i2) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && l()) {
            if (i2 < this.k.size()) {
                this.k.remove(i2);
                D(this.k, false);
            }
            int i3 = this.l;
            if (i2 == i3) {
                r(-1);
            } else {
                r(i3);
            }
        }
    }

    public void v() {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && l() && this.k.size() > 0) {
            this.b.s1(this.k.size() - 1);
            r(this.k.size() - 1);
        }
    }

    public void w(int i2) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = DialogFragmentC7214ov.k();
        if (dialogFragmentC7214ovK != null && dialogFragmentC7214ovK.p() && l()) {
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < this.k.size(); i5++) {
                if (((DialogFragmentC7214ov.i) this.k.get(i5)).a() != null) {
                    i3++;
                }
                if (i3 > i2) {
                    break;
                }
                i4 = i5;
            }
            if (i4 <= 0 || this.k.size() <= i4) {
                return;
            }
            this.b.s1(i4);
            r(i4);
        }
    }

    public void x(boolean z) {
        View view = this.c;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        C3290av c3290av = this.i;
        if (c3290av != null) {
            c3290av.E(z);
        }
        if (z) {
            h();
            g();
        }
    }

    public void y(int i2) {
        z(this.k, i2);
    }

    public void z(List list, int i2) {
        DialogFragmentC7214ov dialogFragmentC7214ovK;
        if (this.i == null || (dialogFragmentC7214ovK = DialogFragmentC7214ov.k()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            DialogFragmentC7214ov.i iVar = (DialogFragmentC7214ov.i) list.get(i3);
            if (iVar.d()) {
                arrayList2.add(new C3569bv.d(arrayList.size(), iVar.a));
            } else {
                arrayList.add(new B61(iVar.a, iVar.c()));
            }
        }
        this.i.D(arrayList);
        this.j.H(arrayList2);
        this.j.I(i2);
        dialogFragmentC7214ovK.w(this.l, false);
    }
}
