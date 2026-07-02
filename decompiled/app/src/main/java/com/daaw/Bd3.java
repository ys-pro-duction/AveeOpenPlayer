package com.daaw;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Bd3 extends Be3 {
    public final Map d;
    public final UF2 e;
    public final UF2 f;
    public final UF2 g;
    public final UF2 h;
    public final UF2 i;

    public Bd3(C8812uf3 c8812uf3) {
        super(c8812uf3);
        this.d = new HashMap();
        C5634jI2 c5634jI2F = this.a.F();
        c5634jI2F.getClass();
        this.e = new UF2(c5634jI2F, "last_delete_stale", 0L);
        C5634jI2 c5634jI2F2 = this.a.F();
        c5634jI2F2.getClass();
        this.f = new UF2(c5634jI2F2, "backoff", 0L);
        C5634jI2 c5634jI2F3 = this.a.F();
        c5634jI2F3.getClass();
        this.g = new UF2(c5634jI2F3, "last_upload", 0L);
        C5634jI2 c5634jI2F4 = this.a.F();
        c5634jI2F4.getClass();
        this.h = new UF2(c5634jI2F4, "last_upload_attempt", 0L);
        C5634jI2 c5634jI2F5 = this.a.F();
        c5634jI2F5.getClass();
        this.i = new UF2(c5634jI2F5, "midnight_offset", 0L);
    }

    @Override // com.daaw.Be3
    public final boolean h() {
        return false;
    }

    public final Pair i(String str) {
        C9925yd3 c9925yd3;
        AdvertisingIdClient.Info advertisingIdInfo;
        d();
        long jB = this.a.p().b();
        C9925yd3 c9925yd32 = (C9925yd3) this.d.get(str);
        if (c9925yd32 != null && jB < c9925yd32.c) {
            return new Pair(c9925yd32.a, Boolean.valueOf(c9925yd32.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jN = this.a.z().n(str, AbstractC1311Jr2.c) + jB;
        try {
            long jN2 = this.a.z().n(str, AbstractC1311Jr2.d);
            if (jN2 > 0) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.v());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c9925yd32 != null && jB < c9925yd32.c + jN2) {
                        return new Pair(c9925yd32.a, Boolean.valueOf(c9925yd32.b));
                    }
                    advertisingIdInfo = null;
                }
            } else {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.a.v());
            }
        } catch (Exception e) {
            this.a.w().m().b("Unable to get advertising id", e);
            c9925yd3 = new C9925yd3("", false, jN);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        c9925yd3 = id != null ? new C9925yd3(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jN) : new C9925yd3("", advertisingIdInfo.isLimitAdTrackingEnabled(), jN);
        this.d.put(str, c9925yd3);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c9925yd3.a, Boolean.valueOf(c9925yd3.b));
    }

    public final Pair j(String str, C3633c83 c3633c83) {
        return c3633c83.j(EnumC9512x73.AD_STORAGE) ? i(str) : new Pair("", Boolean.FALSE);
    }

    public final String k(String str, boolean z) {
        d();
        String str2 = z ? (String) i(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestQ = Pf3.q();
        if (messageDigestQ == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestQ.digest(str2.getBytes())));
    }
}
