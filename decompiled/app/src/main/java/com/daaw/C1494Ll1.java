package com.daaw;

import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.Ll1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1494Ll1 extends AbstractDialogInterfaceOnClickListenerC1597Ml1 {
    public final /* synthetic */ Intent B;
    public final /* synthetic */ InterfaceC1453Lb0 C;

    public C1494Ll1(Intent intent, InterfaceC1453Lb0 interfaceC1453Lb0, int i) {
        this.B = intent;
        this.C = interfaceC1453Lb0;
    }

    @Override // com.daaw.AbstractDialogInterfaceOnClickListenerC1597Ml1
    public final void a() {
        Intent intent = this.B;
        if (intent != null) {
            this.C.startActivityForResult(intent, 2);
        }
    }
}
