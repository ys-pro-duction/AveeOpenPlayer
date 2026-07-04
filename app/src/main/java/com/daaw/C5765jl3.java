package com.daaw;

/* JADX INFO: renamed from: com.daaw.jl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5765jl3 extends Exception {
    public final int B;
    public final boolean C;
    public final C2485Ut1 D;

    public C5765jl3(int i, C2485Ut1 c2485Ut1, boolean z) {
        super("AudioTrack write failed: " + i);
        this.C = z;
        this.B = i;
        this.D = c2485Ut1;
    }
}
