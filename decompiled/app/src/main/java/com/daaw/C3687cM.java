package com.daaw;

/* JADX INFO: renamed from: com.daaw.cM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3687cM extends JL {
    public final a B;

    /* JADX INFO: renamed from: com.daaw.cM$a */
    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        public final int B;

        a(int i) {
            this.B = i;
        }
    }

    public C3687cM(String str) {
        super(str);
        this.B = a.UNKNOWN;
    }

    public a a() {
        return this.B;
    }

    public C3687cM(String str, Throwable th) {
        super(str, th);
        this.B = a.UNKNOWN;
    }

    public C3687cM(String str, a aVar) {
        super(str);
        this.B = aVar;
    }

    public C3687cM(String str, Throwable th, a aVar) {
        super(str, th);
        this.B = aVar;
    }
}
