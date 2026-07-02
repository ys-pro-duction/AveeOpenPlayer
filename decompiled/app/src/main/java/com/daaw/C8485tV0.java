package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.daaw.tV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8485tV0 implements InterfaceC3516bk0 {
    public final C2584Vs0 a = new C2584Vs0();
    public final C2480Us0 b = new C2480Us0();
    public R31 c;

    @Override // com.daaw.InterfaceC3516bk0
    public Metadata a(C4073dk0 c4073dk0) {
        R31 r31 = this.c;
        if (r31 == null || c4073dk0.G != r31.e()) {
            R31 r312 = new R31(c4073dk0.E);
            this.c = r312;
            r312.a(c4073dk0.E - c4073dk0.G);
        }
        ByteBuffer byteBuffer = c4073dk0.D;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.a.H(bArrArray, iLimit);
        this.b.l(bArrArray, iLimit);
        this.b.o(39);
        long jH = (((long) this.b.h(1)) << 32) | ((long) this.b.h(32));
        this.b.o(20);
        int iH = this.b.h(12);
        int iH2 = this.b.h(8);
        this.a.K(14);
        Metadata.Entry entryA = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : TimeSignalCommand.a(this.a, jH, this.c) : SpliceInsertCommand.a(this.a, jH, this.c) : SpliceScheduleCommand.a(this.a) : PrivateCommand.a(this.a, iH, jH) : new SpliceNullCommand();
        return entryA == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entryA);
    }
}
