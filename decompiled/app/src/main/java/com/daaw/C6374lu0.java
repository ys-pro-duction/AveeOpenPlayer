package com.daaw;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.lu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6374lu0 extends AbstractC3311b0 implements InterfaceC4969gu0 {
    public final Object[] C;
    public final Object[] D;
    public final int E;
    public final int F;

    public C6374lu0(Object[] objArr, Object[] objArr2, int i, int i2) {
        G10.g(objArr, "root");
        G10.g(objArr2, "tail");
        this.C = objArr;
        this.D = objArr2;
        this.E = i;
        this.F = i2;
        if (size() > 32) {
            AbstractC9971yn.a(size() - AbstractC1350Kb1.d(size()) <= AbstractC8417tE0.h(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    public final Object[] D(Object[] objArr, int i, int i2, Object obj, C7186op0 c7186op0) {
        Object[] objArrCopyOf;
        int iA = AbstractC1350Kb1.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                G10.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC5152hb.h(objArr, objArrCopyOf, iA + 1, iA, 31);
            c7186op0.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        G10.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        Object obj2 = objArr[iA];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrCopyOf2[iA] = D((Object[]) obj2, i3, i2, obj, c7186op0);
        while (true) {
            iA++;
            if (iA >= 32 || objArrCopyOf2[iA] == null) {
                break;
            }
            Object obj3 = objArr[iA];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrCopyOf2[iA] = D((Object[]) obj3, i3, 0, c7186op0.a(), c7186op0);
        }
        return objArrCopyOf2;
    }

    public final C6374lu0 E(Object[] objArr, int i, Object obj) {
        int size = size() - L();
        Object[] objArrCopyOf = Arrays.copyOf(this.D, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            AbstractC5152hb.h(this.D, objArrCopyOf, i + 1, i, size);
            objArrCopyOf[i] = obj;
            return new C6374lu0(objArr, objArrCopyOf, size() + 1, this.F);
        }
        Object[] objArr2 = this.D;
        Object obj2 = objArr2[31];
        AbstractC5152hb.h(objArr2, objArrCopyOf, i + 1, i, size - 1);
        objArrCopyOf[i] = obj;
        return H(objArr, objArrCopyOf, AbstractC1350Kb1.c(obj2));
    }

    public final Object[] F(Object[] objArr, int i, int i2, C7186op0 c7186op0) {
        Object[] objArrF;
        int iA = AbstractC1350Kb1.a(i2, i);
        if (i == 5) {
            c7186op0.b(objArr[iA]);
            objArrF = null;
        } else {
            Object obj = objArr[iA];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrF = F((Object[]) obj, i - 5, i2, c7186op0);
        }
        if (objArrF == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrF;
        return objArrCopyOf;
    }

    public final InterfaceC4969gu0 G(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                G10.f(objArr, "copyOf(this, newSize)");
            }
            return new RT0(objArr);
        }
        C7186op0 c7186op0 = new C7186op0(null);
        Object[] objArrF = F(objArr, i2, i - 1, c7186op0);
        G10.d(objArrF);
        Object objA = c7186op0.a();
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) objA;
        if (objArrF[1] != null) {
            return new C6374lu0(objArrF, objArr2, i, i2);
        }
        Object obj = objArrF[0];
        if (obj != null) {
            return new C6374lu0((Object[]) obj, objArr2, i, i2 - 5);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public final C6374lu0 H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.F;
        if (size <= (1 << i)) {
            return new C6374lu0(I(objArr, i, objArr2), objArr3, size() + 1, this.F);
        }
        Object[] objArrC = AbstractC1350Kb1.c(objArr);
        int i2 = this.F + 5;
        return new C6374lu0(I(objArrC, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] I(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = com.daaw.AbstractC1350Kb1.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            com.daaw.G10.f(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.I(r2, r5, r6)
            r4[r0] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6374lu0.I(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    public final Object[] J(Object[] objArr, int i, int i2, C7186op0 c7186op0) {
        Object[] objArrCopyOf;
        int iA = AbstractC1350Kb1.a(i2, i);
        if (i == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                G10.f(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC5152hb.h(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = c7186op0.a();
            c7186op0.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? AbstractC1350Kb1.a(L() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        G10.f(objArrCopyOf2, "copyOf(this, newSize)");
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrCopyOf2[iA2] = J((Object[]) obj, i3, 0, c7186op0);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrCopyOf2[iA] = J((Object[]) obj2, i3, i2, c7186op0);
        return objArrCopyOf2;
    }

    public final InterfaceC4969gu0 K(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        AbstractC9971yn.a(i3 < size);
        if (size == 1) {
            return G(objArr, i, i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.D, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (i3 < i4) {
            AbstractC5152hb.h(this.D, objArrCopyOf, i3, i3 + 1, size);
        }
        objArrCopyOf[i4] = null;
        return new C6374lu0(objArr, objArrCopyOf, (i + size) - 1, i2);
    }

    public final int L() {
        return AbstractC1350Kb1.d(size());
    }

    public final Object[] M(Object[] objArr, int i, int i2, Object obj) {
        int iA = AbstractC1350Kb1.a(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        if (i == 0) {
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iA];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrCopyOf[iA] = M((Object[]) obj2, i - 5, i2, obj);
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 add(Object obj) {
        int size = size() - L();
        if (size >= 32) {
            return H(this.C, this.D, AbstractC1350Kb1.c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.D, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = obj;
        return new C6374lu0(this.C, objArrCopyOf, size() + 1, this.F);
    }

    @Override // com.daaw.AbstractC9193w
    public int e() {
        return this.E;
    }

    @Override // com.daaw.J, java.util.List
    public Object get(int i) {
        C6284lc0.a(i, size());
        return w(i)[i & 31];
    }

    @Override // com.daaw.J, java.util.List
    public ListIterator listIterator(int i) {
        C6284lc0.b(i, size());
        return new C6932nu0(this.C, this.D, i, size(), (this.F / 5) + 1);
    }

    @Override // com.daaw.J, java.util.List
    public InterfaceC4969gu0 set(int i, Object obj) {
        C6284lc0.a(i, size());
        if (L() > i) {
            return new C6374lu0(M(this.C, this.F, i, obj), this.D, size(), this.F);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.D, 32);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i & 31] = obj;
        return new C6374lu0(this.C, objArrCopyOf, size(), this.F);
    }

    @Override // com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 t(NQ nq) {
        G10.g(nq, "predicate");
        C6653mu0 c6653mu0Builder = builder();
        c6653mu0Builder.b0(nq);
        return c6653mu0Builder.a();
    }

    @Override // com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 u(int i) {
        C6284lc0.a(i, size());
        int iL = L();
        return i >= iL ? K(this.C, iL, this.F, i - iL) : K(J(this.C, this.F, i, new C7186op0(this.D[0])), iL, this.F, 0);
    }

    public final Object[] w(int i) {
        if (L() <= i) {
            return this.D;
        }
        Object[] objArr = this.C;
        for (int i2 = this.F; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[AbstractC1350Kb1.a(i, i2)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // com.daaw.InterfaceC4969gu0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C6653mu0 builder() {
        return new C6653mu0(this, this.C, this.D, this.F);
    }

    @Override // java.util.List, com.daaw.InterfaceC4969gu0
    public InterfaceC4969gu0 add(int i, Object obj) {
        C6284lc0.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        int iL = L();
        if (i >= iL) {
            return E(this.C, i - iL, obj);
        }
        C7186op0 c7186op0 = new C7186op0(null);
        return E(D(this.C, this.F, i, obj, c7186op0), 0, c7186op0.a());
    }
}
