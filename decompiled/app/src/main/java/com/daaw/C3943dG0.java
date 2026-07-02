package com.daaw;

import com.daaw.InterfaceC10072z80;

/* JADX INFO: renamed from: com.daaw.dG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3943dG0 implements InterfaceC10072z80 {
    public static final a c = new a(null);
    public final Class a;
    public final C9514x80 b;

    /* JADX INFO: renamed from: com.daaw.dG0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C3943dG0 a(Class cls) {
            G10.g(cls, "klass");
            EE0 ee0 = new EE0();
            C8700uF0.a.b(cls, ee0);
            C9514x80 c9514x80N = ee0.n();
            AbstractC2911Yw abstractC2911Yw = null;
            if (c9514x80N == null) {
                return null;
            }
            return new C3943dG0(cls, c9514x80N, abstractC2911Yw);
        }

        public a() {
        }
    }

    public /* synthetic */ C3943dG0(Class cls, C9514x80 c9514x80, AbstractC2911Yw abstractC2911Yw) {
        this(cls, c9514x80);
    }

    @Override // com.daaw.InterfaceC10072z80
    public C9514x80 a() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC10072z80
    public void b(InterfaceC10072z80.d dVar, byte[] bArr) {
        G10.g(dVar, "visitor");
        C8700uF0.a.i(this.a, dVar);
    }

    @Override // com.daaw.InterfaceC10072z80
    public void c(InterfaceC10072z80.c cVar, byte[] bArr) {
        G10.g(cVar, "visitor");
        C8700uF0.a.b(this.a, cVar);
    }

    public final Class d() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC10072z80
    public C6607ml e() {
        return AbstractC9544xF0.e(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3943dG0) && G10.c(this.a, ((C3943dG0) obj).a);
    }

    @Override // com.daaw.InterfaceC10072z80
    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.a.getName();
        G10.f(name, "getName(...)");
        sb.append(AY0.r(name, '.', '/', false, 4, null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return C3943dG0.class.getName() + ": " + this.a;
    }

    public C3943dG0(Class cls, C9514x80 c9514x80) {
        this.a = cls;
        this.b = c9514x80;
    }
}
