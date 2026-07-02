package com.daaw;

import com.daaw.C4208eD;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4038dd0 {
    public final int a;
    public final boolean b;
    public final UY c;
    public final UY d;

    /* JADX INFO: renamed from: com.daaw.dd0$a */
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
                a[C4208eD.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4038dd0(int i, boolean z, UY uy, UY uy2) {
        this.a = i;
        this.b = z;
        this.c = uy;
        this.d = uy2;
    }

    public static C4038dd0 a(int i, C1881Pe1 c1881Pe1) {
        UY uy = new UY(new ArrayList(), TC.a());
        UY uy2 = new UY(new ArrayList(), TC.a());
        for (C4208eD c4208eD : c1881Pe1.d()) {
            int i2 = a.a[c4208eD.c().ordinal()];
            if (i2 == 1) {
                uy = uy.p(c4208eD.b().getKey());
            } else if (i2 == 2) {
                uy2 = uy2.p(c4208eD.b().getKey());
            }
        }
        return new C4038dd0(i, c1881Pe1.k(), uy, uy2);
    }

    public UY b() {
        return this.c;
    }

    public UY c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        return this.b;
    }
}
