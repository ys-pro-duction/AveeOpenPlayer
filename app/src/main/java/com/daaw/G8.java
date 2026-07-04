package com.daaw;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class G8 {
    public static E8 a(Status status) {
        return status.s() ? new GI0(status) : new E8(status);
    }
}
