package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.daaw.C0850Fg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.InAppBilling.StoreItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IX0 extends DialogFragment {
    public static final a L = new a(null);
    public static final int M = 8;
    public static final C10217zg1 N = new C10217zg1();
    public static final C0746Eg1 O = new C0746Eg1();
    public final List B = new ArrayList();
    public Button C;
    public LinearLayout D;
    public View E;
    public StoreItem F;
    public StoreItem G;
    public StoreItem H;
    public StoreItem I;
    public TextView J;
    public TextView K;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void a() {
            AbstractC1765Ob1.w(new IX0(), "StoreDialog");
        }

        public final C10217zg1 b() {
            return IX0.N;
        }

        public final C0746Eg1 c() {
            return IX0.O;
        }

        public a() {
        }
    }

    public static final class b implements Comparator {
        public final /* synthetic */ List B;

        public b(List list) {
            this.B = list;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1188In.a(Integer.valueOf(this.B.indexOf(((com.android.billingclient.api.f) obj).c())), Integer.valueOf(this.B.indexOf(((com.android.billingclient.api.f) obj2).c())));
        }
    }

    public static final void l(IX0 ix0, View view) {
        G10.g(ix0, "this$0");
        AbstractC1765Ob1.j(ix0);
        MainActivity mainActivityE = MainActivity.INSTANCE.e();
        if (mainActivityE != null) {
            mainActivityE.F1();
        }
    }

    public static final void n(IX0 ix0, View view) {
        G10.g(ix0, "this$0");
        StoreItem storeItem = ix0.I;
        if (view != storeItem) {
            if (storeItem != null) {
                storeItem.setChecked(false);
            }
            G10.e(view, "null cannot be cast to non-null type com.daaw.avee.comp.InAppBilling.StoreItem");
            StoreItem storeItem2 = (StoreItem) view;
            ix0.I = storeItem2;
            if (storeItem2 != null) {
                storeItem2.setChecked(true);
            }
            ix0.t();
        }
    }

    public static final void p(IX0 ix0, View view) {
        G10.g(ix0, "this$0");
        ix0.h();
    }

    public static final Boolean r(IX0 ix0, Boolean bool) {
        G10.g(ix0, "this$0");
        G10.d(bool);
        if (bool.booleanValue()) {
            ix0.i();
        }
        return Boolean.TRUE;
    }

    public static final Boolean s(IX0 ix0, Boolean bool) {
        G10.g(ix0, "this$0");
        G10.d(bool);
        if (bool.booleanValue()) {
            ix0.j();
        }
        return Boolean.TRUE;
    }

    public final void h() {
        StoreItem storeItem = this.I;
        String sku = storeItem != null ? storeItem.getCom.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU java.lang.String() : null;
        Object objA = WB0.t.a(sku, Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        if (!((Boolean) objA).booleanValue()) {
            AbstractC1765Ob1.j(this);
            N.a(sku);
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + sku + "&package=com.daaw.avee")));
    }

    public final void i() {
        List list = (List) WB0.w.a(null);
        if (list == null) {
            return;
        }
        List listN = AbstractC1599Mm.n("premium_1month", "premium_3month", "premium_12month");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (listN.contains(((com.android.billingclient.api.f) obj).c())) {
                arrayList.add(obj);
            }
        }
        List listH0 = AbstractC2455Um.H0(arrayList, new b(listN));
        int i = 0;
        for (Object obj2 : AbstractC1599Mm.n(this.F, this.G, this.H)) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            StoreItem storeItem = (StoreItem) obj2;
            if (storeItem != null) {
                storeItem.setDetails((com.android.billingclient.api.f) AbstractC2455Um.h0(listH0, i));
            }
            i = i2;
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        View view = this.E;
        if (view != null) {
            view.setVisibility(0);
        }
        Button button = this.C;
        if (button == null) {
            return;
        }
        button.setVisibility(0);
    }

    public final void j() {
        for (StoreItem storeItem : AbstractC1599Mm.n(this.F, this.G, this.H)) {
            if (storeItem != null) {
                storeItem.a();
            }
        }
        t();
        u();
    }

    public final void k(View view) {
        this.C = (Button) view.findViewById(AbstractC5056hD0.u);
        this.D = (LinearLayout) view.findViewById(AbstractC5056hD0.p2);
        this.E = view.findViewById(AbstractC5056hD0.m);
        this.F = (StoreItem) view.findViewById(AbstractC5056hD0.z1);
        this.G = (StoreItem) view.findViewById(AbstractC5056hD0.A1);
        this.H = (StoreItem) view.findViewById(AbstractC5056hD0.B1);
        this.J = (TextView) view.findViewById(AbstractC5056hD0.J1);
        TextView textView = (TextView) view.findViewById(AbstractC5056hD0.z3);
        this.K = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.GX0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    IX0.l(this.B, view2);
                }
            });
        }
        StoreItem storeItem = this.G;
        if (storeItem != null) {
            storeItem.c();
        }
        StoreItem storeItem2 = this.G;
        if (storeItem2 != null) {
            storeItem2.setChecked(true);
        }
        this.I = this.G;
    }

    public final void m(StoreItem storeItem) {
        if (storeItem != null) {
            storeItem.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.HX0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IX0.n(this.B, view);
                }
            });
        }
    }

    public final void o() {
        Button button = this.C;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.FX0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IX0.p(this.B, view);
                }
            });
        }
        Iterator it = AbstractC1599Mm.n(this.F, this.G, this.H).iterator();
        while (it.hasNext()) {
            m((StoreItem) it.next());
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.X, null);
        G10.d(viewInflate);
        k(viewInflate);
        o();
        q();
        AlertDialog alertDialogCreate = builder.setView(viewInflate).create();
        G10.f(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        this.B.clear();
        super.onDestroyView();
    }

    public final void q() {
        WB0.v.b(new C0850Fg1.a() { // from class: com.daaw.DX0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return IX0.r(this.a, (Boolean) obj);
            }
        }, this.B);
        WB0.s.b(new C0850Fg1.a() { // from class: com.daaw.EX0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return IX0.s(this.a, (Boolean) obj);
            }
        }, this.B);
        i();
        j();
    }

    public final void t() {
        StoreItem storeItem = this.I;
        if (storeItem != null) {
            Boolean bool = (Boolean) WB0.t.a(storeItem.getCom.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity.EXTRAS_SKU java.lang.String(), Boolean.FALSE);
            Button button = this.C;
            if (button != null) {
                G10.d(bool);
                button.setText(bool.booleanValue() ? JD0.o6 : JD0.n6);
                button.setActivated(bool.booleanValue());
            }
        }
    }

    public final void u() {
        C0746Eg1 c0746Eg1 = WB0.m;
        Boolean bool = Boolean.FALSE;
        Object objA = c0746Eg1.a(bool);
        G10.f(objA, "invoke(...)");
        boolean z = ((Boolean) objA).booleanValue() && !((Boolean) WB0.u.a(bool)).booleanValue();
        TextView textView = this.J;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z ? 0 : 8);
    }
}
