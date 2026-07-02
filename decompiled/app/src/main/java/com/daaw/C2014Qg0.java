package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2014Qg0 {
    public final a a;
    public final Q6 b;
    public final K6 c;
    public final boolean d;

    /* JADX INFO: renamed from: com.daaw.Qg0$a */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C2014Qg0(a aVar, Q6 q6, K6 k6, boolean z) {
        this.a = aVar;
        this.b = q6;
        this.c = k6;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public Q6 b() {
        return this.b;
    }

    public K6 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
