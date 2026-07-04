package com.daaw;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3226ai implements InterfaceC2177Rv {
    public final byte[] a;
    public final String b;

    public C3226ai(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    @Override // com.daaw.InterfaceC2177Rv
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream a(EnumC9190vz0 enumC9190vz0) {
        return new ByteArrayInputStream(this.a);
    }

    @Override // com.daaw.InterfaceC2177Rv
    public String getId() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void b() {
    }

    @Override // com.daaw.InterfaceC2177Rv
    public void cancel() {
    }
}
