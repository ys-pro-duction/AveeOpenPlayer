package com.daaw;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.daaw.iT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5400iT1 {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, InterfaceC4842gT1 interfaceC4842gT1) throws C5121hT1 {
        try {
            return interfaceC4842gT1.zza(c(context).d(str));
        } catch (Exception e) {
            throw new C5121hT1(e);
        }
    }

    public static DynamiteModule c(Context context) throws C5121hT1 {
        try {
            return DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new C5121hT1(e);
        }
    }
}
