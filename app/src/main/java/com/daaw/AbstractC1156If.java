package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1156If {
    public static final a f = new a(null);
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    /* JADX INFO: renamed from: com.daaw.If$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public AbstractC1156If(int... iArr) {
        List listK;
        G10.g(iArr, "numbers");
        this.a = iArr;
        Integer numI = AbstractC5431ib.I(iArr, 0);
        this.b = numI != null ? numI.intValue() : -1;
        Integer numI2 = AbstractC5431ib.I(iArr, 1);
        this.c = numI2 != null ? numI2.intValue() : -1;
        Integer numI3 = AbstractC5431ib.I(iArr, 2);
        this.d = numI3 != null ? numI3.intValue() : -1;
        if (iArr.length <= 3) {
            listK = AbstractC1599Mm.k();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listK = AbstractC2455Um.M0(AbstractC5152hb.c(iArr).subList(3, iArr.length));
        }
        this.e = listK;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean d(AbstractC1156If abstractC1156If) {
        G10.g(abstractC1156If, "version");
        return c(abstractC1156If.b, abstractC1156If.c, abstractC1156If.d);
    }

    public final boolean e(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.c;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.d <= i3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !G10.c(getClass(), obj.getClass())) {
            return false;
        }
        AbstractC1156If abstractC1156If = (AbstractC1156If) obj;
        return this.b == abstractC1156If.b && this.c == abstractC1156If.c && this.d == abstractC1156If.d && G10.c(this.e, abstractC1156If.e);
    }

    public final boolean f(AbstractC1156If abstractC1156If) {
        G10.g(abstractC1156If, "ourVersion");
        int i = this.b;
        return i == 0 ? abstractC1156If.b == 0 && this.c == abstractC1156If.c : i == abstractC1156If.b && this.c <= abstractC1156If.c;
    }

    public final int[] g() {
        return this.a;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = i + (i * 31) + this.c;
        int i3 = i2 + (i2 * 31) + this.d;
        return i3 + (i3 * 31) + this.e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i : iArrG) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC2455Um.n0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
