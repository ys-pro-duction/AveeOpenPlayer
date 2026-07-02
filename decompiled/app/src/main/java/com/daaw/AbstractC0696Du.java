package com.daaw;

import com.daaw.H3;

/* JADX INFO: renamed from: com.daaw.Du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0696Du {
    public static final b a = new b(null);
    public static final AbstractC0696Du b = a.e;
    public static final AbstractC0696Du c = e.e;
    public static final AbstractC0696Du d = c.e;

    /* JADX INFO: renamed from: com.daaw.Du$a */
    public static final class a extends AbstractC0696Du {
        public static final a e = new a();

        public a() {
            super(null);
        }

        @Override // com.daaw.AbstractC0696Du
        public int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(abstractC0584Cu0, "placeable");
            return i / 2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Du$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC0696Du a(H3.b bVar) {
            G10.g(bVar, "horizontal");
            return new d(bVar);
        }

        public final AbstractC0696Du b(H3.c cVar) {
            G10.g(cVar, "vertical");
            return new f(cVar);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Du$c */
    public static final class c extends AbstractC0696Du {
        public static final c e = new c();

        public c() {
            super(null);
        }

        @Override // com.daaw.AbstractC0696Du
        public int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(abstractC0584Cu0, "placeable");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                return i;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Du$d */
    public static final class d extends AbstractC0696Du {
        public final H3.b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(H3.b bVar) {
            super(null);
            G10.g(bVar, "horizontal");
            this.e = bVar;
        }

        @Override // com.daaw.AbstractC0696Du
        public int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(abstractC0584Cu0, "placeable");
            return this.e.a(0, i, enumC7560q90);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Du$e */
    public static final class e extends AbstractC0696Du {
        public static final e e = new e();

        public e() {
            super(null);
        }

        @Override // com.daaw.AbstractC0696Du
        public int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(abstractC0584Cu0, "placeable");
            if (enumC7560q90 == EnumC7560q90.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Du$f */
    public static final class f extends AbstractC0696Du {
        public final H3.c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(H3.c cVar) {
            super(null);
            G10.g(cVar, "vertical");
            this.e = cVar;
        }

        @Override // com.daaw.AbstractC0696Du
        public int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            G10.g(enumC7560q90, "layoutDirection");
            G10.g(abstractC0584Cu0, "placeable");
            return this.e.a(0, i);
        }
    }

    public /* synthetic */ AbstractC0696Du(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public abstract int a(int i, EnumC7560q90 enumC7560q90, AbstractC0584Cu0 abstractC0584Cu0, int i2);

    public Integer b(AbstractC0584Cu0 abstractC0584Cu0) {
        G10.g(abstractC0584Cu0, "placeable");
        return null;
    }

    public boolean c() {
        return false;
    }

    public AbstractC0696Du() {
    }
}
