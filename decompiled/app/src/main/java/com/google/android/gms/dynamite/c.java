package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0262b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0262b c0262b = new DynamiteModule.b.C0262b();
        int iB = aVar.b(context, str);
        c0262b.a = iB;
        if (iB != 0) {
            c0262b.c = -1;
            return c0262b;
        }
        int iA = aVar.a(context, str, true);
        c0262b.b = iA;
        if (iA != 0) {
            c0262b.c = 1;
        }
        return c0262b;
    }
}
