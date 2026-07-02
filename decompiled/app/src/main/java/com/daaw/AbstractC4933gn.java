package com.daaw;

/* JADX INFO: renamed from: com.daaw.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4933gn {
    public static final a d = new a(null);
    public final String a;
    public final long b;
    public final int c;

    /* JADX INFO: renamed from: com.daaw.gn$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC4933gn(String str, long j, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, j, i);
    }

    public abstract float[] a(float[] fArr);

    public final int b() {
        return AbstractC3808cn.f(this.b);
    }

    public final int c() {
        return this.c;
    }

    public abstract float d(int i);

    public abstract float e(int i);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G10.c(AbstractC5624jG0.b(getClass()), AbstractC5624jG0.b(obj.getClass()))) {
            return false;
        }
        AbstractC4933gn abstractC4933gn = (AbstractC4933gn) obj;
        if (this.c == abstractC4933gn.c && G10.c(this.a, abstractC4933gn.a)) {
            return AbstractC3808cn.e(this.b, abstractC4933gn.b);
        }
        return false;
    }

    public final long f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + AbstractC3808cn.g(this.b)) * 31) + this.c;
    }

    public abstract float[] i(float[] fArr);

    public String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) AbstractC3808cn.h(this.b)) + ')';
    }

    public AbstractC4933gn(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }
}
