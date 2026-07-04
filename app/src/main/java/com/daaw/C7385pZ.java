package com.daaw;

import com.daaw.AbstractC5362iK;

/* JADX INFO: renamed from: com.daaw.pZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7385pZ {
    public final C5233hr0 a = new C5233hr0();
    public final a b = new a();
    public final b c = new b();

    /* JADX INFO: renamed from: com.daaw.pZ$a */
    public class a extends AbstractC3090aC {
        public a() {
        }

        @Override // com.daaw.AbstractC3090aC
        public void a(AbstractC4340ei abstractC4340ei) {
            C7385pZ.this.a.h(abstractC4340ei);
        }

        @Override // com.daaw.AbstractC3090aC
        public void b(double d) {
            C7385pZ.this.a.j(d);
        }

        @Override // com.daaw.AbstractC3090aC
        public void c() {
            C7385pZ.this.a.n();
        }

        @Override // com.daaw.AbstractC3090aC
        public void d(long j) {
            C7385pZ.this.a.r(j);
        }

        @Override // com.daaw.AbstractC3090aC
        public void e(String str) {
            C7385pZ.this.a.v(str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pZ$b */
    public class b extends AbstractC3090aC {
        public b() {
        }

        @Override // com.daaw.AbstractC3090aC
        public void a(AbstractC4340ei abstractC4340ei) {
            C7385pZ.this.a.i(abstractC4340ei);
        }

        @Override // com.daaw.AbstractC3090aC
        public void b(double d) {
            C7385pZ.this.a.k(d);
        }

        @Override // com.daaw.AbstractC3090aC
        public void c() {
            C7385pZ.this.a.o();
        }

        @Override // com.daaw.AbstractC3090aC
        public void d(long j) {
            C7385pZ.this.a.s(j);
        }

        @Override // com.daaw.AbstractC3090aC
        public void e(String str) {
            C7385pZ.this.a.w(str);
        }
    }

    public AbstractC3090aC b(AbstractC5362iK.c.a aVar) {
        return aVar.equals(AbstractC5362iK.c.a.DESCENDING) ? this.c : this.b;
    }

    public byte[] c() {
        return this.a.a();
    }

    public void d(byte[] bArr) {
        this.a.c(bArr);
    }
}
