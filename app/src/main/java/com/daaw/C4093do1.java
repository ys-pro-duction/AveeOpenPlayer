package com.daaw;

import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafj;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.do1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4093do1 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.a(); i++) {
            zzbx zzbxVarB = zzbyVar.b(i);
            if (zzbxVarB instanceof zzafa) {
                zzafa zzafaVar = (zzafa) zzbxVarB;
                if ("iTunSMPB".equals(zzafaVar.D) && c(zzafaVar.E)) {
                    return true;
                }
            } else if (zzbxVarB instanceof zzafj) {
                zzafj zzafjVar = (zzafj) zzbxVarB;
                if ("com.apple.iTunes".equals(zzafjVar.C) && "iTunSMPB".equals(zzafjVar.D) && c(zzafjVar.E)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = AbstractC9004vJ2.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
