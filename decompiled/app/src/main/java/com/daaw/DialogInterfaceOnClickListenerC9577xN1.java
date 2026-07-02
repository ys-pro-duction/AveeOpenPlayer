package com.daaw;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.daaw.xN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC9577xN1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C9856yN1 B;

    public DialogInterfaceOnClickListenerC9577xN1(C9856yN1 c9856yN1) {
        this.B = c9856yN1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.B.c("Operation denied by user.");
    }
}
