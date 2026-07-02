package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.q53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7543q53 extends AbstractC9213w33 {
    public static final int[] K = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int F;
    public final AbstractC9213w33 G;
    public final AbstractC9213w33 H;
    public final int I;
    public final int J;

    public static AbstractC9213w33 Z(AbstractC9213w33 abstractC9213w33, AbstractC9213w33 abstractC9213w332) {
        if (abstractC9213w332.y() == 0) {
            return abstractC9213w33;
        }
        if (abstractC9213w33.y() == 0) {
            return abstractC9213w332;
        }
        int iY = abstractC9213w33.y() + abstractC9213w332.y();
        if (iY < 128) {
            return a0(abstractC9213w33, abstractC9213w332);
        }
        if (abstractC9213w33 instanceof C7543q53) {
            C7543q53 c7543q53 = (C7543q53) abstractC9213w33;
            if (c7543q53.H.y() + abstractC9213w332.y() < 128) {
                return new C7543q53(c7543q53.G, a0(c7543q53.H, abstractC9213w332));
            }
            if (c7543q53.G.E() > c7543q53.H.E() && c7543q53.J > abstractC9213w332.E()) {
                return new C7543q53(c7543q53.G, new C7543q53(c7543q53.H, abstractC9213w332));
            }
        }
        return iY >= b0(Math.max(abstractC9213w33.E(), abstractC9213w332.E()) + 1) ? new C7543q53(abstractC9213w33, abstractC9213w332) : C5301i53.a(new C5301i53(null), abstractC9213w33, abstractC9213w332);
    }

    public static AbstractC9213w33 a0(AbstractC9213w33 abstractC9213w33, AbstractC9213w33 abstractC9213w332) {
        int iY = abstractC9213w33.y();
        int iY2 = abstractC9213w332.y();
        byte[] bArr = new byte[iY + iY2];
        abstractC9213w33.X(bArr, 0, 0, iY);
        abstractC9213w332.X(bArr, 0, iY, iY2);
        return new C8090s33(bArr);
    }

    public static int b0(int i) {
        int[] iArr = K;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.daaw.AbstractC9213w33
    public final void D(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            this.G.D(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.H.D(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.G.D(bArr, i, i2, i6);
            this.H.D(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.daaw.AbstractC9213w33
    public final int E() {
        return this.J;
    }

    @Override // com.daaw.AbstractC9213w33
    public final boolean F() {
        return this.F >= b0(this.J);
    }

    @Override // com.daaw.AbstractC9213w33
    public final int G(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            return this.G.G(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.H.G(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.H.G(this.G.G(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC9213w33
    public final int H(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.I;
        if (i4 <= i5) {
            return this.G.H(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.H.H(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.H.H(this.G.H(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.daaw.AbstractC9213w33
    public final AbstractC9213w33 I(int i, int i2) {
        int iO = AbstractC9213w33.O(i, i2, this.F);
        if (iO == 0) {
            return AbstractC9213w33.C;
        }
        if (iO == this.F) {
            return this;
        }
        int i3 = this.I;
        if (i2 <= i3) {
            return this.G.I(i, i2);
        }
        if (i >= i3) {
            return this.H.I(i - i3, i2 - i3);
        }
        AbstractC9213w33 abstractC9213w33 = this.G;
        return new C7543q53(abstractC9213w33.I(i, abstractC9213w33.y()), this.H.I(0, i2 - this.I));
    }

    @Override // com.daaw.AbstractC9213w33
    public final E33 J() {
        boolean z = true;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b = 0;
        C5860k53 c5860k53 = new C5860k53(this, null);
        while (c5860k53.hasNext()) {
            arrayList.add(c5860k53.next().L());
        }
        int i = E33.d;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new A33(arrayList, iRemaining, z, b == true ? 1 : 0) : E33.g(new C9218w43(arrayList), 4096);
    }

    @Override // com.daaw.AbstractC9213w33
    public final String K(Charset charset) {
        return new String(e(), charset);
    }

    @Override // com.daaw.AbstractC9213w33
    public final void M(AbstractC6138l33 abstractC6138l33) {
        this.G.M(abstractC6138l33);
        this.H.M(abstractC6138l33);
    }

    @Override // com.daaw.AbstractC9213w33
    public final boolean N() {
        AbstractC9213w33 abstractC9213w33 = this.G;
        AbstractC9213w33 abstractC9213w332 = this.H;
        return abstractC9213w332.H(abstractC9213w33.H(0, 0, this.I), 0, abstractC9213w332.y()) == 0;
    }

    @Override // com.daaw.AbstractC9213w33
    /* JADX INFO: renamed from: Q */
    public final InterfaceC7533q33 iterator() {
        return new C4743g53(this);
    }

    @Override // com.daaw.AbstractC9213w33
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9213w33)) {
            return false;
        }
        AbstractC9213w33 abstractC9213w33 = (AbstractC9213w33) obj;
        if (this.F != abstractC9213w33.y()) {
            return false;
        }
        if (this.F == 0) {
            return true;
        }
        int iP = P();
        int iP2 = abstractC9213w33.P();
        if (iP != 0 && iP2 != 0 && iP != iP2) {
            return false;
        }
        AbstractC5578j53 abstractC5578j53 = null;
        C5860k53 c5860k53 = new C5860k53(this, abstractC5578j53);
        AbstractC7811r33 abstractC7811r33A = c5860k53.next();
        C5860k53 c5860k532 = new C5860k53(abstractC9213w33, abstractC5578j53);
        AbstractC7811r33 abstractC7811r33A2 = c5860k532.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iY = abstractC7811r33A.y() - i;
            int iY2 = abstractC7811r33A2.y() - i2;
            int iMin = Math.min(iY, iY2);
            if (!(i == 0 ? abstractC7811r33A.Y(abstractC7811r33A2, i2, iMin) : abstractC7811r33A2.Y(abstractC7811r33A, i, iMin))) {
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
            if (iMin == iY) {
                abstractC7811r33A = c5860k53.next();
                i = 0;
            } else {
                i += iMin;
                abstractC7811r33A = abstractC7811r33A;
            }
            if (iMin == iY2) {
                abstractC7811r33A2 = c5860k532.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.daaw.AbstractC9213w33, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C4743g53(this);
    }

    @Override // com.daaw.AbstractC9213w33
    public final byte q(int i) {
        AbstractC9213w33.W(i, this.F);
        return s(i);
    }

    @Override // com.daaw.AbstractC9213w33
    public final byte s(int i) {
        int i2 = this.I;
        return i < i2 ? this.G.s(i) : this.H.s(i - i2);
    }

    @Override // com.daaw.AbstractC9213w33
    public final int y() {
        return this.F;
    }

    public C7543q53(AbstractC9213w33 abstractC9213w33, AbstractC9213w33 abstractC9213w332) {
        this.G = abstractC9213w33;
        this.H = abstractC9213w332;
        int iY = abstractC9213w33.y();
        this.I = iY;
        this.F = iY + abstractC9213w332.y();
        this.J = Math.max(abstractC9213w33.E(), abstractC9213w332.E()) + 1;
    }
}
