package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
public final class h implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0262b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0262b c0262b = new DynamiteModule.b.C0262b();
        int iB = aVar.b(context, str);
        c0262b.a = iB;
        int i = 1;
        int i2 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0262b.b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0262b.b = iA;
        }
        int i3 = c0262b.a;
        if (i3 == 0) {
            if (iA == 0) {
                i = 0;
            }
            c0262b.c = i;
            return c0262b;
        }
        i2 = i3;
        if (iA < i2) {
            i = -1;
        }
        c0262b.c = i;
        return c0262b;
    }
}
