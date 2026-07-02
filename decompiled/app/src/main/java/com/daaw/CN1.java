package com.daaw;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class CN1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DN1 B;

    public CN1(DN1 dn1) {
        this.B = dn1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.B.c("User canceled the download.");
    }
}
