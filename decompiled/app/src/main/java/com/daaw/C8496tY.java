package com.daaw;

import android.graphics.Bitmap;
import com.daaw.RunnableC2621Wb1;

/* JADX INFO: renamed from: com.daaw.tY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8496tY extends C8217sY {
    public KQ c;
    public InterfaceC6408m2 d;
    public InterfaceC6408m2 e;
    public KQ f;

    /* JADX INFO: renamed from: com.daaw.tY$a */
    public class a implements RunnableC2621Wb1.b {
        public a() {
        }

        @Override // com.daaw.RunnableC2621Wb1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap a() {
            return (Bitmap) C8496tY.this.f.a();
        }
    }

    public C8496tY(Bitmap bitmap, KQ kq, InterfaceC6408m2 interfaceC6408m2, InterfaceC6408m2 interfaceC6408m22, KQ kq2, InterfaceC6408m2 interfaceC6408m23) {
        super(bitmap, interfaceC6408m23);
        this.c = kq;
        this.d = interfaceC6408m2;
        this.e = interfaceC6408m22;
        this.f = kq2;
    }

    @Override // com.daaw.C8217sY
    public void a() {
        this.e.a();
    }

    @Override // com.daaw.C8217sY
    public int d() {
        return ((Integer) this.c.a()).intValue();
    }

    @Override // com.daaw.C8217sY
    public RunnableC2621Wb1 e() {
        RunnableC2621Wb1 runnableC2621Wb1 = new RunnableC2621Wb1(new a());
        runnableC2621Wb1.a(new b());
        return runnableC2621Wb1;
    }

    @Override // com.daaw.C8217sY
    public void h() {
        this.d.a();
    }

    /* JADX INFO: renamed from: com.daaw.tY$b */
    public class b implements RunnableC2621Wb1.a {
        public b() {
        }

        @Override // com.daaw.RunnableC2621Wb1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Bitmap bitmap) {
        }
    }
}
