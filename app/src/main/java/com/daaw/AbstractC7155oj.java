package com.daaw;

/* JADX INFO: renamed from: com.daaw.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7155oj {
    public static final InterfaceC4988gz a = AbstractC5544iz.a(1.0f, 1.0f);

    /* JADX INFO: renamed from: com.daaw.oj$a */
    public static final class a implements RD {
        public final /* synthetic */ ID a;

        public a(ID id) {
            this.a = id;
        }

        @Override // com.daaw.RD
        public void a(InterfaceC6090kt0 interfaceC6090kt0, int i) {
            G10.g(interfaceC6090kt0, "path");
            this.a.d().a(interfaceC6090kt0, i);
        }

        @Override // com.daaw.RD
        public void b(float f, float f2, float f3, float f4, int i) {
            this.a.d().b(f, f2, f3, f4, i);
        }

        @Override // com.daaw.RD
        public void c(float f, float f2) {
            this.a.d().c(f, f2);
        }

        @Override // com.daaw.RD
        public void d(float[] fArr) {
            G10.g(fArr, "matrix");
            this.a.d().k(fArr);
        }

        @Override // com.daaw.RD
        public void e(float f, float f2, long j) {
            InterfaceC6318lj interfaceC6318ljD = this.a.d();
            interfaceC6318ljD.c(C9982yp0.l(j), C9982yp0.m(j));
            interfaceC6318ljD.e(f, f2);
            interfaceC6318ljD.c(-C9982yp0.l(j), -C9982yp0.m(j));
        }

        @Override // com.daaw.RD
        public void f(float f, float f2, float f3, float f4) {
            InterfaceC6318lj interfaceC6318ljD = this.a.d();
            ID id = this.a;
            long jA = BT0.a(C9879yT0.i(g()) - (f3 + f), C9879yT0.g(g()) - (f4 + f2));
            if (C9879yT0.i(jA) < 0.0f || C9879yT0.g(jA) < 0.0f) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            id.c(jA);
            interfaceC6318ljD.c(f, f2);
        }

        public long g() {
            return this.a.a();
        }
    }

    public static final RD c(ID id) {
        return new a(id);
    }
}
