package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0592Cw0 implements Cloneable {
    public final a B;
    public final boolean C;
    public final String D;

    /* JADX INFO: renamed from: com.daaw.Cw0$a */
    public enum a {
        FOOBAR2000,
        ITUNES,
        MEDIA_PLAYER_CLASSIC,
        MPLAYER,
        QUICKTIME,
        REALPLAYER,
        VLC_MEDIA_PLAYER,
        WINAMP,
        WINDOWS_MEDIA_PLAYER
    }

    public C0592Cw0(a aVar, boolean z, String str) {
        if (aVar == null) {
            throw new NullPointerException("no player");
        }
        this.B = aVar;
        this.C = z;
        this.D = str;
    }

    public Object clone() {
        return super.clone();
    }
}
