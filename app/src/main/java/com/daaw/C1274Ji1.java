package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ji1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1274Ji1 implements InterfaceC1170Ii1 {
    public final QJ0 a;
    public final WG b;
    public final PR0 c;
    public final PR0 d;

    /* JADX INFO: renamed from: com.daaw.Ji1$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C1066Hi1 c1066Hi1) throws Throwable {
            String str = c1066Hi1.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            byte[] bArrK = androidx.work.b.k(c1066Hi1.b);
            if (bArrK == null) {
                nz0.z0(2);
            } else {
                nz0.Z(2, bArrK);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ji1$b */
    public class b extends PR0 {
        public b(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ji1$c */
    public class c extends PR0 {
        public c(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C1274Ji1(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
        this.c = new b(qj0);
        this.d = new c(qj0);
    }

    @Override // com.daaw.InterfaceC1170Ii1
    public void a(String str) {
        this.a.b();
        NZ0 nz0A = this.c.a();
        if (str == null) {
            nz0A.z0(1);
        } else {
            nz0A.w(1, str);
        }
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.c.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1170Ii1
    public void b(C1066Hi1 c1066Hi1) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c1066Hi1);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC1170Ii1
    public void c() {
        this.a.b();
        NZ0 nz0A = this.d.a();
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(nz0A);
        }
    }
}
