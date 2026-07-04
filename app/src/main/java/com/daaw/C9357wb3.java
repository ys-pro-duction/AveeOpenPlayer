package com.daaw;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.daaw.wb3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9357wb3 {
    public final Context a;
    public InterfaceC1810Om2 b;
    public CO2 c;
    public CO2 d;
    public CO2 e;
    public CO2 f;
    public CO2 g;
    public WN2 h;
    public Looper i;
    public C7965rd3 j;
    public int k;
    public boolean l;
    public C3777cg3 m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public Da3 r;

    public C9357wb3(final Context context, C3172aW1 c3172aW1) {
        C3474bb3 c3474bb3 = new C3474bb3(c3172aW1);
        C4309eb3 c4309eb3 = new C4309eb3(context);
        CO2 co2 = new CO2() { // from class: com.daaw.hb3
            @Override // com.daaw.CO2
            public final Object zza() {
                return new C8877us3(context);
            }
        };
        C5994kb3 c5994kb3 = new CO2() { // from class: com.daaw.kb3
            @Override // com.daaw.CO2
            public final Object zza() {
                return new Ga3();
            }
        };
        C6840nb3 c6840nb3 = new C6840nb3(context);
        C7677qb3 c7677qb3 = new WN2() { // from class: com.daaw.qb3
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return new Ii3((InterfaceC1810Om2) obj);
            }
        };
        context.getClass();
        this.a = context;
        this.c = c3474bb3;
        this.d = c4309eb3;
        this.e = co2;
        this.f = c5994kb3;
        this.g = c6840nb3;
        this.h = c7677qb3;
        this.i = AbstractC9004vJ2.I();
        this.j = C7965rd3.c;
        this.k = 1;
        this.l = true;
        this.m = C3777cg3.g;
        this.r = new Da3(0.97f, 1.03f, 1000L, 1.0E-7f, AbstractC9004vJ2.C(20L), AbstractC9004vJ2.C(500L), 0.999f, null);
        this.b = InterfaceC1810Om2.a;
        this.n = 500L;
        this.o = 2000L;
        this.p = true;
    }

    public static /* synthetic */ Up3 a(Context context) {
        return new Ip3(context, new C0557Cn1());
    }
}
