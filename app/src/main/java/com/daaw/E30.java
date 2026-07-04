package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class E30 {
    public static final b d = new b(null);
    public static final E30 e = new E30(AbstractC5009h30.b(null, 1, null), a.B);
    public final C9773y40 a;
    public final NQ b;
    public final boolean c;

    public /* synthetic */ class a extends AbstractC9312wR implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.d(AbstractC5009h30.class, "compiler.common.jvm");
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final EnumC5076hI0 invoke(AP ap) {
            G10.g(ap, "p0");
            return AbstractC5009h30.d(ap);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final E30 a() {
            return E30.e;
        }

        public b() {
        }
    }

    public E30(C9773y40 c9773y40, NQ nq) {
        G10.g(c9773y40, "jsr305");
        G10.g(nq, "getReportLevelForAnnotation");
        this.a = c9773y40;
        this.b = nq;
        this.c = c9773y40.f() || nq.invoke(AbstractC5009h30.e()) == EnumC5076hI0.D;
    }

    public final boolean b() {
        return this.c;
    }

    public final NQ c() {
        return this.b;
    }

    public final C9773y40 d() {
        return this.a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + this.b + ')';
    }
}
