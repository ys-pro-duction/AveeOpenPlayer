package com.daaw;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class MK implements InterfaceC0657Dk0 {
    public final InterfaceC0657Dk0 a;

    public MK(InterfaceC0657Dk0 interfaceC0657Dk0) {
        this.a = interfaceC0657Dk0;
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(File file, int i, int i2) {
        return this.a.a(Uri.fromFile(file), i, i2);
    }
}
