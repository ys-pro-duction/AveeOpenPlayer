package com.daaw;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2823Ya implements Collection, Set {
    public static final int[] F = new int[0];
    public static final Object[] G = new Object[0];
    public static Object[] H;
    public static int I;
    public static Object[] J;
    public static int K;
    public int[] B;
    public Object[] C;
    public int D;
    public AbstractC9658xg0 E;

    /* JADX INFO: renamed from: com.daaw.Ya$a */
    public class a extends AbstractC9658xg0 {
        public a() {
        }

        @Override // com.daaw.AbstractC9658xg0
        public void a() {
            C2823Ya.this.clear();
        }

        @Override // com.daaw.AbstractC9658xg0
        public Object b(int i, int i2) {
            return C2823Ya.this.C[i];
        }

        @Override // com.daaw.AbstractC9658xg0
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // com.daaw.AbstractC9658xg0
        public int d() {
            return C2823Ya.this.D;
        }

        @Override // com.daaw.AbstractC9658xg0
        public int e(Object obj) {
            return C2823Ya.this.indexOf(obj);
        }

        @Override // com.daaw.AbstractC9658xg0
        public int f(Object obj) {
            return C2823Ya.this.indexOf(obj);
        }

        @Override // com.daaw.AbstractC9658xg0
        public void g(Object obj, Object obj2) {
            C2823Ya.this.add(obj);
        }

        @Override // com.daaw.AbstractC9658xg0
        public void h(int i) {
            C2823Ya.this.w(i);
        }

        @Override // com.daaw.AbstractC9658xg0
        public Object i(int i, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C2823Ya() {
        this(0);
    }

    public static void p(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C2823Ya.class) {
                try {
                    if (K < 10) {
                        objArr[0] = J;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        J = objArr;
                        K++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C2823Ya.class) {
                try {
                    if (I < 10) {
                        objArr[0] = H;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        H = objArr;
                        I++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int iS;
        if (obj == null) {
            iS = v();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iS = s(obj, iHashCode);
        }
        if (iS >= 0) {
            return false;
        }
        int i2 = ~iS;
        int i3 = this.D;
        int[] iArr = this.B;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.C;
            e(i4);
            int[] iArr2 = this.B;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.C, 0, objArr.length);
            }
            p(iArr, objArr, this.D);
        }
        int i5 = this.D;
        if (i2 < i5) {
            int[] iArr3 = this.B;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.C;
            System.arraycopy(objArr2, i2, objArr2, i6, this.D - i2);
        }
        this.B[i2] = i;
        this.C[i2] = obj;
        this.D++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m(this.D + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.D;
        if (i != 0) {
            p(this.B, this.C, i);
            this.B = F;
            this.C = G;
            this.D = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(int i) {
        if (i == 8) {
            synchronized (C2823Ya.class) {
                try {
                    Object[] objArr = J;
                    if (objArr != null) {
                        this.C = objArr;
                        J = (Object[]) objArr[0];
                        this.B = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        K--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C2823Ya.class) {
                try {
                    Object[] objArr2 = H;
                    if (objArr2 != null) {
                        this.C = objArr2;
                        H = (Object[]) objArr2[0];
                        this.B = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        I--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.B = new int[i];
        this.C = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.D; i++) {
                try {
                    if (!set.contains(y(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.B;
        int i = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? v() : s(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.D <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return q().m().iterator();
    }

    public void m(int i) {
        int[] iArr = this.B;
        if (iArr.length < i) {
            Object[] objArr = this.C;
            e(i);
            int i2 = this.D;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.B, 0, i2);
                System.arraycopy(objArr, 0, this.C, 0, this.D);
            }
            p(iArr, objArr, this.D);
        }
    }

    public final AbstractC9658xg0 q() {
        if (this.E == null) {
            this.E = new a();
        }
        return this.E;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        w(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.D - 1; i >= 0; i--) {
            if (!collection.contains(this.C[i])) {
                w(i);
                z = true;
            }
        }
        return z;
    }

    public final int s(Object obj, int i) {
        int i2 = this.D;
        if (i2 == 0) {
            return -1;
        }
        int iA = AbstractC0571Cr.a(this.B, i2, i);
        if (iA < 0 || obj.equals(this.C[iA])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.B[i3] == i) {
            if (obj.equals(this.C[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.B[i4] == i; i4--) {
            if (obj.equals(this.C[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.D;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.D;
        Object[] objArr = new Object[i];
        System.arraycopy(this.C, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.D * 14);
        sb.append('{');
        for (int i = 0; i < this.D; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objY = y(i);
            if (objY != this) {
                sb.append(objY);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final int v() {
        int i = this.D;
        if (i == 0) {
            return -1;
        }
        int iA = AbstractC0571Cr.a(this.B, i, 0);
        if (iA < 0 || this.C[iA] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.B[i2] == 0) {
            if (this.C[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.B[i3] == 0; i3--) {
            if (this.C[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public Object w(int i) {
        Object[] objArr = this.C;
        Object obj = objArr[i];
        int i2 = this.D;
        if (i2 <= 1) {
            p(this.B, objArr, i2);
            this.B = F;
            this.C = G;
            this.D = 0;
            return obj;
        }
        int[] iArr = this.B;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.D = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.C;
                System.arraycopy(objArr2, i4, objArr2, i, this.D - i);
            }
            this.C[this.D] = null;
            return obj;
        }
        e(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.D--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.B, 0, i);
            System.arraycopy(objArr, 0, this.C, 0, i);
        }
        int i5 = this.D;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.B, i, i5 - i);
            System.arraycopy(objArr, i6, this.C, i, this.D - i);
        }
        return obj;
    }

    public Object y(int i) {
        return this.C[i];
    }

    public C2823Ya(int i) {
        if (i == 0) {
            this.B = F;
            this.C = G;
        } else {
            e(i);
        }
        this.D = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.D) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.D);
        }
        System.arraycopy(this.C, 0, objArr, 0, this.D);
        int length = objArr.length;
        int i = this.D;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
