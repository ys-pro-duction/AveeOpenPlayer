package com.daaw;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4340ei implements Iterable, Serializable {
    public static final AbstractC4340ei C = new i(AbstractC3317b10.d);
    public static final f D;
    public static final Comparator E;
    public int B = 0;

    /* JADX INFO: renamed from: com.daaw.ei$a */
    public class a extends c {
        public int B = 0;
        public final int C;

        public a() {
            this.C = AbstractC4340ei.this.size();
        }

        @Override // com.daaw.AbstractC4340ei.g
        public byte c() {
            int i = this.B;
            if (i >= this.C) {
                throw new NoSuchElementException();
            }
            this.B = i + 1;
            return AbstractC4340ei.this.M(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B < this.C;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$b */
    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
            g gVarP = abstractC4340ei.iterator();
            g gVarP2 = abstractC4340ei2.iterator();
            while (gVarP.hasNext() && gVarP2.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC4340ei.X(gVarP.c())).compareTo(Integer.valueOf(AbstractC4340ei.X(gVarP2.c())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC4340ei.size()).compareTo(Integer.valueOf(abstractC4340ei2.size()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$d */
    public static final class d implements f {
        public d() {
        }

        @Override // com.daaw.AbstractC4340ei.f
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$e */
    public static final class e extends i {
        public final int G;
        public final int H;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            AbstractC4340ei.D(i, i + i2, bArr.length);
            this.G = i;
            this.H = i2;
        }

        @Override // com.daaw.AbstractC4340ei.i, com.daaw.AbstractC4340ei
        public void K(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.F, h0() + i, bArr, i2, i3);
        }

        @Override // com.daaw.AbstractC4340ei.i, com.daaw.AbstractC4340ei
        public byte M(int i) {
            return this.F[this.G + i];
        }

        @Override // com.daaw.AbstractC4340ei.i
        public int h0() {
            return this.G;
        }

        @Override // com.daaw.AbstractC4340ei.i, com.daaw.AbstractC4340ei
        public int size() {
            return this.H;
        }

        @Override // com.daaw.AbstractC4340ei.i, com.daaw.AbstractC4340ei
        public byte w(int i) {
            AbstractC4340ei.y(i, size());
            return this.F[this.G + i];
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$f */
    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: renamed from: com.daaw.ei$g */
    public interface g extends Iterator {
        byte c();
    }

    /* JADX INFO: renamed from: com.daaw.ei$h */
    public static abstract class h extends AbstractC4340ei {
        @Override // com.daaw.AbstractC4340ei
        public final int L() {
            return 0;
        }

        @Override // com.daaw.AbstractC4340ei
        public final boolean N() {
            return true;
        }

        public abstract boolean g0(AbstractC4340ei abstractC4340ei, int i, int i2);

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$i */
    public static class i extends h {
        public final byte[] F;

        public i(byte[] bArr) {
            bArr.getClass();
            this.F = bArr;
        }

        @Override // com.daaw.AbstractC4340ei
        public void K(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.F, i, bArr, i2, i3);
        }

        @Override // com.daaw.AbstractC4340ei
        public byte M(int i) {
            return this.F[i];
        }

        @Override // com.daaw.AbstractC4340ei
        public final boolean O() {
            int iH0 = h0();
            return AbstractC3472bb1.t(this.F, iH0, size() + iH0);
        }

        @Override // com.daaw.AbstractC4340ei
        public final AbstractC9408wm Q() {
            return AbstractC9408wm.l(this.F, h0(), size(), true);
        }

        @Override // com.daaw.AbstractC4340ei
        public final int R(int i, int i2, int i3) {
            return AbstractC3317b10.h(i, this.F, h0() + i2, i3);
        }

        @Override // com.daaw.AbstractC4340ei
        public final int S(int i, int i2, int i3) {
            int iH0 = h0() + i2;
            return AbstractC3472bb1.v(i, this.F, iH0, i3 + iH0);
        }

        @Override // com.daaw.AbstractC4340ei
        public final AbstractC4340ei V(int i, int i2) {
            int iD = AbstractC4340ei.D(i, i2, size());
            return iD == 0 ? AbstractC4340ei.C : new e(this.F, h0() + i, iD);
        }

        @Override // com.daaw.AbstractC4340ei
        public final String Z(Charset charset) {
            return new String(this.F, h0(), size(), charset);
        }

        @Override // com.daaw.AbstractC4340ei
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC4340ei) || size() != ((AbstractC4340ei) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iT = T();
            int iT2 = iVar.T();
            if (iT == 0 || iT2 == 0 || iT == iT2) {
                return g0(iVar, 0, size());
            }
            return false;
        }

        @Override // com.daaw.AbstractC4340ei
        public final void f0(AbstractC3783ci abstractC3783ci) {
            abstractC3783ci.b(this.F, h0(), size());
        }

        @Override // com.daaw.AbstractC4340ei.h
        public final boolean g0(AbstractC4340ei abstractC4340ei, int i, int i2) {
            if (i2 > abstractC4340ei.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > abstractC4340ei.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + abstractC4340ei.size());
            }
            if (!(abstractC4340ei instanceof i)) {
                return abstractC4340ei.V(i, i3).equals(V(0, i2));
            }
            i iVar = (i) abstractC4340ei;
            byte[] bArr = this.F;
            byte[] bArr2 = iVar.F;
            int iH0 = h0() + i2;
            int iH02 = h0();
            int iH03 = iVar.h0() + i;
            while (iH02 < iH0) {
                if (bArr[iH02] != bArr2[iH03]) {
                    return false;
                }
                iH02++;
                iH03++;
            }
            return true;
        }

        public int h0() {
            return 0;
        }

        @Override // com.daaw.AbstractC4340ei
        public final ByteBuffer q() {
            return ByteBuffer.wrap(this.F, h0(), size()).asReadOnlyBuffer();
        }

        @Override // com.daaw.AbstractC4340ei
        public int size() {
            return this.F.length;
        }

        @Override // com.daaw.AbstractC4340ei
        public byte w(int i) {
            return this.F[i];
        }
    }

    /* JADX INFO: renamed from: com.daaw.ei$j */
    public static final class j implements f {
        public j() {
        }

        @Override // com.daaw.AbstractC4340ei.f
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        D = AbstractC6418m4.c() ? new j(aVar) : new d(aVar);
        E = new b();
    }

    public static int D(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static AbstractC4340ei F(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? C : s(iterable.iterator(), size);
    }

    public static AbstractC4340ei G(byte[] bArr) {
        return H(bArr, 0, bArr.length);
    }

    public static AbstractC4340ei H(byte[] bArr, int i2, int i3) {
        D(i2, i2 + i3, bArr.length);
        return new i(D.a(bArr, i2, i3));
    }

    public static AbstractC4340ei I(String str) {
        return new i(str.getBytes(AbstractC3317b10.b));
    }

    public static int X(byte b2) {
        return b2 & 255;
    }

    public static AbstractC4340ei c0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C3257ao0(byteBuffer);
        }
        return e0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static AbstractC4340ei d0(byte[] bArr) {
        return new i(bArr);
    }

    public static AbstractC4340ei e0(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public static AbstractC4340ei s(Iterator it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return (AbstractC4340ei) it.next();
        }
        int i3 = i2 >>> 1;
        return s(it, i3).E(s(it, i2 - i3));
    }

    public static void y(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public final AbstractC4340ei E(AbstractC4340ei abstractC4340ei) {
        if (Integer.MAX_VALUE - size() >= abstractC4340ei.size()) {
            return YJ0.j0(this, abstractC4340ei);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC4340ei.size());
    }

    public final void J(byte[] bArr, int i2, int i3, int i4) {
        D(i2, i2 + i4, size());
        D(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            K(bArr, i2, i3, i4);
        }
    }

    public abstract void K(byte[] bArr, int i2, int i3, int i4);

    public abstract int L();

    public abstract byte M(int i2);

    public abstract boolean N();

    public abstract boolean O();

    /* JADX INFO: renamed from: P */
    public g iterator() {
        return new a();
    }

    public abstract AbstractC9408wm Q();

    public abstract int R(int i2, int i3, int i4);

    public abstract int S(int i2, int i3, int i4);

    public final int T() {
        return this.B;
    }

    public final AbstractC4340ei U(int i2) {
        return V(i2, size());
    }

    public abstract AbstractC4340ei V(int i2, int i3);

    public final byte[] W() {
        int size = size();
        if (size == 0) {
            return AbstractC3317b10.d;
        }
        byte[] bArr = new byte[size];
        K(bArr, 0, 0, size);
        return bArr;
    }

    public final String Y(Charset charset) {
        return size() == 0 ? "" : Z(charset);
    }

    public abstract String Z(Charset charset);

    public final String a0() {
        return Y(AbstractC3317b10.b);
    }

    public final String b0() {
        if (size() <= 50) {
            return AbstractC4158e21.a(this);
        }
        return AbstractC4158e21.a(V(0, 47)) + "...";
    }

    public abstract boolean equals(Object obj);

    public abstract void f0(AbstractC3783ci abstractC3783ci);

    public final int hashCode() {
        int iR = this.B;
        if (iR == 0) {
            int size = size();
            iR = R(size, 0, size);
            if (iR == 0) {
                iR = 1;
            }
            this.B = iR;
        }
        return iR;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract ByteBuffer q();

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), b0());
    }

    public abstract byte w(int i2);
}
