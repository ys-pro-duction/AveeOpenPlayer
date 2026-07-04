package com.daaw;

import com.daaw.B60;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.tg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8535tg0 implements Map, Serializable, B60 {
    public static final a O = new a(null);
    public static final C8535tg0 P;
    public Object[] B;
    public Object[] C;
    public int[] D;
    public int[] E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public C9100vg0 K;
    public C9379wg0 L;
    public C8814ug0 M;
    public boolean N;

    /* JADX INFO: renamed from: com.daaw.tg0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int c(int i) {
            return Integer.highestOneBit(AbstractC8417tE0.d(i, 1) * 3);
        }

        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final C8535tg0 e() {
            return C8535tg0.P;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.tg0$b */
    public static final class b extends d implements Iterator, InterfaceC9783y60 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C8535tg0 c8535tg0) {
            super(c8535tg0);
            G10.g(c8535tg0, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c next() {
            b();
            if (d() >= f().G) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            j(iD);
            c cVar = new c(f(), e());
            g();
            return cVar;
        }

        public final void l(StringBuilder sb) {
            G10.g(sb, "sb");
            if (d() >= f().G) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            j(iD);
            Object obj = f().B[e()];
            if (obj == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = f().C;
            G10.d(objArr);
            Object obj2 = objArr[e()];
            if (obj2 == f()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            g();
        }

        public final int m() {
            if (d() >= f().G) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            j(iD);
            Object obj = f().B[e()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = f().C;
            G10.d(objArr);
            Object obj2 = objArr[e()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            g();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tg0$c */
    public static final class c implements Map.Entry, B60.a {
        public final C8535tg0 B;
        public final int C;

        public c(C8535tg0 c8535tg0, int i) {
            G10.g(c8535tg0, "map");
            this.B = c8535tg0;
            this.C = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return G10.c(entry.getKey(), getKey()) && G10.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.B.B[this.C];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.B.C;
            G10.d(objArr);
            return objArr[this.C];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.B.o();
            Object[] objArrL = this.B.l();
            int i = this.C;
            Object obj2 = objArrL[i];
            objArrL[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.tg0$d */
    public static class d {
        public final C8535tg0 B;
        public int C;
        public int D;
        public int E;

        public d(C8535tg0 c8535tg0) {
            G10.g(c8535tg0, "map");
            this.B = c8535tg0;
            this.D = -1;
            this.E = c8535tg0.I;
            g();
        }

        public final void b() {
            if (this.B.I != this.E) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.C;
        }

        public final int e() {
            return this.D;
        }

        public final C8535tg0 f() {
            return this.B;
        }

        public final void g() {
            while (this.C < this.B.G) {
                int[] iArr = this.B.D;
                int i = this.C;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.C = i + 1;
                }
            }
        }

        public final void h(int i) {
            this.C = i;
        }

        public final boolean hasNext() {
            return this.C < this.B.G;
        }

        public final void j(int i) {
            this.D = i;
        }

        public final void remove() {
            b();
            if (this.D == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.B.o();
            this.B.S(this.D);
            this.D = -1;
            this.E = this.B.I;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tg0$e */
    public static final class e extends d implements Iterator, InterfaceC9783y60 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C8535tg0 c8535tg0) {
            super(c8535tg0);
            G10.g(c8535tg0, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (d() >= f().G) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            j(iD);
            Object obj = f().B[e()];
            g();
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.tg0$f */
    public static final class f extends d implements Iterator, InterfaceC9783y60 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C8535tg0 c8535tg0) {
            super(c8535tg0);
            G10.g(c8535tg0, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (d() >= f().G) {
                throw new NoSuchElementException();
            }
            int iD = d();
            h(iD + 1);
            j(iD);
            Object[] objArr = f().C;
            G10.d(objArr);
            Object obj = objArr[e()];
            g();
            return obj;
        }
    }

    static {
        C8535tg0 c8535tg0 = new C8535tg0(0);
        c8535tg0.N = true;
        P = c8535tg0;
    }

    public C8535tg0(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.B = objArr;
        this.C = objArr2;
        this.D = iArr;
        this.E = iArr2;
        this.F = i;
        this.G = i2;
        this.H = O.d(G());
    }

    private final void A(int i) {
        if (W(i)) {
            r(true);
        } else {
            y(this.G + i);
        }
    }

    private final void P() {
        this.I++;
    }

    private final void y(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > E()) {
            int iD = J.B.d(E(), i);
            this.B = AbstractC5437ic0.e(this.B, iD);
            Object[] objArr = this.C;
            this.C = objArr != null ? AbstractC5437ic0.e(objArr, iD) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.D, iD);
            G10.f(iArrCopyOf, "copyOf(...)");
            this.D = iArrCopyOf;
            int iC = O.c(iD);
            if (iC > G()) {
                Q(iC);
            }
        }
    }

    public final b B() {
        return new b(this);
    }

    public final int C(Object obj) {
        int iK = K(obj);
        int i = this.F;
        while (true) {
            int i2 = this.E[iK];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (G10.c(this.B[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iK = iK == 0 ? G() - 1 : iK - 1;
        }
    }

    public final int D(Object obj) {
        int i = this.G;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.D[i] >= 0) {
                Object[] objArr = this.C;
                G10.d(objArr);
                if (G10.c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int E() {
        return this.B.length;
    }

    public Set F() {
        C8814ug0 c8814ug0 = this.M;
        if (c8814ug0 != null) {
            return c8814ug0;
        }
        C8814ug0 c8814ug02 = new C8814ug0(this);
        this.M = c8814ug02;
        return c8814ug02;
    }

    public final int G() {
        return this.E.length;
    }

    public Set H() {
        C9100vg0 c9100vg0 = this.K;
        if (c9100vg0 != null) {
            return c9100vg0;
        }
        C9100vg0 c9100vg02 = new C9100vg0(this);
        this.K = c9100vg02;
        return c9100vg02;
    }

    public int I() {
        return this.J;
    }

    public Collection J() {
        C9379wg0 c9379wg0 = this.L;
        if (c9379wg0 != null) {
            return c9379wg0;
        }
        C9379wg0 c9379wg02 = new C9379wg0(this);
        this.L = c9379wg02;
        return c9379wg02;
    }

    public final int K(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.H;
    }

    public final e L() {
        return new e(this);
    }

    public final boolean M(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        A(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (N((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean N(Map.Entry entry) {
        int iK = k(entry.getKey());
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = entry.getValue();
            return true;
        }
        int i = (-iK) - 1;
        if (G10.c(entry.getValue(), objArrL[i])) {
            return false;
        }
        objArrL[i] = entry.getValue();
        return true;
    }

    public final boolean O(int i) {
        int iK = K(this.B[i]);
        int i2 = this.F;
        while (true) {
            int[] iArr = this.E;
            if (iArr[iK] == 0) {
                iArr[iK] = i + 1;
                this.D[i] = iK;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iK = iK == 0 ? G() - 1 : iK - 1;
        }
    }

    public final void Q(int i) {
        P();
        int i2 = 0;
        if (this.G > size()) {
            r(false);
        }
        this.E = new int[i];
        this.H = O.d(i);
        while (i2 < this.G) {
            int i3 = i2 + 1;
            if (!O(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    public final boolean R(Map.Entry entry) {
        G10.g(entry, "entry");
        o();
        int iC = C(entry.getKey());
        if (iC < 0) {
            return false;
        }
        Object[] objArr = this.C;
        G10.d(objArr);
        if (!G10.c(objArr[iC], entry.getValue())) {
            return false;
        }
        S(iC);
        return true;
    }

    public final void S(int i) {
        AbstractC5437ic0.f(this.B, i);
        Object[] objArr = this.C;
        if (objArr != null) {
            AbstractC5437ic0.f(objArr, i);
        }
        T(this.D[i]);
        this.D[i] = -1;
        this.J = size() - 1;
        P();
    }

    public final void T(int i) {
        int iH = AbstractC8417tE0.h(this.F * 2, G() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? G() - 1 : i - 1;
            i2++;
            if (i2 > this.F) {
                this.E[i3] = 0;
                return;
            }
            int[] iArr = this.E;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((K(this.B[i5]) - i) & (G() - 1)) >= i2) {
                    this.E[i3] = i4;
                    this.D[i5] = i3;
                }
                iH--;
            }
            i3 = i;
            i2 = 0;
            iH--;
        } while (iH >= 0);
        this.E[i3] = -1;
    }

    public final boolean U(Object obj) {
        o();
        int iC = C(obj);
        if (iC < 0) {
            return false;
        }
        S(iC);
        return true;
    }

    public final boolean V(Object obj) {
        o();
        int iD = D(obj);
        if (iD < 0) {
            return false;
        }
        S(iD);
        return true;
    }

    public final boolean W(int i) {
        int iE = E();
        int i2 = this.G;
        int i3 = iE - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= E() / 4;
    }

    public final f X() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        o();
        int i = this.G - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.D;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.E[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        AbstractC5437ic0.g(this.B, 0, this.G);
        Object[] objArr = this.C;
        if (objArr != null) {
            AbstractC5437ic0.g(objArr, 0, this.G);
        }
        this.J = 0;
        this.G = 0;
        P();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return C(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return D(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return F();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && x((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iC = C(obj);
        if (iC < 0) {
            return null;
        }
        Object[] objArr = this.C;
        G10.d(objArr);
        return objArr[iC];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarB = B();
        int iM = 0;
        while (bVarB.hasNext()) {
            iM += bVarB.m();
        }
        return iM;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final int k(Object obj) {
        o();
        while (true) {
            int iK = K(obj);
            int iH = AbstractC8417tE0.h(this.F * 2, G() / 2);
            int i = 0;
            while (true) {
                int i2 = this.E[iK];
                if (i2 <= 0) {
                    if (this.G < E()) {
                        int i3 = this.G;
                        int i4 = i3 + 1;
                        this.G = i4;
                        this.B[i3] = obj;
                        this.D[i3] = iK;
                        this.E[iK] = i4;
                        this.J = size() + 1;
                        P();
                        if (i > this.F) {
                            this.F = i;
                        }
                        return i3;
                    }
                    A(1);
                } else {
                    if (G10.c(this.B[i2 - 1], obj)) {
                        return -i2;
                    }
                    i++;
                    if (i > iH) {
                        Q(G() * 2);
                        break;
                    }
                    iK = iK == 0 ? G() - 1 : iK - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return H();
    }

    public final Object[] l() {
        Object[] objArr = this.C;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = AbstractC5437ic0.d(E());
        this.C = objArrD;
        return objArrD;
    }

    public final Map n() {
        o();
        this.N = true;
        if (size() > 0) {
            return this;
        }
        C8535tg0 c8535tg0 = P;
        G10.e(c8535tg0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c8535tg0;
    }

    public final void o() {
        if (this.N) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        o();
        int iK = k(obj);
        Object[] objArrL = l();
        if (iK >= 0) {
            objArrL[iK] = obj2;
            return null;
        }
        int i = (-iK) - 1;
        Object obj3 = objArrL[i];
        objArrL[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        G10.g(map, "from");
        o();
        M(map.entrySet());
    }

    public final void r(boolean z) {
        int i;
        Object[] objArr = this.C;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.G;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.D;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.B;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.E[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC5437ic0.g(this.B, i3, i);
        if (objArr != null) {
            AbstractC5437ic0.g(objArr, i3, this.G);
        }
        this.G = i3;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        o();
        int iC = C(obj);
        if (iC < 0) {
            return null;
        }
        Object[] objArr = this.C;
        G10.d(objArr);
        Object obj2 = objArr[iC];
        S(iC);
        return obj2;
    }

    public final boolean s(Collection collection) {
        G10.g(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!w((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return I();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarB = B();
        int i = 0;
        while (bVarB.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            bVarB.l(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return J();
    }

    public final boolean w(Map.Entry entry) {
        G10.g(entry, "entry");
        int iC = C(entry.getKey());
        if (iC < 0) {
            return false;
        }
        Object[] objArr = this.C;
        G10.d(objArr);
        return G10.c(objArr[iC], entry.getValue());
    }

    public final boolean x(Map map) {
        return size() == map.size() && s(map.entrySet());
    }

    public C8535tg0() {
        this(8);
    }

    public C8535tg0(int i) {
        this(AbstractC5437ic0.d(i), null, new int[i], new int[O.c(i)], 2, 0);
    }
}
