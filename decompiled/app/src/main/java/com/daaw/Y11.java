package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public interface Y11 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final Y11 a(long j) {
            return j != C2559Vm.b.g() ? new C6050kn(j, null) : b.b;
        }
    }

    public static final class b implements Y11 {
        public static final b b = new b();

        @Override // com.daaw.Y11
        public long a() {
            return C2559Vm.b.g();
        }

        @Override // com.daaw.Y11
        public /* synthetic */ Y11 b(Y11 y11) {
            return X11.a(this, y11);
        }

        @Override // com.daaw.Y11
        public /* synthetic */ Y11 c(LQ lq) {
            return X11.b(this, lq);
        }

        @Override // com.daaw.Y11
        public AbstractC2117Rg d() {
            return null;
        }
    }

    long a();

    Y11 b(Y11 y11);

    Y11 c(LQ lq);

    AbstractC2117Rg d();
}
