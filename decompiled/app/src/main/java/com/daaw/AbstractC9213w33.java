package com.daaw;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.w33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9213w33 implements Iterable, Serializable {
    public static final AbstractC9213w33 C = new C8090s33(AbstractC8374t43.d);
    public static final Comparator D;
    public static final C8934v33 E;
    public int B = 0;

    static {
        int i = AbstractC5012h33.a;
        E = new C8934v33(null);
        D = new C6696n33();
    }

    public static int O(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static C8369t33 R() {
        return new C8369t33(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC9213w33 S(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? C : w(iterable.iterator(), size);
    }

    public static AbstractC9213w33 T(byte[] bArr, int i, int i2) {
        O(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C8090s33(bArr2);
    }

    public static AbstractC9213w33 U(String str) {
        return new C8090s33(str.getBytes(AbstractC8374t43.b));
    }

    public static void W(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public static AbstractC9213w33 w(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (AbstractC9213w33) it.next();
        }
        int i2 = i >>> 1;
        AbstractC9213w33 abstractC9213w33W = w(it, i2);
        AbstractC9213w33 abstractC9213w33W2 = w(it, i - i2);
        if (Integer.MAX_VALUE - abstractC9213w33W.y() >= abstractC9213w33W2.y()) {
            return C7543q53.Z(abstractC9213w33W, abstractC9213w33W2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + abstractC9213w33W.y() + "+" + abstractC9213w33W2.y());
    }

    public abstract void D(byte[] bArr, int i, int i2, int i3);

    public abstract int E();

    public abstract boolean F();

    public abstract int G(int i, int i2, int i3);

    public abstract int H(int i, int i2, int i3);

    public abstract AbstractC9213w33 I(int i, int i2);

    public abstract E33 J();

    public abstract String K(Charset charset);

    public abstract ByteBuffer L();

    public abstract void M(AbstractC6138l33 abstractC6138l33);

    public abstract boolean N();

    public final int P() {
        return this.B;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public InterfaceC7533q33 iterator() {
        return new C6417m33(this);
    }

    public final String V(Charset charset) {
        return y() == 0 ? "" : K(charset);
    }

    public final void X(byte[] bArr, int i, int i2, int i3) {
        O(0, i3, y());
        O(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            D(bArr, 0, i2, i3);
        }
    }

    public final byte[] e() {
        int iY = y();
        if (iY == 0) {
            return AbstractC8374t43.d;
        }
        byte[] bArr = new byte[iY];
        D(bArr, 0, 0, iY);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iG = this.B;
        if (iG == 0) {
            int iY = y();
            iG = G(iY, 0, iY);
            if (iG == 0) {
                iG = 1;
            }
            this.B = iG;
        }
        return iG;
    }

    public abstract byte q(int i);

    public abstract byte s(int i);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(y()), y() <= 50 ? AbstractC8658u53.a(this) : AbstractC8658u53.a(I(0, 47)).concat("..."));
    }

    public abstract int y();
}
