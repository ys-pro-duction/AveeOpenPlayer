package com.daaw;

import com.daaw.SY;
import com.daaw.X80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5616jE0 extends SY {
    public X80 B;
    public Comparator C;

    public static C5616jE0 D(List list, Map map, SY.a.InterfaceC0118a interfaceC0118a, Comparator comparator) {
        return b.b(list, map, interfaceC0118a, comparator);
    }

    public static C5616jE0 E(Map map, Comparator comparator) {
        return b.b(new ArrayList(map.keySet()), map, SY.a.d(), comparator);
    }

    public final X80 F(Object obj) {
        X80 x80A = this.B;
        while (!x80A.isEmpty()) {
            int iCompare = this.C.compare(obj, x80A.getKey());
            if (iCompare < 0) {
                x80A = x80A.a();
            } else {
                if (iCompare == 0) {
                    return x80A;
                }
                x80A = x80A.d();
            }
        }
        return null;
    }

    @Override // com.daaw.SY
    public boolean e(Object obj) {
        return F(obj) != null;
    }

    @Override // com.daaw.SY
    public boolean isEmpty() {
        return this.B.isEmpty();
    }

    @Override // com.daaw.SY, java.lang.Iterable
    public Iterator iterator() {
        return new TY(this.B, null, this.C, false);
    }

    @Override // com.daaw.SY
    public Object m(Object obj) {
        X80 x80F = F(obj);
        if (x80F != null) {
            return x80F.getValue();
        }
        return null;
    }

    @Override // com.daaw.SY
    public Comparator p() {
        return this.C;
    }

    @Override // com.daaw.SY
    public Object q() {
        return this.B.h().getKey();
    }

    @Override // com.daaw.SY
    public Object s() {
        return this.B.g().getKey();
    }

    @Override // com.daaw.SY
    public int size() {
        return this.B.size();
    }

    @Override // com.daaw.SY
    public SY v(Object obj, Object obj2) {
        return new C5616jE0(this.B.b(obj, obj2, this.C).e(null, null, X80.a.BLACK, null, null), this.C);
    }

    @Override // com.daaw.SY
    public Iterator w(Object obj) {
        return new TY(this.B, obj, this.C, false);
    }

    @Override // com.daaw.SY
    public SY y(Object obj) {
        return !e(obj) ? this : new C5616jE0(this.B.c(obj, this.C).e(null, null, X80.a.BLACK, null, null), this.C);
    }

    public C5616jE0(X80 x80, Comparator comparator) {
        this.B = x80;
        this.C = comparator;
    }

    /* JADX INFO: renamed from: com.daaw.jE0$b */
    public static class b {
        public final List a;
        public final Map b;
        public final SY.a.InterfaceC0118a c;
        public Z80 d;
        public Z80 e;

        /* JADX INFO: renamed from: com.daaw.jE0$b$b, reason: collision with other inner class name */
        public static class C0196b {
            public boolean a;
            public int b;
        }

        public b(List list, Map map, SY.a.InterfaceC0118a interfaceC0118a) {
            this.a = list;
            this.b = map;
            this.c = interfaceC0118a;
        }

        public static C5616jE0 b(List list, Map map, SY.a.InterfaceC0118a interfaceC0118a, Comparator comparator) {
            b bVar = new b(list, map, interfaceC0118a);
            Collections.sort(list, comparator);
            int size = list.size();
            for (C0196b c0196b : new a(list.size())) {
                int i = c0196b.b;
                size -= i;
                if (c0196b.a) {
                    bVar.c(X80.a.BLACK, i, size);
                } else {
                    bVar.c(X80.a.BLACK, i, size);
                    int i2 = c0196b.b;
                    size -= i2;
                    bVar.c(X80.a.RED, i2, size);
                }
            }
            X80 x80I = bVar.d;
            if (x80I == null) {
                x80I = W80.i();
            }
            return new C5616jE0(x80I, comparator);
        }

        public final X80 a(int i, int i2) {
            if (i2 == 0) {
                return W80.i();
            }
            if (i2 == 1) {
                Object obj = this.a.get(i);
                return new V80(obj, d(obj), null, null);
            }
            int i3 = i2 / 2;
            int i4 = i + i3;
            X80 x80A = a(i, i3);
            X80 x80A2 = a(i4 + 1, i3);
            Object obj2 = this.a.get(i4);
            return new V80(obj2, d(obj2), x80A, x80A2);
        }

        public final void c(X80.a aVar, int i, int i2) {
            X80 x80A = a(i2 + 1, i - 1);
            Object obj = this.a.get(i2);
            Z80 y80 = aVar == X80.a.RED ? new Y80(obj, d(obj), null, x80A) : new V80(obj, d(obj), null, x80A);
            if (this.d == null) {
                this.d = y80;
                this.e = y80;
            } else {
                this.e.t(y80);
                this.e = y80;
            }
        }

        public final Object d(Object obj) {
            return this.b.get(this.c.a(obj));
        }

        /* JADX INFO: renamed from: com.daaw.jE0$b$a */
        public static class a implements Iterable {
            public long B;
            public final int C;

            public a(int i) {
                int i2 = i + 1;
                int iFloor = (int) Math.floor(Math.log(i2) / Math.log(2.0d));
                this.C = iFloor;
                this.B = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i2);
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C0195a();
            }

            /* JADX INFO: renamed from: com.daaw.jE0$b$a$a, reason: collision with other inner class name */
            public class C0195a implements Iterator {
                public int B;

                public C0195a() {
                    this.B = a.this.C - 1;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C0196b next() {
                    long j = a.this.B & ((long) (1 << this.B));
                    C0196b c0196b = new C0196b();
                    c0196b.a = j == 0;
                    c0196b.b = (int) Math.pow(2.0d, this.B);
                    this.B--;
                    return c0196b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.B >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }
        }
    }
}
