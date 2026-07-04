package com.daaw;

/* JADX INFO: renamed from: com.daaw.dl3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4081dl3 extends Exception {
    public final int B;
    public final boolean C;
    public final C2485Ut1 D;

    public C4081dl3(int i, int i2, int i3, int i4, C2485Ut1 c2485Ut1, boolean z, Exception exc) {
        String strValueOf = String.valueOf(c2485Ut1);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.B = i;
        this.C = z;
        this.D = c2485Ut1;
    }
}
