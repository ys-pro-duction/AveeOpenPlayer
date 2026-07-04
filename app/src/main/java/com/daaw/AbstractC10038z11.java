package com.daaw;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.z11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10038z11 {
    public static void a(Status status, Object obj, C7521q11 c7521q11) {
        if (status.v()) {
            c7521q11.c(obj);
        } else {
            c7521q11.b(G8.a(status));
        }
    }
}
