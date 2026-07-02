package com.daaw;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.Bl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445Bl1 extends AbstractDialogInterfaceOnClickListenerC1597Ml1 {
    public final /* synthetic */ Intent B;
    public final /* synthetic */ Activity C;
    public final /* synthetic */ int D;

    public C0445Bl1(Intent intent, Activity activity, int i) {
        this.B = intent;
        this.C = activity;
        this.D = i;
    }

    @Override // com.daaw.AbstractDialogInterfaceOnClickListenerC1597Ml1
    public final void a() {
        Intent intent = this.B;
        if (intent != null) {
            this.C.startActivityForResult(intent, this.D);
        }
    }
}
