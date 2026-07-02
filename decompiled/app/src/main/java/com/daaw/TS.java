package com.daaw;

import android.graphics.Bitmap;
import android.util.Log;
import com.daaw.HS;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class TS implements OI0 {
    public static final a d = new a();
    public final HS.a a;
    public final InterfaceC1883Pf b;
    public final a c;

    public static class a {
        public HS a(HS.a aVar) {
            return new HS(aVar);
        }

        public C3067a7 b() {
            return new C3067a7();
        }

        public KI0 c(Bitmap bitmap, InterfaceC1883Pf interfaceC1883Pf) {
            return new C2113Rf(bitmap, interfaceC1883Pf);
        }

        public RS d() {
            return new RS();
        }
    }

    public TS(InterfaceC1883Pf interfaceC1883Pf) {
        this(interfaceC1883Pf, d);
    }

    public final HS b(byte[] bArr) {
        RS rsD = this.c.d();
        rsD.o(bArr);
        QS qsC = rsD.c();
        HS hsA = this.c.a(this.a);
        hsA.o(qsC, bArr);
        hsA.a();
        return hsA;
    }

    @Override // com.daaw.CG
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(KI0 ki0, OutputStream outputStream) {
        long jB = AbstractC1357Kd0.b();
        IS is = (IS) ki0.get();
        InterfaceC6983o51 interfaceC6983o51H = is.h();
        if (interfaceC6983o51H instanceof I91) {
            return e(is.d(), outputStream);
        }
        HS hsB = b(is.d());
        C3067a7 c3067a7B = this.c.b();
        if (!c3067a7B.h(outputStream)) {
            return false;
        }
        for (int i = 0; i < hsB.f(); i++) {
            KI0 ki0D = d(hsB.i(), interfaceC6983o51H, is);
            try {
                if (!c3067a7B.a((Bitmap) ki0D.get())) {
                    return false;
                }
                c3067a7B.f(hsB.e(hsB.d()));
                hsB.a();
                ki0D.c();
            } finally {
                ki0D.c();
            }
        }
        boolean zD = c3067a7B.d();
        if (Log.isLoggable("GifEncoder", 2)) {
            hsB.f();
            int length = is.d().length;
            AbstractC1357Kd0.a(jB);
        }
        return zD;
    }

    public final KI0 d(Bitmap bitmap, InterfaceC6983o51 interfaceC6983o51, IS is) {
        KI0 ki0C = this.c.c(bitmap, this.b);
        KI0 ki0A = interfaceC6983o51.a(ki0C, is.getIntrinsicWidth(), is.getIntrinsicHeight());
        if (!ki0C.equals(ki0A)) {
            ki0C.c();
        }
        return ki0A;
    }

    public final boolean e(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.daaw.CG
    public String getId() {
        return "";
    }

    public TS(InterfaceC1883Pf interfaceC1883Pf, a aVar) {
        this.b = interfaceC1883Pf;
        this.a = new C10153zS(interfaceC1883Pf);
        this.c = aVar;
    }
}
