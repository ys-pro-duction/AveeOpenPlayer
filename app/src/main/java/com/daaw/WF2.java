package com.daaw;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class WF2 {
    public WF2() {
        try {
            AbstractC4001dU2.a();
        } catch (GeneralSecurityException e) {
            zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.registerAead");
        }
    }

    public static final String a() {
        C8369t33 c8369t33R = AbstractC9213w33.R();
        try {
            AbstractC7643qT2.b(IT2.c(BT2.a("AES128_GCM").b()), C6248lT2.b(c8369t33R));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to generate key".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(c8369t33R.c().e(), 11);
        c8369t33R.d();
        return strEncodeToString;
    }

    public static final String b(byte[] bArr, byte[] bArr2, String str, C0542Cj2 c0542Cj2) {
        IT2 it2C = c(str);
        if (it2C == null) {
            return null;
        }
        try {
            byte[] bArrA = ((InterfaceC5681jT2) it2C.e(C3460bY2.a(), InterfaceC5681jT2.class)).a(bArr, bArr2);
            c0542Cj2.a().put("ds", "1");
            return new String(bArrA, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            zze.zza("Failed to decrypt ".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.decrypt");
            c0542Cj2.a().put("dsf", e.toString());
            return null;
        }
    }

    public static final IT2 c(String str) {
        try {
            return AbstractC7643qT2.a(C5960kT2.b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            zze.zza("Failed to get keysethandle".concat(e.toString()));
            zzt.zzo().u(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
