package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.ap2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3264ap2 implements InterfaceC9554xH2 {
    public static final Pattern d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String a;
    public final EI2 b;
    public final TI2 c;

    public C3264ap2(String str, TI2 ti2, EI2 ei2) {
        this.a = str;
        this.c = ti2;
        this.b = ei2;
    }

    @Override // com.daaw.InterfaceC9554xH2
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws C2350Tl2 {
        C2350Tl2 c2350Tl2;
        String strConcat;
        C2986Zo2 c2986Zo2 = (C2986Zo2) obj;
        int iOptInt = c2986Zo2.a.optInt("http_timeout_millis", 60000);
        IP1 ip1 = c2986Zo2.b;
        String strJoin = "";
        if (ip1.a() != -2) {
            if (ip1.a() == 1) {
                if (ip1.f() != null) {
                    strJoin = TextUtils.join(", ", ip1.f());
                    AbstractC4274eT1.zzg(strJoin);
                }
                c2350Tl2 = new C2350Tl2(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                c2350Tl2 = new C2350Tl2(1);
            }
            TI2 ti2 = this.c;
            EI2 ei2 = this.b;
            ei2.e(c2350Tl2);
            ei2.zzf(false);
            ti2.a(ei2);
            throw c2350Tl2;
        }
        HashMap map = new HashMap();
        if (c2986Zo2.b.h() && !TextUtils.isEmpty(this.a)) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.N0)).booleanValue()) {
                String str = this.a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.a);
            }
        }
        if (c2986Zo2.b.i()) {
            C3543bp2.a(map, c2986Zo2.a);
        }
        if (c2986Zo2.b != null && !TextUtils.isEmpty(c2986Zo2.b.d())) {
            strJoin = c2986Zo2.b.d();
        }
        TI2 ti22 = this.c;
        EI2 ei22 = this.b;
        ei22.zzf(true);
        ti22.a(ei22);
        return new C2570Vo2(c2986Zo2.b.e(), iOptInt, map, strJoin.getBytes(UN2.c), "", c2986Zo2.b.i());
    }
}
