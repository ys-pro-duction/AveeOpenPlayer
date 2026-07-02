package com.daaw;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: com.daaw.oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7145oh extends InterfaceC9600xT0, WritableByteChannel {
    InterfaceC7145oh C(int i);

    InterfaceC7145oh J0(byte[] bArr);

    InterfaceC7145oh L(int i);

    InterfaceC7145oh d0(String str);

    @Override // com.daaw.InterfaceC9600xT0, java.io.Flushable
    void flush();

    InterfaceC7145oh n0(String str, int i, int i2);

    InterfaceC7145oh y(int i);
}
