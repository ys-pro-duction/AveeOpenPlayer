package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D7 implements CharSequence {
    public final String B;
    public final List C;
    public final List D;
    public final List E;

    public D7(String str, List list, List list2, List list3) {
        G10.g(str, "text");
        G10.g(list, "spanStyles");
        G10.g(list2, "paragraphStyles");
        G10.g(list3, "annotations");
        this.B = str;
        this.C = list;
        this.D = list2;
        this.E = list3;
        int size = list2.size();
        int iD = -1;
        for (int i = 0; i < size; i++) {
            b bVar = (b) list2.get(i);
            if (bVar.f() < iD) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (bVar.d() > this.B.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
            }
            iD = bVar.d();
        }
    }

    public char a(int i) {
        return this.B.charAt(i);
    }

    public final List b() {
        return this.E;
    }

    public int c() {
        return this.B.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return a(i);
    }

    public final List d() {
        return this.D;
    }

    public final List e() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D7)) {
            return false;
        }
        D7 d7 = (D7) obj;
        return G10.c(this.B, d7.B) && G10.c(this.C, d7.C) && G10.c(this.D, d7.D) && G10.c(this.E, d7.E);
    }

    public final List f(String str, int i, int i2) {
        G10.g(str, "tag");
        List list = this.E;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            b bVar = (b) obj;
            if ((bVar.e() instanceof String) && G10.c(str, bVar.g()) && E7.f(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String g() {
        return this.B;
    }

    public final List h(int i, int i2) {
        List list = this.E;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            b bVar = (b) obj;
            if ((bVar.e() instanceof AbstractC10063z61) && E7.f(i, i2, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.B.hashCode() * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public D7 subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.B.length()) {
                return this;
            }
            String strSubstring = this.B.substring(i, i2);
            G10.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new D7(strSubstring, E7.d(this.C, i, i2), E7.d(this.D, i, i2), E7.d(this.E, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    public final D7 j(long j) {
        return subSequence(G21.i(j), G21.h(j));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.B;
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final String d;

        public b(Object obj, int i, int i2, String str) {
            G10.g(str, "tag");
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i > i2) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.c;
        }

        public final Object e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && G10.c(this.d, bVar.d);
        }

        public final int f() {
            return this.b;
        }

        public final String g() {
            return this.d;
        }

        public int hashCode() {
            Object obj = this.a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
        }

        public b(Object obj, int i, int i2) {
            this(obj, i, i2, "");
        }
    }

    public static final class a {
        public final StringBuilder a;
        public final List b;
        public final List c;
        public final List d;
        public final List e;

        public a(int i) {
            this.a = new StringBuilder(i);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public final void a(String str) {
            G10.g(str, "text");
            this.a.append(str);
        }

        public final void b() {
            if (this.e.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            ((C0056a) this.e.remove(r0.size() - 1)).a(this.a.length());
        }

        public final void c(int i) {
            if (i < this.e.size()) {
                while (this.e.size() - 1 >= i) {
                    b();
                }
            } else {
                throw new IllegalStateException((i + " should be less than " + this.e.size()).toString());
            }
        }

        public final int d(XU0 xu0) {
            G10.g(xu0, "style");
            C0056a c0056a = new C0056a(xu0, this.a.length(), 0, null, 12, null);
            this.e.add(c0056a);
            this.b.add(c0056a);
            return this.e.size() - 1;
        }

        public final D7 e() {
            String string = this.a.toString();
            G10.f(string, "text.toString()");
            List list = this.b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C0056a) list.get(i)).b(this.a.length()));
            }
            List list2 = this.c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((C0056a) list2.get(i2)).b(this.a.length()));
            }
            List list3 = this.d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(((C0056a) list3.get(i3)).b(this.a.length()));
            }
            return new D7(string, arrayList, arrayList2, arrayList3);
        }

        /* JADX INFO: renamed from: com.daaw.D7$a$a, reason: collision with other inner class name */
        public static final class C0056a {
            public final Object a;
            public final int b;
            public int c;
            public final String d;

            public C0056a(Object obj, int i, int i2, String str) {
                G10.g(str, "tag");
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public final void a(int i) {
                this.c = i;
            }

            public final b b(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    return new b(this.a, this.b, i, this.d);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0056a)) {
                    return false;
                }
                C0056a c0056a = (C0056a) obj;
                return G10.c(this.a, c0056a.a) && this.b == c0056a.b && this.c == c0056a.c && G10.c(this.d, c0056a.d);
            }

            public int hashCode() {
                Object obj = this.a;
                return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
            }

            public /* synthetic */ C0056a(Object obj, int i, int i2, String str, int i3, AbstractC2911Yw abstractC2911Yw) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
            this((i2 & 1) != 0 ? 16 : i);
        }
    }

    public /* synthetic */ D7(String str, List list, List list2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, (i & 2) != 0 ? AbstractC1599Mm.k() : list, (i & 4) != 0 ? AbstractC1599Mm.k() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D7(String str, List list, List list2) {
        this(str, list, list2, AbstractC1599Mm.k());
        G10.g(str, "text");
        G10.g(list, "spanStyles");
        G10.g(list2, "paragraphStyles");
    }
}
