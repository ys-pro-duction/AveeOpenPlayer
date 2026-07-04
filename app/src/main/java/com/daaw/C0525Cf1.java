package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Cf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0525Cf1 {
    public static final C0525Cf1 a = new C0525Cf1();
    public static final Map b;
    public static final h c;

    /* JADX INFO: renamed from: com.daaw.Cf1$a */
    public static final class a extends AbstractC0742Ef1 {
        public static final a c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$b */
    public static final class b extends AbstractC0742Ef1 {
        public static final b c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$c */
    public static final class c extends AbstractC0742Ef1 {
        public static final c c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$d */
    public static final class d extends AbstractC0742Ef1 {
        public static final d c = new d();

        public d() {
            super("local", false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$e */
    public static final class e extends AbstractC0742Ef1 {
        public static final e c = new e();

        public e() {
            super("private", false);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$f */
    public static final class f extends AbstractC0742Ef1 {
        public static final f c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // com.daaw.AbstractC0742Ef1
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$g */
    public static final class g extends AbstractC0742Ef1 {
        public static final g c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$h */
    public static final class h extends AbstractC0742Ef1 {
        public static final h c = new h();

        public h() {
            super("public", true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Cf1$i */
    public static final class i extends AbstractC0742Ef1 {
        public static final i c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = AbstractC1369Kg0.c();
        mapC.put(f.c, 0);
        mapC.put(e.c, 0);
        mapC.put(b.c, 1);
        mapC.put(g.c, 1);
        h hVar = h.c;
        mapC.put(hVar, 2);
        b = AbstractC1369Kg0.b(mapC);
        c = hVar;
    }

    public final Integer a(AbstractC0742Ef1 abstractC0742Ef1, AbstractC0742Ef1 abstractC0742Ef12) {
        G10.g(abstractC0742Ef1, "first");
        G10.g(abstractC0742Ef12, "second");
        if (abstractC0742Ef1 == abstractC0742Ef12) {
            return 0;
        }
        Map map = b;
        Integer num = (Integer) map.get(abstractC0742Ef1);
        Integer num2 = (Integer) map.get(abstractC0742Ef12);
        if (num == null || num2 == null || G10.c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(AbstractC0742Ef1 abstractC0742Ef1) {
        G10.g(abstractC0742Ef1, "visibility");
        return abstractC0742Ef1 == e.c || abstractC0742Ef1 == f.c;
    }
}
