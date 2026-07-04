package com.daaw;

import com.daaw.OY;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.vG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8990vG0 extends OY {
    public static final OY I = new C8990vG0(null, new Object[0], 0);
    public final transient Object F;
    public final transient Object[] G;
    public final transient int H;

    /* JADX INFO: renamed from: com.daaw.vG0$a */
    public static class a extends PY {
        public final transient OY D;
        public final transient Object[] E;
        public final transient int F;
        public final transient int G;

        /* JADX INFO: renamed from: com.daaw.vG0$a$a, reason: collision with other inner class name */
        public class C0245a extends MY {
            public C0245a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i) {
                AbstractC7785qy0.l(i, a.this.G);
                int i2 = i * 2;
                Object obj = a.this.E[a.this.F + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.E[i2 + (a.this.F ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.G;
            }
        }

        public a(OY oy, Object[] objArr, int i, int i2) {
            this.D = oy;
            this.E = objArr;
            this.F = i;
            this.G = i2;
        }

        @Override // com.daaw.PY
        public MY H() {
            return new C0245a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public O91 iterator() {
            return D().iterator();
        }

        @Override // com.daaw.IY, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.D.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.daaw.IY
        public int e(Object[] objArr, int i) {
            return D().e(objArr, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.G;
        }

        @Override // com.daaw.IY
        public boolean y() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vG0$b */
    public static final class b extends PY {
        public final transient OY D;
        public final transient MY E;

        public b(OY oy, MY my) {
            this.D = oy;
            this.E = my;
        }

        @Override // com.daaw.PY
        public MY D() {
            return this.E;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public O91 iterator() {
            return D().iterator();
        }

        @Override // com.daaw.IY, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.D.get(obj) != null;
        }

        @Override // com.daaw.IY
        public int e(Object[] objArr, int i) {
            return D().e(objArr, i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.D.size();
        }

        @Override // com.daaw.IY
        public boolean y() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vG0$c */
    public static final class c extends MY {
        public final transient Object[] D;
        public final transient int E;
        public final transient int F;

        public c(Object[] objArr, int i, int i2) {
            this.D = objArr;
            this.E = i;
            this.F = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            AbstractC7785qy0.l(i, this.F);
            Object obj = this.D[(i * 2) + this.E];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.F;
        }
    }

    public C8990vG0(Object obj, Object[] objArr, int i) {
        this.F = obj;
        this.G = objArr;
        this.H = i;
    }

    public static C8990vG0 l(int i, Object[] objArr, OY.a aVar) {
        if (i == 0) {
            return (C8990vG0) I;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC0768Em.a(obj, obj2);
            return new C8990vG0(null, objArr, 1);
        }
        AbstractC7785qy0.q(i, objArr.length >> 1);
        Object objN = n(objArr, i, PY.E(i), 0);
        if (objN instanceof Object[]) {
            Object[] objArr2 = (Object[]) objN;
            OY.a.C0096a c0096a = (OY.a.C0096a) objArr2[2];
            if (aVar == null) {
                throw c0096a.a();
            }
            aVar.e = c0096a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objN = obj3;
            i = iIntValue;
        }
        return new C8990vG0(objN, objArr, i);
    }

    public static Object n(Object[] objArr, int i, int i2, int i3) {
        OY.a.C0096a c0096a = null;
        int i4 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC0768Em.a(obj, obj2);
            return null;
        }
        int i5 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj3 = objArr[i8];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC0768Em.a(obj3, obj4);
                int iA = EU.a(obj3.hashCode());
                while (true) {
                    int i10 = iA & i5;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj5 = objArr[i12];
                            Objects.requireNonNull(obj5);
                            c0096a = new OY.a.C0096a(obj3, obj4, obj5);
                            objArr[i12] = obj4;
                            break;
                        }
                        iA = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0096a};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj6 = objArr[i15];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC0768Em.a(obj6, obj7);
                int iA2 = EU.a(obj6.hashCode());
                while (true) {
                    int i17 = iA2 & i5;
                    int i18 = sArr[i17] & 65535;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else {
                        if (obj6.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj8 = objArr[i19];
                            Objects.requireNonNull(obj8);
                            c0096a = new OY.a.C0096a(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            break;
                        }
                        iA2 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0096a};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj9 = objArr[i22];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i22 ^ i4];
            Objects.requireNonNull(obj10);
            AbstractC0768Em.a(obj9, obj10);
            int iA3 = EU.a(obj9.hashCode());
            while (true) {
                int i24 = iA3 & i5;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                } else {
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        Objects.requireNonNull(obj11);
                        c0096a = new OY.a.C0096a(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        break;
                    }
                    iA3 = i24 + 1;
                }
            }
            i20++;
            i4 = 1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c0096a};
    }

    public static Object o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = EU.a(obj2.hashCode());
            while (true) {
                int i3 = iA & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iA = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = EU.a(obj2.hashCode());
            while (true) {
                int i5 = iA2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iA2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = EU.a(obj2.hashCode());
            while (true) {
                int i7 = iA3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iA3 = i7 + 1;
            }
        }
    }

    @Override // com.daaw.OY
    public PY d() {
        return new a(this, this.G, 0, this.H);
    }

    @Override // com.daaw.OY
    public PY e() {
        return new b(this, new c(this.G, 0, this.H));
    }

    @Override // com.daaw.OY
    public IY f() {
        return new c(this.G, 1, this.H);
    }

    @Override // com.daaw.OY, java.util.Map
    public Object get(Object obj) {
        Object objO = o(this.F, this.G, this.H, 0, obj);
        if (objO == null) {
            return null;
        }
        return objO;
    }

    @Override // com.daaw.OY
    public boolean h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.H;
    }
}
