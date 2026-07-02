package com.daaw;

import com.daaw.AbstractC4340ei;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class YJ0 extends AbstractC4340ei {
    public static final int[] K = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int F;
    public final AbstractC4340ei G;
    public final AbstractC4340ei H;
    public final int I;
    public final int J;

    public class a extends AbstractC4340ei.c {
        public final c B;
        public AbstractC4340ei.g C = b();

        public a() {
            this.B = new c(YJ0.this, null);
        }

        public final AbstractC4340ei.g b() {
            if (this.B.hasNext()) {
                return this.B.next().iterator();
            }
            return null;
        }

        @Override // com.daaw.AbstractC4340ei.g
        public byte c() {
            AbstractC4340ei.g gVar = this.C;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bC = gVar.c();
            if (!this.C.hasNext()) {
                this.C = b();
            }
            return bC;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.C != null;
        }
    }

    public static final class c implements Iterator {
        public final ArrayDeque B;
        public AbstractC4340ei.h C;

        public /* synthetic */ c(AbstractC4340ei abstractC4340ei, a aVar) {
            this(abstractC4340ei);
        }

        public final AbstractC4340ei.h a(AbstractC4340ei abstractC4340ei) {
            while (abstractC4340ei instanceof YJ0) {
                YJ0 yj0 = (YJ0) abstractC4340ei;
                this.B.push(yj0);
                abstractC4340ei = yj0.G;
            }
            return (AbstractC4340ei.h) abstractC4340ei;
        }

        public final AbstractC4340ei.h b() {
            AbstractC4340ei.h hVarA;
            do {
                ArrayDeque arrayDeque = this.B;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                hVarA = a(((YJ0) this.B.pop()).H);
            } while (hVarA.isEmpty());
            return hVarA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC4340ei.h next() {
            AbstractC4340ei.h hVar = this.C;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.C = b();
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.C != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public c(AbstractC4340ei abstractC4340ei) {
            if (!(abstractC4340ei instanceof YJ0)) {
                this.B = null;
                this.C = (AbstractC4340ei.h) abstractC4340ei;
                return;
            }
            YJ0 yj0 = (YJ0) abstractC4340ei;
            ArrayDeque arrayDeque = new ArrayDeque(yj0.L());
            this.B = arrayDeque;
            arrayDeque.push(yj0);
            this.C = a(yj0.G);
        }
    }

    public /* synthetic */ YJ0(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2, a aVar) {
        this(abstractC4340ei, abstractC4340ei2);
    }

    public static AbstractC4340ei j0(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
        if (abstractC4340ei2.size() == 0) {
            return abstractC4340ei;
        }
        if (abstractC4340ei.size() == 0) {
            return abstractC4340ei2;
        }
        int size = abstractC4340ei.size() + abstractC4340ei2.size();
        if (size < 128) {
            return k0(abstractC4340ei, abstractC4340ei2);
        }
        if (abstractC4340ei instanceof YJ0) {
            YJ0 yj0 = (YJ0) abstractC4340ei;
            if (yj0.H.size() + abstractC4340ei2.size() < 128) {
                return new YJ0(yj0.G, k0(yj0.H, abstractC4340ei2));
            }
            if (yj0.G.L() > yj0.H.L() && yj0.L() > abstractC4340ei2.L()) {
                return new YJ0(yj0.G, new YJ0(yj0.H, abstractC4340ei2));
            }
        }
        return size >= m0(Math.max(abstractC4340ei.L(), abstractC4340ei2.L()) + 1) ? new YJ0(abstractC4340ei, abstractC4340ei2) : new b(null).b(abstractC4340ei, abstractC4340ei2);
    }

    public static AbstractC4340ei k0(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
        int size = abstractC4340ei.size();
        int size2 = abstractC4340ei2.size();
        byte[] bArr = new byte[size + size2];
        abstractC4340ei.J(bArr, 0, 0, size);
        abstractC4340ei2.J(bArr, 0, size, size2);
        return AbstractC4340ei.d0(bArr);
    }

    public static int m0(int i) {
        int[] iArr = K;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.daaw.AbstractC4340ei
    public void K(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            this.G.K(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.H.K(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.G.K(bArr, i, i2, i6);
            this.H.K(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.daaw.AbstractC4340ei
    public int L() {
        return this.J;
    }

    @Override // com.daaw.AbstractC4340ei
    public byte M(int i) {
        int i2 = this.I;
        return i < i2 ? this.G.M(i) : this.H.M(i - i2);
    }

    @Override // com.daaw.AbstractC4340ei
    public boolean N() {
        return this.F >= m0(this.J);
    }

    @Override // com.daaw.AbstractC4340ei
    public boolean O() {
        int iS = this.G.S(0, 0, this.I);
        AbstractC4340ei abstractC4340ei = this.H;
        return abstractC4340ei.S(iS, 0, abstractC4340ei.size()) == 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public AbstractC4340ei.g iterator() {
        return new a();
    }

    @Override // com.daaw.AbstractC4340ei
    public AbstractC9408wm Q() {
        return AbstractC9408wm.h(i0(), true);
    }

    @Override // com.daaw.AbstractC4340ei
    public int R(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            return this.G.R(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.H.R(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.H.R(this.G.R(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC4340ei
    public int S(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            return this.G.S(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.H.S(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.H.S(this.G.S(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC4340ei
    public AbstractC4340ei V(int i, int i2) {
        int iD = AbstractC4340ei.D(i, i2, this.F);
        if (iD == 0) {
            return AbstractC4340ei.C;
        }
        if (iD == this.F) {
            return this;
        }
        int i3 = this.I;
        return i2 <= i3 ? this.G.V(i, i2) : i >= i3 ? this.H.V(i - i3, i2 - i3) : new YJ0(this.G.U(i), this.H.V(0, i2 - this.I));
    }

    @Override // com.daaw.AbstractC4340ei
    public String Z(Charset charset) {
        return new String(W(), charset);
    }

    @Override // com.daaw.AbstractC4340ei
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4340ei)) {
            return false;
        }
        AbstractC4340ei abstractC4340ei = (AbstractC4340ei) obj;
        if (this.F != abstractC4340ei.size()) {
            return false;
        }
        if (this.F == 0) {
            return true;
        }
        int iT = T();
        int iT2 = abstractC4340ei.T();
        if (iT == 0 || iT2 == 0 || iT == iT2) {
            return l0(abstractC4340ei);
        }
        return false;
    }

    @Override // com.daaw.AbstractC4340ei
    public void f0(AbstractC3783ci abstractC3783ci) {
        this.G.f0(abstractC3783ci);
        this.H.f0(abstractC3783ci);
    }

    public List i0() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().q());
        }
        return arrayList;
    }

    public final boolean l0(AbstractC4340ei abstractC4340ei) {
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC4340ei.h hVar = (AbstractC4340ei.h) cVar.next();
        c cVar2 = new c(abstractC4340ei, aVar);
        AbstractC4340ei.h hVar2 = (AbstractC4340ei.h) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = hVar.size() - i;
            int size2 = hVar2.size() - i2;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? hVar.g0(hVar2, i2, iMin) : hVar2.g0(hVar, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.F;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i = 0;
                hVar = (AbstractC4340ei.h) cVar.next();
            } else {
                i += iMin;
                hVar = hVar;
            }
            if (iMin == size2) {
                hVar2 = (AbstractC4340ei.h) cVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.daaw.AbstractC4340ei
    public ByteBuffer q() {
        return ByteBuffer.wrap(W()).asReadOnlyBuffer();
    }

    @Override // com.daaw.AbstractC4340ei
    public int size() {
        return this.F;
    }

    @Override // com.daaw.AbstractC4340ei
    public byte w(int i) {
        AbstractC4340ei.y(i, this.F);
        return M(i);
    }

    public static class b {
        public final ArrayDeque a;

        public b() {
            this.a = new ArrayDeque();
        }

        public final AbstractC4340ei b(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
            c(abstractC4340ei);
            c(abstractC4340ei2);
            AbstractC4340ei yj0 = (AbstractC4340ei) this.a.pop();
            while (!this.a.isEmpty()) {
                yj0 = new YJ0((AbstractC4340ei) this.a.pop(), yj0, null);
            }
            return yj0;
        }

        public final void c(AbstractC4340ei abstractC4340ei) {
            if (abstractC4340ei.N()) {
                e(abstractC4340ei);
                return;
            }
            if (abstractC4340ei instanceof YJ0) {
                YJ0 yj0 = (YJ0) abstractC4340ei;
                c(yj0.G);
                c(yj0.H);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC4340ei.getClass());
            }
        }

        public final int d(int i) {
            int iBinarySearch = Arrays.binarySearch(YJ0.K, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        public final void e(AbstractC4340ei abstractC4340ei) {
            a aVar;
            int iD = d(abstractC4340ei.size());
            int iM0 = YJ0.m0(iD + 1);
            if (this.a.isEmpty() || ((AbstractC4340ei) this.a.peek()).size() >= iM0) {
                this.a.push(abstractC4340ei);
                return;
            }
            int iM02 = YJ0.m0(iD);
            AbstractC4340ei yj0 = (AbstractC4340ei) this.a.pop();
            while (true) {
                aVar = null;
                if (this.a.isEmpty() || ((AbstractC4340ei) this.a.peek()).size() >= iM02) {
                    break;
                } else {
                    yj0 = new YJ0((AbstractC4340ei) this.a.pop(), yj0, aVar);
                }
            }
            YJ0 yj02 = new YJ0(yj0, abstractC4340ei, aVar);
            while (!this.a.isEmpty()) {
                if (((AbstractC4340ei) this.a.peek()).size() >= YJ0.m0(d(yj02.size()) + 1)) {
                    break;
                } else {
                    yj02 = new YJ0((AbstractC4340ei) this.a.pop(), yj02, aVar);
                }
            }
            this.a.push(yj02);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public YJ0(AbstractC4340ei abstractC4340ei, AbstractC4340ei abstractC4340ei2) {
        this.G = abstractC4340ei;
        this.H = abstractC4340ei2;
        int size = abstractC4340ei.size();
        this.I = size;
        this.F = size + abstractC4340ei2.size();
        this.J = Math.max(abstractC4340ei.L(), abstractC4340ei2.L()) + 1;
    }
}
