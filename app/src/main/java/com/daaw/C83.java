package com.daaw;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class C83 extends C3912d83 {
    public final int E;
    public final String F;
    public final Map G;
    public final byte[] H;

    public C83(int i, String str, IOException iOException, Map map, C5835k03 c5835k03, byte[] bArr) {
        super("Response code: " + i, iOException, c5835k03, 2004, 1);
        this.E = i;
        this.F = str;
        this.G = map;
        this.H = bArr;
    }
}
