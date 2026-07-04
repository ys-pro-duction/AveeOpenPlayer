package com.daaw;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.daaw.d83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3912d83 extends UX2 {
    public final C5835k03 C;
    public final int D;

    public C3912d83(C5835k03 c5835k03, int i, int i2) {
        super(b(2008, 1));
        this.C = c5835k03;
        this.D = 1;
    }

    public static C3912d83 a(IOException iOException, C5835k03 c5835k03, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !ON2.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new C9791y73(iOException, c5835k03) : new C3912d83(iOException, c5835k03, i2, i);
    }

    public static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public C3912d83(IOException iOException, C5835k03 c5835k03, int i, int i2) {
        super(iOException, b(i, i2));
        this.C = c5835k03;
        this.D = i2;
    }

    public C3912d83(String str, C5835k03 c5835k03, int i, int i2) {
        super(str, b(i, i2));
        this.C = c5835k03;
        this.D = i2;
    }

    public C3912d83(String str, IOException iOException, C5835k03 c5835k03, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.C = c5835k03;
        this.D = i2;
    }
}
