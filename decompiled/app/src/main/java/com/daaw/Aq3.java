package com.daaw;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class Aq3 implements InterfaceC5246ht3, Kp3 {
    public final Uri b;
    public final Z83 c;
    public final InterfaceC8867uq3 d;
    public final InterfaceC1398Kn1 e;
    public final C5779jo2 f;
    public volatile boolean h;
    public long j;
    public InterfaceC8576to1 l;
    public boolean m;
    public final /* synthetic */ Pq3 n;
    public final C6057ko1 g = new C6057ko1();
    public boolean i = true;
    public final long a = Mp3.a();
    public C5835k03 k = g(0);

    public Aq3(Pq3 pq3, Uri uri, InterfaceC7659qX2 interfaceC7659qX2, InterfaceC8867uq3 interfaceC8867uq3, InterfaceC1398Kn1 interfaceC1398Kn1, C5779jo2 c5779jo2) {
        this.n = pq3;
        this.b = uri;
        this.c = new Z83(interfaceC7659qX2);
        this.d = interfaceC8867uq3;
        this.e = interfaceC1398Kn1;
        this.f = c5779jo2;
    }

    public static /* bridge */ /* synthetic */ void f(Aq3 aq3, long j, long j2) {
        aq3.g.a = j;
        aq3.j = j2;
        aq3.i = true;
        aq3.m = false;
    }

    @Override // com.daaw.Kp3
    public final void a(C5900kE2 c5900kE2) {
        long jMax = !this.m ? this.j : Math.max(Pq3.N(this.n, true), this.j);
        int iJ = c5900kE2.j();
        InterfaceC8576to1 interfaceC8576to1 = this.l;
        interfaceC8576to1.getClass();
        AbstractC8018ro1.b(interfaceC8576to1, c5900kE2, iJ);
        interfaceC8576to1.c(jMax, 1, iJ, 0, null);
        this.m = true;
    }

    public final C5835k03 g(long j) {
        C3742cZ2 c3742cZ2 = new C3742cZ2();
        c3742cZ2.d(this.b);
        c3742cZ2.c(j);
        c3742cZ2.a(6);
        c3742cZ2.b(Pq3.n0);
        return c3742cZ2.e();
    }

    @Override // com.daaw.InterfaceC5246ht3
    public final void zzg() {
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[LOOP:0: B:3:0x0004->B:117:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd A[EDGE_INSN: B:118:0x01cd->B:81:0x01cd BREAK  A[LOOP:1: B:69:0x018b->B:121:0x018b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178 A[Catch: all -> 0x0070, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #1 {all -> 0x0070, blocks: (B:28:0x008a, B:30:0x0095, B:32:0x00a1, B:34:0x00ab, B:36:0x00b7, B:38:0x00c1, B:40:0x00cd, B:42:0x00d7, B:44:0x00e9, B:46:0x00f3, B:47:0x00f9, B:55:0x0128, B:56:0x012f, B:58:0x013c, B:60:0x0144, B:62:0x0161, B:64:0x0178, B:65:0x017d, B:67:0x0181, B:50:0x0103, B:53:0x0119, B:21:0x0058, B:26:0x0076), top: B:101:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed  */
    @Override // com.daaw.InterfaceC5246ht3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Aq3.zzh():void");
    }
}
