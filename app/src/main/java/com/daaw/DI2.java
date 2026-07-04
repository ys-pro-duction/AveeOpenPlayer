package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class DI2 {
    public static EI2 a(Context context, int i) {
        boolean zBooleanValue;
        if (WI2.a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) AbstractC7307pF1.c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) AbstractC7307pF1.d.e()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) AbstractC7307pF1.b.e()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) AbstractC7307pF1.e.e()).booleanValue();
            }
            if (zBooleanValue) {
                return new GI2(context, i);
            }
        }
        return new C4514fJ2();
    }

    public static EI2 b(Context context, int i, int i2, zzl zzlVar) {
        EI2 ei2A = a(context, i);
        if (!(ei2A instanceof GI2)) {
            return ei2A;
        }
        ei2A.zzh();
        ei2A.b(i2);
        if (SI2.e(zzlVar.zzp)) {
            ei2A.a(zzlVar.zzp);
        }
        return ei2A;
    }
}
