package com.daaw;

/* JADX INFO: renamed from: com.daaw.ps1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7481ps1 {
    public final InterfaceC8576to1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public C7481ps1(InterfaceC8576to1 interfaceC8576to1) {
        this.a = interfaceC8576to1;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = i3 + (i2 - i);
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
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
    public final void b(long j, int i, boolean z) {
        if (this.e == 182 && z && this.b) {
            long j2 = this.h;
            if (j2 != -9223372036854775807L) {
                long j3 = j - this.g;
                int i2 = (int) j3;
                this.a.c(j2, this.d ? 1 : 0, i2, i, null);
            }
        }
        if (this.e != 179) {
            this.g = j;
        }
    }

    public final void c(int i, long j) {
        boolean z;
        this.e = i;
        this.d = false;
        if (i == 182) {
            z = true;
        } else if (i == 179) {
            i = 179;
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.c = i == 182;
        this.f = 0;
        this.h = j;
    }

    public final void d() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = -1;
    }
}
