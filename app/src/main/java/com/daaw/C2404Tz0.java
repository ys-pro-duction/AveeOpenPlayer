package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2404Tz0 {
    public static final a d = new a(null);
    public static final C2404Tz0 e = new C2404Tz0(0.0f, AbstractC8138sE0.b(0.0f, 0.0f), 0, 4, null);
    public final float a;
    public final InterfaceC7449pm b;
    public final int c;

    /* JADX INFO: renamed from: com.daaw.Tz0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2404Tz0 a() {
            return C2404Tz0.e;
        }

        public a() {
        }
    }

    public C2404Tz0(float f, InterfaceC7449pm interfaceC7449pm, int i) {
        G10.g(interfaceC7449pm, "range");
        this.a = f;
        this.b = interfaceC7449pm;
        this.c = i;
    }

    public final float b() {
        return this.a;
    }

    public final InterfaceC7449pm c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2404Tz0)) {
            return false;
        }
        C2404Tz0 c2404Tz0 = (C2404Tz0) obj;
        return this.a == c2404Tz0.a && G10.c(this.b, c2404Tz0.b) && this.c == c2404Tz0.c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + ')';
    }

    public /* synthetic */ C2404Tz0(float f, InterfaceC7449pm interfaceC7449pm, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(f, interfaceC7449pm, (i2 & 4) != 0 ? 0 : i);
    }
}
