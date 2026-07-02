package com.daaw;

import com.daaw.C4208eD;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.m11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6405m11 {
    public int a = 0;
    public final Map b = new HashMap();
    public boolean c = true;
    public AbstractC4340ei d = AbstractC4340ei.C;
    public boolean e = false;

    /* JADX INFO: renamed from: com.daaw.m11$a */
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
                a[C4208eD.a.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void a(TC tc, C4208eD.a aVar) {
        this.c = true;
        this.b.put(tc, aVar);
    }

    public void b() {
        this.c = false;
        this.b.clear();
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.a != 0;
    }

    public void f() {
        this.c = true;
        this.e = true;
    }

    public void g() {
        this.a++;
    }

    public void h() {
        this.a--;
    }

    public void i(TC tc) {
        this.c = true;
        this.b.remove(tc);
    }

    public C4721g11 j() {
        UY uyH = TC.h();
        UY uyH2 = TC.h();
        UY uyH3 = TC.h();
        UY uyP = uyH;
        UY uyP2 = uyH2;
        UY uyP3 = uyH3;
        for (Map.Entry entry : this.b.entrySet()) {
            TC tc = (TC) entry.getKey();
            C4208eD.a aVar = (C4208eD.a) entry.getValue();
            int i = a.a[aVar.ordinal()];
            if (i == 1) {
                uyP = uyP.p(tc);
            } else if (i == 2) {
                uyP2 = uyP2.p(tc);
            } else {
                if (i != 3) {
                    throw AbstractC6557mb.a("Encountered invalid change type: %s", aVar);
                }
                uyP3 = uyP3.p(tc);
            }
        }
        return new C4721g11(this.d, this.e, uyP, uyP2, uyP3);
    }

    public void k(AbstractC4340ei abstractC4340ei) {
        if (abstractC4340ei.isEmpty()) {
            return;
        }
        this.c = true;
        this.d = abstractC4340ei;
    }
}
