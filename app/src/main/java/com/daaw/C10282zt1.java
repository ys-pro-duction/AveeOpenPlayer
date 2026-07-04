package com.daaw;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.daaw.zt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10282zt1 implements InterfaceC10003yt1 {
    public final FileChannel a;
    public final long b;
    public final long c;

    public C10282zt1(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // com.daaw.InterfaceC10003yt1
    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.daaw.InterfaceC10003yt1
    public final long zza() {
        return this.c;
    }
}
