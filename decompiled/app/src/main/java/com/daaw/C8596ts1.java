package com.daaw;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.daaw.ts1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8596ts1 {
    public final InterfaceC8576to1 a;
    public final VR2 d;
    public final byte[] e;
    public int f;
    public long g;
    public long h;
    public long l;
    public long m;
    public boolean n;
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final C8317ss1 i = new C8317ss1(null);
    public final C8317ss1 j = new C8317ss1(null);
    public boolean k = false;

    public C8596ts1(InterfaceC8576to1 interfaceC8576to1, boolean z, boolean z2) {
        this.a = interfaceC8576to1;
        byte[] bArr = new byte[128];
        this.e = bArr;
        this.d = new VR2(bArr, 0, 0);
    }

    public final void a(long j) {
        this.g = j;
        g(0);
        this.k = false;
    }

    public final void b(YP2 yp2) {
        this.c.append(yp2.a, yp2);
    }

    public final void c(BQ2 bq2) {
        this.b.append(bq2.d, bq2);
    }

    public final void d() {
        this.k = false;
    }

    public final void e(long j, int i, long j2) {
        this.f = i;
        this.h = j2;
        this.g = j;
    }

    public final boolean f(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f == 9) {
            if (z && this.k) {
                g(i + ((int) (j - this.g)));
            }
            this.l = this.g;
            this.m = this.h;
            this.n = false;
            this.k = true;
        }
        boolean z4 = this.n;
        int i2 = this.f;
        if (i2 == 5 || (z2 && i2 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.n = z5;
        return z5;
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
    public final void g(int i) {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.n;
        long j2 = this.g - this.l;
        this.a.c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
