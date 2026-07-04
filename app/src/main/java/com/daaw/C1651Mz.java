package com.daaw;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1651Mz {
    public static final a c;
    public static int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final C1651Mz o;
    public static final C1651Mz p;
    public static final C1651Mz q;
    public static final C1651Mz r;
    public static final C1651Mz s;
    public static final C1651Mz t;
    public static final C1651Mz u;
    public static final C1651Mz v;
    public static final C1651Mz w;
    public static final C1651Mz x;
    public static final List y;
    public static final List z;
    public final List a;
    public final int b;

    /* JADX INFO: renamed from: com.daaw.Mz$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.Mz$a$a, reason: collision with other inner class name */
        public static final class C0094a {
            public final int a;
            public final String b;

            public C0094a(int i, String str) {
                G10.g(str, "name");
                this.a = i;
                this.b = str;
            }

            public final int a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int b() {
            return C1651Mz.k;
        }

        public final int c() {
            return C1651Mz.l;
        }

        public final int d() {
            return C1651Mz.i;
        }

        public final int e() {
            return C1651Mz.e;
        }

        public final int f() {
            return C1651Mz.h;
        }

        public final int g() {
            return C1651Mz.f;
        }

        public final int h() {
            return C1651Mz.g;
        }

        public final int i() {
            return C1651Mz.j;
        }

        public final int j() {
            int i = C1651Mz.d;
            C1651Mz.d <<= 1;
            return i;
        }

        public a() {
        }
    }

    static {
        a.C0094a c0094a;
        a.C0094a c0094a2;
        a aVar = new a(null);
        c = aVar;
        d = 1;
        int iJ = aVar.j();
        e = iJ;
        int iJ2 = aVar.j();
        f = iJ2;
        int iJ3 = aVar.j();
        g = iJ3;
        int iJ4 = aVar.j();
        h = iJ4;
        int iJ5 = aVar.j();
        i = iJ5;
        int iJ6 = aVar.j();
        j = iJ6;
        int iJ7 = aVar.j() - 1;
        k = iJ7;
        int i2 = iJ | iJ2 | iJ3;
        l = i2;
        int i3 = iJ2 | iJ5 | iJ6;
        m = i3;
        int i4 = iJ5 | iJ6;
        n = i4;
        int i5 = 2;
        o = new C1651Mz(iJ7, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        p = new C1651Mz(i4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        q = new C1651Mz(iJ, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        r = new C1651Mz(iJ2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        s = new C1651Mz(iJ3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        t = new C1651Mz(i2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        u = new C1651Mz(iJ4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        v = new C1651Mz(iJ5, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        w = new C1651Mz(iJ6, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        x = new C1651Mz(i3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        Field[] fields = C1651Mz.class.getFields();
        G10.f(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C1651Mz c1651Mz = obj instanceof C1651Mz ? (C1651Mz) obj : null;
            if (c1651Mz != null) {
                int i6 = c1651Mz.b;
                String name = field2.getName();
                G10.f(name, "getName(...)");
                c0094a2 = new a.C0094a(i6, name);
            } else {
                c0094a2 = null;
            }
            if (c0094a2 != null) {
                arrayList2.add(c0094a2);
            }
        }
        y = arrayList2;
        Field[] fields2 = C1651Mz.class.getFields();
        G10.f(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (G10.c(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            G10.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                G10.f(name2, "getName(...)");
                c0094a = new a.C0094a(iIntValue, name2);
            } else {
                c0094a = null;
            }
            if (c0094a != null) {
                arrayList5.add(c0094a);
            }
        }
        z = arrayList5;
    }

    public C1651Mz(int i2, List list) {
        G10.g(list, "excludes");
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((AbstractC1547Lz) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (i2 & this.b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!G10.c(C1651Mz.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        G10.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C1651Mz c1651Mz = (C1651Mz) obj;
        return G10.c(this.a, c1651Mz.a) && this.b == c1651Mz.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final List l() {
        return this.a;
    }

    public final int m() {
        return this.b;
    }

    public final C1651Mz n(int i2) {
        int i3 = i2 & this.b;
        if (i3 == 0) {
            return null;
        }
        return new C1651Mz(i3, this.a);
    }

    public String toString() {
        Object next;
        Iterator it = y.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((a.C0094a) next).a() == this.b) {
                break;
            }
        }
        a.C0094a c0094a = (a.C0094a) next;
        String strB = c0094a != null ? c0094a.b() : null;
        if (strB == null) {
            List<a.C0094a> list = z;
            ArrayList arrayList = new ArrayList();
            for (a.C0094a c0094a2 : list) {
                String strB2 = a(c0094a2.a()) ? c0094a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = AbstractC2455Um.n0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.a + ')';
    }

    public /* synthetic */ C1651Mz(int i2, List list, int i3, AbstractC2911Yw abstractC2911Yw) {
        this(i2, (i3 & 2) != 0 ? AbstractC1599Mm.k() : list);
    }
}
