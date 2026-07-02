package com.daaw;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.daaw.he1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5169he1 {
    public static boolean a = true;

    public static InterfaceC4611fe1 a(ViewGroup viewGroup) {
        return new C4322ee1(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }
}
