package com.daaw;

/* JADX INFO: renamed from: com.daaw.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7479ps {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.ps$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final InterfaceC7479ps b = new C0223a();
        public static final InterfaceC7479ps c = new e();
        public static final InterfaceC7479ps d = new c();
        public static final InterfaceC7479ps e = new d();
        public static final InterfaceC7479ps f = new f();
        public static final NM g = new NM(1.0f);
        public static final InterfaceC7479ps h = new b();

        /* JADX INFO: renamed from: com.daaw.ps$a$a, reason: collision with other inner class name */
        public static final class C0223a implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                float f = AbstractC7758qs.f(j, j2);
                return AbstractC6222lN0.a(f, f);
            }
        }

        /* JADX INFO: renamed from: com.daaw.ps$a$b */
        public static final class b implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                return AbstractC6222lN0.a(AbstractC7758qs.h(j, j2), AbstractC7758qs.e(j, j2));
            }
        }

        /* JADX INFO: renamed from: com.daaw.ps$a$c */
        public static final class c implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                float fE = AbstractC7758qs.e(j, j2);
                return AbstractC6222lN0.a(fE, fE);
            }
        }

        /* JADX INFO: renamed from: com.daaw.ps$a$d */
        public static final class d implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                float fH = AbstractC7758qs.h(j, j2);
                return AbstractC6222lN0.a(fH, fH);
            }
        }

        /* JADX INFO: renamed from: com.daaw.ps$a$e */
        public static final class e implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                float fG = AbstractC7758qs.g(j, j2);
                return AbstractC6222lN0.a(fG, fG);
            }
        }

        /* JADX INFO: renamed from: com.daaw.ps$a$f */
        public static final class f implements InterfaceC7479ps {
            @Override // com.daaw.InterfaceC7479ps
            public long a(long j, long j2) {
                if (C9879yT0.i(j) <= C9879yT0.i(j2) && C9879yT0.g(j) <= C9879yT0.g(j2)) {
                    return AbstractC6222lN0.a(1.0f, 1.0f);
                }
                float fG = AbstractC7758qs.g(j, j2);
                return AbstractC6222lN0.a(fG, fG);
            }
        }

        public final InterfaceC7479ps a() {
            return h;
        }

        public final InterfaceC7479ps b() {
            return c;
        }

        public final InterfaceC7479ps c() {
            return f;
        }
    }

    long a(long j, long j2);
}
