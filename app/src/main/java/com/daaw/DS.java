package com.daaw;

import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class DS implements NI0 {
    public static final b g = new b();
    public static final a h = new a();
    public final NI0 a;
    public final NI0 b;
    public final InterfaceC1883Pf c;
    public final b d;
    public final a e;
    public String f;

    public static class a {
        public InputStream a(InputStream inputStream, byte[] bArr) {
            return new C5343iF0(inputStream, bArr);
        }
    }

    public static class b {
        public ImageHeaderParser.ImageType a(InputStream inputStream) {
            return new ImageHeaderParser(inputStream).d();
        }
    }

    public DS(NI0 ni0, NI0 ni02, InterfaceC1883Pf interfaceC1883Pf) {
        this(ni0, ni02, interfaceC1883Pf, g, h);
    }

    public final AS a(AY ay, int i, int i2, byte[] bArr) {
        return ay.b() != null ? f(ay, i, i2, bArr) : d(ay, i, i2);
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KI0 c(AY ay, int i, int i2) {
        C3505bi c3505biA = C3505bi.a();
        byte[] bArrB = c3505biA.b();
        try {
            AS asA = a(ay, i, i2, bArrB);
            if (asA != null) {
                return new CS(asA);
            }
            return null;
        } finally {
            c3505biA.c(bArrB);
        }
    }

    public final AS d(AY ay, int i, int i2) {
        KI0 ki0C = this.a.c(ay, i, i2);
        if (ki0C != null) {
            return new AS(ki0C, null);
        }
        return null;
    }

    public final AS e(InputStream inputStream, int i, int i2) {
        KI0 ki0C = this.b.c(inputStream, i, i2);
        if (ki0C == null) {
            return null;
        }
        IS is = (IS) ki0C.get();
        return is.g() > 1 ? new AS(null, ki0C) : new AS(new C2113Rf(is.f(), this.c), null);
    }

    public final AS f(AY ay, int i, int i2, byte[] bArr) throws IOException {
        InputStream inputStreamA = this.e.a(ay.b(), bArr);
        inputStreamA.mark(2048);
        ImageHeaderParser.ImageType imageTypeA = this.d.a(inputStreamA);
        inputStreamA.reset();
        AS asE = imageTypeA == ImageHeaderParser.ImageType.GIF ? e(inputStreamA, i, i2) : null;
        return asE == null ? d(new AY(inputStreamA, ay.a()), i, i2) : asE;
    }

    @Override // com.daaw.NI0
    public String getId() {
        if (this.f == null) {
            this.f = this.b.getId() + this.a.getId();
        }
        return this.f;
    }

    public DS(NI0 ni0, NI0 ni02, InterfaceC1883Pf interfaceC1883Pf, b bVar, a aVar) {
        this.a = ni0;
        this.b = ni02;
        this.c = interfaceC1883Pf;
        this.d = bVar;
        this.e = aVar;
    }
}
