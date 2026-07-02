package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Or0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1828Or0 implements InterfaceC7927rV0 {
    public static final C8036rs[] a = {new C8036rs(new String[]{".pla"}, new String[]{"application/octet-stream"}, new C0592Cw0[0], "iRiver iQuickList File")};

    private void d(List list, AbstractC3868d0 abstractC3868d0) {
        if (abstractC3868d0 instanceof LP0) {
            LP0 lp0 = (LP0) abstractC3868d0;
            if (lp0.a() < 0) {
                throw new IllegalArgumentException("A PLA playlist cannot handle a sequence repeated indefinitely");
            }
            AbstractC3868d0[] abstractC3868d0ArrB = lp0.b();
            for (int i = 0; i < lp0.a(); i++) {
                for (AbstractC3868d0 abstractC3868d02 : abstractC3868d0ArrB) {
                    d(list, abstractC3868d02);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 a(InputStream inputStream, String str, InterfaceC0412Bd0 interfaceC0412Bd0) {
        C1724Nr0 c1724Nr0 = new C1724Nr0();
        c1724Nr0.d(this);
        byte[] bArr = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
        if (inputStream.read(bArr) != 512) {
            throw new IllegalArgumentException("Not a PLA playlist format (file too small)");
        }
        if (!"iriver UMS PLA".equals(new String(bArr, 4, 14, "US-ASCII"))) {
            throw new IllegalArgumentException("Not a PLA playlist format (bad magic)");
        }
        int i = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
        for (int i2 = 0; i2 < i; i2++) {
            if (inputStream.read(bArr) != 512) {
                interfaceC0412Bd0.h("Malformed PLA playlist (file too small)");
                return null;
            }
            c1724Nr0.c().add(new String(bArr, 2, 510, "UTF-16BE"));
        }
        return c1724Nr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public C8036rs[] b() {
        return (C8036rs[]) a.clone();
    }

    @Override // com.daaw.InterfaceC7927rV0
    public InterfaceC7649qV0 c(C0809Ew0 c0809Ew0) {
        C1724Nr0 c1724Nr0 = new C1724Nr0();
        c1724Nr0.d(this);
        d(c1724Nr0.c(), c0809Ew0.a());
        return c1724Nr0;
    }

    @Override // com.daaw.InterfaceC7927rV0
    public String getId() {
        return "pla";
    }
}
