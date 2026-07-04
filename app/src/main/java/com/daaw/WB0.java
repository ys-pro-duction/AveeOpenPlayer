package com.daaw;

import android.app.Activity;
import android.widget.TextView;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.g;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C8808uf;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.Common.PrControls.PrButton;
import com.daaw.avee.comp.Common.PrControls.PrCheckBox;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import com.daaw.avee.comp.Common.PrControls.PrImageButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WB0 {
    public static boolean q;
    public C8808uf e;
    public List f;
    public List h;
    public List i;
    public boolean j;
    public static final a k = new a(null);
    public static final int l = 8;
    public static C0746Eg1 m = new C0746Eg1();
    public static C0746Eg1 n = new C0746Eg1();
    public static C0850Fg1 o = new C0850Fg1();
    public static C0954Gg1 p = new C0954Gg1();
    public static final InterfaceC1396Kn r = AbstractC1603Mn.b(null, 1, null);
    public static C0850Fg1 s = new C0850Fg1();
    public static C0850Fg1 t = new C0850Fg1();
    public static C0746Eg1 u = new C0746Eg1();
    public static C0850Fg1 v = new C0850Fg1();
    public static C0746Eg1 w = new C0746Eg1();
    public final O90 a = C7555q80.f(MR0.class, null, null, 6, null);
    public final O90 b = C7555q80.f(C4812gM.class, null, null, 6, null);
    public final List c = new ArrayList();
    public final b d = new b();
    public List g = AbstractC1599Mm.k();

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final boolean a() {
            return WB0.r.o();
        }

        public a() {
        }
    }

    public final class b implements C8808uf.a {
        public b() {
        }

        @Override // com.daaw.C8808uf.a
        public void a() {
            WB0.r.B0(Boolean.FALSE);
            WB0.q = false;
        }

        @Override // com.daaw.C8808uf.a
        public void b() {
            if (WB0.this.e != null) {
                WB0.this.t0();
            } else {
                IL.a().c("no billing manager from its listener");
                a();
            }
        }

        @Override // com.daaw.C8808uf.a
        public void c(List list, boolean z) {
            G10.g(list, "purchases");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                List listC = ((Purchase) obj).c();
                G10.f(listC, "getProducts(...)");
                List list2 = listC;
                boolean z2 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (G10.c((String) it.next(), "premium")) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                WB0.q = z2;
                if (z2) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            C0576Cs0 c0576Cs0 = new C0576Cs0(arrayList, arrayList2);
            List list3 = (List) c0576Cs0.b();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                List listC2 = ((Purchase) it2.next()).c();
                G10.f(listC2, "getProducts(...)");
                AbstractC2141Rm.A(arrayList3, listC2);
            }
            C0576Cs0 c0576Cs0A = D61.a(list3, arrayList3);
            List list4 = (List) c0576Cs0A.a();
            List list5 = (List) c0576Cs0A.b();
            if (WB0.this.h == null || z) {
                WB0.this.f = list5;
                WB0.this.h = list4;
            }
            C0850Fg1 c0850Fg1 = WB0.s;
            Boolean bool = Boolean.TRUE;
            c0850Fg1.a(bool, bool);
            WB0.r.B0(bool);
            WB0.this.r0();
        }

        @Override // com.daaw.C8808uf.a
        public void d(List list) {
            G10.g(list, "history");
            WB0.this.g = list;
        }
    }

    public static final class c extends SZ0 implements InterfaceC3429bR {
        public boolean F;
        public int G;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return WB0.this.new c(interfaceC1416Ks);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
        
            if (com.daaw.AbstractC0391Ay.a(180000, r6) == r0) goto L30;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.WB0.c.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class d extends SZ0 implements InterfaceC3429bR {
        public Object F;
        public int G;

        public d(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return WB0.this.new d(interfaceC1416Ks);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        
            if (com.daaw.AbstractC0391Ay.a(60000, r6) == r0) goto L25;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.WB0.d.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class e extends AbstractC4192e90 implements NQ {
        public static final e B = new e();

        public e() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Integer[] numArr) {
            G10.g(numArr, "it");
            return Boolean.valueOf(numArr[2].intValue() == numArr[3].intValue());
        }
    }

    public static final class f extends AbstractC4192e90 implements NQ {
        public static final f B = new f();

        public f() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Integer[] numArr) {
            G10.g(numArr, "it");
            return Boolean.valueOf(numArr[2].intValue() == numArr[3].intValue());
        }
    }

    public static final class g extends AbstractC4192e90 implements NQ {
        public g() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(TextView textView) {
            if (WB0.this.m0()) {
                return Boolean.FALSE;
            }
            WB0.this.v0();
            return Boolean.TRUE;
        }
    }

    public static final class h implements C0850Fg1.a {
        public final /* synthetic */ NQ a;

        public h(NQ nq) {
            G10.g(nq, "function");
            this.a = nq;
        }

        @Override // com.daaw.C0850Fg1.a
        public final /* synthetic */ Object invoke(Object obj) {
            return this.a.invoke(obj);
        }
    }

    public WB0() {
        f0();
    }

    public static final B61 R(WB0 wb0) {
        G10.g(wb0, "this$0");
        return new B61(Boolean.valueOf(wb0.m0()), Boolean.TRUE);
    }

    public static final Boolean S(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean T(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean U(com.daaw.WB0 r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "this$0"
            com.daaw.G10.g(r1, r0)
            if (r2 == 0) goto L13
            java.util.List r1 = r1.f
            if (r1 == 0) goto L13
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 != r2) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WB0.U(com.daaw.WB0, java.lang.String):java.lang.Boolean");
    }

    public static final List V(WB0 wb0) {
        G10.g(wb0, "this$0");
        return wb0.i;
    }

    public static final Boolean W(WB0 wb0) {
        G10.g(wb0, "this$0");
        boolean z = false;
        if (wb0.h != null && (!r2.isEmpty())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Boolean X(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean Y(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.n0(new Integer[]{1, 7, 5, 3}, e.B));
    }

    public static final Boolean Z(WB0 wb0, Integer[] numArr) {
        G10.g(wb0, "this$0");
        G10.d(numArr);
        return Boolean.valueOf(o0(wb0, numArr, null, 2, null));
    }

    public static final Boolean a0(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.n0(new Integer[]{4, 4, 6, 4}, f.B));
    }

    public static final Boolean b0(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean c0(WB0 wb0, Object obj) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean d0(WB0 wb0, Object obj) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean e0(WB0 wb0, Integer[] numArr) {
        G10.g(wb0, "this$0");
        G10.d(numArr);
        return Boolean.valueOf(o0(wb0, numArr, null, 2, null));
    }

    public static final void h0(WB0 wb0, Activity activity) {
        G10.g(wb0, "this$0");
        G10.g(activity, "activity");
        wb0.J(activity);
        wb0.w0(activity);
    }

    public static final void i0(WB0 wb0, int i) {
        G10.g(wb0, "this$0");
        if (i == 4) {
            wb0.v0();
        }
    }

    public static final Boolean j0(WB0 wb0) {
        G10.g(wb0, "this$0");
        wb0.v0();
        return Boolean.TRUE;
    }

    public static final Boolean k0(WB0 wb0) {
        G10.g(wb0, "this$0");
        return Boolean.valueOf(wb0.m0());
    }

    public static final Boolean l0(WB0 wb0, PrImageButton prImageButton) {
        G10.g(wb0, "this$0");
        if (wb0.m0()) {
            return Boolean.FALSE;
        }
        wb0.v0();
        return Boolean.TRUE;
    }

    public static /* synthetic */ boolean o0(WB0 wb0, Integer[] numArr, NQ nq, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = null;
        }
        return wb0.n0(numArr, nq);
    }

    public static final void u0(WB0 wb0, com.android.billingclient.api.d dVar, List list) {
        G10.g(wb0, "this$0");
        G10.g(dVar, "billingResult");
        G10.g(list, "list");
        if (dVar.b() == 0) {
            wb0.i = list;
            v.a(Boolean.TRUE, Boolean.FALSE);
        } else {
            C0850Fg1 c0850Fg1 = v;
            Boolean bool = Boolean.FALSE;
            c0850Fg1.a(bool, bool);
        }
    }

    public final void J(Activity activity) {
        if (this.e == null) {
            this.e = new C8808uf(activity, this.d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0093 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:25:0x003e, B:27:0x0042, B:28:0x0048, B:30:0x004f, B:36:0x0064, B:39:0x0069, B:41:0x006d, B:42:0x0073, B:44:0x0079, B:48:0x0088, B:55:0x009a, B:57:0x009e, B:52:0x008f, B:54:0x0093), top: B:66:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #0 {Exception -> 0x0061, blocks: (B:25:0x003e, B:27:0x0042, B:28:0x0048, B:30:0x004f, B:36:0x0064, B:39:0x0069, B:41:0x006d, B:42:0x0073, B:44:0x0079, B:48:0x0088, B:55:0x009a, B:57:0x009e, B:52:0x008f, B:54:0x0093), top: B:66:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.WB0.K(java.lang.String):void");
    }

    public final C4812gM L() {
        return (C4812gM) this.b.getValue();
    }

    public final List M() {
        List listN = AbstractC1599Mm.n("premium_1month", "premium_3month", "premium_12month", "premium_1month_trial", "premium_1month30discount", "premium_1month90discount");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(g.b.a().b((String) it.next()).c("subs").a());
        }
        return arrayList;
    }

    public final MR0 N() {
        return (MR0) this.a.getValue();
    }

    public final com.android.billingclient.api.f O(String str) {
        G10.g(str, "skuId");
        List list = this.i;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (G10.c(((com.android.billingclient.api.f) next).c(), str)) {
                obj = next;
                break;
            }
        }
        return (com.android.billingclient.api.f) obj;
    }

    public final void P() {
        if (this.j) {
            return;
        }
        this.j = true;
        AbstractC9104vh.d(AbstractC7763qt.a(C7850rC.c()), null, null, new c(null), 3, null);
        AbstractC9104vh.d(AbstractC7763qt.a(C7850rC.c()), null, null, new d(null), 3, null);
    }

    public final void Q() {
        PrCheckBox.F.b(new C0746Eg1.a() { // from class: com.daaw.UB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.X(this.a);
            }
        }, this.c);
        PrEditText.K.b(new C0746Eg1.a() { // from class: com.daaw.DB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.Y(this.a);
            }
        }, this.c);
        PrButton.D.b(new C0850Fg1.a() { // from class: com.daaw.EB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.Z(this.a, (Integer[]) obj);
            }
        }, this.c);
        PrImageButton.B.b(new C0746Eg1.a() { // from class: com.daaw.FB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.a0(this.a);
            }
        }, this.c);
        C3847cv.A.b(new C0746Eg1.a() { // from class: com.daaw.GB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.b0(this.a);
            }
        }, this.c);
        C3486be0.Y.b(new C0850Fg1.a() { // from class: com.daaw.HB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.c0(this.a, obj);
            }
        }, this.c);
        C1092Hp.U.b(new C0850Fg1.a() { // from class: com.daaw.IB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.d0(this.a, obj);
            }
        }, this.c);
        C2221Sf1.P.b(new C0850Fg1.a() { // from class: com.daaw.JB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.e0(this.a, (Integer[]) obj);
            }
        }, this.c);
        MainActivity.j1.b(new C0746Eg1.a() { // from class: com.daaw.LB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.R(this.a);
            }
        }, this.c);
        IX0.L.c().b(new C0746Eg1.a() { // from class: com.daaw.MB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.S(this.a);
            }
        }, this.c);
        m.b(new C0746Eg1.a() { // from class: com.daaw.VB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.T(this.a);
            }
        }, this.c);
        t.b(new C0850Fg1.a() { // from class: com.daaw.AB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.U(this.a, (String) obj);
            }
        }, this.c);
        w.b(new C0746Eg1.a() { // from class: com.daaw.BB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.V(this.a);
            }
        }, this.c);
        u.b(new C0746Eg1.a() { // from class: com.daaw.CB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.W(this.a);
            }
        }, this.c);
    }

    public final void f0() {
        Q();
        g0();
    }

    public final void g0() {
        MainActivity.J0.b(new C10217zg1.a() { // from class: com.daaw.zB0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.J((Activity) obj);
            }
        }, this.c);
        MainActivity.L0.b(new C10217zg1.a() { // from class: com.daaw.KB0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                WB0.h0(this.a, (Activity) obj);
            }
        }, this.c);
        MainActivity.P0.b(new C9938yg1.a() { // from class: com.daaw.OB0
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                this.a.p0();
            }
        }, this.c);
        IX0.L.b().b(new C10217zg1.a() { // from class: com.daaw.PB0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.K((String) obj);
            }
        }, this.c);
        MY0.a.a().b(new C10217zg1.a() { // from class: com.daaw.PB0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.K((String) obj);
            }
        }, this.c);
        MainActivity.T0.b(new C10217zg1.a() { // from class: com.daaw.QB0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                WB0.i0(this.a, ((Integer) obj).intValue());
            }
        }, this.c);
        n.b(new C0746Eg1.a() { // from class: com.daaw.RB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.j0(this.a);
            }
        }, this.c);
        AbstractC2916Yx0.a.b(new C0746Eg1.a() { // from class: com.daaw.SB0
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return WB0.k0(this.a);
            }
        }, this.c);
        Iterator it = AbstractC1599Mm.n(PrCheckBox.G, PrEditText.L, PrButton.E).iterator();
        while (it.hasNext()) {
            ((C0850Fg1) it.next()).b(new h(new g()), this.c);
        }
        PrImageButton.C.b(new C0850Fg1.a() { // from class: com.daaw.TB0
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return WB0.l0(this.a, (PrImageButton) obj);
            }
        }, this.c);
    }

    public final boolean m0() {
        List list;
        return q || ((list = this.f) != null && (list.isEmpty() ^ true));
    }

    public final boolean n0(Integer[] numArr, NQ nq) {
        if (!m0()) {
            return false;
        }
        Object objA = p.a(this, numArr, Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        if (((Boolean) objA).booleanValue()) {
            return nq != null ? ((Boolean) nq.invoke(numArr)).booleanValue() : true;
        }
        return false;
    }

    public final void p0() {
        AbstractC0441Bk1.a("killHelper");
        q0();
    }

    public final void q0() {
        AbstractC0441Bk1.a("Destroying helper.");
        C8808uf c8808uf = this.e;
        if (c8808uf != null) {
            c8808uf.m();
        }
        this.e = null;
    }

    public final void r0() {
        MainActivity.Companion companion = MainActivity.INSTANCE;
        MainActivity mainActivityE = companion.e();
        if (mainActivityE != null) {
            mainActivityE.J1();
        }
        o.a(Boolean.valueOf(m0()), null);
        if (m0()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().Q(companion.e(), "pref_disableHeaderAds", true);
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().Q(companion.e(), "pref_alwaysHideAppLogo", true);
        }
    }

    public final void s0() {
        C8808uf c8808uf;
        C8808uf c8808uf2 = this.e;
        if (c8808uf2 == null || c8808uf2.q() != 0 || (c8808uf = this.e) == null) {
            return;
        }
        c8808uf.u();
    }

    public final void t0() {
        C8808uf c8808uf = this.e;
        if (c8808uf != null) {
            c8808uf.o(M(), new InterfaceC1548Lz0() { // from class: com.daaw.NB0
                @Override // com.daaw.InterfaceC1548Lz0
                public final void a(com.android.billingclient.api.d dVar, List list) {
                    WB0.u0(this.a, dVar, list);
                }
            });
        }
    }

    public final void v0() {
        IX0.L.a();
    }

    public final boolean w0(Activity activity) {
        s0();
        return false;
    }
}
