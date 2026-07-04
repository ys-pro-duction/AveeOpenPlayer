package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ww1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2705Ww1 {
    public String a;
    public Uri b;
    public final C5824jy1 c = new C5824jy1();
    public final ZC1 d = new ZC1(null);
    public final List e = Collections.EMPTY_LIST;
    public final OP2 f = OP2.J();
    public final UE1 g = new UE1();
    public final LJ1 h = LJ1.c;

    public final C2705Ww1 a(String str) {
        this.a = str;
        return this;
    }

    public final C2705Ww1 b(Uri uri) {
        this.b = uri;
        return this;
    }

    public final YL1 c() {
        MH1 mh1;
        Uri uri = this.b;
        if (uri != null) {
            mh1 = new MH1(uri, null, null, null, this.e, null, this.f, null, -9223372036854775807L, null);
        } else {
            mh1 = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new YL1(str, new NA1(this.c, null), mh1, new C4222eG1(this.g), C9027vP1.y, this.h, null);
    }
}
