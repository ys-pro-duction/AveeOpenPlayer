package com.daaw;

/* JADX INFO: renamed from: com.daaw.ns1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6923ns1 implements InterfaceC6365ls1 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public InterfaceC8576to1 b;
    public final C4965gt1 c;
    public final C5900kE2 d;
    public final C0369As1 e;
    public final boolean[] f = new boolean[4];
    public final C6644ms1 g = new C6644ms1(128);
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public C6923ns1(C4965gt1 c4965gt1) {
        C5900kE2 c5900kE2;
        this.c = c4965gt1;
        if (c4965gt1 != null) {
            this.e = new C0369As1(178, 128);
            c5900kE2 = new C5900kE2();
        } else {
            c5900kE2 = null;
            this.e = null;
        }
        this.d = c5900kE2;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.InterfaceC6365ls1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.daaw.C5900kE2 r30) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6923ns1.a(com.daaw.kE2):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.InterfaceC6365ls1
    public final void b(boolean z) {
        AbstractC6048km2.b(this.b);
        if (z) {
            boolean z2 = this.o;
            long j = this.h - this.m;
            this.b.c(this.n, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void c(long j, int i) {
        this.l = j;
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void d(InterfaceC1398Kn1 interfaceC1398Kn1, C4118dt1 c4118dt1) {
        c4118dt1.c();
        this.a = c4118dt1.b();
        this.b = interfaceC1398Kn1.o(c4118dt1.a(), 2);
        C4965gt1 c4965gt1 = this.c;
        if (c4965gt1 != null) {
            c4965gt1.b(interfaceC1398Kn1, c4118dt1);
        }
    }

    @Override // com.daaw.InterfaceC6365ls1
    public final void zze() {
        AbstractC4556fR2.f(this.f);
        this.g.b();
        C0369As1 c0369As1 = this.e;
        if (c0369As1 != null) {
            c0369As1.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
