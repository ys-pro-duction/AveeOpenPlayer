package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.daaw.kW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC5971kW1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult B;

    public DialogInterfaceOnClickListenerC5971kW1(JsResult jsResult) {
        this.B = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.B.confirm();
    }
}
