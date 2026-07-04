package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class Y71 {
    public static final a k = new a(null);
    public static final Y71 l;
    public static final Y71 m;
    public static final Y71 n;
    public static final Y71 o;
    public static final Y71 p;
    public static final Y71 q;
    public static final Y71 r;
    public static final Y71 s;
    public static final Y71 t;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Y71 f;
    public final boolean g;
    public final Y71 h;
    public final Y71 i;
    public final boolean j;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1042Hc1.values().length];
            try {
                iArr[EnumC1042Hc1.G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1042Hc1.F.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Y71 y71 = new Y71(z, z2, z3, z4, z5, null, false, null, null, z6, 1023, null);
        l = y71;
        Y71 y712 = new Y71(false, false, z6, false, false, null, false, null, null, true, 511, null);
        m = y712;
        n = new Y71(false, true, false, false, false, null, false, null, null, false, 1021, null);
        o = new Y71(z, z2, z3, z4, z5, y71, false, null, null, z6, 988, null);
        p = new Y71(false, false, z6, false, false, y712, false, null, null, true, 476, null);
        AbstractC2911Yw abstractC2911Yw = null;
        boolean z7 = false;
        Y71 y713 = null;
        Y71 y714 = null;
        q = new Y71(z, true, z3, z4, z5, y71, z7, y713, y714, z6, 988, abstractC2911Yw);
        boolean z8 = false;
        boolean z9 = true;
        r = new Y71(z, z8, z3, z9, z5, y71, z7, y713, y714, z6, 983, abstractC2911Yw);
        s = new Y71(z, z8, z3, z9, z5, y71, z7, y713, y714, z6, 919, abstractC2911Yw);
        t = new Y71(z, z8, true, false, z5, y71, z7, y713, y714, z6, 984, abstractC2911Yw);
    }

    public Y71(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Y71 y71, boolean z6, Y71 y712, Y71 y713, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = y71;
        this.g = z6;
        this.h = y712;
        this.i = y713;
        this.j = z7;
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final Y71 f(EnumC1042Hc1 enumC1042Hc1, boolean z) {
        G10.g(enumC1042Hc1, "effectiveVariance");
        if (!z || !this.c) {
            int i = b.a[enumC1042Hc1.ordinal()];
            if (i == 1) {
                Y71 y71 = this.h;
                if (y71 != null) {
                    return y71;
                }
            } else if (i != 2) {
                Y71 y712 = this.f;
                if (y712 != null) {
                    return y712;
                }
            } else {
                Y71 y713 = this.i;
                if (y713 != null) {
                    return y713;
                }
            }
        }
        return this;
    }

    public final Y71 g() {
        return new Y71(this.a, true, this.c, this.d, this.e, this.f, this.g, this.h, this.i, false, AdRequest.MAX_CONTENT_URL_LENGTH, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Y71(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Y71 y71, boolean z6, Y71 y712, Y71 y713, boolean z7, int i, AbstractC2911Yw abstractC2911Yw) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        y71 = (i & 32) != 0 ? null : y71;
        this(z, z2, z3, z4, z5, y71, (i & 64) != 0 ? true : z6, (i & 128) != 0 ? y71 : y712, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? y71 : y713, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z7);
    }
}
