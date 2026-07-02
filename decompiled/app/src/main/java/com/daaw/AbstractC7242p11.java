package com.daaw;

import com.daaw.C5033h8;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: com.daaw.p11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7242p11 {
    public final Feature[] a;
    public final boolean b;
    public final int c;

    /* JADX INFO: renamed from: com.daaw.p11$a */
    public static class a {
        public CG0 a;
        public Feature[] c;
        public boolean b = true;
        public int d = 0;

        public /* synthetic */ a(AbstractC10242zl1 abstractC10242zl1) {
        }

        public AbstractC7242p11 a() {
            AbstractC7506py0.b(this.a != null, "execute parameter required");
            return new C9963yl1(this, this.c, this.b, this.d);
        }

        public a b(CG0 cg0) {
            this.a = cg0;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(Feature... featureArr) {
            this.c = featureArr;
            return this;
        }

        public a e(int i) {
            this.d = i;
            return this;
        }
    }

    public AbstractC7242p11(Feature[] featureArr, boolean z, int i) {
        this.a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(C5033h8.b bVar, C7521q11 c7521q11);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final Feature[] e() {
        return this.a;
    }
}
