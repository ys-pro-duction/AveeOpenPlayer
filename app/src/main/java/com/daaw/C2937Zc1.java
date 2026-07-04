package com.daaw;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2937Zc1 extends AbstractC3482bd1 implements Iterable, InterfaceC9783y60 {
    public final String B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final List J;
    public final List K;

    /* JADX INFO: renamed from: com.daaw.Zc1$a */
    public static final class a implements Iterator, InterfaceC9783y60 {
        public final Iterator B;

        public a(C2937Zc1 c2937Zc1) {
            this.B = c2937Zc1.K.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC3482bd1 next() {
            return (AbstractC3482bd1) this.B.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2937Zc1(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        super(null);
        G10.g(str, "name");
        G10.g(list, "clipPathData");
        G10.g(list2, "children");
        this.B = str;
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = f5;
        this.H = f6;
        this.I = f7;
        this.J = list;
        this.K = list2;
    }

    public final float D() {
        return this.G;
    }

    public final float E() {
        return this.H;
    }

    public final float F() {
        return this.I;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2937Zc1)) {
            C2937Zc1 c2937Zc1 = (C2937Zc1) obj;
            return G10.c(this.B, c2937Zc1.B) && this.C == c2937Zc1.C && this.D == c2937Zc1.D && this.E == c2937Zc1.E && this.F == c2937Zc1.F && this.G == c2937Zc1.G && this.H == c2937Zc1.H && this.I == c2937Zc1.I && G10.c(this.J, c2937Zc1.J) && G10.c(this.K, c2937Zc1.K);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.B.hashCode() * 31) + Float.floatToIntBits(this.C)) * 31) + Float.floatToIntBits(this.D)) * 31) + Float.floatToIntBits(this.E)) * 31) + Float.floatToIntBits(this.F)) * 31) + Float.floatToIntBits(this.G)) * 31) + Float.floatToIntBits(this.H)) * 31) + Float.floatToIntBits(this.I)) * 31) + this.J.hashCode()) * 31) + this.K.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    public final List m() {
        return this.J;
    }

    public final String p() {
        return this.B;
    }

    public final float s() {
        return this.D;
    }

    public final float v() {
        return this.E;
    }

    public final float w() {
        return this.C;
    }

    public final float y() {
        return this.F;
    }
}
