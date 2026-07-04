package com.daaw;

/* JADX INFO: renamed from: com.daaw.d91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3915d91 {
    public final C4716g01 a = AbstractC3870d01.a();
    public final C9095vf0 b = new C9095vf0(16);

    /* JADX INFO: renamed from: com.daaw.d91$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C3636c91 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3636c91 c3636c91) {
            super(1);
            this.C = c3636c91;
        }

        public final void a(InterfaceC4193e91 interfaceC4193e91) {
            G10.g(interfaceC4193e91, "finalResult");
            C4716g01 c4716g01B = C3915d91.this.b();
            C3915d91 c3915d91 = C3915d91.this;
            C3636c91 c3636c91 = this.C;
            synchronized (c4716g01B) {
                try {
                    if (interfaceC4193e91.a()) {
                        c3915d91.b.e(c3636c91, interfaceC4193e91);
                    } else {
                        c3915d91.b.f(c3636c91);
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC4193e91) obj);
            return G91.a;
        }
    }

    public final C4716g01 b() {
        return this.a;
    }

    public final InterfaceC6258lW0 c(C3636c91 c3636c91, NQ nq) {
        G10.g(c3636c91, "typefaceRequest");
        G10.g(nq, "resolveTypeface");
        synchronized (this.a) {
            InterfaceC4193e91 interfaceC4193e91 = (InterfaceC4193e91) this.b.d(c3636c91);
            if (interfaceC4193e91 != null) {
                if (interfaceC4193e91.a()) {
                    return interfaceC4193e91;
                }
            }
            try {
                InterfaceC4193e91 interfaceC4193e912 = (InterfaceC4193e91) nq.invoke(new a(c3636c91));
                synchronized (this.a) {
                    try {
                        if (this.b.d(c3636c91) == null && interfaceC4193e912.a()) {
                            this.b.e(c3636c91, interfaceC4193e912);
                        }
                        G91 g91 = G91.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC4193e912;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
