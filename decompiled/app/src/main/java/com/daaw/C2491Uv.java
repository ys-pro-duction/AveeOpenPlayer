package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: renamed from: com.daaw.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2491Uv implements InterfaceC2595Vv {
    public C2907Yv a;
    public int b;
    public byte[] c;

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.c.length - this.b;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i2, length);
        System.arraycopy(this.c, this.b, bArr, i, iMin);
        this.b += iMin;
        return iMin;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        this.a = null;
        this.c = null;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) throws C3000Zs0 {
        this.a = c2907Yv;
        Uri uri = c2907Yv.a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new C3000Zs0("Unsupported scheme: " + scheme);
        }
        String[] strArrW = AbstractC6280lb1.W(uri.getSchemeSpecificPart(), ",");
        if (strArrW.length != 2) {
            throw new C3000Zs0("Unexpected URI format: " + uri);
        }
        String str = strArrW[1];
        if (strArrW[0].contains(";base64")) {
            try {
                this.c = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new C3000Zs0("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.c = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.c.length;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        C2907Yv c2907Yv = this.a;
        if (c2907Yv != null) {
            return c2907Yv.a;
        }
        return null;
    }
}
