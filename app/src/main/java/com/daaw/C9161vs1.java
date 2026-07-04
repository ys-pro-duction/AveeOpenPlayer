package com.daaw;

/* JADX INFO: renamed from: com.daaw.vs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9161vs1 {
    public final InterfaceC8576to1 a;
    public long b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public boolean m;

    public C9161vs1(InterfaceC8576to1 interfaceC8576to1) {
        this.a = interfaceC8576to1;
    }

    public final void a(long j) {
        this.b = j;
        f(0);
        this.i = false;
    }

    public final void b(long j, int i, boolean z) {
        if (this.j && this.g) {
            this.m = this.c;
            this.j = false;
        } else if (this.h || this.g) {
            if (z && this.i) {
                f(i + ((int) (j - this.b)));
            }
            this.k = this.b;
            this.l = this.e;
            this.m = this.c;
            this.i = true;
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        if (this.f) {
            int i3 = this.d;
            int i4 = (i + 2) - i3;
            if (i4 >= i2) {
                this.d = i3 + (i2 - i);
            } else {
                this.g = (bArr[i4] & 128) != 0;
                this.f = false;
            }
        }
    }

    public final void d() {
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public final void e(long j, int i, int i2, long j2, boolean z) {
        this.g = false;
        this.h = false;
        this.e = j2;
        this.d = 0;
        this.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (this.i && !this.j) {
                if (z) {
                    f(i);
                }
                this.i = false;
            }
            if (i2 <= 35 || i2 == 39) {
                this.h = !this.j;
                this.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        this.c = z2;
        this.f = z2 || i2 <= 9;
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
    public final void f(int i) {
        long j = this.l;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.m;
        long j2 = this.b - this.k;
        this.a.c(j, z ? 1 : 0, (int) j2, i, null);
    }
}
