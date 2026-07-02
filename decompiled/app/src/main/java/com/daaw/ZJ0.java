package com.daaw;

import com.daaw.AbstractC4629fi;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public class ZJ0 extends AbstractC4629fi {
    public static final int[] I;
    public final int C;
    public final AbstractC4629fi D;
    public final AbstractC4629fi E;
    public final int F;
    public final int G;
    public int H;

    public static class b {
        public final Stack a;

        public b() {
            this.a = new Stack();
        }

        public final AbstractC4629fi b(AbstractC4629fi abstractC4629fi, AbstractC4629fi abstractC4629fi2) {
            c(abstractC4629fi);
            c(abstractC4629fi2);
            AbstractC4629fi zj0 = (AbstractC4629fi) this.a.pop();
            while (!this.a.isEmpty()) {
                zj0 = new ZJ0((AbstractC4629fi) this.a.pop(), zj0);
            }
            return zj0;
        }

        public final void c(AbstractC4629fi abstractC4629fi) {
            if (abstractC4629fi.E()) {
                e(abstractC4629fi);
                return;
            }
            if (abstractC4629fi instanceof ZJ0) {
                ZJ0 zj0 = (ZJ0) abstractC4629fi;
                c(zj0.D);
                c(zj0.E);
            } else {
                String strValueOf = String.valueOf(abstractC4629fi.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public final int d(int i) {
            int iBinarySearch = Arrays.binarySearch(ZJ0.I, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(AbstractC4629fi abstractC4629fi) {
            int iD = d(abstractC4629fi.size());
            int i = ZJ0.I[iD + 1];
            if (this.a.isEmpty() || ((AbstractC4629fi) this.a.peek()).size() >= i) {
                this.a.push(abstractC4629fi);
                return;
            }
            int i2 = ZJ0.I[iD];
            AbstractC4629fi zj0 = (AbstractC4629fi) this.a.pop();
            while (true) {
                if (this.a.isEmpty() || ((AbstractC4629fi) this.a.peek()).size() >= i2) {
                    break;
                } else {
                    zj0 = new ZJ0((AbstractC4629fi) this.a.pop(), zj0);
                }
            }
            ZJ0 zj02 = new ZJ0(zj0, abstractC4629fi);
            while (!this.a.isEmpty()) {
                if (((AbstractC4629fi) this.a.peek()).size() >= ZJ0.I[d(zj02.size()) + 1]) {
                    break;
                } else {
                    zj02 = new ZJ0((AbstractC4629fi) this.a.pop(), zj02);
                }
            }
            this.a.push(zj02);
        }
    }

    public static class c implements Iterator {
        public final Stack B;
        public C9917yc0 C;

        public final C9917yc0 a(AbstractC4629fi abstractC4629fi) {
            while (abstractC4629fi instanceof ZJ0) {
                ZJ0 zj0 = (ZJ0) abstractC4629fi;
                this.B.push(zj0);
                abstractC4629fi = zj0.D;
            }
            return (C9917yc0) abstractC4629fi;
        }

        public final C9917yc0 b() {
            while (!this.B.isEmpty()) {
                C9917yc0 c9917yc0A = a(((ZJ0) this.B.pop()).E);
                if (!c9917yc0A.isEmpty()) {
                    return c9917yc0A;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C9917yc0 next() {
            C9917yc0 c9917yc0 = this.C;
            if (c9917yc0 == null) {
                throw new NoSuchElementException();
            }
            this.C = b();
            return c9917yc0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.C != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(AbstractC4629fi abstractC4629fi) {
            this.B = new Stack();
            this.C = a(abstractC4629fi);
        }
    }

    public class d implements AbstractC4629fi.a {
        public final c B;
        public AbstractC4629fi.a C;
        public int D;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(c());
        }

        @Override // com.daaw.AbstractC4629fi.a
        public byte c() {
            if (!this.C.hasNext()) {
                this.C = this.B.next().iterator();
            }
            this.D--;
            return this.C.c();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.D > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public d() {
            c cVar = new c(ZJ0.this);
            this.B = cVar;
            this.C = cVar.next().iterator();
            this.D = ZJ0.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        I = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = I;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public static AbstractC4629fi S(AbstractC4629fi abstractC4629fi, AbstractC4629fi abstractC4629fi2) {
        ZJ0 zj0 = abstractC4629fi instanceof ZJ0 ? (ZJ0) abstractC4629fi : null;
        if (abstractC4629fi2.size() == 0) {
            return abstractC4629fi;
        }
        if (abstractC4629fi.size() == 0) {
            return abstractC4629fi2;
        }
        int size = abstractC4629fi.size() + abstractC4629fi2.size();
        if (size < 128) {
            return T(abstractC4629fi, abstractC4629fi2);
        }
        if (zj0 != null && zj0.E.size() + abstractC4629fi2.size() < 128) {
            return new ZJ0(zj0.D, T(zj0.E, abstractC4629fi2));
        }
        if (zj0 == null || zj0.D.D() <= zj0.E.D() || zj0.D() <= abstractC4629fi2.D()) {
            return size >= I[Math.max(abstractC4629fi.D(), abstractC4629fi2.D()) + 1] ? new ZJ0(abstractC4629fi, abstractC4629fi2) : new b().b(abstractC4629fi, abstractC4629fi2);
        }
        return new ZJ0(zj0.D, new ZJ0(zj0.E, abstractC4629fi2));
    }

    public static C9917yc0 T(AbstractC4629fi abstractC4629fi, AbstractC4629fi abstractC4629fi2) {
        int size = abstractC4629fi.size();
        int size2 = abstractC4629fi2.size();
        byte[] bArr = new byte[size + size2];
        abstractC4629fi.w(bArr, 0, 0, size);
        abstractC4629fi2.w(bArr, 0, size, size2);
        return new C9917yc0(bArr);
    }

    @Override // com.daaw.AbstractC4629fi
    public int D() {
        return this.G;
    }

    @Override // com.daaw.AbstractC4629fi
    public boolean E() {
        return this.C >= I[this.G];
    }

    @Override // com.daaw.AbstractC4629fi
    public boolean F() {
        int I2 = this.D.I(0, 0, this.F);
        AbstractC4629fi abstractC4629fi = this.E;
        return abstractC4629fi.I(I2, 0, abstractC4629fi.size()) == 0;
    }

    @Override // com.daaw.AbstractC4629fi
    public int H(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.F;
        if (i4 <= i5) {
            return this.D.H(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.E.H(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.E.H(this.D.H(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC4629fi
    public int I(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.F;
        if (i4 <= i5) {
            return this.D.I(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.E.I(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.E.I(this.D.I(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC4629fi
    public int J() {
        return this.H;
    }

    @Override // com.daaw.AbstractC4629fi
    public String L(String str) {
        return new String(K(), str);
    }

    @Override // com.daaw.AbstractC4629fi
    public void O(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.F;
        if (i3 <= i4) {
            this.D.O(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.E.O(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.D.O(outputStream, i, i5);
            this.E.O(outputStream, 0, i2 - i5);
        }
    }

    public final boolean U(AbstractC4629fi abstractC4629fi) {
        c cVar = new c(this);
        C9917yc0 c9917yc0 = (C9917yc0) cVar.next();
        c cVar2 = new c(abstractC4629fi);
        C9917yc0 c9917yc02 = (C9917yc0) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = c9917yc0.size() - i;
            int size2 = c9917yc02.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? c9917yc0.P(c9917yc02, i2, iMin) : c9917yc02.P(c9917yc0, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.C;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                c9917yc0 = (C9917yc0) cVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == size2) {
                c9917yc02 = (C9917yc0) cVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC4629fi.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iJ;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4629fi)) {
            return false;
        }
        AbstractC4629fi abstractC4629fi = (AbstractC4629fi) obj;
        if (this.C != abstractC4629fi.size()) {
            return false;
        }
        if (this.C == 0) {
            return true;
        }
        if (this.H == 0 || (iJ = abstractC4629fi.J()) == 0 || this.H == iJ) {
            return U(abstractC4629fi);
        }
        return false;
    }

    public int hashCode() {
        int iH = this.H;
        if (iH == 0) {
            int i = this.C;
            iH = H(i, 0, i);
            if (iH == 0) {
                iH = 1;
            }
            this.H = iH;
        }
        return iH;
    }

    @Override // com.daaw.AbstractC4629fi
    public int size() {
        return this.C;
    }

    @Override // com.daaw.AbstractC4629fi
    public void y(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.F;
        if (i4 <= i5) {
            this.D.y(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.E.y(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.D.y(bArr, i, i2, i6);
            this.E.y(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    public ZJ0(AbstractC4629fi abstractC4629fi, AbstractC4629fi abstractC4629fi2) {
        this.H = 0;
        this.D = abstractC4629fi;
        this.E = abstractC4629fi2;
        int size = abstractC4629fi.size();
        this.F = size;
        this.C = size + abstractC4629fi2.size();
        this.G = Math.max(abstractC4629fi.D(), abstractC4629fi2.D()) + 1;
    }
}
