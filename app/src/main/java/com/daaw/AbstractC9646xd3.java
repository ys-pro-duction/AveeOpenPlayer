package com.daaw;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.xd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9646xd3 implements Iterable, Serializable {
    public static final AbstractC9646xd3 C = new C5166hd3(AbstractC10214zf3.d);
    public static final Comparator D;
    public static final C6850nd3 E;
    public int B = 0;

    static {
        int i = Ac3.a;
        E = new C6850nd3(null);
        D = new Sc3();
    }

    public static int G(int i, int i2, int i3) {
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

    public static AbstractC9646xd3 I(byte[] bArr, int i, int i2) {
        G(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C5166hd3(bArr2);
    }

    public abstract String D(Charset charset);

    public abstract void E(Lc3 lc3);

    public abstract boolean F();

    public final int H() {
        return this.B;
    }

    public final String J(Charset charset) {
        return s() == 0 ? "" : D(charset);
    }

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iW = this.B;
        if (iW == 0) {
            int iS = s();
            iW = w(iS, 0, iS);
            if (iW == 0) {
                iW = 1;
            }
            this.B = iW;
        }
        return iW;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Oc3(this);
    }

    public abstract byte q(int i);

    public abstract int s();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(s()), s() <= 50 ? Lh3.a(this) : Lh3.a(y(0, 47)).concat("..."));
    }

    public abstract int w(int i, int i2, int i3);

    public abstract AbstractC9646xd3 y(int i, int i2);
}
