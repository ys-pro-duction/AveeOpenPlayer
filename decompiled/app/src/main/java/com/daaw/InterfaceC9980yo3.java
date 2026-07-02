package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.yo3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9980yo3 {
    void a(int i, long j);

    ByteBuffer b(int i);

    void c(int i, int i2, int i3, long j, int i4);

    ByteBuffer d(int i);

    void e(int i, int i2, C10080z93 c10080z93, long j, int i3);

    void f(Surface surface);

    void g(int i);

    void h(int i, boolean z);

    int i(MediaCodec.BufferInfo bufferInfo);

    void q(Bundle bundle);

    int zza();

    MediaFormat zzc();

    void zzi();

    void zzl();

    boolean zzr();
}
