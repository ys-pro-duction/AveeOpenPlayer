package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class US0 extends FS0 implements InterfaceC6828nZ0 {
    public final String n;

    public US0(String str) {
        super(new C7665qZ0[2], new AbstractC7943rZ0[2]);
        this.n = str;
        v(1024);
    }

    @Override // com.daaw.FS0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final C7107oZ0 k(C7665qZ0 c7665qZ0, AbstractC7943rZ0 abstractC7943rZ0, boolean z) {
        try {
            ByteBuffer byteBuffer = c7665qZ0.D;
            abstractC7943rZ0.t(c7665qZ0.E, z(byteBuffer.array(), byteBuffer.limit(), z), c7665qZ0.G);
            abstractC7943rZ0.m(Integer.MIN_VALUE);
            return null;
        } catch (C7107oZ0 e) {
            return e;
        }
    }

    public final void B(AbstractC7943rZ0 abstractC7943rZ0) {
        super.s(abstractC7943rZ0);
    }

    @Override // com.daaw.FS0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C7665qZ0 h() {
        return new C7665qZ0();
    }

    @Override // com.daaw.FS0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final AbstractC7943rZ0 i() {
        return new VS0(this);
    }

    @Override // com.daaw.FS0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final C7107oZ0 j(Throwable th) {
        return new C7107oZ0("Unexpected decode error", th);
    }

    public abstract InterfaceC6549mZ0 z(byte[] bArr, int i, boolean z);

    @Override // com.daaw.InterfaceC6828nZ0
    public void b(long j) {
    }
}
