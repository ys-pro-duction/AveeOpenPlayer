package com.daaw;

import com.daaw.PP0;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: renamed from: com.daaw.vi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9110vi0 extends PP0 {

    /* JADX INFO: renamed from: com.daaw.vi0$a */
    public interface a extends PP0.a {
        void j(InterfaceC9110vi0 interfaceC9110vi0);
    }

    @Override // com.daaw.PP0
    long c();

    @Override // com.daaw.PP0
    boolean d(long j);

    long e(long j, DO0 do0);

    @Override // com.daaw.PP0
    long f();

    @Override // com.daaw.PP0
    void g(long j);

    long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, QM0[] qm0Arr, boolean[] zArr2, long j);

    void l();

    long m(long j);

    void o(a aVar, long j);

    long q();

    TrackGroupArray r();

    void t(long j, boolean z);
}
