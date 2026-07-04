package com.daaw;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3535bo {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final InterfaceC9976yo f;
    public final Set g;

    public static /* synthetic */ Object a(Object obj, InterfaceC8295so interfaceC8295so) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC8295so interfaceC8295so) {
        return obj;
    }

    public static b c(C4205eC0 c4205eC0) {
        return new b(c4205eC0, new C4205eC0[0]);
    }

    public static b d(C4205eC0 c4205eC0, C4205eC0... c4205eC0Arr) {
        return new b(c4205eC0, c4205eC0Arr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C3535bo l(final Object obj, Class cls) {
        return m(cls).f(new InterfaceC9976yo() { // from class: com.daaw.Zn
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return C3535bo.b(obj, interfaceC8295so);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C3535bo q(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new InterfaceC9976yo() { // from class: com.daaw.ao
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return C3535bo.a(obj, interfaceC8295so);
            }
        }).d();
    }

    public Set g() {
        return this.c;
    }

    public InterfaceC9976yo h() {
        return this.f;
    }

    public String i() {
        return this.a;
    }

    public Set j() {
        return this.b;
    }

    public Set k() {
        return this.g;
    }

    public boolean n() {
        return this.d == 1;
    }

    public boolean o() {
        return this.d == 2;
    }

    public boolean p() {
        return this.e == 0;
    }

    public C3535bo r(InterfaceC9976yo interfaceC9976yo) {
        return new C3535bo(this.a, this.b, this.c, this.d, this.e, interfaceC9976yo, this.g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: com.daaw.bo$b */
    public static class b {
        public String a;
        public final Set b;
        public final Set c;
        public int d;
        public int e;
        public InterfaceC9976yo f;
        public final Set g;

        public b b(C6114kz c6114kz) {
            AbstractC8063ry0.c(c6114kz, "Null dependency");
            j(c6114kz.c());
            this.c.add(c6114kz);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C3535bo d() {
            AbstractC8063ry0.d(this.f != null, "Missing required property: factory.");
            return new C3535bo(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }

        public b e() {
            return i(2);
        }

        public b f(InterfaceC9976yo interfaceC9976yo) {
            this.f = (InterfaceC9976yo) AbstractC8063ry0.c(interfaceC9976yo, "Null factory");
            return this;
        }

        public final b g() {
            this.e = 1;
            return this;
        }

        public b h(String str) {
            this.a = str;
            return this;
        }

        public final b i(int i) {
            AbstractC8063ry0.d(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        public final void j(C4205eC0 c4205eC0) {
            AbstractC8063ry0.a(!this.b.contains(c4205eC0), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            AbstractC8063ry0.c(cls, "Null interface");
            hashSet.add(C4205eC0.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC8063ry0.c(cls2, "Null interface");
                this.b.add(C4205eC0.b(cls2));
            }
        }

        public b(C4205eC0 c4205eC0, C4205eC0... c4205eC0Arr) {
            this.a = null;
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            this.c = new HashSet();
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            AbstractC8063ry0.c(c4205eC0, "Null interface");
            hashSet.add(c4205eC0);
            for (C4205eC0 c4205eC02 : c4205eC0Arr) {
                AbstractC8063ry0.c(c4205eC02, "Null interface");
            }
            Collections.addAll(this.b, c4205eC0Arr);
        }
    }

    public C3535bo(String str, Set set, Set set2, int i, int i2, InterfaceC9976yo interfaceC9976yo, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC9976yo;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }
}
