package com.daaw;

import com.daaw.InterfaceC4969gu0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.daaw.mu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6653mu0 extends V implements InterfaceC4969gu0.a {
    public InterfaceC4969gu0 B;
    public Object[] C;
    public Object[] D;
    public int E;
    public C2972Zl0 F;
    public Object[] G;
    public Object[] H;
    public int I;

    /* JADX INFO: renamed from: com.daaw.mu0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Collection B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection) {
            super(1);
            this.B = collection;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.B.contains(obj));
        }
    }

    public C6653mu0(InterfaceC4969gu0 interfaceC4969gu0, Object[] objArr, Object[] objArr2, int i) {
        G10.g(interfaceC4969gu0, "vector");
        G10.g(objArr2, "vectorTail");
        this.B = interfaceC4969gu0;
        this.C = objArr;
        this.D = objArr2;
        this.E = i;
        this.F = new C2972Zl0();
        this.G = this.C;
        this.H = this.D;
        this.I = this.B.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] I(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, com.daaw.C7186op0 r13) {
        /*
            r8 = this;
            int r0 = com.daaw.AbstractC1350Kb1.a(r11, r10)
            if (r10 != 0) goto L1a
            r10 = 31
            r11 = r9[r10]
            r13.b(r11)
            java.lang.Object[] r11 = r8.M(r9)
            int r13 = r0 + 1
            java.lang.Object[] r9 = com.daaw.AbstractC5152hb.h(r9, r11, r13, r0, r10)
            r9[r0] = r12
            return r9
        L1a:
            java.lang.Object[] r9 = r8.M(r9)
            int r3 = r10 + (-5)
            r10 = r9[r0]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r10 == 0) goto L56
            r2 = r10
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r8
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r10 = r1.I(r2, r3, r4, r5, r6)
            r9[r0] = r10
        L33:
            int r0 = r0 + 1
            r10 = 32
            if (r0 >= r10) goto L55
            r10 = r9[r0]
            if (r10 == 0) goto L55
            if (r10 == 0) goto L4f
            r2 = r10
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r5 = r6.a()
            r4 = 0
            r1 = r8
            java.lang.Object[] r10 = r1.I(r2, r3, r4, r5, r6)
            r9[r0] = r10
            goto L33
        L4f:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        L55:
            return r9
        L56:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6653mu0.I(java.lang.Object[], int, int, java.lang.Object, com.daaw.op0):java.lang.Object[]");
    }

    private final Object[] R(Object[] objArr, int i, int i2, C7186op0 c7186op0) {
        Object[] objArrR;
        int iA = AbstractC1350Kb1.a(i2 - 1, i);
        if (i == 5) {
            c7186op0.b(objArr[iA]);
            objArrR = null;
        } else {
            Object obj = objArr[iA];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArrR = R((Object[]) obj, i - 5, i2, c7186op0);
        }
        if (objArrR == null && iA == 0) {
            return null;
        }
        Object[] objArrM = M(objArr);
        objArrM[iA] = objArrR;
        return objArrM;
    }

    private final Object[] c0(Object[] objArr, int i, int i2, C7186op0 c7186op0) {
        int iA = AbstractC1350Kb1.a(i2, i);
        if (i == 0) {
            Object obj = objArr[iA];
            Object[] objArrH = AbstractC5152hb.h(objArr, M(objArr), iA, iA + 1, 32);
            objArrH[31] = c7186op0.a();
            c7186op0.b(obj);
            return objArrH;
        }
        int iA2 = objArr[31] == null ? AbstractC1350Kb1.a(f0() - 1, i) : 31;
        Object[] objArrM = M(objArr);
        int i3 = i - 5;
        int i4 = iA + 1;
        if (i4 <= iA2) {
            while (true) {
                Object obj2 = objArrM[iA2];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArrM[iA2] = c0((Object[]) obj2, i3, 0, c7186op0);
                if (iA2 == i4) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrM[iA];
        if (obj3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrM[iA] = c0((Object[]) obj3, i3, i2, c7186op0);
        return objArrM;
    }

    private final int f0() {
        if (size() <= 32) {
            return 0;
        }
        return AbstractC1350Kb1.d(size());
    }

    private final Object[] w(int i) {
        if (f0() <= i) {
            return this.H;
        }
        Object[] objArr = this.G;
        G10.d(objArr);
        for (int i2 = this.E; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[AbstractC1350Kb1.a(i, i2)];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
        return objArr;
    }

    public final int D() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] E() {
        return this.G;
    }

    public final int F() {
        return this.E;
    }

    public final Object[] G() {
        return this.H;
    }

    public final void H(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        if (this.G == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        Object[] objArrH0 = h0(i4, i2, objArr, i3, objArr2);
        int iF0 = i3 - (((f0() >> 5) - 1) - i4);
        if (iF0 < i3) {
            Object[] objArr4 = objArr[iF0];
            G10.d(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        i0(collection, i, objArrH0, 32, objArr, iF0, objArr3);
    }

    public final void J(Object[] objArr, int i, Object obj) {
        int iJ0 = j0();
        Object[] objArrM = M(this.H);
        if (iJ0 < 32) {
            AbstractC5152hb.h(this.H, objArrM, i + 1, i, iJ0);
            objArrM[i] = obj;
            this.G = objArr;
            this.H = objArrM;
            this.I = size() + 1;
            return;
        }
        Object[] objArr2 = this.H;
        Object obj2 = objArr2[31];
        AbstractC5152hb.h(objArr2, objArrM, i + 1, i, 31);
        objArrM[i] = obj;
        V(objArr, objArrM, P(obj2));
    }

    public final boolean K(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.F;
    }

    public final ListIterator L(int i) {
        if (this.G == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iF0 = f0() >> 5;
        C6284lc0.b(i, iF0);
        int i2 = this.E;
        if (i2 == 0) {
            Object[] objArr = this.G;
            G10.d(objArr);
            return new C4562fT0(objArr, i);
        }
        Object[] objArr2 = this.G;
        G10.d(objArr2);
        return new W51(objArr2, i, iF0, i2 / 5);
    }

    public final Object[] M(Object[] objArr) {
        return objArr == null ? O() : K(objArr) ? objArr : AbstractC5152hb.k(objArr, O(), 0, 0, AbstractC8417tE0.h(objArr.length, 32), 6, null);
    }

    public final Object[] N(Object[] objArr, int i) {
        return K(objArr) ? AbstractC5152hb.h(objArr, objArr, i, 0, 32 - i) : AbstractC5152hb.h(objArr, O(), i, 0, 32 - i);
    }

    public final Object[] O() {
        Object[] objArr = new Object[33];
        objArr[32] = this.F;
        return objArr;
    }

    public final Object[] P(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.F;
        return objArr;
    }

    public final Object[] Q(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iA = AbstractC1350Kb1.a(i, i2);
        Object obj = objArr[iA];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object objQ = Q((Object[]) obj, i, i2 - 5);
        if (iA < 31) {
            int i3 = iA + 1;
            if (objArr[i3] != null) {
                if (K(objArr)) {
                    AbstractC5152hb.p(objArr, null, i3, 32);
                }
                objArr = AbstractC5152hb.h(objArr, O(), 0, 0, i3);
            }
        }
        if (objQ == objArr[iA]) {
            return objArr;
        }
        Object[] objArrM = M(objArr);
        objArrM[iA] = objQ;
        return objArrM;
    }

    public final void S(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.G = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.H = objArr;
            this.I = i;
            this.E = i2;
            return;
        }
        C7186op0 c7186op0 = new C7186op0(null);
        G10.d(objArr);
        Object[] objArrR = R(objArr, i2, i, c7186op0);
        G10.d(objArrR);
        Object objA = c7186op0.a();
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        this.H = (Object[]) objA;
        this.I = i;
        if (objArrR[1] == null) {
            this.G = (Object[]) objArrR[0];
            this.E = i2 - 5;
        } else {
            this.G = objArrR;
            this.E = i2;
        }
    }

    public final Object[] T(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM = M(objArr);
        int iA = AbstractC1350Kb1.a(i, i2);
        int i3 = i2 - 5;
        objArrM[iA] = T((Object[]) objArrM[iA], i, i3, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrM[iA] = T((Object[]) objArrM[iA], 0, i3, it);
        }
        return objArrM;
    }

    public final Object[] U(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itA = AbstractC2093Ra.a(objArr2);
        int i2 = i >> 5;
        int i3 = this.E;
        Object[] objArrT = i2 < (1 << i3) ? T(objArr, i, i3, itA) : M(objArr);
        while (itA.hasNext()) {
            this.E += 5;
            objArrT = P(objArrT);
            int i4 = this.E;
            T(objArrT, 1 << i4, i4, itA);
        }
        return objArrT;
    }

    public final void V(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.E;
        if (size > (1 << i)) {
            this.G = W(P(objArr), objArr2, this.E + 5);
            this.H = objArr3;
            this.E += 5;
            this.I = size() + 1;
            return;
        }
        if (objArr == null) {
            this.G = objArr2;
            this.H = objArr3;
            this.I = size() + 1;
        } else {
            this.G = W(objArr, objArr2, i);
            this.H = objArr3;
            this.I = size() + 1;
        }
    }

    public final Object[] W(Object[] objArr, Object[] objArr2, int i) {
        int iA = AbstractC1350Kb1.a(size() - 1, i);
        Object[] objArrM = M(objArr);
        if (i == 5) {
            objArrM[iA] = objArr2;
            return objArrM;
        }
        objArrM[iA] = W((Object[]) objArrM[iA], objArr2, i - 5);
        return objArrM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int X(NQ nq, Object[] objArr, int i, int i2, C7186op0 c7186op0, List list, List list2) {
        if (K(objArr)) {
            list.add(objArr);
        }
        Object objA = c7186op0.a();
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrO = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) nq.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrO = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : O();
                    i2 = 0;
                }
                objArrO[i2] = obj;
                i2++;
            }
        }
        c7186op0.b(objArrO);
        if (objArr2 != c7186op0.a()) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int Y(NQ nq, Object[] objArr, int i, C7186op0 c7186op0) {
        Object[] objArrM = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) nq.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrM = M(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM[i2] = obj;
                i2++;
            }
        }
        c7186op0.b(objArrM);
        return i2;
    }

    public final boolean Z(NQ nq) {
        Object[] objArrT;
        int iJ0 = j0();
        C7186op0 c7186op0 = new C7186op0(null);
        if (this.G == null) {
            return a0(nq, iJ0, c7186op0) != iJ0;
        }
        ListIterator listIteratorL = L(0);
        int iY = 32;
        while (iY == 32 && listIteratorL.hasNext()) {
            iY = Y(nq, (Object[]) listIteratorL.next(), 32, c7186op0);
        }
        if (iY == 32) {
            AbstractC9971yn.a(!listIteratorL.hasNext());
            int iA0 = a0(nq, iJ0, c7186op0);
            if (iA0 == 0) {
                S(this.G, size(), this.E);
            }
            return iA0 != iJ0;
        }
        int iPreviousIndex = listIteratorL.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iX = iY;
        while (listIteratorL.hasNext()) {
            iX = X(nq, (Object[]) listIteratorL.next(), 32, iX, c7186op0, arrayList2, arrayList);
        }
        int iX2 = X(nq, this.H, iJ0, iX, c7186op0, arrayList2, arrayList);
        Object objA = c7186op0.a();
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) objA;
        AbstractC5152hb.p(objArr, null, iX2, 32);
        if (arrayList.isEmpty()) {
            objArrT = this.G;
            G10.d(objArrT);
        } else {
            objArrT = T(this.G, iPreviousIndex, this.E, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.G = e0(objArrT, size);
        this.H = objArr;
        this.I = size + iX2;
        return true;
    }

    @Override // com.daaw.InterfaceC4969gu0.a
    public InterfaceC4969gu0 a() {
        InterfaceC4969gu0 c6374lu0;
        if (this.G == this.C && this.H == this.D) {
            c6374lu0 = this.B;
        } else {
            this.F = new C2972Zl0();
            Object[] objArr = this.G;
            this.C = objArr;
            Object[] objArr2 = this.H;
            this.D = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.G;
                G10.d(objArr3);
                c6374lu0 = new C6374lu0(objArr3, this.H, size(), this.E);
            } else if (objArr2.length == 0) {
                c6374lu0 = AbstractC1350Kb1.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.H, size());
                G10.f(objArrCopyOf, "copyOf(this, newSize)");
                c6374lu0 = new RT0(objArrCopyOf);
            }
        }
        this.B = c6374lu0;
        return c6374lu0;
    }

    public final int a0(NQ nq, int i, C7186op0 c7186op0) {
        int iY = Y(nq, this.H, i, c7186op0);
        if (iY == i) {
            AbstractC9971yn.a(c7186op0.a() == this.H);
            return i;
        }
        Object objA = c7186op0.a();
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        Object[] objArr = (Object[]) objA;
        AbstractC5152hb.p(objArr, null, iY, i);
        this.H = objArr;
        this.I = size() - (i - iY);
        return iY;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iJ0 = j0();
        if (iJ0 < 32) {
            Object[] objArrM = M(this.H);
            objArrM[iJ0] = obj;
            this.H = objArrM;
            this.I = size() + 1;
        } else {
            V(this.G, this.H, P(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        G10.g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ0 = j0();
        Iterator it = collection.iterator();
        if (32 - iJ0 >= collection.size()) {
            this.H = y(M(this.H), iJ0, it);
            this.I = size() + collection.size();
        } else {
            int size = ((collection.size() + iJ0) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = y(M(this.H), iJ0, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = y(O(), 0, it);
            }
            this.G = U(this.G, f0(), objArr);
            this.H = y(O(), 0, it);
            this.I = size() + collection.size();
        }
        return true;
    }

    public final boolean b0(NQ nq) {
        G10.g(nq, "predicate");
        boolean Z = Z(nq);
        if (Z) {
            ((AbstractList) this).modCount++;
        }
        return Z;
    }

    public final Object d0(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        AbstractC9971yn.a(i3 < size);
        if (size == 1) {
            Object obj = this.H[0];
            S(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.H;
        Object obj2 = objArr2[i3];
        Object[] objArrH = AbstractC5152hb.h(objArr2, M(objArr2), i3, i3 + 1, size);
        objArrH[size - 1] = null;
        this.G = objArr;
        this.H = objArrH;
        this.I = (i + size) - 1;
        this.E = i2;
        return obj2;
    }

    @Override // com.daaw.V
    public int e() {
        return this.I;
    }

    public final Object[] e0(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i == 0) {
            this.E = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.E;
            if ((i2 >> i3) != 0) {
                return Q(objArr, i2, i3);
            }
            this.E = i3 - 5;
            Object[] objArr2 = objArr[0];
            if (objArr2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr = objArr2;
        }
    }

    public final Object[] g0(Object[] objArr, int i, int i2, Object obj, C7186op0 c7186op0) {
        int iA = AbstractC1350Kb1.a(i2, i);
        Object[] objArrM = M(objArr);
        if (i == 0) {
            if (objArrM != objArr) {
                ((AbstractList) this).modCount++;
            }
            c7186op0.b(objArrM[iA]);
            objArrM[iA] = obj;
            return objArrM;
        }
        Object obj2 = objArrM[iA];
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        objArrM[iA] = g0((Object[]) obj2, i - 5, i2, obj, c7186op0);
        return objArrM;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        C6284lc0.a(i, size());
        return w(i)[i & 31];
    }

    public final Object[] h0(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.G == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ListIterator listIteratorL = L(f0() >> 5);
        while (listIteratorL.previousIndex() != i) {
            Object[] objArr3 = (Object[]) listIteratorL.previous();
            AbstractC5152hb.h(objArr3, objArr2, 0, 32 - i2, 32);
            objArr2 = N(objArr3, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return (Object[]) listIteratorL.previous();
    }

    public final void i0(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrO;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrM = M(objArr);
        objArr2[0] = objArrM;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC5152hb.h(objArrM, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrO = objArrM;
            } else {
                objArrO = O();
                i3--;
                objArr2[i3] = objArrO;
            }
            int i7 = i2 - i6;
            AbstractC5152hb.h(objArrM, objArr3, 0, i7, i2);
            AbstractC5152hb.h(objArrM, objArrO, size + 1, i4, i7);
            objArr3 = objArrO;
        }
        Iterator it = collection.iterator();
        y(objArrM, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = y(O(), 0, it);
        }
        y(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    public final int j0() {
        return k0(size());
    }

    public final int k0(int i) {
        return i <= 32 ? i : i - AbstractC1350Kb1.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        G10.g(collection, "elements");
        return b0(new a(collection));
    }

    @Override // com.daaw.V
    public Object s(int i) {
        C6284lc0.a(i, size());
        ((AbstractList) this).modCount++;
        int iF0 = f0();
        if (i >= iF0) {
            return d0(this.G, iF0, this.E, i - iF0);
        }
        C7186op0 c7186op0 = new C7186op0(this.H[0]);
        Object[] objArr = this.G;
        G10.d(objArr);
        d0(c0(objArr, this.E, i, c7186op0), iF0, this.E, 0);
        return c7186op0.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        C6284lc0.a(i, size());
        if (f0() > i) {
            C7186op0 c7186op0 = new C7186op0(null);
            Object[] objArr = this.G;
            G10.d(objArr);
            this.G = g0(objArr, this.E, i, obj, c7186op0);
            return c7186op0.a();
        }
        Object[] objArrM = M(this.H);
        if (objArrM != this.H) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM[i2];
        objArrM[i2] = obj;
        this.H = objArrM;
        return obj2;
    }

    public final Object[] y(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        C6284lc0.b(i, size());
        return new C7211ou0(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        C6284lc0.b(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iF0 = f0();
        if (i >= iF0) {
            J(this.G, i - iF0, obj);
            return;
        }
        C7186op0 c7186op0 = new C7186op0(null);
        Object[] objArr = this.G;
        G10.d(objArr);
        J(I(objArr, this.E, i, obj, c7186op0), 0, c7186op0.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        C6653mu0 c6653mu0;
        Collection collection2;
        Object[] objArrH;
        Object[][] objArr;
        G10.g(collection, "elements");
        C6284lc0.b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            AbstractC9971yn.a(i >= f0());
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr2 = this.H;
            Object[] objArrH2 = AbstractC5152hb.h(objArr2, M(objArr2), size2 + 1, i3, j0());
            y(objArrH2, i3, collection.iterator());
            this.H = objArrH2;
            this.I = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iJ0 = j0();
        int iK0 = k0(size() + collection.size());
        if (i >= f0()) {
            objArrH = O();
            objArr = objArr3;
            c6653mu0 = this;
            collection2 = collection;
            c6653mu0.i0(collection2, i, this.H, iJ0, objArr, size, objArrH);
        } else {
            c6653mu0 = this;
            collection2 = collection;
            if (iK0 > iJ0) {
                int i4 = iK0 - iJ0;
                Object[] objArrN = N(c6653mu0.H, i4);
                c6653mu0.H(collection2, i, i4, objArr3, size, objArrN);
                objArr = objArr3;
                objArrH = objArrN;
            } else {
                int i5 = iJ0 - iK0;
                objArrH = AbstractC5152hb.h(c6653mu0.H, O(), 0, i5, iJ0);
                int i6 = 32 - i5;
                Object[] objArrN2 = N(c6653mu0.H, i6);
                int i7 = size - 1;
                objArr3[i7] = objArrN2;
                c6653mu0.H(collection2, i, i6, objArr3, i7, objArrN2);
                collection2 = collection2;
                objArr = objArr3;
                c6653mu0 = c6653mu0;
            }
        }
        c6653mu0.G = U(c6653mu0.G, i2, objArr);
        c6653mu0.H = objArrH;
        c6653mu0.I = size() + collection2.size();
        return true;
    }
}
