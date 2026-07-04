package com.daaw;

import androidx.lifecycle.y;

/* JADX INFO: renamed from: com.daaw.xe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9649xe1 {
    public static final AbstractC8526te1 a(y.c cVar, J50 j50, AbstractC5247hu abstractC5247hu) {
        G10.g(cVar, "factory");
        G10.g(j50, "modelClass");
        G10.g(abstractC5247hu, "extras");
        try {
            try {
                return cVar.b(j50, abstractC5247hu);
            } catch (AbstractMethodError unused) {
                return cVar.c(X40.b(j50), abstractC5247hu);
            }
        } catch (AbstractMethodError unused2) {
            return cVar.a(X40.b(j50));
        }
    }
}
