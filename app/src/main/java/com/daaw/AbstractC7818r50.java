package com.daaw;

/* JADX INFO: renamed from: com.daaw.r50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7818r50 {
    public static final b a = new b(null);
    public static final d b = new d(EnumC6703n50.BOOLEAN);
    public static final d c = new d(EnumC6703n50.CHAR);
    public static final d d = new d(EnumC6703n50.BYTE);
    public static final d e = new d(EnumC6703n50.SHORT);
    public static final d f = new d(EnumC6703n50.INT);
    public static final d g = new d(EnumC6703n50.FLOAT);
    public static final d h = new d(EnumC6703n50.LONG);
    public static final d i = new d(EnumC6703n50.DOUBLE);

    /* JADX INFO: renamed from: com.daaw.r50$a */
    public static final class a extends AbstractC7818r50 {
        public final AbstractC7818r50 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC7818r50 abstractC7818r50) {
            super(null);
            G10.g(abstractC7818r50, "elementType");
            this.j = abstractC7818r50;
        }

        public final AbstractC7818r50 i() {
            return this.j;
        }
    }

    /* JADX INFO: renamed from: com.daaw.r50$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final d a() {
            return AbstractC7818r50.b;
        }

        public final d b() {
            return AbstractC7818r50.d;
        }

        public final d c() {
            return AbstractC7818r50.c;
        }

        public final d d() {
            return AbstractC7818r50.i;
        }

        public final d e() {
            return AbstractC7818r50.g;
        }

        public final d f() {
            return AbstractC7818r50.f;
        }

        public final d g() {
            return AbstractC7818r50.h;
        }

        public final d h() {
            return AbstractC7818r50.e;
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.r50$c */
    public static final class c extends AbstractC7818r50 {
        public final String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            G10.g(str, "internalName");
            this.j = str;
        }

        public final String i() {
            return this.j;
        }
    }

    /* JADX INFO: renamed from: com.daaw.r50$d */
    public static final class d extends AbstractC7818r50 {
        public final EnumC6703n50 j;

        public d(EnumC6703n50 enumC6703n50) {
            super(null);
            this.j = enumC6703n50;
        }

        public final EnumC6703n50 i() {
            return this.j;
        }
    }

    public /* synthetic */ AbstractC7818r50(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public String toString() {
        return C8376t50.a.a(this);
    }

    public AbstractC7818r50() {
    }
}
