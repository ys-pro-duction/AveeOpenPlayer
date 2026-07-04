package com.daaw;

import com.daaw.C1881Pe1;
import com.daaw.C2620Wb0;
import com.daaw.C4208eD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Nd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1669Nd1 {
    public final C5890kC0 a;
    public boolean c;
    public C3373bD d;
    public UY e;
    public C1881Pe1.a b = C1881Pe1.a.NONE;
    public UY f = TC.h();
    public UY g = TC.h();

    /* JADX INFO: renamed from: com.daaw.Nd1$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C4208eD.a.values().length];
            a = iArr;
            try {
                iArr[C4208eD.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C4208eD.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C4208eD.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C4208eD.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Nd1$b */
    public static class b {
        public final C3373bD a;
        public final C4487fD b;
        public final boolean c;
        public final UY d;

        public /* synthetic */ b(C3373bD c3373bD, C4487fD c4487fD, UY uy, boolean z, a aVar) {
            this(c3373bD, c4487fD, uy, z);
        }

        public boolean b() {
            return this.c;
        }

        public b(C3373bD c3373bD, C4487fD c4487fD, UY uy, boolean z) {
            this.a = c3373bD;
            this.b = c4487fD;
            this.d = uy;
            this.c = z;
        }
    }

    public C1669Nd1(C5890kC0 c5890kC0, UY uy) {
        this.a = c5890kC0;
        this.d = C3373bD.p(c5890kC0.c());
        this.e = uy;
    }

    public static /* synthetic */ int a(C1669Nd1 c1669Nd1, C4208eD c4208eD, C4208eD c4208eD2) {
        c1669Nd1.getClass();
        int iL = AbstractC6838nb1.l(f(c4208eD), f(c4208eD2));
        c4208eD.c().compareTo(c4208eD2.c());
        return iL != 0 ? iL : c1669Nd1.a.c().compare(c4208eD.b(), c4208eD2.b());
    }

    public static int f(C4208eD c4208eD) {
        int i = a.a[c4208eD.c().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + c4208eD.c());
            }
        }
        return i2;
    }

    public C2107Rd1 b(b bVar) {
        return c(bVar, null);
    }

    public C2107Rd1 c(b bVar, C4721g11 c4721g11) {
        C1881Pe1 c1881Pe1;
        AbstractC6557mb.d(!bVar.c, "Cannot apply changes that need a refill", new Object[0]);
        C3373bD c3373bD = this.d;
        this.d = bVar.a;
        this.g = bVar.d;
        List listB = bVar.b.b();
        Collections.sort(listB, new Comparator() { // from class: com.daaw.Md1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1669Nd1.a(this.B, (C4208eD) obj, (C4208eD) obj2);
            }
        });
        e(c4721g11);
        List listM = m();
        C1881Pe1.a aVar = (this.f.size() == 0 && this.c) ? C1881Pe1.a.SYNCED : C1881Pe1.a.LOCAL;
        boolean z = aVar != this.b;
        this.b = aVar;
        if (listB.size() != 0 || z) {
            c1881Pe1 = new C1881Pe1(this.a, bVar.a, c3373bD, listB, aVar == C1881Pe1.a.LOCAL, bVar.d, z, false, (c4721g11 == null || c4721g11.e().isEmpty()) ? false : true);
        } else {
            c1881Pe1 = null;
        }
        return new C2107Rd1(c1881Pe1, listM);
    }

    public C2107Rd1 d(EnumC1409Kq0 enumC1409Kq0) {
        if (!this.c || enumC1409Kq0 != EnumC1409Kq0.OFFLINE) {
            return new C2107Rd1(null, Collections.EMPTY_LIST);
        }
        this.c = false;
        return b(new b(this.d, new C4487fD(), this.g, false, null));
    }

    public final void e(C4721g11 c4721g11) {
        if (c4721g11 != null) {
            Iterator it = c4721g11.b().iterator();
            while (it.hasNext()) {
                this.e = this.e.p((TC) it.next());
            }
            for (TC tc : c4721g11.c()) {
                AbstractC6557mb.d(this.e.contains(tc), "Modified document %s not found in view.", tc);
            }
            Iterator it2 = c4721g11.d().iterator();
            while (it2.hasNext()) {
                this.e = this.e.s((TC) it2.next());
            }
            this.c = c4721g11.f();
        }
    }

    public b g(SY sy) {
        return h(sy, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.C1669Nd1.b h(com.daaw.SY r18, com.daaw.C1669Nd1.b r19) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1669Nd1.h(com.daaw.SY, com.daaw.Nd1$b):com.daaw.Nd1$b");
    }

    public C1881Pe1.a i() {
        return this.b;
    }

    public UY j() {
        return this.e;
    }

    public final boolean k(TC tc) {
        LC lcQ;
        return (this.e.contains(tc) || (lcQ = this.d.q(tc)) == null || lcQ.d()) ? false : true;
    }

    public final boolean l(LC lc, LC lc2) {
        return lc.d() && lc2.c() && !lc2.d();
    }

    public final List m() {
        if (!this.c) {
            return Collections.EMPTY_LIST;
        }
        UY<TC> uy = this.f;
        this.f = TC.h();
        for (LC lc : this.d) {
            if (k(lc.getKey())) {
                this.f = this.f.p(lc.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(uy.size() + this.f.size());
        for (TC tc : uy) {
            if (!this.f.contains(tc)) {
                arrayList.add(new C2620Wb0(C2620Wb0.a.REMOVED, tc));
            }
        }
        for (TC tc2 : this.f) {
            if (!uy.contains(tc2)) {
                arrayList.add(new C2620Wb0(C2620Wb0.a.ADDED, tc2));
            }
        }
        return arrayList;
    }
}
