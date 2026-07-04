package com.daaw;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4629fi implements Iterable {
    public static final AbstractC4629fi B = new C9917yc0(new byte[0]);

    /* JADX INFO: renamed from: com.daaw.fi$a */
    public interface a extends Iterator {
        byte c();
    }

    public static b G() {
        return new b(128);
    }

    public static AbstractC4629fi e(Iterator it, int i) {
        if (i == 1) {
            return (AbstractC4629fi) it.next();
        }
        int i2 = i >>> 1;
        return e(it, i2).m(e(it, i - i2));
    }

    public static AbstractC4629fi p(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC4629fi) it.next());
            }
        }
        return arrayList.isEmpty() ? B : e(arrayList.iterator(), arrayList.size());
    }

    public static AbstractC4629fi q(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public static AbstractC4629fi s(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C9917yc0(bArr2);
    }

    public static AbstractC4629fi v(String str) {
        try {
            return new C9917yc0(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract int D();

    public abstract boolean E();

    public abstract boolean F();

    public abstract int H(int i, int i2, int i3);

    public abstract int I(int i, int i2, int i3);

    public abstract int J();

    public byte[] K() {
        int size = size();
        if (size == 0) {
            return AbstractC3595c10.a;
        }
        byte[] bArr = new byte[size];
        y(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String L(String str);

    public String M() {
        try {
            return L("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public void N(OutputStream outputStream, int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= size()) {
            if (i2 > 0) {
                O(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public abstract void O(OutputStream outputStream, int i, int i2);

    public boolean isEmpty() {
        return size() == 0;
    }

    public AbstractC4629fi m(AbstractC4629fi abstractC4629fi) {
        int size = size();
        int size2 = abstractC4629fi.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return ZJ0.S(this, abstractC4629fi);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public void w(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                y(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void y(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: com.daaw.fi$b */
    public static final class b extends OutputStream {
        public static final byte[] G = new byte[0];
        public final int B;
        public final ArrayList C;
        public int D;
        public byte[] E;
        public int F;

        public b(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.B = i;
            this.C = new ArrayList();
            this.E = new byte[i];
        }

        public final byte[] a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        public final void c(int i) {
            this.C.add(new C9917yc0(this.E));
            int length = this.D + this.E.length;
            this.D = length;
            this.E = new byte[Math.max(this.B, Math.max(i, length >>> 1))];
            this.F = 0;
        }

        public final void d() {
            int i = this.F;
            byte[] bArr = this.E;
            if (i >= bArr.length) {
                this.C.add(new C9917yc0(this.E));
                this.E = G;
            } else if (i > 0) {
                this.C.add(new C9917yc0(a(bArr, i)));
            }
            this.D += this.F;
            this.F = 0;
        }

        public synchronized int j() {
            return this.D + this.F;
        }

        public synchronized AbstractC4629fi l() {
            d();
            return AbstractC4629fi.p(this.C);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(j()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.F == this.E.length) {
                    c(1);
                }
                byte[] bArr = this.E;
                int i2 = this.F;
                this.F = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.E;
                int length = bArr2.length;
                int i3 = this.F;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.F += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    c(i4);
                    System.arraycopy(bArr, i + length2, this.E, 0, i4);
                    this.F = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
