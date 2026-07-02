package com.daaw;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class E8 extends Exception {
    public final Status B;

    public E8(Status status) {
        super(status.m() + ": " + (status.p() != null ? status.p() : ""));
        this.B = status;
    }

    public Status a() {
        return this.B;
    }

    public int b() {
        return this.B.m();
    }
}
