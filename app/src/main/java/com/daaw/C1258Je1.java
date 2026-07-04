package com.daaw;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Je1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1258Je1 {
    public Interpolator c;
    public InterfaceC1362Ke1 d;
    public boolean e;
    public long b = -1;
    public final AbstractC1466Le1 f = new a();
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: com.daaw.Je1$a */
    public class a extends AbstractC1466Le1 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // com.daaw.InterfaceC1362Ke1
        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == C1258Je1.this.a.size()) {
                InterfaceC1362Ke1 interfaceC1362Ke1 = C1258Je1.this.d;
                if (interfaceC1362Ke1 != null) {
                    interfaceC1362Ke1.b(null);
                }
                d();
            }
        }

        @Override // com.daaw.AbstractC1466Le1, com.daaw.InterfaceC1362Ke1
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            InterfaceC1362Ke1 interfaceC1362Ke1 = C1258Je1.this.d;
            if (interfaceC1362Ke1 != null) {
                interfaceC1362Ke1.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.a = false;
            C1258Je1.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((C1154Ie1) it.next()).c();
            }
            this.e = false;
        }
    }

    public void b() {
        this.e = false;
    }

    public C1258Je1 c(C1154Ie1 c1154Ie1) {
        if (!this.e) {
            this.a.add(c1154Ie1);
        }
        return this;
    }

    public C1258Je1 d(C1154Ie1 c1154Ie1, C1154Ie1 c1154Ie12) {
        this.a.add(c1154Ie1);
        c1154Ie12.i(c1154Ie1.d());
        this.a.add(c1154Ie12);
        return this;
    }

    public C1258Je1 e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public C1258Je1 f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public C1258Je1 g(InterfaceC1362Ke1 interfaceC1362Ke1) {
        if (!this.e) {
            this.d = interfaceC1362Ke1;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (C1154Ie1 c1154Ie1 : this.a) {
            long j = this.b;
            if (j >= 0) {
                c1154Ie1.e(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                c1154Ie1.f(interpolator);
            }
            if (this.d != null) {
                c1154Ie1.g(this.f);
            }
            c1154Ie1.k();
        }
        this.e = true;
    }
}
