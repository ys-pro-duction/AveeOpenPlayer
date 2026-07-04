package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5431ib extends AbstractC5152hb {

    /* JADX INFO: renamed from: com.daaw.ib$a */
    public static final class a implements Iterable, InterfaceC9783y60 {
        public final /* synthetic */ Object[] B;

        public a(Object[] objArr) {
            this.B = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2093Ra.a(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ib$b */
    public static final class b implements KP0 {
        public final /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return AbstractC2093Ra.a(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ib$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ Object[] B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object[] objArr) {
            super(0);
            this.B = objArr;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke() {
            return AbstractC2093Ra.a(this.B);
        }
    }

    public static final boolean A(int[] iArr, int i) {
        G10.g(iArr, "<this>");
        return K(iArr, i) >= 0;
    }

    public static boolean B(Object[] objArr, Object obj) {
        G10.g(objArr, "<this>");
        return L(objArr, obj) >= 0;
    }

    public static List C(Object[] objArr, int i) {
        G10.g(objArr, "<this>");
        if (i >= 0) {
            return Z(objArr, AbstractC8417tE0.d(objArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static List D(Object[] objArr) {
        G10.g(objArr, "<this>");
        return (List) E(objArr, new ArrayList());
    }

    public static final Collection E(Object[] objArr, Collection collection) {
        G10.g(objArr, "<this>");
        G10.g(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object F(Object[] objArr) {
        G10.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object G(Object[] objArr) {
        G10.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static int H(Object[] objArr) {
        G10.g(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer I(int[] iArr, int i) {
        G10.g(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object J(Object[] objArr, int i) {
        G10.g(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final int K(int[] iArr, int i) {
        G10.g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int L(Object[] objArr, Object obj) {
        G10.g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (G10.c(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final Appendable M(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) throws IOException {
        G10.g(objArr, "<this>");
        G10.g(appendable, "buffer");
        G10.g(charSequence, "separator");
        G10.g(charSequence2, "prefix");
        G10.g(charSequence3, "postfix");
        G10.g(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            AbstractC8218sY0.a(appendable, obj, nq);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String O(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq) {
        G10.g(objArr, "<this>");
        G10.g(charSequence, "separator");
        G10.g(charSequence2, "prefix");
        G10.g(charSequence3, "postfix");
        G10.g(charSequence4, "truncated");
        String string = ((StringBuilder) M(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, nq)).toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String P(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, NQ nq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            nq = null;
        }
        CharSequence charSequence5 = charSequence4;
        NQ nq2 = nq;
        return O(objArr, charSequence, charSequence2, charSequence3, i, charSequence5, nq2);
    }

    public static Object Q(Object[] objArr) {
        G10.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[H(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int R(int[] iArr, int i) {
        G10.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static int S(Object[] objArr, Object obj) {
        G10.g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (G10.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static List T(Object[] objArr, NQ nq) {
        G10.g(objArr, "<this>");
        G10.g(nq, "transform");
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(nq.invoke(obj));
        }
        return arrayList;
    }

    public static char U(char[] cArr) {
        G10.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object V(Object[] objArr) {
        G10.g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object W(Object[] objArr) {
        G10.g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final Object[] X(Object[] objArr, Comparator comparator) {
        G10.g(objArr, "<this>");
        G10.g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G10.f(objArrCopyOf, "copyOf(...)");
        AbstractC5152hb.w(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List Y(Object[] objArr, Comparator comparator) {
        G10.g(objArr, "<this>");
        G10.g(comparator, "comparator");
        return AbstractC5152hb.d(X(objArr, comparator));
    }

    public static final List Z(Object[] objArr, int i) {
        G10.g(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return AbstractC1599Mm.k();
        }
        int length = objArr.length;
        if (i >= length) {
            return h0(objArr);
        }
        if (i == 1) {
            return AbstractC1496Lm.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static final Collection a0(Object[] objArr, Collection collection) {
        G10.g(objArr, "<this>");
        G10.g(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static List b0(byte[] bArr) {
        G10.g(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? k0(bArr) : AbstractC1496Lm.e(Byte.valueOf(bArr[0])) : AbstractC1599Mm.k();
    }

    public static List c0(char[] cArr) {
        G10.g(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? l0(cArr) : AbstractC1496Lm.e(Character.valueOf(cArr[0])) : AbstractC1599Mm.k();
    }

    public static List d0(double[] dArr) {
        G10.g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m0(dArr) : AbstractC1496Lm.e(Double.valueOf(dArr[0])) : AbstractC1599Mm.k();
    }

    public static List e0(float[] fArr) {
        G10.g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? n0(fArr) : AbstractC1496Lm.e(Float.valueOf(fArr[0])) : AbstractC1599Mm.k();
    }

    public static List f0(int[] iArr) {
        G10.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? o0(iArr) : AbstractC1496Lm.e(Integer.valueOf(iArr[0])) : AbstractC1599Mm.k();
    }

    public static List g0(long[] jArr) {
        G10.g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? p0(jArr) : AbstractC1496Lm.e(Long.valueOf(jArr[0])) : AbstractC1599Mm.k();
    }

    public static List h0(Object[] objArr) {
        G10.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? q0(objArr) : AbstractC1496Lm.e(objArr[0]) : AbstractC1599Mm.k();
    }

    public static List i0(short[] sArr) {
        G10.g(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? r0(sArr) : AbstractC1496Lm.e(Short.valueOf(sArr[0])) : AbstractC1599Mm.k();
    }

    public static List j0(boolean[] zArr) {
        G10.g(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? s0(zArr) : AbstractC1496Lm.e(Boolean.valueOf(zArr[0])) : AbstractC1599Mm.k();
    }

    public static final List k0(byte[] bArr) {
        G10.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static final List l0(char[] cArr) {
        G10.g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c2 : cArr) {
            arrayList.add(Character.valueOf(c2));
        }
        return arrayList;
    }

    public static final List m0(double[] dArr) {
        G10.g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static final List n0(float[] fArr) {
        G10.g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List o0(int[] iArr) {
        G10.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List p0(long[] jArr) {
        G10.g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final List q0(Object[] objArr) {
        G10.g(objArr, "<this>");
        return new ArrayList(AbstractC1599Mm.h(objArr));
    }

    public static final List r0(short[] sArr) {
        G10.g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static final List s0(boolean[] zArr) {
        G10.g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static Set t0(Object[] objArr) {
        G10.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) a0(objArr, new LinkedHashSet(AbstractC1369Kg0.d(objArr.length))) : AbstractC9588xQ0.c(objArr[0]) : AbstractC9867yQ0.d();
    }

    public static Iterable u0(Object[] objArr) {
        G10.g(objArr, "<this>");
        return new C8779uZ(new c(objArr));
    }

    public static List v0(Object[] objArr, Iterable iterable) {
        G10.g(objArr, "<this>");
        G10.g(iterable, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1703Nm.v(iterable, 10), length));
        int i = 0;
        for (Object obj : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(D61.a(objArr[i], obj));
            i++;
        }
        return arrayList;
    }

    public static List w0(Object[] objArr, Object[] objArr2) {
        G10.g(objArr, "<this>");
        G10.g(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(D61.a(objArr[i], objArr2[i]));
        }
        return arrayList;
    }

    public static Iterable y(Object[] objArr) {
        G10.g(objArr, "<this>");
        return objArr.length == 0 ? AbstractC1599Mm.k() : new a(objArr);
    }

    public static KP0 z(Object[] objArr) {
        G10.g(objArr, "<this>");
        return objArr.length == 0 ? SP0.e() : new b(objArr);
    }
}
