package com.daaw;

import java.net.URL;

/* JADX INFO: renamed from: com.daaw.Ca1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0505Ca1 implements InterfaceC0657Dk0 {
    public final InterfaceC0657Dk0 a;

    public AbstractC0505Ca1(InterfaceC0657Dk0 interfaceC0657Dk0) {
        this.a = interfaceC0657Dk0;
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(URL url, int i, int i2) {
        return this.a.a(new C4840gT(url), i, i2);
    }
}
