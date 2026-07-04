package com.daaw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.daaw.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5152hb extends AbstractC4873gb {

    /* JADX INFO: renamed from: com.daaw.hb$a */
    public static final class a extends J implements RandomAccess {
        public final /* synthetic */ int[] C;

        public a(int[] iArr) {
            this.C = iArr;
        }

        public int D(int i) {
            return AbstractC5431ib.R(this.C, i);
        }

        @Override // com.daaw.AbstractC9193w, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return s(((Number) obj).intValue());
            }
            return false;
        }

        @Override // com.daaw.AbstractC9193w
        public int e() {
            return this.C.length;
        }

        @Override // com.daaw.J, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return y(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // com.daaw.AbstractC9193w, java.util.Collection
        public boolean isEmpty() {
            return this.C.length == 0;
        }

        @Override // com.daaw.J, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return D(((Number) obj).intValue());
            }
            return -1;
        }

        public boolean s(int i) {
            return AbstractC5431ib.A(this.C, i);
        }

        @Override // com.daaw.J, java.util.List
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer get(int i) {
            return Integer.valueOf(this.C[i]);
        }

        public int y(int i) {
            return AbstractC5431ib.K(this.C, i);
        }
    }

    public static List c(int[] iArr) {
        G10.g(iArr, "<this>");
        return new a(iArr);
    }

    public static List d(Object[] objArr) {
        G10.g(objArr, "<this>");
        List listA = AbstractC5711jb.a(objArr);
        G10.f(listA, "asList(...)");
        return listA;
    }

    public static float[] e(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        G10.g(fArr, "<this>");
        G10.g(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static int[] f(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        G10.g(iArr, "<this>");
        G10.g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] g(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        G10.g(jArr, "<this>");
        G10.g(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static Object[] h(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        G10.g(objArr, "<this>");
        G10.g(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static /* synthetic */ float[] i(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return e(fArr, fArr2, i, i2, i3);
    }

    public static /* synthetic */ int[] j(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return f(iArr, iArr2, i, i2, i3);
    }

    public static /* synthetic */ Object[] k(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return h(objArr, objArr2, i, i2, i3);
    }

    public static byte[] l(byte[] bArr, int i, int i2) {
        G10.g(bArr, "<this>");
        AbstractC4594fb.b(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        G10.f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static float[] m(float[] fArr, int i, int i2) {
        G10.g(fArr, "<this>");
        AbstractC4594fb.b(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        G10.f(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static Object[] n(Object[] objArr, int i, int i2) {
        G10.g(objArr, "<this>");
        AbstractC4594fb.b(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        G10.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void o(int[] iArr, int i, int i2, int i3) {
        G10.g(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static void p(Object[] objArr, Object obj, int i, int i2) {
        G10.g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static /* synthetic */ void q(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        o(iArr, i, i2, i3);
    }

    public static byte[] r(byte[] bArr, byte[] bArr2) {
        G10.g(bArr, "<this>");
        G10.g(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        G10.d(bArrCopyOf);
        return bArrCopyOf;
    }

    public static int[] s(int[] iArr, int i) {
        G10.g(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        G10.d(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] t(int[] iArr, int[] iArr2) {
        G10.g(iArr, "<this>");
        G10.g(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        G10.d(iArrCopyOf);
        return iArrCopyOf;
    }

    public static Object[] u(Object[] objArr, Object obj) {
        G10.g(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        G10.d(objArrCopyOf);
        return objArrCopyOf;
    }

    public static void v(Object[] objArr) {
        G10.g(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void w(Object[] objArr, Comparator comparator) {
        G10.g(objArr, "<this>");
        G10.g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void x(Object[] objArr, Comparator comparator, int i, int i2) {
        G10.g(objArr, "<this>");
        G10.g(comparator, "comparator");
        Arrays.sort(objArr, i, i2, comparator);
    }
}
